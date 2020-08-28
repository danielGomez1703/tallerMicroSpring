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

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}