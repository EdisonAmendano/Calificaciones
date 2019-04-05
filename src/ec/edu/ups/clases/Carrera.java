/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison
 */
public class Carrera {
    
    private int codigo;
    private String nombre;
    private List<Materia> materias;
    private int numerosSemestres;
    private int numeroEstudiantes;
    private String titulo;

    public Carrera(int codigo, String nombre, int numerosSemestres, int numeroEstudiantes, String titulo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numerosSemestres = numerosSemestres;
        this.numeroEstudiantes = numeroEstudiantes;
        this.titulo = titulo;
        materias = new ArrayList<>();
    }
    
    
    public Carrera(){
        materias = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerosSemestres() {
        return numerosSemestres;
    }

    public void setNumerosSemestres(int numerosSemestres) {
        this.numerosSemestres = numerosSemestres;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void agregrarMateria(Materia materia){
        materias.add(materia);
    }

    @Override
    public String toString() {
        return "\n  Carrera:" + "\n   Codigo: " + codigo + "\n   Nombre: " + nombre + "\n   Materias: " + materias + "\n   Numeros de semestres: " + numerosSemestres 
                + "\n   Numero de estudiantes: " + numeroEstudiantes + "\n   Titulo: " + titulo;
    }
    
    
         
}
