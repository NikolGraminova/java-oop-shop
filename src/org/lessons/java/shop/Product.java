package org.lessons.java.shop;

/*
Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop. Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
Il codice prodotto sia accessibile solo in lettura
Gli altri attributi siano accessibili sia in lettura che in scrittura
Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome: il codice deve avere un pad left di zeri per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
Nello stesso package aggiungete una classe Main con metodo main nella quale create uno o più prodotti e testate tutte le funzionalità della classe (cioè tutti i metodi public)
 */

public class Product {

    // DATA
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;


    // CONSTRUCTORS
    public Product(int code, String name, String description, double price, int iva) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }


    // GETTERS AND SETTERS
    public int getCode() {
        return code;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }


    // METHODS
    public double calcPrice(){
        return price;
    }

    public double calcPriceIva(){
        double ivaPrice = price * iva / 100;
        return price + ivaPrice;
    }

    public String calcCode(){
        String codeString = Integer.toString(code);
        char o = '0';
        for (int i = 0; i < codeString.length(); i++){
            while (codeString.length() < 9){
                codeString = o + codeString;
                i++;
            }
        } return codeString;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }

}
