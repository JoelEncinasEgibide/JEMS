CREATE OR REPLACE PACKAGE TRIGGER_MT AS 
  TRIGG_JUGADOR PLAYER%ROWTYPE := NULL; 
END;


CREATE OR REPLACE TRIGGER TRIG_MAX_EQUIPO --ESTE TRIGGER VA A LIMITAR LA CANTIDAD DE JUGADORES MAXIMOS POR EQUIPO
AFTER INSERT OR UPDATE OF EQUIPO
ON JUGADOR
DECLARE
  MIEMBROS NUMBER;
BEGIN
  SELECT COUNT(*) INTO MIEMBROS FROM JUGADOR WHERE EQUIPO=TRIGGER_MT.TRIGG_JUGADOR.EQUIPO; --SELECT PARA CALCULAR CUANTOS JUGADORES TIENE CADA EQUIPO
  IF MIEMBROS >= 6 THEN --SI ES MAYOR QUE 6 :
    RAISE_APPLICATION_ERROR(-20001, 'Limite de miembros alcanzados por un equipo.'); --SALTA LA EXCEPCION
  END IF;
END TRIG_MAX_EQUIPO;