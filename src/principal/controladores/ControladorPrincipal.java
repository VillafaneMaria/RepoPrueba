/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;


/**
 *
 * @author prog2
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
    
     //<editor-fold defaultstate="collapsed" desc="Sin intefaz gráfica"> 
//        ArrayList<Grupo> grupos = new ArrayList<>();
//        ArrayList<Alumno> alumnos = new ArrayList<>();
//        ArrayList<Profesor> profesores = new ArrayList<>();
//        ArrayList<Tipo> tipos = new ArrayList<>();
//        ArrayList<Lugar> lugares = new ArrayList<>();
//        ArrayList<Idioma> idiomas = new ArrayList<>();
//        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
//        ArrayList<Publicacion> publicaciones = new ArrayList<>();
//
//        //GRUPOS
//        Grupo grupo1 = new Grupo("Grupo 1", "Descripción 1");
//        Grupo grupo2 = new Grupo("Grupo 2", "Descripción 2");
//        Grupo grupo3 = new Grupo("Grupo 3", "Descripción 3");
//        Grupo grupo4 = new Grupo("Grupo 4", "Descripción 4");
//        Grupo grupo5 = new Grupo("Grupo 5", "Descripción 5");
//
//        
//        grupos.add(grupo1);
//        grupos.add(grupo2);
//        grupos.add(grupo3);
//        grupos.add(grupo4);
//        grupos.add(grupo5);
//      
//        System.out.println("----Grupos----");
//        for(Grupo g : grupos)
//            g.mostrar();
//        //GRUPOS
//        
//        //ALUMNOS
//        Alumno alumno1 = new Alumno(1, "Apellido1", "Nombre1", "Clave1", "1");
//        Alumno alumno2 = new Alumno(2, "Apellido2", "Nombre2", "Clave2", "2");
//        Alumno alumno3 = new Alumno(3, "Apellido3", "Nombre3", "Clave3", "3");
//        Alumno alumno4 = new Alumno(4, "Apellido4", "Nombre4", "Clave4", "4");
//        Alumno alumno5 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5");
//
//        alumnos.add(alumno1);
//        alumnos.add(alumno2);
//        alumnos.add(alumno3);
//        alumnos.add(alumno4);
//        alumnos.add(alumno5);
//        
//        System.out.println("\n----Alumnos----\n");
//        for(Alumno a : alumnos)
//            a.mostrar();
//        //ALUMNOS
//        
//        //PROFESORES
//        Profesor profesor1 = new Profesor(10, "Apellido10", "Nombre10", "Clave10", Cargo.TITULAR);
//        Profesor profesor2 = new Profesor(20, "Apellido20", "Nombre20", "Clave20", Cargo.ASOCIADO);
//        Profesor profesor3 = new Profesor(30, "Apellido30", "Nombre30", "Clave30", Cargo.ADJUNTO);
//        Profesor profesor4 = new Profesor(40, "Apellido40", "Nombre40", "Clave40", Cargo.JTP);
//        Profesor profesor5 = new Profesor(50, "Apellido50", "Nombre50", "Clave50", Cargo.ADG);
//
//        profesores.add(profesor1);
//        profesores.add(profesor2);
//        profesores.add(profesor3);
//        profesores.add(profesor4);
//        profesores.add(profesor5);
//        
//        System.out.println("\n----Profesores----\n");
//        for(Profesor p : profesores)
//            p.mostrar();
//        //PROFESORES        
//        
//        //TIPOS DE PUBLICACION
//        System.out.println("\n----Tipos de publicación----\n");
//        Tipo tipo1 = new Tipo("Tipo 1");
//        Tipo tipo2 = new Tipo("Tipo 2");
//        Tipo tipo3 = new Tipo("Tipo 3");
//        Tipo tipo4 = new Tipo("Tipo 4");
//        Tipo tipo5 = new Tipo("Tipo 5");
//
//        tipos.add(tipo1);
//        tipos.add(tipo2);
//        tipos.add(tipo3);
//        tipos.add(tipo4);
//        tipos.add(tipo5);
//
//        for(Tipo t : tipos)
//            System.out.println(t);
//    
//        //TIPOS DE PUBLICACION
//        
//        //LUGARES
//        System.out.println("\n----Lugares----\n");
//        Lugar lugar1 = new Lugar("Lugar 1");
//        Lugar lugar2 = new Lugar("Lugar 2");
//        Lugar lugar3 = new Lugar("Lugar 3");
//        Lugar lugar4 = new Lugar("Lugar 4");
//        Lugar lugar5 = new Lugar("Lugar 5");
//
//        lugares.add(lugar1);
//        lugares.add(lugar2);
//        lugares.add(lugar3);
//        lugares.add(lugar4);
//        lugares.add(lugar5);
//
//        for(Lugar l : lugares)
//            System.out.println(l);
//        //LUGARES
//        
//        //IDIOMAS        
//        System.out.println("\n----Idiomas----\n");
//        Idioma idioma1 = new Idioma("Idioma 1");
//        Idioma idioma2 = new Idioma("Idioma 2");
//        Idioma idioma3 = new Idioma("Idioma 3");
//        Idioma idioma4 = new Idioma("Idioma 4");
//        Idioma idioma5 = new Idioma("Idioma 5");
//
//        idiomas.add(idioma1);
//        idiomas.add(idioma2);
//        idiomas.add(idioma3);
//        idiomas.add(idioma4);
//        idiomas.add(idioma5);
//
//        for(Idioma i : idiomas)
//            System.out.println(i);        
//        //IDIOMAS
//        
//        //PALABRAS CLAVE
//        System.out.println("\n----Palabras clave----\n");
//        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
//        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
//        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
//        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
//        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");
//
//        palabrasClaves.add(palabraClave1);
//        palabrasClaves.add(palabraClave2);
//        palabrasClaves.add(palabraClave3);
//        palabrasClaves.add(palabraClave4);
//        palabrasClaves.add(palabraClave5);
//
//        for(PalabraClave pc : palabrasClaves)
//            System.out.println(pc); 
//        //PALABRAS CLAVE
//        
//        //PUBLICACIONES
//        /*
//        Para un objeto de la clase publicación:
//        Titulo
//        Miembro en grupo
//        Fecha
//        Tipo
//        Idioma
//        Lugar
//        Lista de palabras clave
//        Enlace
//        Resumen
//        */
//                
//        Publicacion publicacion1 = new Publicacion("Título 1", new MiembroEnGrupo(profesor1, grupo1, Rol.ADMINISTRADOR), LocalDate.of(2020, 06, 24), tipo1, idioma1, lugar1, Arrays.asList(new PalabraClave[] {palabraClave1, palabraClave2, palabraClave3}), "Enlace 1", "Resumen 1");
//        Publicacion publicacion2 = new Publicacion("Título 2", new MiembroEnGrupo(profesor2, grupo1, Rol.ADMINISTRADOR), LocalDate.of(2020, 06, 24), tipo2, idioma2, lugar2, Arrays.asList(new PalabraClave[] {palabraClave4, palabraClave5}), "Enlace 2", "Resumen 2");
//        Publicacion publicacion3 = new Publicacion("Título 3", new MiembroEnGrupo(profesor2, grupo2, Rol.COLABORADOR), LocalDate.of(2020, 06, 24), tipo1, idioma2, lugar2, Arrays.asList(new PalabraClave[] {palabraClave2, palabraClave4, palabraClave5}), "Enlace 3", "Resumen 3");
//        Publicacion publicacion4 = new Publicacion("Título 4", new MiembroEnGrupo(profesor4, grupo3, Rol.ADMINISTRADOR), LocalDate.of(2020, 06, 24), tipo4, idioma2, lugar5, Arrays.asList(new PalabraClave[] {palabraClave1}), "Enlace 4", "Resumen 4");
//        Publicacion publicacion5 = new Publicacion("Título 5", new MiembroEnGrupo(profesor4, grupo5, Rol.COLABORADOR), LocalDate.of(2020, 06, 24), tipo5, idioma3, lugar5, Arrays.asList(new PalabraClave[] {palabraClave2, palabraClave3, palabraClave4}), "Enlace 5", "Resumen 5");
//        
//        publicaciones.add(publicacion1);
//        publicaciones.add(publicacion2);
//        publicaciones.add(publicacion3);
//        publicaciones.add(publicacion4);
//        publicaciones.add(publicacion5);
//      
//        for(Publicacion p : publicaciones) {
//            p.mostrar();
//            System.out.println();
//        }
        //PUBLICACIONES

      //</editor-fold>   
     //<editor-fold defaultstate="collapsed" desc="Intefaz gráfica"> 
         VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); //se instancia la ventana
