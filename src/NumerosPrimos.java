import java.util.Vector;

public class NumerosPrimos {
    private static boolean isPrimeNumber(int number){
        if (number < 2) return false;

        int max = (int) Math.ceil(Math.sqrt(number));

        for (int i = 2; i < max; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    private static Vector<Integer> generatePrimeNumbersVector(int max) {
        Vector<Integer> vectors = new Vector<Integer>();
        for (int i = 1; i <= max; i++){
            if (isPrimeNumber(i)){
                vectors.add(i);
            }
        }
        return vectors;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(generatePrimeNumbersVector(120).toString());
    }
}