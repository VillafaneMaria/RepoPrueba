/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.util.ArrayList;

/**
 *
 * @author LuccaMatienzo
 */
public abstract class Autor {
    private String nombres;
    private String apellidos;
    private int DNI;
    private String clave;
//Agrego metodos get and set con insert code
    public ArrayList<MiembroEnGrupo> getGrupos() {
        return grupos;
    }
    public void setGrupos(ArrayList<MiembroEnGrupo> grupos) {
        this.grupos = grupos;
    }
    private ArrayList <MiembroEnGrupo> grupos;

    public Autor(String nombres, String apellidos, int DNI, String clave) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.clave = clave;
    }
    
    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int verDNI() {
        return DNI;
    }

    public void asignarDNI(int DNI) {
        this.DNI = DNI;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }
    
//Metodo para mostrar autores modificadp
    public void mostrar(){
        System.out.println("[" + DNI + "] " + apellidos + ", " + nombres);
        mostrarGrupos();
    }
//Implementacion de un metodo para mostrar los grupos
    public void mostrarGrupos(){
        System.out.println("Grupos de " + this.nombres + ", " + this.apellidos + " ");
        if(this.tieneGrupos()){
            for(MiembroEnGrupo miembro: this.grupos){
                System.out.println("Grupo: " + miembro.verGrupo().verNombre() + "   Rol: " + miembro.verRol().toString());
            }
        }
        else{
            System.out.println("No se encuentra en ningun grupo");
        }
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.DNI;
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
        final Autor other = (Autor) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        return true;
    }
    public void agregarGrupo(Grupo grupo, Rol rol){
        MiembroEnGrupo unGrupo = new MiembroEnGrupo((Profesor)this, grupo, rol);
       
        if(!tieneGrupos()){
            if(this.grupos == null)
                this.grupos = new ArrayList<>();
        }
        if(grupo.esSuperAdministradores()){
            if(!this.grupos.contains(unGrupo)){  
                unGrupo.asignarRol(Rol.ADMINISTRADOR);
                this.grupos.add(unGrupo);
                grupo.agregarMiembro(this, Rol.ADMINISTRADOR);
            }
        }
        if(!this.grupos.contains(unGrupo)){
            this.grupos.add(unGrupo);
            grupo.agregarMiembro(this, rol);
        } 
    }
    public boolean tieneGrupos(){
        if(this.grupos == null){
            return false;
        }
        else if(this.grupos.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void quitarGrupo(Grupo grupo){
        ArrayList<MiembroEnGrupo> sinGrupo = new ArrayList<>();
        ArrayList<MiembroEnGrupo> sinMiembro = new ArrayList<>();
        
        if(tieneGrupos()){
            for(MiembroEnGrupo g: grupos){
                if(!g.verGrupo().equals(grupo)){
                    sinGrupo.add(g);
                }
            }
            for(MiembroEnGrupo g: grupo.verMiembrosengrupo()){
                if(!g.verAutor().equals(this)){
                    sinMiembro.add(g);
                }
            }    
        }
        
        grupo.asignarMiembrosengrupo(sinMiembro);
        this.grupos = sinGrupo;
    }
    public boolean esSuperAdministrador(){
        for(MiembroEnGrupo m: grupos){
            if(m.verGrupo().esSuperAdministradores()){
                return true;
            }
        }
        
        return false;
    }
}
