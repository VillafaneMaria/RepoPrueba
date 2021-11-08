/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author 54381
 */
public class Profesor extends Autor {
    private Cargo cargo;
   

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

    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Profesor (int dni, String apellidos,String nombres , String clave, Cargo cargo) {
        super(nombres,apellidos, dni,clave);
        this.cargo = cargo;
    }
    
    @Override
    public void mostrar(){
        System.out.println("[" + super.verDNI() + "}" + super.verApellidos() +","+ super.verNombres());
        System.out.println("Cargo:" + this.cargo.toString());
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.verDNI();
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
        final Profesor other = (Profesor) obj;
        if (this.verDNI() != other.verDNI()) {
            return false;
        }
        return true;
    }
    
}
