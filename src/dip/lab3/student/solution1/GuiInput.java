/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Nathaniel
 */
public class GuiInput implements Input{
    @Override
    public String input(){
        return JOptionPane.showInputDialog(null, "Please enter your message: ");
    }
}
