package UzdaviniaiCiklai2;
//2.	KVADRATU
//Parašykite programą, kuri atspausdintų visus vienaženklius skaičius pakeltus kvadratu.
//-----------------------------------------------------------
//Gauta:
//0 – 0;
//1 – 1;
//2 – 4;
//...
//9 – 81;

public class CiklaiUzd015 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            double y = Math.pow(i, 2);
            System.out.println(i+" ir "+y);
        }

    }
}
