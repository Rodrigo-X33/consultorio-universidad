/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2026;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class Cita {
    public int codigo;
    public Paciente paciente;
    public Usuario doctor;
    public Consultorio consultorio;
    public Date fechaHora;
    public String motivo;
    public String estado;
    public ArrayList<Medicamento> receta = new ArrayList<>();
}
