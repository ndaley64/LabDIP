/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.FileNotFoundException;

/**
 *
 * @author Nathaniel
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Input input = new GuiInput();
        Output output = new TextFileOutput();
        
        MessageHandler messageHandler = new MessageHandler(input, output);
        
        messageHandler.transferMessage();
        
        input = new KeyboardInput();
        output = new GuiOutput();
        
        messageHandler.setInput(input);
        messageHandler.setOutput(output);
        
        messageHandler.transferMessage();
    }
}
