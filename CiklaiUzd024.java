package UzdaviniaiCiklai2;
//11. Dėžutės | Kiekio ir sumos skaičiavimo algoritmai
//Jonas paneša k gramų. Jis renkasi iš eilės sustatytas dėžutes.
//Pirmoji dėžutė sveria d1 gramų, antroji – d2 ir t.t. Parašykite programą,
//skaičiuojančią kelias dėžutes n galės paimti Jonas.
//Pradiniai duomenys įvedami klaviatūra: k, d1, d2, d3, …
//Rezultatas – Jono panešamų dėžučių skaičius n – išvedamas į ekraną.
//Pradiniai duomenys	Rezultatai
//1000
//100
//400
//600                	2
//---------------------
//750
//100
//400
//200
//75	                3
//---------------------
//130
//5
//15
//30
//80	                4

import java.util.Scanner;

public class CiklaiUzd024 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int k, box, counter=0, sum=0;

        System.out.print("Kiek gramų paneša Jonas: ");
        k = reader.nextInt();

        while (sum<k) {
            System.out.print("Kiek gramų sveria dėžutė: ");
            box = reader.nextInt();
            sum=sum+box;
            if (sum<=k) {
                counter++;
            }
        }

        System.out.printf("Jonas gali panešti %d dėžutės", counter);

        reader.close();
    }
}
