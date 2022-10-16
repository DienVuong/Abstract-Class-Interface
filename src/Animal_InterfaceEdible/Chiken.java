package Animal_InterfaceEdible;

public class Chiken extends Animal implements Edible{
    public String makeSound() {
        return " Chicken : cluck cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
