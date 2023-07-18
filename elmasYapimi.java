import java.util.Scanner;

public class elmasYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        int bosluk = yukseklik - 1;
        int yildiz = 1;

        // Üst yarım elmas
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }

            System.out.println();
            bosluk--;
            yildiz += 2;
        }

        bosluk = 1;
        yildiz = yukseklik * 2 - 3;

        // Alt yarım elmas
        for (int i = 0; i < yukseklik - 1; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }

            System.out.println();
            bosluk++;
            yildiz -= 2;
        }
    }
}
