import java.util.Scanner;
public class tipepesawat {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int tipe_pesawat;
		
		System.out.print("Masukkan Tipe Pesawat Anda = ");
		tipe_pesawat = input.nextInt();
		
		if (tipe_pesawat == 1){
			System.out.println("Pesawat Garuda"); 
			}
			 else if (tipe_pesawat == 2) {
				System.out.println("Pesawat Batik");
				} 
				else if (tipe_pesawat == 3) {
					System.out.println("Pesawat Lion");
					} 
					else {
						System.out.println("PMaaf Anda Salah Memasukkan Tipe Pesawat");
						}
						
					}
				}
			
	
