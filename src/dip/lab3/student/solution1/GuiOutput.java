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
public class GuiOutput implements Output{
    @Override
    public void output(String output){
        JOptionPane.showMessageDialog(null, output);
    }
}