/*
//        ventanaGrupo.setLocationRelativeTo(null); //se centra la ventana
//        ventanaGrupo.setVisible(true); //se hace visible la ventana
        
//        VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
//        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
//        ventanaAlumno.setVisible(true); //se hace visible la ventana
*/        
        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null); //se instancia la ventana
        ventanaProfesor.setLocationRelativeTo(null); //se centra la ventana
        ventanaProfesor.setVisible(true); //se hace visible la ventana        
/*        
//        VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); //se instancia la ventana
//        ventanaIdioma.setLocationRelativeTo(null); //se centra la ventana
//        ventanaIdioma.setVisible(true); //se hace visible la ventana                
        
//        VentanaALugar ventanaLugar = new VentanaALugar(null); //se instancia la ventana
//        ventanaLugar.setLocationRelativeTo(null); //se centra la ventana
//        ventanaLugar.setVisible(true); //se hace visible la ventana                        
        
//        VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); //se instancia la ventana
//        ventanaPalabraClave.setLocationRelativeTo(null); //se centra la ventana
//        ventanaPalabraClave.setVisible(true); //se hace visible la ventana                                
        
//        VentanaATipo ventanaTipo = new VentanaATipo(null); //se instancia la ventana
//        ventanaTipo.setLocationRelativeTo(null); //se centra la ventana
//        ventanaTipo.setVisible(true); //se hace visible la ventana   
*/

     //</editor-fold>
    
    ArrayList<Alumno> alumnos = new ArrayList<>();
    ArrayList<Profesor> profesores = new ArrayList<>();
    ArrayList<Grupo> grupos = new ArrayList<>();
    ArrayList<Idioma> idiomas = new ArrayList<>();
    ArrayList<Lugar> lugares = new ArrayList<>();
    ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
    ArrayList<Publicacion> publicaciones = new ArrayList<>();
    ArrayList<Tipo> tipos = new ArrayList<>();
    ArrayList<Autor> autores = new ArrayList<>();

