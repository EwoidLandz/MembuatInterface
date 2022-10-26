/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatUserInterface;
import java.awt.*;

public class LatihanMembuatButton {
	public static void main(String [] args) {
//	Melakukan inisialisasi class objek
		Frame objek_frame = new Frame("Latihan Menggunakan BUTTON 1");
		
		Button objek_button = new Button("Tekan Di Sini");
		objek_button.setBounds(50, 100, 80, 30);
		
		objek_frame.add(objek_button);
		objek_frame.setSize(300,300);
		objek_frame.setLayout(null);
		objek_frame.setVisible(true);
//	objek frame
	}
}

