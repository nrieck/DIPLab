/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Nick
 */
public class CopyInput{
        private final Reader reader;
	private final Writer writer;

    
	public CopyInput( Reader reader, Writer writer ) {
		this.reader = reader;
		this.writer = writer;
	}
	
	public void copy() {
            String line = reader.readln();
            writer.writeln( line );
	}
}
