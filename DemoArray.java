public class DemoArray{ 
	public static void main(String[] args) {
		System.out.print("\n Contoh 1\n");
		String nama[] = new String[5];

		nama[0] = "Andi Novianto";
		nama[1] = "Zidna Aisya";

		System.out.println(nama[0]);
		System.out.println(nama[1]);
		System.out.println(nama[2]);

		System.out.print("\n Contoh 2\n");
		int nilai[] = {75,80,90,100};

		System.out.println("Cetak Nilai Elemen 0 : " + nilai[0]);
		System.out.println("Cetak Nilai Elemen 1 : " + nilai[1]);
		System.out.println("Cetak Nilai Elemen 2 : " + nilai[2]);
		System.out.println("Cetak Nilai Elemen 3 : " + nilai[3]);

		int jumlah = nilai[1] + nilai[2] + nilai[3];
		System.out.println("Jumlah Nilai Elemen (1 + 2 + 3) : " + jumlah);
	}
}