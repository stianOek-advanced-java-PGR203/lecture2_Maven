package no.home;

public class toRoman {

    public String convert(int i) {
        if(i == 1) {
            return "I";
        } else if( i == 2) {
            return "II";
        }
        return "III";
    }
}
