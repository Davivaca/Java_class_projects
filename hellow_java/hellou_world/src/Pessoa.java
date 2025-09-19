public class Pessoa {

    private String name;
    private int age;

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public Pessoa setName(String name) {
        this.name = name;
        return this; // permite encadear chamadas
    }

    // Getter
    public int getAge() {
        return this.age;
    }

    // Setter
    public Pessoa setAge(int age) {
        this.age = age;
        return this;
    }
}
