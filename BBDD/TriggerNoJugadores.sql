CREATE OR REPLACE TRIGGER TRIG_NO_JUGADORES --TRIGGER QUE COMPRUEBA QUE NO HAYA EQUIPOS SIN JUGADORES
BEFORE INSERT ON LIGA FOR EACH ROW
DECLARE
ERROR_NO_JUGADORES EXCEPTION; -- ERROR PERSONALIZADO DEL TRIGGER
V_CANTIDAD NUMBER(1);
BEGIN
  SELECT COUNT(*) INTO V_CANTIDAD
  FROM JUGADOR;
  IF V_CANTIDAD = 0 THEN
    RAISE_APPLICATION_ERROR (-20005,'No hay jugadores en el equipo'); -- ACTIVA EL ERROR
  END IF;
END TRIG_NO_JUGADORES;