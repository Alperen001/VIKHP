import java.util.Scanner;

public class VKIHP {

	public static void main(String[] args) {
		int b;
		double a,indeks;
		Scanner inp = new Scanner(System.in);
		System.out.println("Lütfen Boyunuzu Giriniz");
		a=inp.nextDouble();
		System.out.println("Lütfen Kilonuzu Giriniz");
		b=inp.nextInt();
		indeks=b/(a*a);
		System.out.println(indeks);
	}

}
