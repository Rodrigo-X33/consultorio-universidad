/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2026;
import java.util.ArrayList;
/**
 *
 * @author carlos
 */
public class Proyecto2026 {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static Usuario usuarioLogin;
    public static ArrayList<Consultorio> consultorios = new ArrayList<>();
    public static int contadorConsultorios = 1;
    public static ArrayList<Paciente> pacientes = new ArrayList<>();
    public static int contadorPacientes = 1;
    public static ArrayList<Cita> citas = new ArrayList<>();
    public static int contadorCitas = 1;
    
    public static void main(String[] args) {
        Usuario admin = new Usuario();
        admin.nombre = "admin";
        admin.password = "admin";
        admin.rol = "Administrador";
        usuarios.add(admin);

        Consultorio c1 = new Consultorio();
        c1.codigo = contadorConsultorios++;
        c1.nombre = "Consultorio 1";
        consultorios.add(c1);

        Usuario doctor = new Usuario();
        doctor.nombre = "doctor";
        doctor.password = "doctor";
        doctor.rol = "Doctor";
        doctor.consultorio = c1;
        usuarios.add(doctor);

        Usuario secre = new Usuario();
        secre.nombre = "secretaria";
        secre.password = "secretaria";
        secre.rol = "Secretaria";
        secre.consultorio = c1;
        usuarios.add(secre);

        Paciente p1 = new Paciente();
        p1.codigo = contadorPacientes++;
        p1.nombre = "Juan Pérez";
        p1.edad = 30;
        p1.peso = 70.5;
        p1.estatura = 1.75;
        p1.telefonos = "5551234567";
        pacientes.add(p1);

        Login l = new Login();
        l.setVisible(true);

    }
}
