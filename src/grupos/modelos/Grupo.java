/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.Profesor;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author LuccaMatienzo
 */
public class Grupo {

    public String verNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    String nombre;
    String descripcion;
//Defino una variable de instancia para los Miembro en grupo
    private ArrayList<MiembroEnGrupo> miembrosengrupo;
//Agrego metodos get y set con insertcode
    public ArrayList<MiembroEnGrupo> verMiembrosengrupo() {
        return miembrosengrupo;
    }
//Agrego metodo para agregar un miembro a un grupo con control 
//Del grupo Super Administradores     
    public void agregarMiembro(Autor autor, Rol rol) {
        MiembroEnGrupo miembro = new MiembroEnGrupo((Profesor) autor, this, rol);
        if(!tieneMiembros() && miembrosengrupo == null)
            miembrosengrupo = new ArrayList<>();
        if(this.esSuperAdministradores()){
            if(!this.miembrosengrupo.contains(miembro)){  
                miembro.asignarRol(Rol.ADMINISTRADOR);
                this.miembrosengrupo.add(miembro);
                autor.agregarGrupo(this, Rol.ADMINISTRADOR);  
            }
        }
        
        else if(!this.miembrosengrupo.contains(miembro)){
            this.miembrosengrupo.add(miembro);
            autor.agregarGrupo(this, rol);
        }
    }
    
    public void quitarMiembro(Autor miembro){
        ArrayList<MiembroEnGrupo> sinMiembro = new ArrayList<>();
        ArrayList<MiembroEnGrupo> sinGrupo = new ArrayList<>();

        if(tieneMiembros()){
            for(MiembroEnGrupo m: this.miembrosengrupo){
                if(!m.verAutor().equals(miembro)){
                    sinMiembro.add(m);
                }
            }    
            for(MiembroEnGrupo g: miembro.getGrupos()){
                if(!g.verGrupo().equals(this)){
                    sinGrupo.add(g);
                }
            }
        }
        
        miembro.setGrupos(sinGrupo);
        this.miembrosengrupo = sinMiembro;
    }
    
    public void asignarMiembrosengrupo(ArrayList<MiembroEnGrupo> miembrosengrupo) {
        this.miembrosengrupo = miembrosengrupo;
    }
    public void mostrar(){
        System.out.println("Grupo:" + this.nombre + "-" + this.descripcion);
    }

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
//Metodo para mostrar los miembros del grupò    
    public void mostrarMiembros() {
        System.out.println("Los miembros del grupo: " + this.nombre + " ");
        if(this.tieneMiembros()){
            for(MiembroEnGrupo m: this.miembrosengrupo){
                System.out.println(m.toString());
            }
        }
        else{
            System.out.println("No tiene miembros");
        }
    }
    public boolean esSuperAdministradores(){
        if(this.nombre.equals("Super Administradores"))
            return true;
        else{
            return false;
        }
    } 
//Metodo para verificar si es un grupo vacio
    public boolean tieneMiembros(){
        if(this.miembrosengrupo.isEmpty() || this.miembrosengrupo == null)
            return false;
        else
            return true;
    }     
}

