package petsExample;

public class Runner {
    public static void main(String[] args) {
        Voice[] pets = {new Cat(),
                new Cow(),
                new Dog()};

        for (Voice p : pets)
            p.voice();
    }
}
