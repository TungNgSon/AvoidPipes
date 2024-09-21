/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avoidpipes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AvoidPipes extends JFrame
{
    public AvoidPipes()
    {
        this.add(new ControlWindow());
        this.pack();
        this.setTitle("Avoid Pipes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new AvoidPipes();
    }
    
}
