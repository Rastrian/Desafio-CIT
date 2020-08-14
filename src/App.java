public class App {
    private static float calcDias(Double distancia, Double velocidadeMedia) {
        return (float) ((distancia/velocidadeMedia)/24);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(calcDias(149600000.00, 28440.00));
    }
}
