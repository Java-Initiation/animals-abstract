import models.Animal;
import models.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("bleu");

        faireSeDeplacer(dog);

    }

    public static void faireSeDeplacer(Animal animal){
        animal.seDeplacer();
    }

}
