package MoodAnalyzerTest;

import MoodAnalyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void moodTest(){
        String result = moodAnalyzer.analyseMood("I am happy");
        Assert.assertEquals("happy", result);
    }
}
