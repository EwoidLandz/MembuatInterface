/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatUserInterface;
import javax.swing.*;
public class LatihanMembuatComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("ComboBox Example");
		String country [] = {"SOLO", "JOGJA", "INGGRIS", "BANTUL", "REMBANG"};
		JComboBox cb = new JComboBox(country);
		cb.setBounds(50, 50, 90, 20);
		f.add(cb);
		f.setLayout(null);
		f.setSize(400, 500);
		f.setVisible(true);
	}

}

