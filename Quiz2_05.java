import java.util.Scanner;
public class Quiz2_05{
    public static void main (String[] args)throws Exception{
        System.out.println("=====QUIZ 2 PRAKTIKUM ASD TI -  1G=====");
        System.out.println("Dibuat oleh\t: Arainal Aldiansyah");
        System.out.println("Nim\t\t: 2141720042");
        System.out.println("Absen\t\t: 05");
        System.out.println("=======================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        DoubleLinkedList_05 dll = new DoubleLinkedList_05();

        Pembeli_05 bl = new Pembeli_05();
        Pesanan_05 psn = new Pesanan_05();
        int pilih;
        do {
            System.out.println("===============================");
            System.out.println("Menu");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih Menu (1-5): ");
            pilih = sc.nextInt();
            System.out.println("");
            if (pilih == 1){
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data pembeli");
                System.out.println("-----------------------------");
                System.out.print("No Antrian : ");
                int no_antri = sc.nextInt();
                System.out.print("Nama Customer : ");
                String nama_pembeli = ss.nextLine();
                System.out.print("No Hp: ");
                String hp = sc.next();
                System.out.println("");
                bl = new Pembeli_05(no_antri, nama_pembeli, hp);
                dll.addLast(bl);
            }
            if (pilih == 2){
                dll.print();

            }
            if (pilih == 3){
                dll.removeFirst();
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Pesanan");
                System.out.println("-----------------------------");
                System.out.print("No Pesanan: ");
                int kd_pesanan = sc.nextInt();
                System.out.print("Nama Pesanan : ");
                String nama_pesanan = ss.nextLine();
                System.out.print("Harga: ");
                int harga= sc.nextInt();
                System.out.println("");
                psn = new Pesanan_05(kd_pesanan, nama_pesanan, harga);


            }
            if (pilih == 4){

            }
            if (pilih == 5){

            }
            if (pilih == 6){
                pilih = 6;
            }

        } while (pilih <6);

    
    }
}