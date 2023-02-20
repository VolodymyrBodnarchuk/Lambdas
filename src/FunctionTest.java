import java.util.function.Function;

public class FunctionTest {
    private FunctionMap<Integer,Integer> integerFunctionMap;

    public void init(){
        integerFunctionMap = Functions.intFunctionMap();
    }

    void squareFunction(){
        Function<Integer, Integer> squareFunction = integerFunctionMap.getFunction("square");

        int result = squareFunction().apply(5);

        assertThat(result).isEqualTo(25);
    }
}
