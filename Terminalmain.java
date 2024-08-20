/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class Terminalmain {
    public static void main(String[] args) {
        String[] namabus = {"Sugeng Rahayu", "Rosalia Indah", "Sinar Jaya", "Gunung Harta"};
        String[] rutetujuan = {"Bandung", "Jakarta", "Denpasar", "Surabaya"};

        System.out.println("Pilihan Bus:");
        for (int i = 0; i < namabus.length; i++) {
            System.out.println((i + 1) + ". " + namabus[i]);
        }

        System.out.println("\nPilihan Jurusan:");
        for (int i = 0; i < rutetujuan.length; i++) {
            System.out.println((i + 1) + ". " + rutetujuan[i]);
        }

        // Membuat objek Bus berdasarkan pilihan
        int selectedBusIndex = 0; // Pilih bus pertama
        int selectedRouteIndex = 2; // Pilih jurusan ketiga 

        TerminalOOP Bus = new TerminalOOP (namabus[selectedBusIndex], rutetujuan[selectedRouteIndex]);

        System.out.println("\nAnda telah memilih:");
        Bus.displayInfo();
    }
}

    
