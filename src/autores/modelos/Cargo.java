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
public enum Cargo {
    TITULAR("Titular"), 
    ASOCIADO("Asociado"),
    ADJUNTO("Adjunto"),
    JTP("Jefe de Trabajos Practicos"),
    ADG("Auxiliar Docente Graduado");
    
    private String item;
    
    private Cargo (String cargo){
        this.item = cargo;
    }
    @Override
    public String toString() {
        return item;
    }

}
