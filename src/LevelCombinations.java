public class LevelCombinations {
    private static int calcLevelCombinationAreas(int lvl1_Options, int lvl2_Options, int lvl3_Options, int lvl4_Options){
        int[] counter = new int[3]; int[] conditions = new int[3];

        // total without ANY condition
        conditions[0] = lvl1_Options * lvl2_Options * lvl3_Options * lvl4_Options;
        // total with condition
        conditions[1] = lvl1_Options * lvl2_Options * (lvl3_Options - 2);
        // total combinations
        conditions[2] = conditions[0] - conditions[1];

        // (Options - 1) * (Options Per Level Based (LVL 2 = LVL 3)) - (exeception if exists)
        counter[0] = 2 * lvl2_Options - 1; // A
        counter[1] = 2 * lvl3_Options; // B
        counter[2] = 2 * lvl4_Options; // C

        System.out.println("A: " + counter[0] +
                            "\nB: " + counter[1] +
                            "\nC: " + counter[2]);
        
        if (conditions[2] == (counter[0] + counter[1] + counter[2]))
            return conditions[2];

        return (counter[0] + counter[1] + counter[2]);
    }

    public static void main(String[] args) {
        System.out.println("Total: " + calcLevelCombinationAreas(1, 3, 3, 2));
    }     
}