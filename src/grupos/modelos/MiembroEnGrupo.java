/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.Profesor;
import java.util.Objects;


/**
 *
 * @author 54381
 */
public class MiembroEnGrupo {
    private Autor autor;
    private Grupo grupo;
    private Rol rol;

    public MiembroEnGrupo(Profesor miembro, Grupo grupo, Rol rol) {
        this.autor = autor;
        this.grupo = grupo;
        this.rol = rol;
    }

    MiembroEnGrupo(Autor autor, Grupo aThis, Rol rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Autor verAutor() {
        return autor;
    }

    public void asignarMiembro(Profesor miembro) {
        this.autor = autor;
    }

    public Grupo verGrupo() {
        return grupo;
    }

    public void asignarGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Rol verRol() {
        return rol;
    }

    public void asignarRol(Rol rol) {
        this.rol = rol;
    }
     @Override
    public String toString() {
        return autor.verNombres() + "," + autor.verApellidos() + "\nRol: " + rol.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.autor);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    
    
}


