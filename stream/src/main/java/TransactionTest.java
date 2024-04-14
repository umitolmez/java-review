import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {
        //Find all transactions in 2011 and sort by value
        System.out.println("**TASK1**");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2- what are all the unique cities where the traders work?
        System.out.println("**TASK2**");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3- find all traders from cambridge and sort them by name
        System.out.println("**TASK3**");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                //.distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4- Return a string of all traders' names sorted alphabetically
        System.out.println("**TASK4**");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2)-> name1+name2 + " ");

        System.out.println(result);

        //5- Are any traders based in Milano?
        System.out.println("**TASK5**");
        boolean milanoBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milano"));
        System.out.println(milanoBased);

        //6- print the values of all transactions from the traders living in Cambridge
        System.out.println("**TASK6**");
        TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7- what is the highest value of all the transactions
        System.out.println("**TASK7**");
        Optional<Integer> high = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(high.get());

        //8- Find the transaction with smallest value
        System.out.println("**TASK8**");
        Optional<Transaction> smallestValue= TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue()<t2.getValue() ? t1:t2);

        System.out.println(smallestValue.get());

        Optional<Transaction> smallestValue2 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));

        System.out.println(smallestValue2);
    }
}
