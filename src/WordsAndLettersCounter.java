import java.util.Scanner;

public class WordsAndLettersCounter {
    public static void main(String[] args) {
        String sentence;
        int count=0;
        int words;

        System.out.println("Wpisz jakieś zdanie do przeliczenia liter i słów:");
        Scanner scan = new Scanner(System.in);
        sentence = scan.nextLine();

        if (sentence.isEmpty()){
            count = 0;
            words =0;
        }
        else {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) != ' ' && sentence.charAt(i) != '.' && sentence.charAt(i) != ',') {
                    count++;
                }
            }
            String[] wordsArray = sentence.split("\\s+");
            words = wordsArray.length;
        }

        System.out.println("Twoje zdanie to: \""+sentence+"\"\nliczba liter: "+count+", liczba słów: "+words);



    }
}
