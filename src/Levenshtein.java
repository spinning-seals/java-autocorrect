public class Levenshtein
{
    public static int myLevenshtein(String myInput, String wordInDictionary)
    {
        int[][] my2DArray = new int[myInput.length() + 1][wordInDictionary.length() + 1];

        for(int i = 0; i<=myInput.length(); i++) {
            my2DArray[i][0] = i;
        }

        for(int j = 0; j<=wordInDictionary.length(); j++)
        {
            my2DArray[0][j] = j;
        }

        for(int i = 1; i <= myInput.length(); i++)
        {
            for(int j = 1; j <= wordInDictionary.length(); j++)
            {
                int steps;
                if(myInput.charAt(i-1)==wordInDictionary.charAt(j-1))
                {
                    steps = 0;
                }
                else
                {
                    steps = 1;
                }

                my2DArray[i][j] = Math.min(
                        Math.min(
                                my2DArray[i][j - 1] + 1,     // insert
                                my2DArray[i - 1][j] + 1      // delete
                        ),
                        my2DArray[i - 1][j - 1] + steps // replace
                );



            }

        }
        return my2DArray[myInput.length()][wordInDictionary.length()];
    }
}

