/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatUserInterface;
import java.awt.*;
public class LatihanMembuatCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame objek_frame = new Frame("Latihan Membuat Check Box");
		
		Checkbox checkbox_c = new Checkbox("C++");
		checkbox_c.setBounds(100, 100, 50, 50);
		Checkbox checkbox_d = new Checkbox("Java");
		checkbox_d.setBounds(100, 150, 50, 50);
		Checkbox checkbox_e = new Checkbox("Python");
		checkbox_e.setBounds(100, 200, 60, 50);
		Checkbox checkbox_f = new Checkbox("Php");
		checkbox_f.setBounds(100, 250, 50, 50);
		
		objek_frame.add(checkbox_c);
		objek_frame.add(checkbox_d);
		objek_frame.add(checkbox_e);
		objek_frame.add(checkbox_f);
		objek_frame.setSize(400, 400);
		objek_frame.setLayout(null);
		objek_frame.setVisible(true);
	}

}

