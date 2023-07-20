package org.lessons.java.shop;
/*
BONUS 1:  Aggiungere una classe Categoria (con nome e descrizione) e associare ad ogni Prodotto una categoria usando la composizione
BONUS 2: Permettere di associare più di una Categoria ad ogni prodotto (usare quindi una ArrayList di categorie come tipo di attributo)
 */
public class Category {

    // DATA
    String name;
    String description;


    // CONSTRUCTORS
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }


    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    // METHODS
    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
