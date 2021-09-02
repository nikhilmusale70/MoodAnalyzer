package MoodAnalyzer;

import java.util.Locale;

public class MoodAnalyzer {
    public String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer(){

    }

    public String analyseMood(){
        if (message.toLowerCase().contains("happy"))
            return "happy";
        else if (message.toLowerCase().contains("sad"))
            return "sad";
        else
            return "happy";
    }
}