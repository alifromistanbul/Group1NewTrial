package mondayTrial;

public class Task1 {
    public static void main(String[] args) {

        String word = "Ali";
        String wordReversed = "";


        for(int i=word.length()-1; i>=0; i--){
            char ch = word.charAt(i);
            wordReversed += ch;
        }
        System.out.println(wordReversed);

    }
}
