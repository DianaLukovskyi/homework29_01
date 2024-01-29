import java.util.Arrays;

public class Homework3 {
    public static long
    countWordsWith(String firstString,String string2){
        return Arrays.stream(firstString.split(" "))
                .filter(word -> word.startsWith(string2))
                .count();
    }

    public static void main(String[] args) {
        String string1 = "aaaaaaa cccc ab bbbbb a ff aaa";

        long result1 = countWordsWith(string1 , "a");
        System.out.println(result1);

        long result2 = countWordsWith(string1 , "aaa");
        System.out.println(result2);

        long result3 = countWordsWith(string1 , "aaaa");
        System.out.println(result3);
    }

    }

