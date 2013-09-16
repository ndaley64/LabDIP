/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Nathaniel
 */
public class MessageHandler {
    private Input input;
    private Output output;
    private String message;
    
    public MessageHandler(Input input, Output output){
        this.input = input;
        this.output = output;
    }
    
    public void transferMessage(){
        message = input.input();
        output.output(message);
    }
    
    public void setInput(Input input){
        this.input = input;
    }

    public void setOutput(Output output) {
        this.output = output;
    }
}
