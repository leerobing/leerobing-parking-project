public class Wallet {
    private Long amount;

    public Wallet(Long amount) {
        this.amount = amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }


}
