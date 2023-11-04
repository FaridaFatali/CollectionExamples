package commons;

import java.util.*;
import java.text.NumberFormat;
import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;

public class BagInvertory {
    private Bag invertoryBag = new HashBag();

    private Album album1 = new Album("Ring Ring", "ABBA");
    private Album album2 = new Album("Love Me Do", "Beatles");
    private Album album3 = new Album("Appetite for Destruction", "Guns N' Roses");
    private Album album4 = new Album("Let It Bleed", "Rolling Stones");

    public static void main(String[] args) {
        BagInvertory example = new BagInvertory();
        example.start();
    }

    private void start() {
        // Read our inventory into a Bag
        populateInventory();
        System.out.println("Inventory before Transactions:");
        printAlbums(invertoryBag);
        printSeparator();

        // A Customer wants to purchase 500 ABBA, 2 Radio head, and 150 Parker
        Bag shoppingCart1 = new HashBag();
        shoppingCart1.add(album4, 500);
        shoppingCart1.add(album3, 150);
        shoppingCart1.add(album1, 2);
        checkout(shoppingCart1, "\nCustomer 1");

        // Another Customer wants to purchase 600 copies of ABBA
        Bag shoppingCart2 = new HashBag();
        shoppingCart2.add(album4, 600);
        checkout(shoppingCart2, "\nCustomer 2");

        // Another Customer wants to purchase 3 copies of Kraftwerk
        Bag shoppingCart3 = new HashBag();
        shoppingCart3.add(album2, 3);
        checkout(shoppingCart3, "\nCustomer 3");

        System.out.println("\nInventory after Transaction:");
        printAlbums(invertoryBag);
    }

    private void populateInventory() {
        // Adds items to a Bag
        invertoryBag.add(album1, 200);
        invertoryBag.add(album2, 100);
        invertoryBag.add(album3, 500);
        invertoryBag.add(album4, 900);
    }

    private void printAlbums(Bag albumBag) {
        Set albums = albumBag.uniqueSet();

        for (Object o : albums) {
            Album album = (Album) o;
            NumberFormat format = NumberFormat.getInstance();
            format.setMinimumIntegerDigits(3);
            format.setMaximumFractionDigits(0);
            System.out.println("\t" + format.format(albumBag.getCount(album)) + " - " + album.getBand());
        }
    }

    private void checkout(Bag shoppingCart, String customer) {
        // Check to see if we have the inventory to cover this purchase
        if (invertoryBag.containsAll((Collection) shoppingCart)) {
            // Remove these items from our inventory
            invertoryBag.removeAll((Collection) shoppingCart);
            System.out.println(customer + " purchased the following items:");
            printAlbums(shoppingCart);
        } else {
            System.out.println(customer + ", I'm sorry but we are unable to fill your order.");
        }
    }

    private void printSeparator() {
    }
}


class Album {
    private String name;
    private String band;

    public Album(String name, String artistName) {
        super();
        this.name = name;
        this.band = artistName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "Album: name - " + name + ", artist name - " + band;
    }
}