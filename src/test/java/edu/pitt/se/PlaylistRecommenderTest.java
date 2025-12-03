package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


public class PlaylistRecommenderTest {

    @Test
    public void testMediumBPMS() {
        List<Integer> bpms = List.of(100, 110, 120, 130, 140, 150);
        String res = PlaylistRecommender.classifyEnergy(bpms);
        assertEquals("MEDIUM", res);
    }

    @Test
    public void testLongTitle(){
        boolean res = PlaylistRecommender.isValidTrackTitle("jkvcnjmcjmcmcnmjrcsjnlfsvjnfvjnlvjnlfsvjnvjfbjbkjlnbkljnrnjklrdgljknrgnlrdgklnbljkfkljbnjknbfx");
        assertFalse(res);
    }

    @Test
    public void testNegVol(){
        int res = PlaylistRecommender.normalizeVolume(-1);
        assertEquals(0,res);
    }
}
