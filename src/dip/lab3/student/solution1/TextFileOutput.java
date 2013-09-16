/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Nathaniel
 */
public class TextFileOutput implements Output{
    private PrintWriter outputFile;

    public TextFileOutput() throws FileNotFoundException {
        this.outputFile = new PrintWriter("output.txt");
    }
    
    @Override
    public void output(String output){
        this.outputFile.println(output);
        this.outputFile.close();
    }
}
