package Praktikum01;

import java.util.Scanner;

public class PRAK102_2210817120003_IkhtiaraFakhrunisa {

	public static void main(String[] args) {
		  //--deklarasi variabel dan scanner
        Scanner input = new Scanner(System.in);
        int angka, bilangan;
        
        //--input 
        System.out.print("Input bilangan: ");
        angka = input.nextInt();
        
        //--proses
        int i = 0;
        while(i < 11 ) {
            if (angka %5 == 0){
                bilangan = (angka /5 )-1;
            } else {
                bilangan=angka;
            }
        
        //--output
        if(i == 10){
            System.out.print(bilangan);
        }else {
            System.out.print(bilangan);
        } 
        
        if(i < 10){
            System.out.print(", ");
        } else {
            System.out.print("");
        }
        
        angka++;
        i++;
            } 
}}