public class latihan6 {
	public static void main(String args []) {
		char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama Anda : ");
		try{
			hurufAwal = (char)System.in.read();
			}catch(Exception e) {
				System.out.println("Salah ko menginput cess...!");
				}
				switch(hurufAwal){
					case (char)-1 :System.out.println("bukan huruf depan !!!");break;
					case 'a' : System.out.println("Apa namamu amin ?"); break;
					case 'b' : System.out.println("Apa namamu bambang ?"); break;
					case 'c' : System.out.println("Apa namamu ceceo ?"); break;
					case 'd' : System.out.println("Apa namamu daud ?"); break;
					case 'e' : System.out.println("Apa namamu endang ?"); break;
					default : System.out.println("Aku tidak bisa menebak");
				}
			}
		}