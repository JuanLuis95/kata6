package kata6;

public class Person {
    private final Integer id;
    private final String mail;

    public Person(int id, String name) {
        this.id = id;
        this.mail = name;
    }

    public Integer getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }
}