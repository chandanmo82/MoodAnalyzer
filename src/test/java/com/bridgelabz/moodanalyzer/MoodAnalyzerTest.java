package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD",mood);

    }
    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Happy message");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);

    }

}
