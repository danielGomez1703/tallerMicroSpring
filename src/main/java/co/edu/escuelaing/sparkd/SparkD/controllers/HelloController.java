/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD.controllers;

import co.edu.escuelaing.sparkd.SparkD.RequestMapping;

/**
 *
 * @author Jairo Gomez
 */
public class HelloController {

    @RequestMapping("/hola")
    static public String hola() {
        return "Greetings from Micro Spring Boot!";
    }

    @RequestMapping("/pi")
    static public String pi() {
        return "PI: " + Math.PI;
    }

    @RequestMapping("/pag")
    static public String pagina() {
        String outputLine = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF - 8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Constante de Euler</h1>\n" + Math.E
                + "</body>\n"
                + "</html>\n";
        return outputLine;
    }
}
