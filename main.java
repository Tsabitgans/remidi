import java.util.Scanner;
public class main {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.println("========DAFTAR MENU=====");
		System.out.println("Gurami asam manis	=	Rp 30.000");
		System.out.println("Ayam goreng kremes	=	Rp 18.000");
		System.out.println("Soto daging		=	Rp 15.000");
		System.out.println("Ayam penyet		=	Rp 17.000");
		System.out.println("Bebek goreng		=	Rp 15.000");
		System.out.println("Steak			=	Rp 45.000");
		
		int a = 30000;
		int b = 18000;
		int c =	15000;
		int d =	17000;
		int e = 15000;
		int f = 45000;
		System.out.println("               ");
				
		
		
		
		System.out.println("DAFTAR PESANAN :");
		
		System.out.print("||Gurami asam manis:");
		int A = input.nextInt();
		
		System.out.print("||Ayam goreng kremes:");
		int B = input.nextInt();
		
		System.out.print("||Soto daging:");
		int C = input.nextInt();
		
		System.out.print("||Ayam penyet:");
		int D = input.nextInt();
		
		System.out.print("||Bebek goreng:");
		int E = input.nextInt();
		
		System.out.print("||Steak:");
		int F = input.nextInt();
	
		
		
		int Total = 0;
		
		System.out.println("");	
			
		System.out.println("======DAFTAR MINUMAN=====");
		System.out.println("Es teh		= Rp 3.000");
		System.out.println("Es jeruk	= Rp 4.000");
		System.out.println("Es degan	= Rp 5.000");
		
		int g=3000;
		int h=4000;
		int i=5000;
		
		System.out.println("=====JUMLAH PESANAN====");
		
		System.out.print("||Es teh:");
		int G = input.nextInt();
		
		System.out.print("||Es jeruk:");
		int H = input.nextInt();
		
		System.out.print("||Es degan:");
		int I = input.nextInt();
		
		int totalmakan = A*30000+B*18000+C*15000+D*17000+E*15000+F*55000;
		int totalminum = G*3000+H*4000+I*5000;
		int totalharga = totalmakan+totalminum;
		
		System.out.println("TOTAL PEMBAYAARAN = " + totalharga);
		System.out.println("");
		System.out.print("NOMINAL PEMBAYARAN:");
		int bayar = input.nextInt();
		int kembalian = bayar-totalharga;
		System.out.println("KEMBALIAN: " +kembalian );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}
