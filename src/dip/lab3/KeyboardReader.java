/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Nick
 */
public class KeyboardReader implements Reader{
    @Override
    public String readln() {
        System.out.println("Please enter some text to display");
        
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
