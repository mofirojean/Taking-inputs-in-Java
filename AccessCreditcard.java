public class AccessCreditcard {
// using the command line arguement as input
    
    public static void main(String[] args){
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("peter johnas", "Califonia Savings", "563 2435 355 463", 500);
        wallet[1] = new CreditCard("peter johnas", "Califonia Savings", "563 2435 355 463", 500);
        wallet[2] = new CreditCard("peter johnas", "Califonia Savings", "563 2435 355 463", 500);


        for (int val = 1; val<=16; val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for (CreditCard card : wallet){
            CreditCard.printSummary(card);
            while (card.getBalance() > 200.0){
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
}
