# Streams API

__Objective__: To understand and implement the Streams API in Java

### Step-by-Step Exercise

Follow these steps:

1. **Creating a Stream from a Collection**

    - Given this list of strings, convert it to a stream and print each element of the stream:

      ```java
      List<String> list = Arrays.asList("apple", "banana", "cherry", "durian");
      ```

    <details>
    <summary>Reveal Solution</summary>

    ```java
    import java.util.Arrays;
    import java.util.List;
    import java.util.stream.Stream;

    public class StreamExample {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("apple", "banana", "cherry");
            Stream<String> stream = list.stream();
            stream.forEach(System.out::println);
        }
    }
    ```
    </details>

2. **Creating a Stream from an Array**

    - This time the strings are in an array. Do the same thing.

    ```java
    String[] array = {"New York", "London", "Paris", "Dublin", "Mumbai", "Madrid"};
    ```

    <details>
    <summary>Reveal Solution</summary>

    ```java
    import java.util.Arrays;
    import java.util.stream.Stream;

    public class StreamExample {
        public static void main(String[] args) {
            String[] array = {"New York", "London", "Paris", "Dublin", "Mumbai", "Madrid"};
            Stream<String> stream = Arrays.stream(array);
            stream.forEach(System.out::println);
        }
    }
    ```
    </details>

3. **Generating an Infinite Stream with a Limit**

    Generate an infinite stream of integers starting from 0 and increasing by 2. Limit the stream to the first 5 elements and print each element.

    <details>
    <summary>Reveal Solution</summary>

    ```java
    import java.util.stream.Stream;

    public class StreamExample {
        public static void main(String[] args) {
            Stream<Integer> stream = Stream.iterate(0, n -> n + 2).limit(5);
            stream.forEach(System.out::println); // Output: 0, 2, 4, 6, 8
        }
    }
    ```
    </details>

4. **Generating a Stream of Random Numbers**

    Generate a stream of 5 random numbers and print each number.

    <details>
    <summary>Reveal Solution</summary>

    ```java
    import java.util.stream.Stream;

    public class StreamExample {
        public static void main(String[] args) {
            Stream<Double> stream = Stream.generate(Math::random).limit(5);
            stream.forEach(System.out::println);
        }
    }
    ```
    </details>
