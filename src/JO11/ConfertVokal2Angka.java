/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JO11;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ConfertVokal2Angka {
    Scanner scanner = new Scanner(System.in);
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConfert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    public static void main(String[] args){
    String identitas = "Mohammad Daffa Khalfani Sujatmiko / X-RPL-3 / 23";
    
    tampilJudul(identitas);
    }
    private static String tampilInput(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
        
    }
    String kalimat = tampilInput();
    private static String vocal2Angka(String kalimat){
     char [][] arConvert =
     {
         {'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}
     };
     
     kalimat = kalimat.toLowerCase();
     for(int i=0; i<arConvert.length; i++)
         kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
     
     return kalimat;
    }
    String convert = vocal2Angka(kalimat);
    private static void tampilPerKata(String kalimat, String convert){
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
        for(int i=0; i<arrKal.length; i++)
            System.out.println(arrKal[i]+" => "+arrCon[i]);
    }
    tampilPerKata(kalimat, convert);
    private static void tampilHasil(String convert){
        System.out.println("Kalimat Alay Angka : " + convert);
    }
    tampilHasil(convert);
}
