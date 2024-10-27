/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author tweet
 */
public class bmi {

    double tinggi;
    double berat;

    public bmi(double tinggi, double berat) {
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }

    public double hitung() {
        return berat / (tinggi * tinggi);
    }

    public void hasil() {
        double bmi = hitung();
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("berat berlebih");
        } else {
            System.out.println("obesitas");
        }
            System.out.printf ("hasil bmi anda : %.1f%n" , hitung());
    }
}
