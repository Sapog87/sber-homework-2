import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> nameToPhonesStorage = new HashMap<>();

    public void add(String name, String phone) {
        nameToPhonesStorage.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String name) {
        return Collections.unmodifiableList(
                nameToPhonesStorage.getOrDefault(name, Collections.emptyList())
        );
    }
}
