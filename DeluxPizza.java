public class DeluxPizza extends pizza {
    public DeluxPizza(Boolean isVeg){
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {
       
    }
}