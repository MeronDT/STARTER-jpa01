package edu.ucsb.cs156.pconrad.menuitem;

public class MenuItem {

    private String name;
    private int priceInCents;
    private String category;

    /**
     * Custom exception thrown when getPrice is called with a width
     * that is too narrow for the formatted price.
     */

    public static class TooNarrowException extends RuntimeException {
    }


    public MenuItem(String name, int priceInCents, String category) {
        this.name = name;
        this.priceInCents = priceInCents;
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Returns the price, formatted as a string with a $.
     * For example "$0.99", "$10.99", or "$3.50"
     */

    public String getPrice() {
        int dollars = priceInCents / 100;
        int cents = priceInCents % 100;
        String price = "$" + dollars + ".";
        if(cents < 10){
            price += "0" + cents;
        }
        else{
            price += cents;
        }
        return price;
    }

    /**
     * Returns the price, formatted as a string with a $,
     * right justified in a field with the specified width.
     * For example "$0.99", "$10.99", or "$3.50".
     * <p>
     * If the width is too small, throws TooNarrowException
     *
     * @param width width of returned string
     */

    public String getPrice(int width) {
        String price = getPrice();
        if(price.length() > width){
            throw new TooNarrowException;
        }



        return String
    }

    public int getPriceInCents() {
        return this.priceInCents;
    }
    /**
     * return a string in csv format, in the order name,price,cateogry.
     * For example <code>Small Poke Bowl,1049,Poke Bowls</code>
     *
     * @return string in csv format
     */

    @Override
    public String toString() {
        return name + priceInCents + category;
    }

}
