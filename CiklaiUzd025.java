package UzdaviniaiCiklai2;
//12.	Pavasaris | Kiekio ir sumos skaičiavimo algoritmai
//Dienos ilgumas šiandien buvo v1 valandų ir m1 minučių.
//Kiekviena kita diena ilgesnė už prieš tai buvusią m minučių. Parašykite programą,
//skaičiuojančią po kelių dienų d dienos ilgumas bus lygus arba didesnis už v2 valandų ir m2 minučių.
//Pradiniai duomenys įvedami klaviatūra tokia tvarka: v1, m1, v2, m2, m.
//Rezultatas rodomas ekrane.
//Pradiniai duomenys	Rezultatai
//15 35 16 24 3	    17

import java.util.Scanner;

public class CiklaiUzd025 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int v1, m1, v2, m2, m;

        System.out.print("Dienos ilgumas (hh mm) dabar: ");
        v1 = reader.nextInt();
        m1 = reader.nextInt();
        System.out.print("Galutinis dienos ilgumas (hh mm): ");
        v2 = reader.nextInt();
        m2 = reader.nextInt();
        System.out.print("Kiek min kiekvieną dieną ilgėja diena: ");
        m = reader.nextInt();

        int sumMin1=(v1 * 60)+m1;
        int sumMin2=(v2 * 60)+m2;
        int dayCounter=0;

        while (sumMin1<=sumMin2) {
            sumMin1=sumMin1+3;
            dayCounter++;
            }

        System.out.printf("Po %d dienų dienos ilgumas bus lygus arba didesnis %d val ir %d min", dayCounter, v2, m2);

        reader.close();
    }
}

