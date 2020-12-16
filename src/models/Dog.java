package models;

public class Dog extends Animal {

    public Dog(String couleur) {
        super(couleur);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace comme un chien");
    }

}
