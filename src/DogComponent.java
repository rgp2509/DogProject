public class DogComponent {
    int counter;
    String name;
    String breed;
    int age;
    String gender;
    String color;

    public DogComponent (int dogCounter, String name, String breed, String age, String gender, String color) {
        this.counter = dogCounter;
        this.name = name;
        this.breed = breed;
        this.age = Integer.parseInt(age);
        this.gender = gender;
        this.color = color;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString(){
        return
                "Dog: " + this.counter
                + "\n" + "     Name: " + this.name
                + "\n" + "     Breed: " + this.breed
                + "\n" + "     Age: " + this.age
                + "\n" + "     Gender: " + this.gender
                + "\n" + "     Color: " + this.color;
    }

}
