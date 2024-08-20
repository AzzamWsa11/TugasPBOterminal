/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class TerminalOOP {
    private String nama;
    private String rute;

    public TerminalOOP(String nama, String rute) {
        this.nama = nama;
        this.rute = rute;
    }

    public String getName() {
        return nama;
    }

    public String getRoute() {
        return rute;
    }

    public void displayInfo() {
        System.out.println("Bus: " + nama);
        System.out.println("Jurusan: " + rute);
    }
}


    

