package com.jsps.ejemplo;

import com.jsps.pooherencia.*;

public class MainHerencia {

    public static void main(String[] args) {

        /* Realizando cast desde la clase súper Object, que es la clase Padre de todas las clases
        Object alumno2 = new Alumno(); Se crea un objeto de la clase súper Object
        ((Persona)alumno2).setNombre("Pepe"); Se realiza cast del objeto alumno2 con la clase hija Persona que tiene el método get/setNombre
        ((Alumno)alumno2).setNombre("Pepe");  Se realiza cast del objeto alumno2 con la clase hija Alumno que tiene el método get/setNombre*/
        System.out.println("================= Creando la instancia de la clase Alumno =================");
        Alumno alumno = new Alumno(); //Se crea un objeto de la clase padre pero instancia de la clase hija
        alumno.setNombre("Sebastian");
        alumno.setApellido("Pérez");
        alumno.setInstitucion("Colegio nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        //((Alumno)alumno).setColegio("Colegio nacional"); //Se realiza cast del objeto para poder acceder al método setColegio
        //((Alumno) alumno.getColegio()
        //Ya, que la clase padre Persona NO tiene método get/set Colegio y el objeto es creado de la
        // clase padre Persona, por eso es necesario realizar cast de clase hija al objeto alumno

        System.out.println("================= Creando la instancia de la clase Alumno Internacional =================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto internacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("================= Creando la instancia de la clase Profesor =================");
        Profesor profe = new Profesor();
        profe.setNombre("Lucy");
        profe.setApellido("Parra");
        profe.setAsignatura("Matemáticas");

        System.out.println("================= - =================");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getInstitucion());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getInstitucion() + " " + alumnoInt.getPais());
        System.out.println("Profesor " + profe.getAsignatura() + ": " + profe.getNombre() + " " + profe.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }


    }
}