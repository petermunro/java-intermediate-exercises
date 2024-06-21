# Exception Handling with Lambdas

__Objective__: To understand and implement exception handling within lambda expressions in Java


1. Create a class `LambdaExceptionDemo` with a `main` method.

<details>
<summary>Reveal Solution</summary>

We'll place this in a file called "LambdaExceptionDemo.java":

```java
public class LambdaExceptionDemo {
    public static void main(String[] args) {

    }
}
```
</details>

2. Add a list of integers to the `main` method and iterate over the list using a lambda expression.

    - You can use `Arrays.asList` to create the list.
    - Use the `forEach` method to iterate over the list.
    - Print each integer to the console.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.println(n));
    }
}
```
</details>

3. Modify the lambda expression to throw an exception when the integer is 3, and handle this exception within the lambda.

    - Use a `try-catch` block inside the lambda expression.
    - Print the stack trace if an exception is caught.

<details>
<summary>Reveal Solution</summary>

```java
public class LambdaExceptionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> {
            try {
                if (n == 3) throw new Exception("Exception for 3");
                System.out.println(n);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
```
</details>

4. Create a functional interface `CheckedConsumer` that can throw an exception.

    - Define a method `accept(T t)` that throws an exception.
    - Annotate the interface with `@FunctionalInterface`.

<details>
<summary>Reveal Solution</summary>

```java
@FunctionalInterface
public interface CheckedConsumer<T> {
    void accept(T t) throws Exception;
}
```
</details>

5. Implement a static method `wrap` in `LambdaExceptionDemo` to wrap the `CheckedConsumer` in a standard `Consumer`, converting checked exceptions to unchecked exceptions.

    - The `wrap` method should take a `CheckedConsumer` and return a `Consumer`.
    - In the `wrap` method, use a `try-catch` block to handle the checked exception and throw a `RuntimeException`.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.function.Consumer;

public class LambdaExceptionDemo {
    public static <T> Consumer<T> wrap(CheckedConsumer<T> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
```
</details>

6. Refactor the `forEach` loop in the `main` method to use the `wrap` method.

    - Use the `wrap` method to handle exceptions within the lambda.
    - Ensure that exceptions are printed to the console as a stack trace.

<details>
<summary>Reveal Solution</summary>

```java
public class LambdaExceptionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(wrap(n -> {
            if (n == 3) throw new Exception("Exception for 3");
            System.out.println(n);
        }));
    }

    public static <T> Consumer<T> wrap(CheckedConsumer<T> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
```
</details>


## Optional Exercises (if time permits)

7. Add another example that reads lines from a file using lambdas and the `wrap` method to handle `IOException`.

    - Use `Files.lines(Paths.get("file.txt"))` to read lines from a file.
    - Use the `forEach` method to iterate over the lines.
    - Throw an `IOException` if a line contains the word "error".
    - Handle the `IOException` using the `wrap` method.

<details>
<summary>Reveal Solution</summary>

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        // Previous code

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.forEach(wrap(line -> {
                if (line.contains("error")) throw new IOException("Error in line");
                System.out.println(line);
            }));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> Consumer<T> wrap(CheckedConsumer<T> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
```
</details>

## Complete code

CheckedConsumer.java:

```java
@FunctionalInterface
public interface CheckedConsumer<T> {
    void accept(T t) throws Exception;
}
```

LambdaExceptionDemo.java:

```java
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.io.IOException;

public class LambdaExceptionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(wrap(n -> {
            if (n == 3) throw new Exception("Exception for 3");
            System.out.println(n);
        }));

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.forEach(wrap(line -> {
                if (line.contains("error")) throw new IOException("Error in line");
                System.out.println(line);
            }));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> Consumer<T> wrap(CheckedConsumer<T> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
