package MoodAnalyzerTest;

import MoodAnalyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void moodHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am happy");
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("happy", result);
    }

    @Test
    public void moodTest(){

    }

    @Test
    public void moodTestSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am sad");
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("sad", result);
    }

    @Test
    public void MoodAnyIsHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("happy", result);
    }
}