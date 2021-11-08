/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author 54381
 */
public class Publicacion {
    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;
    private List<PalabraClave> palabrasClaves = new ArrayList<PalabraClave>();
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    private MiembroEnGrupo miembroEnGrupo;

    public Publicacion(String titulo, MiembroEnGrupo miembroEnGrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, List palabrasClaves, String enlace, String resumen) {
        this.titulo = titulo;
        this.miembroEnGrupo = miembroEnGrupo;
        this.fechaPublicacion = fechaPublicacion;
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.palabrasClaves = palabrasClaves;
        this.enlace = enlace;
        this.resumen = resumen;
    }
    
     

    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate verFechaPublicacion() {
        return fechaPublicacion;
    }

    public void asignarFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String verEnlace() {
        return enlace;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String verResumen() {
        return resumen;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public void mostrar(){
        System.out.println("Titulo:" + titulo);
        System.out.println( "Autor:" + miembroEnGrupo.verAutor().verNombres() + "," + miembroEnGrupo.verAutor().verApellidos());
        System.out.println("Grupo:" + miembroEnGrupo.verGrupo());
        System.out.println("Rol:" + miembroEnGrupo.verRol());
        System.out.println("Fecha de Publicacion:" + this.fechaPublicacion);
        System.out.println("Tipo:" + tipo);
        System.out.println("Idioma:" + idioma);
        System.out.println("Lugar:" + lugar);
        System.out.println("Palabras Claves: \n--------------");
        for (PalabraClave p: palabrasClaves){
        System.out.println("\t" + p);
        }
        System.out.println("Enlace:" + enlace);
        System.out.println("Resumen:" + resumen);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.titulo);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
}
