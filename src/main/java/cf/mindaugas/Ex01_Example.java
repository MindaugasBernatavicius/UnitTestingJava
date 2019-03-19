package cf.mindaugas;

public class Ex01_Example {
    public static String appendString(String baseString, String appendage){
        return baseString + ":" + appendage;
    }

    public static String appendStrings(String baseString, String... appendages){
        for (String appendage: appendages) {
            baseString += ":" + appendage;
        }
        return baseString;
    }
}