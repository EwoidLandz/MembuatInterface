/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatUserInterface;
import javax.swing.*;
/**
 *
 * @author PC
 */
public class LatihanMembuatScrollBar {
    public static void main(String [] args){
        JFrame f = new JFrame("ScrollBar Example");
        JScrollBar s = new JScrollBar();
        s.setBounds(100, 100, 50, 100);
        f.add(s);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
