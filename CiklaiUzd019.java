package UzdaviniaiCiklai2;
//6.VARDAS
//Parašykite programą, kuri atspausdintų Jūsų vardą n kartų.
//-----------------------------------------------------------
//Įvesta: 3
//Gauta: Vardas Vardas Vardas
import java.util.Scanner;
public class CiklaiUzd019 {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.print("Iveskite n:");
        int n = rd.nextInt();
        System.out.print("Gauta: ");

        for(int i=1; i<=n; i++) {
            System.out.print("Justina ");
        }

        rd.close();
    }
}

