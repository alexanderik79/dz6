import java.util.Scanner;
public class Game {
    StringBuilder result = new StringBuilder("###############");
    StringBuilder crossWord = new StringBuilder(randomWord());
    String compare = crossWord + "###############";
    public void play(){
        System.out.println("Guess the word:\n###############");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String userVvod = scanner.nextLine();
            for (int i = 0; i < userVvod.length(); i++) {
                String letter = String.valueOf(userVvod.charAt(i));
                if (crossWord.indexOf(letter) != -1){
                    int index = crossWord.indexOf(letter);
                    result.replace(index, index+1, letter);
                    crossWord.replace(index, index+1, "#");
                }
            }
            compare = compare.substring(0,15);
            if (compare.equals(String.valueOf(result))){
                System.out.println(compare = compare.replace("#", ""));
                System.out.println("YOU WIN !!!!! ");
                break;
            }else{
                System.out.println(result + "\nKeep trying!");
            }
        }
        scanner.close();
    }
    public String randomWord (){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int word = (int)(Math.random() * words.length);
        return words[word];
    }
}
