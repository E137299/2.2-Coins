public class Coins {
    private int amount;
    public Coins(int amount) {
        this.amount=amount;
    }
    // methods
    public void calc() {
        int quarters=amount/25;
        System.out.println("You have "+quarters+" quarters");
        int quarterAmount=amount%25;
        int dimes=quarterAmount/10;
        System.out.println("You have "+dimes+" dimes");
        int dimeAmount=quarterAmount%10;
        int nickles=dimeAmount/5;
        System.out.println("You have "+nickles+" nickles");
        int nickleAmount=dimeAmount%5;
        int pennies=nickleAmount/1;
        System.out.println("You have "+pennies+" pennies");
    } 
}
