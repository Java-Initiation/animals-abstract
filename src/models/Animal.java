package models;

//  une classe abstraite ne peut pas être instanciée
// (on ne peut pas créer d'objet avec)
public abstract class Animal {

    String couleur;

    public Animal(String couleur) {
        this.couleur = couleur;
    }

    // dans une classe abstraite on peut mettre des méthodes abstraites
    // celles-ci devront être obligatoirement redéfinies dans
    // les classes filles (à condition qu'elles ne soient pas abstraites)
    public abstract void seDeplacer();

}
