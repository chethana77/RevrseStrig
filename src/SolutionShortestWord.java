import java.util.*;

class SolutionShortestWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String resword="";
        int minLength=10000;
        List<Character> charList=new ArrayList<Character>();

        for(int i=0;i<licensePlate.length();i++)
        {
            char ch=licensePlate.charAt(i);
            if(Character.isLetter(ch))
                charList.add(Character.toLowerCase(ch));
        }

        for(String word:words)
        {
            List<Character> copyPlate=new ArrayList<>(charList);

            for(int wordCharPointer=0; wordCharPointer<word.length(); wordCharPointer++)
            {
                Character ch=word.charAt(wordCharPointer);
                if(copyPlate.contains(ch))
                    copyPlate.remove(ch);
            }

            if(copyPlate.size()==0 && word.length()< minLength)
            {
                resword=word;
                minLength=word.length();
            }

        }

        return resword;

    }

}
