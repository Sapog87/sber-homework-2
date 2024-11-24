import java.util.*;

public class PhoneBook {
    private final Map<String, Set<String>> nameToPhonesStorage = new HashMap<>();

    public void add(String name, String phone) {
        nameToPhonesStorage.computeIfAbsent(name, k -> new HashSet<>()).add(phone);
    }

    public List<String> get(String name) {
        return List.copyOf(
                nameToPhonesStorage.getOrDefault(name, Collections.emptySet())
        );
    }
}
