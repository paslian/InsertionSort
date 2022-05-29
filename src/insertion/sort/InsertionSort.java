
package insertion.sort;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class InsertionSort {
    /**
     * @param args the command line arguments
     */

    public static void spasi(){
        System.out.println(" ");
        System.out.println("================================================================");
        System.out.println(" ");
}

    public static void thankyou(){
        System.out.println(" ");
        System.out.println("\n================================================================");
        System.out.println("=======================     Thank You     ======================");
        System.out.println("================================================================");
        System.out.println(" ");
}

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    boolean running = true;
        System.out.println("================================================================");
        System.out.println("==     SISTEM MENGURUTKAN DATA MENGGUNAKAN INSERTION SORT     ==");
        System.out.println("================================================================\n\n");

    while (running){
        System.out.println("pilih tipe data yang ingin di sorting");
        System.out.println("1. String\n2. Int\n3. Double");
        System.out.print("Masukkan pilihan dengan angka = ");
        int pilihan = in.nextInt();
                spasi();
        switch (pilihan) {
            case 1 : System.out.print("masukkan jumlah kata kata yang ingin di sort : ");
                int jumlahString = in.nextInt();
                if(jumlahString <= 1){
                    spasi();
                    System.out.println("data harus lebih dari 1 kata");
                    running = true;
            }
                if(jumlahString > 1){
                    String [] String = new String [jumlahString];
                    for(int a = 0; a < jumlahString; a++){
                     System.out.print("Kata ke-"+(a+1)+" : ");
                     String[a]=in.next();
                    }
                    spasi();
                    insertionsortString(String);
            }

                break;

            case 2 : System.out.print("masukkan jumlah angka yang ingin di sort : ");
                int jumlahInt = in.nextInt();
                if(jumlahInt <= 1){
                    spasi();
                    System.out.println("data harus lebih dari 1 angka");
                    running = true;
            }
                if(jumlahInt > 1){
                int [] nilai = new int [jumlahInt];
                for(int a = 0; a < jumlahInt; a++){
                 System.out.print("angka ke-"+(a+1)+" : ");
                 nilai[a]=in.nextInt();
                }
                spasi();
                insertionsortint(nilai);
            }
                break;

            case 3 : System.out.print("masukkan jumlah angka berkoma yang ingin di sort : ");
                int jumlahDouble = in.nextInt();
                if(jumlahDouble <= 1){
                    spasi();
                    System.out.println("data harus lebih dari 1 angka berkoma");
                    running = true;
            }
                if(jumlahDouble > 1){
                double [] Double = new double [jumlahDouble];
                for(int a = 0; a < jumlahDouble; a++){
                 System.out.print("Angka Berkoma ke-"+(a+1)+" : ");
                 Double[a]=in.nextDouble();
                }
                spasi();
                insertionsortDouble(Double);
            }
                break;                

            default:
                System.out.println("Pilihan tidak ada");
        }
        spasi();
        System.out.println("Apakah anda ingin mengulangi program (yes/no)");
        System.out.print("pilihan : ");
        String jawab = in.next();
        if(jawab.equalsIgnoreCase("yes")){
           spasi();
           running = true;
        }
        if(jawab.equalsIgnoreCase("no")) {
           running = false;
           thankyou();
        }
        
    }
}

    public static void insertionsortString(String[]nama) {

        //sebelum diurutkan
        System.out.println("== urutan data String sebelum di sorting ==");
        for (String c : nama){
            System.out.print(c + ", ");
        }
        //logic
            for(int i = 1; i < nama.length; i++){
            for(int j = i; j > 0; j--) { 
            if(nama[j].compareTo(nama[j-1])<0){

        //ditukar
        String tampungan = nama[j];
        nama[j] = nama[j-1];
        nama[j-1] = tampungan;
        }
    }
}

        //tampilan data sesudah diurutkan
        int o = 0;
        System.out.println("\n\n== urutan data String sesudah di sorting ==");
        for (String c : nama){
            System.out.print(c + ", ");
            }
            System.out.println(" ");
        }
   
   

    public static void insertionsortint(int[]bilangan) {

        //sebelum diurutkan
        System.out.println("== urutan data Int sebelum di sorting ==");
        for (int b : bilangan){
            System.out.print(b + ", ");
        }
        //logic
            for(int i = 1; i < bilangan.length; i++){
            for(int j = i; j > 0; j--) { 
            if(bilangan[j]<bilangan[j-1]){

        //ditukar
        int tampungan = bilangan[j];
        bilangan[j] = bilangan[j-1];
        bilangan[j-1] = tampungan;
        }
    }
}

        //tampilan data sesudah diurutkan
        System.out.println("\n== urutan data Int sesudah di sorting ==");
        for (int b : bilangan){
            System.out.print(b + ", ");
            }
            System.out.println(" ");
        }
   
    public static void insertionsortDouble(double[]bilangan) {

        //sebelum diurutkan
        System.out.println("== urutan data Double sebelum di sorting ==");
        for (double b : bilangan){
            System.out.print(b + ", ");
        }
        //logic
            for(int i = 1; i < bilangan.length; i++){
            for(int j = i; j > 0; j--) { 
            if(bilangan[j]<bilangan[j-1]){

        //ditukar
        double tampungan = bilangan[j];
        bilangan[j] = bilangan[j-1];
        bilangan[j-1] = tampungan;
        }
    }
}

        //tampilan data sesudah diurutkan
        System.out.println("\n== urutan data Double sebelum di sorting ==");
        for (double b : bilangan){
            System.out.print(b + ", ");
            }
            System.out.println(" ");
        }
    }

