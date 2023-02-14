import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer > 0){
                    return true;
                }
                return false;
            }
        };

        System.out.println(predicate.test(-10));


        Predicate<Integer> predicate1 = x -> x > 0;

        System.out.println(predicate1.test(222));



        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello, " + s +"!");
            }
        };

        consumer.accept("Sol");

        Consumer<String> consumer1 = s -> System.out.println("Hello, " + s +"!");

        consumer1.accept("Danila");

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double num) {
                return Math.round(num);
            }
        };

        System.out.println(function.apply(20.18));

        Function<Double, Long> function1 = x -> Math.round(x);

        System.out.println(function1.apply(-26.7891));

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int)(Math.random() * 100);
            }
        };

        System.out.println(supplier.get());


        Supplier<Integer> supplier1 = () -> (int)(Math.random() * 100);

        System.out.println(supplier1.get());

    }
}