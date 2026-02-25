public class ArrayAlgorithms {

    public static void printExclamation(String[] wordlist){
        for (int i = 0; i < wordlist.length; i++){
            System.out.println(wordlist[i] + "!");
        }
    }

    public static void addExclamation(String[] wordList){
        for (int i = 0; i < wordList.length; i++){
            wordList[i] = wordList[i] + "!";
        }
    }

    public static int sum (int[] numList){
        int total = 0;
        for (int i = 0; i < numList.length; i++){
            total += numList[i];
        }
        return total;
    }

    public static double average (int[] numList) {
        int total = sum(numList);
        return (double) total/numList.length;
    }

    public static int minimum (int[] numList){
        int current = numList[0];
        for (int i = 0; i < numList.length; i++){
            if (numList[i] < current){
                current = numList[i];
            }
        }
        return current;
    }

    public static int maximum(int[] numList){
        int current = numList[0];
        for (int i = 0; i < numList.length; i++){
            if (numList[i] > current){
                current = numList[i];
            }
        }
        return current;
    }

    public static void multiplyBy(int[] numList, int multiplier){
        for (int i = 0; i < numList.length; i++){
            numList[i] *= multiplier;
        }
    }

    public static int[] squares (int[] numList){
        int[] squaredArray = new int[numList.length];
        for (int i = 0; i < numList.length; i++){
            squaredArray[i] = numList[i] * numList[i];
        }
        return squaredArray;
    }

    public static void flipBool(boolean[] boolList) {
        for (int i = 0; i < boolList.length; i++){
            if (boolList[i]){
                boolList[i] = false;
            }
            else {
                boolList[i] = true;
            }
        }
    }

    public static String customToString(int[] numList){
        String reportString = "[";
        for (int i = 0; i < numList.length; i++){
            if (i == numList.length-1){
                reportString += numList[i];
            }
            else{
                reportString += numList[i] + ", ";
            }
        }
        return reportString + "]";
    }

    public static boolean containsPositive(int[] numList){
        boolean anyPos = false;
        for (int num: numList){
            if (num > 0){
                anyPos = true;
            }
        }
        return anyPos;
    }

    public static boolean containsString(String[] stringList, String searchStr){
        boolean contains = false;
        for (String s : stringList){
            if (s.toUpperCase().contains(searchStr.toUpperCase())){
                contains = true;
            }
        }
        return contains;
    }

    public static String[] makeLowercase(String[] wordList){
        String[] returnList = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++){
            String r = wordList[i].toLowerCase();
            returnList[i] = r;
        }
        return returnList;
    }

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2){
        int[] returnList = new int[intArr1.length];
        for (int i = 0; i < intArr1.length; i++){
            if (intArr1[i] > intArr2[i]){
                returnList[i] = intArr1[i];
            } else {
                returnList[i] = intArr2[i];
            }
        }
        return returnList;
    }

    public static int endsInExclamations(String[] stringList){
        int exclamationCounter = 0;
        for (String s : stringList){
            if (s.substring(s.length()-1).equals("!")){
                exclamationCounter++;
            }
        }
        return exclamationCounter;
    }
    public static int countConsecutiveDoubles(int[] numList){
        int doublesCounter = 0;
        for (int i = 0; i+1 < numList.length; i++){
            if (numList[i] == numList[i+1]){
                doublesCounter++;
            }
        }
        return doublesCounter;
    }

    public static int[] shiftLeft(int[] numList){
        int[] newList = new int[numList.length];
        for (int i = 0; i < numList.length; i++){
            if (i != 0){
                newList[i-1] = numList[i];
            }
            else {
                newList[newList.length-1] = numList[i];
            }
        }
        return newList;
    }

    public static void shiftLeftModify(int[] numList){
        int[] newList = new int[numList.length];
        for (int i = 0; i < numList.length; i++){
            if (i != 0){
                newList[i-1] = numList[i];
            }
            else {
                newList[newList.length-1] = numList[i];
            }
        }
        for (int i = 0; i < newList.length; i++){
            numList[i] = newList[i];
        }
    }

}
