/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;
/**
 *
 * @author Lucca Matienzo
 */
import javax.swing.*;

public class ModelCarg extends DefaultComboBoxModel {
    public ModelCarg() {
        for (Cargo cargo : Cargo.values()) {
            this.addElement(cargo);
        }

    }
    public Cargo obtenerCargo() {
        return (Cargo)this.getSelectedItem();
    }
}
