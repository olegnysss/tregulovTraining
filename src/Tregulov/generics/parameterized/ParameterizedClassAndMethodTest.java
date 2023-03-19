package Tregulov.generics.parameterized;

import org.junit.jupiter.api.Test;

public class ParameterizedClassAndMethodTest {
    @Test
    public void TestParameterizedClass() {
        ExampleClass<String> stringExample = new ExampleClass<>("Hello");
        System.out.println(stringExample);
        stringExample.parameterizedMethod(42);

        ExampleClass<Integer> intExample = new ExampleClass<>(100);
        System.out.println(intExample);
        intExample.parameterizedMethod("World");
    }
}

//<T> - type placeholder
class ExampleClass<T> {

    //Cannot be static
    private final T value;

    public ExampleClass(T value) {
        this.value = value;
    }

    //If we put <T> type in the method, we can use the different type from <T> of class anyway.
    //Method type parameter hides class type parameter.
    public <U> void parameterizedMethod(U parameter) {
        System.out.println("Parameterized method called with parameter: " + parameter);
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
            "value=" + value +
            '}';
    }
}