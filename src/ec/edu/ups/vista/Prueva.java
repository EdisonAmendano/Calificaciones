/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificacionesEstudiante;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author Edison
 */
public class Prueva {
    
    
    public static void main(String[]args){
        
    
    
    Carrera telematica = new Carrera(2, "Telematica", 10, 200, "ingenieria en telematica");
    Carrera computacion = new Carrera(3, "Computacion", 10, 250, "Ingenieria de la ciencia de la computación");
    Carrera mecatronica = new Carrera(4, "Mecatronica", 10, 300, "Mecatronicos");
    
    Profesor juan = new Profesor("Ingeniero", 1500, "Profesor", 111, "Juan", "0303675930", "0945912485", "Cuenca");
    Profesor pedro = new Profesor("Ingeniero", 2500, "Profesor", 112, "Pedro", "0301576940", "09556144487", "Cuenca");

    Estudiante max = new Estudiante("telematica", 101, "Max", "03015674895", "089473645293", "Cuenca");
    Estudiante julio = new Estudiante("computacion", 102, "Julio", "0385723647", "0946378493", "Cuenca");
    Estudiante willian = new Estudiante("computacion", 104, "Willian", "0349235478", "0984327648", "Cuenca");
    Estudiante marcela = new Estudiante("mecatronica", 104, "Marcela", "0345623409", "0904567432", "Cuenca");
    
    Grupo g1 = new Grupo(201, "Grupo 1", 35);
    Grupo g2 = new Grupo(202, "Grupo 2", 35);
    Grupo g3 = new Grupo(203, "Grupo 3", 35);
    Grupo g4 = new Grupo(204, "Grupo 4", 35);
    
    Materia matematicas = new Materia(11, "Matematicas", 5, 50, 1, juan, g1);
    Materia ingles = new Materia(12, "Ingles", 3, 30, 1, juan, g4);
    Materia matematicasAvanzads = new Materia(13, "Matematicas Avanzadas", 5, 60, 3, juan, g2);
    Materia electronica = new Materia(14, "Electronica", 3, 40, 3, pedro, g3);
    Materia fisica = new Materia(13, "Fisica", 3, 20, 1, pedro, g4);
    Materia redes = new Materia(13, "Redes", 4, 44, 5, pedro, g1);
    
    Sede cuenca = new Sede(1, "SedeCuenca", "CalleVieja", "03010200");
    cuenca.agregarCarrera(telematica);
    cuenca.agregarCarrera(computacion);
    cuenca.agregarCarrera(mecatronica);
    
    telematica.agregrarMateria(matematicas);
    telematica.agregrarMateria(ingles);
    computacion.agregrarMateria(matematicasAvanzads);
    computacion.agregrarMateria(electronica);
    mecatronica.agregrarMateria(fisica);
    mecatronica.agregrarMateria(redes);
    
    HistorialCalificacionesEstudiante calificacionMatematicasMax = new HistorialCalificacionesEstudiante(25, 15, 10, 20, "matematicas");
    HistorialCalificacionesEstudiante calificacionInglesMax = new HistorialCalificacionesEstudiante(29, 10, 20, 20, "Ingles");
    HistorialCalificacionesEstudiante calificacionmatematicasAvanzadaJulio = new HistorialCalificacionesEstudiante(25, 20, 10, 20, "Matematicas Avanzadas");
    HistorialCalificacionesEstudiante calificacionmatematicasAvanzadaWillian = new HistorialCalificacionesEstudiante(20, 17, 15, 15, "Matematicas Avanzadas");
    HistorialCalificacionesEstudiante calificacionElectronicaJulio = new HistorialCalificacionesEstudiante(27, 19, 25, 18, "Electronica");
    HistorialCalificacionesEstudiante calificacionElectronicaWillian = new HistorialCalificacionesEstudiante(25, 17, 19, 18, "Electronica");
    HistorialCalificacionesEstudiante calificacionFisicaMarcela = new HistorialCalificacionesEstudiante(23, 19, 25, 17, "Fisica");
    HistorialCalificacionesEstudiante calificacionRedesMarcela = new HistorialCalificacionesEstudiante(20, 15, 20, 16, "Redes");
    
    max.agregarHstorialCalificacionesEstudiante(calificacionMatematicasMax);
    max.agregarHstorialCalificacionesEstudiante(calificacionInglesMax);
    julio.agregarHstorialCalificacionesEstudiante(calificacionmatematicasAvanzadaJulio);
    julio.agregarHstorialCalificacionesEstudiante(calificacionElectronicaJulio);
    willian.agregarHstorialCalificacionesEstudiante(calificacionmatematicasAvanzadaWillian);
    willian.agregarHstorialCalificacionesEstudiante(calificacionElectronicaWillian);
    marcela.agregarHstorialCalificacionesEstudiante(calificacionFisicaMarcela);
    marcela.agregarHstorialCalificacionesEstudiante(calificacionRedesMarcela);

    System.out.println(cuenca);
    System.out.println(max);
    System.out.println(julio);
    System.out.println(willian);
    System.out.println(marcela);
    
    }
    
}
