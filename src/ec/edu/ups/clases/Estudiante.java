/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison
 */
public class Estudiante  extends Persona{
    
    private String carrera;
    private List<HistorialCalificacionesEstudiante>calificaciones;
    
    
    
    public Estudiante(String carrera, int codigo, String nombre, String cedula, String telefono, String direccion) {
        super(codigo, nombre, cedula, telefono, direccion);
        this.carrera = carrera;
        calificaciones = new ArrayList<>();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void agregarHstorialCalificacionesEstudiante(HistorialCalificacionesEstudiante calificaciones){
        this.calificaciones.add(calificaciones);
    }

    @Override
    public String toString() {
        return "Estudiante: " + "\n Nombre: "+ this.getNombre() + "\n Cedula: " + this.getCedula() + "\n Codigo: " + this.getCodigo() + "\n Direccion" 
                + this.getDireccion()+ "\n Telefono" + this.getTelefono() +"\n Carrera: " + carrera + "\n calificaciones: " + calificaciones ;
    }
    
}
