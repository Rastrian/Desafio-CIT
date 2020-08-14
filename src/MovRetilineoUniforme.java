public class MovRetilineoUniforme { 
    private static Float horizontalMovimentDistance(Double velocity, Double angle, Double secondsTime){
        return (float) ((velocity/3.6) * (Math.cos(Math.toRadians(angle))) * secondsTime);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(horizontalMovimentDistance(80.00, 45.00, 5.0));
    }
}