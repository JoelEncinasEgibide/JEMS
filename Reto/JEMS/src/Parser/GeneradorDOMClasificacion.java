/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import UML.Equipo;
import UML.Liga;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Joel Encinas
 *
 * @version %I%, %G%
 * @since 1.0
 */
public class GeneradorDOMClasificacion {

    /*
    private List<Equipo> equipos;
    private Document dom;

    public GeneradorDOMClasificacion() {        

        // Construir un documento DOM vacio
        crearDocumento();
    }

    public void run() {
        crearArbolDOM();
        exportarFichero();
    }

    private void crearDocumento() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            dom = db.newDocument();

            // REF: No hay esquema o DTD: https://stackoverflow.com/a/8438236
            // dom.setXmlStandalone(true);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    private void crearArbolDOM() {
        // Elemento raiz liga
        Element raiz = dom.createElement("liga");
        dom.appendChild(raiz);
        raiz.setAttribute("cod", liga.getCod_liga());
        raiz.setAttribute("fecha_inicio", liga.getFecha_inicio());
        raiz.setAttribute("fecha_fin", liga.getFecha_fin());
        raiz.setAttribute("estado_liga", liga.isEstado());

        // Elemento fecha_actualizacion
        Element elementoFechaActualizacion = dom.createElement("fecha_actualizacion");
        Text fechaActualizacion = dom.createTextNode(liga.getFechaActualizacion());
        elementoFechaActualizacion.appendChild(fechaActualizacion);
        raiz.appendChild(elementoFechaActualizacion);

        // Generar elementos equipo y hacer equipos el padre
        for (Equipo equipo : equipos) {
            Element elemento = crearElementoEquipo(equipo);
            raiz.appendChild(elemento);
        }
    }

    private Element crearElementoEquipo(Equipo equipo) {

        // <equipo cod="">
        Element elementoEquipo = dom.createElement("equipo");
        elementoEquipo.setAttribute("cod", String.valueOf(equipo.getCod_equipo()));

        // <nombre>
        Element elementoNombre = dom.createElement("nombre");

        // #PCDATA
        Text nombre = dom.createTextNode(equipo.getNombre());
        elementoNombre.appendChild(nombre);

        // </nombre>
        elementoEquipo.appendChild(elementoNombre);

        // <puntos>
        Element elementoPuntos = dom.createElement("puntos");

        // #PCDATA
        Text puntos = dom.createTextNode(String.valueOf(equipo.getPuntuacion()));
        elementoPuntos.appendChild(puntos);

        // </puntos>
        elementoEquipo.appendChild(elementoPuntos);

        return elementoEquipo;
    }

    private void exportarFichero() {
        // REF: Serializar XML: https://www.edureka.co/blog/serialization-of-java-objects-to-xml-using-xmlencoder-decoder/
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            // REF: Indentar la salida: https://stackoverflow.com/a/1264872
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

            Result output = new StreamResult(new File("./liga.xml"));
            Source input = new DOMSource(dom);

            transformer.transform(input, output);

        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        System.out.println("--- DOM (escritura) ---\n");
        new GeneradorDOMClasificacion().run();
    }
*/
}