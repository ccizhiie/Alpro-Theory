import java.util.Scanner;

public class HitungKelulusan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int lulus = 0;

        for (int i = 1; i <= n; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
    double nilai = sc.nextDouble();

    if (nilai >= 75) {
        lulus++;
        System.out.println("  dinyatakan Lulus");
    } else {
        System.out.println("  dinyatakan Tidak lulus");
    }
}
System.out.println("________________________________");
        System.out.println("Jumlah mahasiswa lulus = " + lulus);
        System.out.println("Jumlah mahasiswa Tidak Lulus = " + (n - lulus));

        sc.close();
    }
}
