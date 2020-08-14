
public class YoshiIslandCalculator {
    public static int getNumberOfYoshisLikeOneLocation(int max, int like_yoshi, int like_chocolate, int like_cookie,
                        int like_YCH, int like_YCO, int like_CHCO, int like_all){

        // exclude all
        like_YCH = like_YCH - like_all; like_YCO = like_YCO - like_all; like_CHCO = like_CHCO - like_all;

        // exclude groups - all
        like_yoshi = like_yoshi - like_YCO - like_YCH - like_all;
        like_chocolate = like_chocolate - like_YCH - like_CHCO - like_all;
        like_cookie = like_cookie - like_CHCO - like_YCO - like_all;

        return (like_yoshi + like_chocolate + like_cookie);
    }

    public static int getNumberOfDislikesOfYoshisOnAllLocations(int max, int like_yoshi, int like_chocolate, int like_cookie,
                        int like_YCH, int like_YCO, int like_CHCO, int like_all){

        // exclude all
        like_YCH = like_YCH - like_all; like_YCO = like_YCO - like_all; like_CHCO = like_CHCO - like_all;

        // exclude groups - all
        like_yoshi = like_yoshi - like_YCO - like_YCH - like_all;
        like_chocolate = like_chocolate - like_YCH - like_CHCO - like_all;
        like_cookie = like_cookie - like_CHCO - like_YCO - like_all;

        return (max - like_yoshi - like_chocolate - like_cookie - like_all - like_YCH - like_YCO - like_CHCO);
    }
}