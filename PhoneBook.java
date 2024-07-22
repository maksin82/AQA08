import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, ArrayList<String>> phones = new HashMap<>();

    public void addPhone(String surname, String phone) {
        if (phones.containsKey(surname)) {
            phones.get(surname).add(phone);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phone);
            phones.put(surname, list);
        }
    }

    public void getPhone(String sourname) {
        System.out.println(sourname + phones.get(sourname));
    }
}