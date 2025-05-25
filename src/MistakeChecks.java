public class MistakeChecks {
    public static boolean missingLetter(String myInput, String wordInDictionary) {
        if (myInput.length() == (wordInDictionary.length() - 1)) {
            for (int i = 0; i < wordInDictionary.length(); i++) {
                String isMissingLetter = wordInDictionary.substring(0, i) + wordInDictionary.substring(i + 1);
                {
                    if (isMissingLetter.equals(myInput)) {
                        System.out.println("^_^ MISSING LETTER MATCH! : " + myInput + " matches " + wordInDictionary);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean tooManyLetters(String myInput, String wordInDictionary) {
        if (myInput.length() == wordInDictionary.length() + 1) {
            for (int i = 0; i < myInput.length(); i++) {
                String test = myInput.substring(0, i) + myInput.substring(i + 1);
                if (test.equals(wordInDictionary)) {
                    System.out.println("o_O TOO MANY LETTERS MATCH: " + myInput + " => " + wordInDictionary);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean swappedLetters(String myInput, String wordInDictionary) {

        if (myInput.length() == wordInDictionary.length()) {
            char[] myInputArray = myInput.toCharArray();
            char[] wordInDictionaryArray = wordInDictionary.toCharArray();
            int firstChar = -1;
            int secondChar = -1;

            for (int i = 0; i < myInputArray.length; i++) {
                if (myInputArray[i] != wordInDictionaryArray[i]) {
                    if (firstChar == -1) {
                        firstChar = i;
                    } else if (secondChar == -1) {
                        secondChar = i;
                    } else {
                        return false;
                    }
                }
            }

            if (secondChar != -1 &&
                    myInputArray[firstChar] == wordInDictionaryArray[secondChar] &&
                    myInputArray[secondChar] == wordInDictionaryArray[firstChar]) {
                System.out.println(">_< SWAPPED MATCH! : " + myInput + " <--> " + wordInDictionary);
                return true;
            }

        }
        return false;
    }
}

