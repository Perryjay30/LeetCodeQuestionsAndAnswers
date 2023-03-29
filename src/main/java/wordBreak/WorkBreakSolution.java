package wordBreak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//Given a string s and a dictionary of words dict, add spaces in s to construct a sentence
//        where each word is a valid dictionary word. Return all such possible sentences.
//        For example, given s = "catsanddog", dict = ["cat", "cats", "and", "sand", "dog"], the
//        solution is ["cats and dog", "cat sand dog"].

public class WorkBreakSolution {
    public static void main(String[] args) {
        String s = "catsanddog";
//        Set<String> dict = Set.of(new String[]{"cat", "cats", "and", "sand", "dog"});
        String sai = "leetcode";
        Set<String> dict = Set.of(new String[]{"leet", "code"});

        System.out.print(wordBreak2(s, dict));
    }
    public static List<String> wordBreak(String s, Set<String> dict) {
        //create an array of ArrayList<String>
        List<String>[] dp = new ArrayList[s.length()+1];
        dp[0] = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (dp[i] == null)
                continue;

            for(String word: dict) {
                int len = word.length();
                int end = i +len;
                if(end > s.length())
                    continue;

                if(s.substring(i, end).equals(word)) {
                    if(dp[end] == null)
                        dp[end] = new ArrayList<>();
                    dp[end].add(word);
                }
            }
        }

        List <String> result = new LinkedList<>();
        if(dp[s.length()] == null)
            return result;

        ArrayList<String> temp = new ArrayList<>();
        dfs(dp, s.length(), result, temp);

        return result;
    }

    public static void dfs(List<String>[] dp, int end, List<String> result,
                           ArrayList<String> tmp) {
        if(end <= 0) {
            String path = tmp.get(tmp.size()-1);
            for (int i = tmp.size()-1; i >= 0; i++) {
                path += " " + tmp.get(i);
            }

            result.add(path);
            return;
        }
        for(String str : dp[end]) {
            tmp.add(str);
            dfs(dp, end-str.length()-1, result, tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    //Another method

    public static boolean wordBreak2(String sai, Set<String> dict) {
      boolean [] t = new boolean[sai.length()+1];
      t[0] = true; //set first to be true, why?
      //Because we need initial state
        for (int i = 0; i < sai.length(); i++) {
            //should continue form match position
            if(!t[i])
                continue;
            for(String a : dict) {
                int len = a.length();
                int end = i + len;
                if(end > sai.length())
                    continue;

                if(t[end]) continue;

                if(sai.substring(i, end).equals(a)) {
                    t[end] = true;
                }
            }
        }
        return t[sai.length()];
    }
}
