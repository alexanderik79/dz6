import java.util.Scanner;

public class Game {
    public void play(){
        String crossWord = randomWord();
        // String wordCode = crossWord.subSequence(0, 2) + "###############";
        String wordCode = "###############";
        System.out.println("Вгадай слово: \n" + wordCode);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userWord = scanner.next();
            if (userWord.equals(crossWord)) {
                System.out.println("YOU WIN !!!");
                break;
            }
            else {
                System.out.println("Спробуй ще:");
            }
            wordCode = wordCodeMethod(crossWord,userWord,wordCode);
            System.out.println(wordCode);
        }
    }
    public String randomWord (){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int word = (int)(Math.random() * words.length);
        return words[word-1];
    }
    public String wordCodeMethod (String crossWord, String userWord, String wordCode){
        String result = "";
        if (crossWord.contains(userWord)) {
            result = userWord + "###############";
            return result.substring(0,14);
        }
        else return wordCode.substring(0,14);
    }
}
