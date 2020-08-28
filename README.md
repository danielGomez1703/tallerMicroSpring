# Arep - Micro Spring

este laboratorio es la muestra de un framewok desde un punto de vista general tipo springboot, el cual nos permite manejar recursos etaticos y dinamicos
en este proyecto manejamos unicamente recursos estaticos, usamos Hservidores HTTP implementados en java durante el desarrollo de la clase, una vez atiende 
la solicitud, se hace el proceso para atender el recurso solicitado con la URI. posteriormente se busca con el path y se retorna al browser

## Installation
 ```sh
$ git pull https://github.com/danielGomez1703/AREP-Spark
$ cd AREP-Spark
$ mvn package
```

# MANUAL

una vez instalado el programa debe ejecutar el programa con la ruta del archivo que contengan los datos 
 
    java -cp target/classes co.edu.escuelaing.sparkd.SparkD.MicroSpringBoot


# Modelo
![Modelo](https://github.com/danielGomez1703/tallerMicroSpring/blob/master/resources/model.JPG)
    
este modelo nos muestra como funciona un framework de spring de forma general, los cual nos permite hacer llamados al servidor con determinados paths los cuales
retornaran recursos staticos.

# Funcionamiento

cuando iniciamos el programa podemos observar que el servidor empieza a escuchar, pero antes revisa los metodos del controller que estamos usando + los de la super clase Object

![evidence](https://github.com/danielGomez1703/tallerMicroSpring/blob/master/resources/evidence1.JPG)

despues podemos ver como el servidor escucha y atiende a la solicitud 

![evidence2](https://github.com/danielGomez1703/tallerMicroSpring/blob/master/resources/evidence2.JPG)


finalmente podemos ver como nos retorna la pagina de acuerdo a la ruta que le demos 

![evidence2](https://github.com/danielGomez1703/tallerMicroSpring/blob/master/resources/evidence1_2.JPG)



## Author
    LUIS DANIEL BENAVIDES NAVARRO - Profesor
    Daniel Felipe Gomez Suarez [danielgomez1703](https://github.com/danielGomez1703)
    
    
## BUILT IN
   Proyecto construido en [Maven](https://maven.apache.org/)
## License
----
para consultar su licencia vaya al link 
[leer aqui](https://github.com/danielGomez1703/tallerMicroSpring/blob/master/LICENSE.txt)
