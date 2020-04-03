import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner pindai = new Scanner(System.in);
        Scanner pindai2 = new Scanner(System.in);
        try {
            File file = new File("../out/out.txt");
            Scanner read = new Scanner(file);
            
            while (read.hasNextLine()) {
                String data = read.nextLine();
                String splitter[] = data.split(":",2);
                ll.add(splitter[0],splitter[1]);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        //tampilan program
        while (true) {
            System.out.println("-------LinkedList Program--------");
            System.out.println("\n 1. Cari Editor + Tampilkan Judul Artikel \n 2. Mengurutkan Nama Editor Sesuai Abjad \n 3. Tampilkan Semua Nama Editor + Judul Artikel \n 4. Exit");
            int pilihan = pindai.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Editor : ");
                String editor = pindai2.nextLine();
                ll.specialSearch(editor);

            } else if (pilihan == 2) {
                System.out.println();
                ll.displayWithoutTitle();
                System.out.println();

            } else if (pilihan == 3) {
                System.out.println();
                ll.displayWithTitle();
                System.out.println();

            } else if(pilihan == 4) {
                pindai.close();
                pindai2.close();
                System.exit(0);
               
            }
        }
        
    }
    
}