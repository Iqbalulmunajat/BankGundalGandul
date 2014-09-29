import java.io.*;
import java.io.BufferedReader;			//untuk membaca input dari keputusan
import java.io.IOException;				//untuk membaca karakter dari keputusan
import java.io.InputStreamReader; 
import java.util.Scanner;
    class tabungan {
		String bank;
		String nama_nasabah;
		String rekening;
		int nabung;
		int penarikan;


    void saldo2() {
		System.out.println (""+ (nabung - penarikan));
    }

    }
    public class bank_gundalgandul {
	
    static Scanner input=new Scanner (System.in);

    public static void main(String[] bank) throws Exception {
	BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
    tabungan t;
	int i = 0;
	String keputusan="Y";
	t= new tabungan();
	System.out.println(" **********************************************");
    System.out.println("\n\tBANK GUNDAL-GANDUL INFORMATIKA (BGI)");
	System.out.println("\t        MELAYANI DENGAN TULUS");
	System.out.println("\n **********************************************");
	System.out.println(" Selamat Datang di BANK GUNDAL-GANDUL INFORMATIKA (BGI)");
    System.out.println(" Tekan Enter Untuk Melanjutkan...");
	String caset=input.nextLine();
	System.out.print("");

   
    boolean status = false;
    int kembali=0;
    while (kembali!=1){
    System.out.println();
    System.out.println("+======= BANK GUNDAL-GANDUL INFORMATIKA (BGI)=======+");
	System.out.println("+		JL. AH NASUTION NO. 105 CIBIRU-BANDUNG		+"); 
    System.out.println("+=========================================+");
    System.out.println();
    System.out.println("+____________________*MENU PILIHAN*_____________________+");
    System.out.println("| 1. MENABUNG						|");
    System.out.println("| 2. PENARIKAN						|");
    System.out.println("| 3. CEK SALDO						|");
    System.out.println("| 4. LIHAT DATA RINCI					|");
    System.out.println("| 5. KELUAR						|");
    System.out.println("+_______________________________________________________+");
    System.out.println();
	
	while (keputusan.equals("Y")||keputusan.equals("y"))
        {
	
			System.out.print("Masukan Pilihan Anda : ");
			int pilihan=Integer.parseInt(input.next());
    
			switch(pilihan){
	
			case 1:
				System.out.println ("SILAHKAN MASUKAN DATA ANDA");
				System.out.print ("NAMA NASABAH 		: ");
				t.nama_nasabah =  input.next();
				System.out.print ("NO REKENING		: ");
				t.rekening =  input.next();
				System.out.print ("JUMLAH MENABUNG	: ");
				t.nabung =  input.nextInt();
				status = true;
				System.out.println("________________________________________________");
				System.out.println();
		
				String case1=input.nextLine();
				System.out.print("Apakah anda ingin transaksi lagi ? Y/T : ");
					try{
						keputusan = input2.readLine();
					}
						catch(IOException e){
						System.out.println("Gagal Membaca Keyboard");
					}
								
					System.out.println("");
		
				kembali=1;
				
			break;

			case 2:
				if (status == true){
					System.out.print ("\nMasukkan Jumlah Tarik Tunai: Rp. ");
					t.penarikan =  input.nextInt();
					System.out.print ("\nPenarikan Tunai Berhasil...");
				}
				else {
					System.out.println("________________________________________________\n");
					System.out.println ("MAAF TABUNGAN ANDA TIDAK ADA");
				}
				System.out.println("\n________________________________________________");
				String case2=input.nextLine();
				System.out.print("");
				
				System.out.print("Apakah anda ingin transaksi lagi ? Y/T : ");
					try{
						keputusan = input2.readLine();
					}
						catch(IOException e){
						System.out.println("Gagal Membaca Keyboard");
					}
								
					System.out.println("");
		
			break;

			case 3:
				System.out.println("________________________________________________\n");
				System.out.print ("\nSALDO ANDA: Rp. ");
				t.saldo2();
				System.out.println("\n________________________________________________");
				String case3=input.nextLine();
				System.out.print("");
				
				System.out.print("Apakah anda ingin transaksi lagi ? Y/T : ");
					try{
						keputusan = input2.readLine();
					}
						catch(IOException e){
						System.out.println("Gagal Membaca Keyboard");
					}
								
					System.out.println("");
		
			break;

			case 4:
				System.out.println("________________________________________________\n");
				System.out.println( "NAMA NASABAH :" +t.nama_nasabah);
				System.out.println( "REKENING :" +t.rekening);
				System.out.println( "MENABUNG : " +t.nabung);
				System.out.println( "PENARIKAN :"+t.penarikan);
				System.out.println("________________________________________________");
				String case4=input.nextLine();
				System.out.print("");
				
				System.out.print("Apakah anda ingin transaksi lagi ? Y/T : ");
					try{
						keputusan = input2.readLine();
					}
						catch(IOException e){
						System.out.println("Gagal Membaca Keyboard");
					}
								
					System.out.println("");
		
			break;

			case 5:
				System.out.println("________________________________________________\n");
				System.out.println ("TERIMA KASIH TELAH BERTRANSAKSI ");
				System.out.println("________________________________________________\n");
				System.out.print("");
				System.exit(0);
		
				default:
				System.out.println("Maaf pilihan menu anda tidak tepat, silahkan masukan pilihan kembali ");
				System.out.println(""); 
				
		
		
		}
		
			}
    
			}
		}		
}


