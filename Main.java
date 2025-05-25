import java.util.List;

public class Main {
    public static void main(String[] args) {
        WordSuggester myAutoCorrect = new WordSuggester(List.of("study", "stud", "rename", "ream", "read", "ready", "red"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: red");
        System.out.println(myAutoCorrect.mySuggest("red"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("red"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: raedy");
        System.out.println(myAutoCorrect.mySuggest("raedy"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("raedy"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: rready");
        System.out.println(myAutoCorrect.mySuggest("rready"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("rready"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: stdu");
        System.out.println(myAutoCorrect.mySuggest("stdu"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("stdu"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: stud");
        System.out.println(myAutoCorrect.mySuggest("stud"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("stud"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: ream");
        System.out.println(myAutoCorrect.mySuggest("ream"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("ream"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: sttud");
        System.out.println(myAutoCorrect.mySuggest("sttud"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("sttud"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: stuyd");
        System.out.println(myAutoCorrect.mySuggest("stuyd"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("stuyd"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: renam");
        System.out.println(myAutoCorrect.mySuggest("renam"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("renam"));
        System.out.println("*------------------------------------------*");
        System.out.println("YOUR INPUT: read");
        System.out.println(myAutoCorrect.mySuggest("read"));
        System.out.println(myAutoCorrect.mySuggestLevenshtein("read"));
        System.out.println("*------------------------------------------*");
    }
}
