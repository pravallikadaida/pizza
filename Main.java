public class Main {
    public static void main(String[] args) {
       pizza basepizza = new pizza(false);
       DeluxPizza deluxpizza = new DeluxPizza(true);

       basepizza.getBill();

       basepizza.addExtraCheese();
       basepizza.addExtraToppings();
       basepizza.addExtraCheese();
       basepizza.takeAway();
       basepizza.getBill();

       deluxpizza.getBill();
    }
}