public class YoshiIsland {
    
    public static void main(String[] args) {
        System.out.println("N° of Yoshis who like 1 location: "
        + YoshiIslandCalculator.getNumberOfYoshisLikeOneLocation(
            1000, 450, 330, 340, 200, 180, 100, 30
        ));

        System.out.println("N° of Yoshis who DISLIKE ALL LOCATIONS: "
        + YoshiIslandCalculator.getNumberOfDislikesOfYoshisOnAllLocations(
            1000, 450, 330, 340, 200, 180, 100, 30
        ));
    }
}