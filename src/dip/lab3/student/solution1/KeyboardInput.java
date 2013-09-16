/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Nathaniel
 */
public class KeyboardInput implements Input{
    Scanner keyboard = new Scanner(System.in);
    
    @Override
    public String input(){
        System.out.println("Input your message:");
        return keyboard.nextLine();
    }
}
