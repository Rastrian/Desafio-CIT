import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LaraIsProblematicImSureAboutThis {
    private final static int SECONDSPERTRY = 2;

    private static Object getRandomElement(String type) {
        List<Character> list = null; List<Integer> listInteger;
        Random random = new Random();
        if (type == "number"){
            listInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
            return listInteger.get(random.nextInt(listInteger.size()));
        }
        if (type == "letter"){
            list = Arrays.asList('A','B','C','D','E','F');
            return (Character.toString(list.get(random.nextInt(list.size()))));
        }
        return null;
    }

    private static boolean containsValidLetters(String word){
        if (word.contains("A") && word.contains("D"))
            return true;
        return false;
    }

    private static boolean containsValidInitialNumber(int number){
        if ((number == 3) || (number == 6))
            return true;
        return false;
    }

    private static boolean containsUniqueLetters(String word){
        if (word.length() > 3)
            word.substring(0,3);

        for (int i = 0; i < word.length(); i++) 
            for (int j = i + 1; j < word.length(); j++) 
                if (word.charAt(i) == word.charAt(j)) 
                    return false; 
        return true; 
    }

    private static void listAllPossibleCombinations() {
        int[] number = new int[3]; String[] letter = new String[3];
        int max = 120; int trys = 0;
        String word; boolean state = true;

        LinkedList<String> passwords = new LinkedList<String>();

        while (state) {
            if (passwords.size() >= max){
                state = false;
            }
            trys++;

            word = "";

            number[0] = (int) getRandomElement("number");   
            number[1] = (int) getRandomElement("number");
            number[2] = (int) getRandomElement("number");

            letter[0] = (String) getRandomElement("letter");   
            letter[1] = (String) getRandomElement("letter");
            letter[2] = (String) getRandomElement("letter");

            word = ""+letter[0]+letter[1]+letter[2]+
            Integer.toString(number[0]) + Integer.toString(number[1]) + Integer.toString(number[2])+"";

            if ((number[0]+number[1]+number[2])==8){
                if (containsValidLetters(word)){
                    if (containsUniqueLetters(word)){
                        if (containsValidInitialNumber(number[0])){
                            if (!passwords.contains(word))
                                trys = 0;
                                passwords.add(word);
                        }
                    }
                }
            }

            if (trys >= (max*10000)){
                max = passwords.size();
            }
        }
        System.out.println(passwords.toString());
        System.out.println("Tempo: "+getTimeOfCombinations(passwords.size()) + " minuto(s)");
        System.out.println("Qtde de Combinações: "+passwords.size());
    }

    private static float getTimeOfCombinations(double number) {
        return (float)((number * SECONDSPERTRY) / 60);
    }

    public static void main(String[] args) {
        listAllPossibleCombinations();
    }
}