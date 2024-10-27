/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

import java.util.Scanner;


/**
 *
 * @author tweet
 */

public class bmiBeraksi {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("tinggi badan anda : ");
        double tinggi = inputan.nextDouble();
        System.out.print("berat badan anda : ");
        double berat = inputan.nextDouble();
        bmi bmialfred = new bmi(tinggi, berat);
        bmialfred.hasil();
    }
}
