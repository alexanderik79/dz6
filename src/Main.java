public class Main {


    public static void main(String[] args) {


        String s = "come on baby light my fire";
        System.out.println(findSymbolOccurance(s, 'e'));
        System.out.println(findWordPosition(s, "baby"));
        System.out.println(stringReverse(s));
        System.out.println(isPalindrome("Don't nod"));

        Game game = new Game();
        game.play();
    }


    public static int findSymbolOccurance (String string, char symbol ){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(symbol == string.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static int findWordPosition (String source, String target){
        if (source.contains(target)){
            return source.indexOf(target);
        }
        return -1;
    }
    public static String stringReverse (String string){
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        return String.valueOf(builder);
    }
    public static boolean isPalindrome (String palinString){
        StringBuilder builder = new StringBuilder(palinString.toLowerCase().replaceAll("[^a-zа-я]", ""));
        String str = String.valueOf(builder);
        builder.reverse();
        System.out.println(builder);
        return String.valueOf(builder).equals(str);
    }
}