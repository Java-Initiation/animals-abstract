package models;

public class Cat extends Animal {

    public Cat(String couleur) {
        super(couleur);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me déplace comme un chat");
    }

}
