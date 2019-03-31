import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AOSChallengeImpl implements AOSChallenge {

    //#1
    public int[] productOfOtherPositions(int[] input) {


        //can put nullchecks and no. of elements in the array
        int[] resultArray = new int[input.length];
        int resultSum = 1;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (i != j) {
                    resultSum = resultSum * input[j];
                }
            }
            resultArray[i] = resultSum;
            resultSum = 1;
        }

        return resultArray;
    }

    //#2
    public String reverseWordsInSentence(String input) {

        String[] words = input.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word + " ");
        }
        StringBuilder sbReverse = sb.reverse();

        return sbReverse.toString();
    }

    //#3
    public String replaceMultiplesOf3And5WithText(int max) {

        StringBuilder result = new StringBuilder("");
        if (max > 0) {

            if (max % 3 == 0) result.append("Apple");
            if (max % 5 == 0) result.append("Online");
        }
        return result.toString();

    }

    //#4
    public Set<HistogramElement> buildHistogram(int[] input) {

        Set<HistogramElement> resultTest = new HashSet<>();


        int val = 1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(input[i])) val = map.get(input[i]);
            map.put(input[i], val);

        }

        for (Integer key : map.keySet()) {
            HistogramElementImpl hs = new HistogramElementImpl(key, map.get(key));
            resultTest.add(hs);
        }

        return resultTest;


    }

    public class HistogramElementImpl implements HistogramElement {
        int value;
        int count;

        HistogramElementImpl(int value, int count) {
            this.value = value;
            this.count = count;
        }

        public int getValue() {
            return this.value;
        }

        public  int getCount() {
            return this.count;
        }

    }

}