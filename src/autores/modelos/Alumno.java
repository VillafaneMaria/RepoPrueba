/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import java.util.Objects;

/**
 *
 * @author 54381
 */
public class Alumno extends Autor {
//    private String nombres;
//    private String apellidos;
//    private int DNI;
//    private String clave;
    private String cx;
    
    @Override
    public void mostrar(){
       System.out.println("[" + super.verDNI() + "}" + super.verApellidos() +","+ super.verNombres());
       System.out.println("CX:" + this.cx);
    }

//    public String verNombres() {
//        return nombres;
//    }
//
//    public void asignarNombres(String nombres) {
//        this.nombres = nombres;
//    }
//
//    public String verApellidos() {
//        return apellidos;
//    }
//
//    public void asignarApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    public int verDNI() {
//        return DNI;
//    }
//
//    public void asignarDNI(int DNI) {
//        this.DNI = DNI;
//    }
//
//    public String verClave() {
//        return clave;
//    }
//
//    public void asignarClave(String clave) {
//        this.clave = clave;
//    }

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(nombres,apellidos,dni,clave);
//        this.nombres = nombres;
//        this.apellidos = apellidos;
//        this.DNI = DNI;
//        this.clave = clave;
        this.cx = cx;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 37 * hash + this.DNI;
//        return hash;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Alumno other = (Alumno) obj;
//        if (this.DNI != other.DNI) {
//            return false;
//        }
//        return true;
//    }
//   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.cx, other.cx)) {
            return false;
        }
        return true;
    }
    
    
}
