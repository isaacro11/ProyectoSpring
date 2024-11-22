/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.pln.service;

import com.example.pln.entity.Alumnos;
import java.util.List;

/**
 *
 * @author Calde
 */
public interface ServiceAlumnos {
    //SERVICIO PARA LISTAR A TODOS LOS ALUMNOS
    public List<Alumnos> ListAllAlumnos();
    //SERVICIO PARA GUARDAR ALUMNOS
    public Alumnos saveAlumnos(Alumnos alumnos);
    
    
}
