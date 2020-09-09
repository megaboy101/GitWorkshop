import java.util.ArrayList;

class Order {
    public int totalCost = 0;
    public ArrayList<String> items = new ArrayList<String>();

    public void printOrder() {
        System.out.println("Your total is $" + totalCost);
        System.out.println("Here are your items: " + items);
    }

    public void addSalad() {
        this.totalCost += 5;
        items.add("salad");
    }
}