//Creacion de alumnos
        Alumno a1 = new Alumno(1, "Matienzo", "Lucca", "23", "1");
        Alumno a2 = new Alumno(2, "Villafanie", "Maria de los Angeles", "22", "2");
//Control si existe o no un alumno con el mismo dni
        if (!alumnos.contains(a1))
            alumnos.add(a1);
        if (!alumnos.contains(a2))
            alumnos.add(a2);
//For para mostrar los alumnos
        for(Alumno a : alumnos)
            a.mostrar();
//Creacion de profesores
        Profesor p1 = new Profesor(10, "Nieto", "Luis", "10", Cargo.TITULAR);
        Profesor p2 = new Profesor(20, "Sanchez", "Mariana", "19", Cargo.TITULAR);
//Control si existe o no un profesor con el mismo dni
        if (!profesores.contains(p1))
            profesores.add(p1);
        if (!profesores.contains(p2))
            profesores.add(p2);
//For para mostrar los profesores 
        for(Profesor p : profesores)
            p.mostrar();    
//Creacion de nuevos grupos
        Grupo g1 = new Grupo("Grupo 16", "Aprobado");
        Grupo g2 = new Grupo("Grupo 23", "Aprobado");
//Control si existe o no un grupo con el mismo nombre
        if (!grupos.contains(g1))
            grupos.add(g1);
        if (!grupos.contains(g2))
            grupos.add(g2);
//For para mostrar los grupos    
        for(Grupo g : grupos)
            g.mostrar();
//Creacion de nuevos objetos idioma
        Idioma i1 = new Idioma("Ingles");
        Idioma i2 = new Idioma("Espaniol");
//Control si hay o no otro idioma igual
        if (!idiomas.contains(i1))
            idiomas.add(i1);
        if (!idiomas.contains(i2))
            idiomas.add(i2);
//For para mostrar idioma
        for(Idioma i : idiomas)
            System.out.println(i); 
//Creacion de nuevos lugares
        Lugar l1 = new Lugar("S");
        Lugar l2 = new Lugar("A");
//Control si existe o no otro lugar igual segun el nombre
        if (!lugares.contains(l1))
            lugares.add(l1);
        if (!lugares.contains(l2))
            lugares.add(l2);
//For para mostrar lugar        
        for(Lugar l : lugares)
            System.out.println(l); 
//Creacion de nuevos tipos
        Tipo t1 = new Tipo("Anfiteatro");
        Tipo t2 = new Tipo("Anfiteatro");        
//Control si existe o no otro tipo igual segun el nombre
        if (!tipos.contains(t1))
            tipos.add(t1);
        if (!tipos.contains(t2))
            tipos.add(t2);
//For para mostrar los tipos
        for(Tipo t : tipos)
            System.out.println(t);     
//Creacion de nuevas palabras claves
        PalabraClave pc1 = new PalabraClave("Eficiencia");
        PalabraClave pc2 = new PalabraClave("Comodidad");
        if (!palabrasClaves.contains(pc1))
            palabrasClaves.add(pc1);
        if (!palabrasClaves.contains(pc2))
            palabrasClaves.add(pc2);
//For para mostrar palabras claves
        for(PalabraClave pac : palabrasClaves)
            System.out.println(pac);  
//Creacion de nuevas publicaciones
        Publicacion pub1 = new Publicacion("Matrices", new MiembroEnGrupo(p1, g1, Rol.ADMINISTRADOR), LocalDate.of(2002, 01, 23), t1, i1, l1, Arrays.asList(new PalabraClave[] {pc1}), "-", "Onemanarmy");
        Publicacion pub2 = new Publicacion("Matrices", new MiembroEnGrupo(p1, g1, Rol.ADMINISTRADOR), LocalDate.of(2002, 01, 23), t1, i1, l1, Arrays.asList(new PalabraClave[] {pc2}), "", "One");
//Control si hay o no otra publicacion igual segun el titulo
        if (!publicaciones.contains(pub1))
            publicaciones.add(pub1);
        if (!publicaciones.contains(pub2))
            publicaciones.add(pub2);
//For para mostrar las publicaciones
        for(Publicacion p : publicaciones) {
            p.mostrar();
        }
    
//    Creacion de autores
    Autor profesor3 = new Profesor(42678908,"Lucca","Matienzo","clave",Cargo.TITULAR);
    Autor alumno3 = new Alumno(23647897, "Perez", "Juana", "2", "4");
    
    if(!autores.contains(profesor3))
        autores.add(profesor3);
    if (!autores.contains(alumno3))
        autores.add(alumno3);
    
//    para mostrar autores
     for(Autor a : autores){
         a.mostrar();
     }
    }

    
    
}
