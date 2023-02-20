import java.util.HashMap;
import java.util.Map;
import java.util.function.*;


public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> abs = a -> Math.abs(a);
        DoubleFunction<Double> sgn = s -> Math.signum(s);
        Consumer<Integer> increment = i -> Math.incrementExact(i);
        Consumer<Integer> decrement = d -> Math.decrementExact(d);
        DoubleFunction<Double> square = sq -> Math.sqrt(sq);
        DoubleFunction<Double> square2 = sq1 -> Math.pow(sq1,sq1);

        Map mapA = new HashMap();
        mapA.put(abs,abs);
        mapA.put(sgn,sgn);
        mapA.put(increment,increment);
        mapA.put(decrement,decrement);
        mapA.put(square,square);
        mapA.put(square2,square2);
    }
}