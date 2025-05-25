import java.util.*;

public class WordSuggester
{
    private List<String> dictionary;

    public WordSuggester(List<String> myDictionary) {
        this.dictionary = myDictionary;
    }

    public List<String> mySuggest (String myInput)
    {
        System.out.println();
        Set<String> mySuggestions = new HashSet<>();
        for (String checkInput : dictionary)
        {
            if (checkInput.equals(myInput))
            {
                mySuggestions.add(checkInput);
            }

            if (MistakeChecks.missingLetter(myInput, checkInput))
            {
                mySuggestions.add(checkInput);
            }

            if (MistakeChecks.swappedLetters(myInput, checkInput))
            {
                mySuggestions.add(checkInput);
            }

            if (MistakeChecks.tooManyLetters(myInput, checkInput))
            {
                mySuggestions.add(checkInput);
            }
        }
        return new ArrayList<>(mySuggestions);
    }

    public List<String> mySuggestLevenshtein (String myInput)
    {
        System.out.println();
        Set<String> mySuggestions = new HashSet<>();
        for (String checkInput : dictionary)
        {
            int myLevenshteinDistance = Levenshtein.myLevenshtein(myInput, checkInput);
            if (myLevenshteinDistance <= 2) {
                System.out.println("*_* LEVENSHTEIN MATCH (Steps = " + myLevenshteinDistance+ "): " + checkInput);

                mySuggestions.add(checkInput);
            }
        }

        return new ArrayList<>(mySuggestions);
    }
}