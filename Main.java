import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] wordsArray = {"Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "consectetur", "elit", "sit", "vel", "consectetur", "odio", "proin", "sit", "non", "consectetur"};

        System.out.println("_________Task 1_________");
        HashSet<String> set = new HashSet<>(Arrays.asList(wordsArray));
        System.out.println(set);

        Map<String, Integer> worldCount = new HashMap<>();
        for (String s : wordsArray) {
            int count = worldCount.getOrDefault(s, 0);
            worldCount.put(s, count + 1);
        }
        System.out.println(worldCount);

        System.out.println("_________Task 2_________");
        PhoneBook greenPage = new PhoneBook();
        greenPage.addPhone("Aleksandrov", "293048");
        greenPage.addPhone("Vasechkin", "293049");
        greenPage.addPhone("Aleksandrov", "1946167464");

        greenPage.getPhone("Aleksandrov");
        greenPage.getPhone("Vasechkin");

    }
}


