package Classes;

import java.util.Arrays;
import java.util.List;

public class TestLibrary {
    public int[] oddsArray(int number) {
        int[] arr = new int[((number+1)/2)];
        for(int i = 0, e = 1; i < arr.length; e += 2, i++) {
            arr[i] = e;
        }
        return arr;
    }

    public boolean testKeywords(String phrase){
        String[] array = phrase.split(" ");
        List<String> keywords = Arrays.asList("abstract","continue", "for","new","switch",
        "assert","default","goto","package","synchronized","boolean","do","if","private","this",
        "break","double","implements","protected","throw","byte","else","import","public","throws",
        "case","enum","instanceof","return","transient","catch","extends","int","short","try",
        "char","final","interface","static","void","class","finally","long","strictfp","volatile",
        "const","float","native","super","while");
        for (String word: array){
            if (keywords.contains(word)){
               return true;
            }
        }
        return false;
    }

    public int[] livesSubtract(Player player){
        player.setLives(player.getLives()-1);
        player.setHealth(player.getMaxHealth());
        return new int[]{player.getLives(),player.getHealth()};
    }

    public int  attack (Player player1, Player player2){
        player1.setHealth(player1.getHealth()-player2.getStrength());
        return player1.getHealth();
    }




}
