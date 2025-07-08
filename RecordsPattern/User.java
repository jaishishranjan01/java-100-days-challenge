package RecordsPattern;

public record User (String name, int age, Address address) {
    public record Address (String city, int zip) {}
}
