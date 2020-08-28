/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.SparkD;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jairo Gomez
 */
public class MicroSpring {

    private Map<String, Method> beans = new HashMap <>();

    public void start(String[] args) throws Exception {
        int mapped = 0;
        for (Method m : Class.forName(args[0]).getMethods()) {
            System.out.println("Revisando: " + m.getName());
            if (m.isAnnotationPresent(RequestMapping.class)) {
                System.out.println("Si está anotado con @Reques tMapping");
                try {
                    RequestMapping rm = m.getAnnotation(RequestMapping.class);
                    beans.put(rm.value(), m);
                    mapped++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                }
            }
        }
    }

    public String invoke(String path) {
        try {
            System.out.println(path);
            return beans.get(path).invoke(null).toString();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error ";
    }
}
