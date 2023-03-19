package Tregulov.generics.parameterized;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedClassAndMethodTest {
    @Test
    public void TestParameterizedClass() {
        ExampleClass<String> stringExample = new ExampleClass<>("Hello");
        System.out.println(stringExample);
        stringExample.parameterizedMethod(42);

        ExampleClass<Integer> intExample = new ExampleClass<>(100);
        System.out.println(intExample);
        intExample.parameterizedMethod("World");

        Integer[] integers = {1, 2, 3};
        Double[] doubles = {1.0, 2.0, 3.0};

        Integer firstInt = intExample.getNumber(integers); // returns 1
        Double firstDouble = intExample.getNumber(doubles); // returns 1.0

        assertEquals(1, firstInt);
        assertEquals(1.0, firstDouble);
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

    //If we need to create subtyping in method, we need to add it in method's type placeholder
    //If we need to add interfaces, we need to add <E extends Number & Interface1 $ Interface2>
    public <E extends Number & Comparable<E>> E getNumber(E[] array) {
        if (array.length == 0) {
            return null;
        } else {
            return array[0];
        }
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
            "value=" + value +
            '}';
    }
}