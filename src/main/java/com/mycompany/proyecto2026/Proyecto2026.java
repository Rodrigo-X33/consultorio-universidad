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
    
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.nombre = "admin";
        u.password = "admin";
        u.rol = "Administrador";
        usuarios.add(u);
        Login l = new Login();
        l.setVisible(true);
        
    }
}
