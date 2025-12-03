package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {

        if(bpms.isEmpty() || bpms == null){
            throw new IllegalArgumentException("bad bpms");
        }
        int tot = 0;
        for(int x: bpms){
            tot += x;
        }
        double avg = tot/bpms.size();
        if(avg >= 140){
            return "HIGH";
        }
        else if(avg >= 100){
            return "MEDIUM";
        }
        else{
            return "LOW";
        }
    }

    public static boolean isValidTrackTitle(String title) {

        if(title == null){
            return false;
        }
        if(title.length()<1 || title.length() > 30){
            return false;
        }
        
        for(int i = 0; i < title.length(); i++){
            if(!Character.isLetter(title.charAt(i)) && title.charAt(i)!= ' '){
                return false;
            }
        }
        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        
        if(volumeDb > 100){
            volumeDb = 100;
        }
        if(volumeDb < 0){
            volumeDb = 0;
        }
        return volumeDb;

    }
}
