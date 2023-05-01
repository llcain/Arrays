import java.util.stream.DoubleStream;
public class Calculator {

    static int add(int x, int y) {
        return (x + y);

    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }
}
