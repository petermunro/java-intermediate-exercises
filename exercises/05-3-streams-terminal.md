# Streams - Terminal Operations

__Objective__: To understand and apply terminal operations in Java Streams API.


### 1. Collecting with `collect()`

1. Create a list of names: "John", "Emma", "Michael".
2. Transform the list of names into a stream.
3. Use the `collect()` method to transform the stream of names into a list.
4. Print the collected list.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Emma", "Michael");
    List<String> collected = names.stream().collect(Collectors.toList());
    System.out.println(collected); // [John, Emma, Michael]
  }
}
```
</details>



### 2. Reducing with `reduce()`

1. Create a list of numbers: 10, 20, 30, 40.
2. Turn it into a stream.
3. Use the `reduce()` method to compute the sum of the numbers.
4. Print the sum.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
    int sum = numbers.stream().reduce(0, Integer::sum);
    System.out.println(sum); // 100
  }
}
```
</details>



### 3. Finding with `findFirst()`

1. Create a list of names: "Alex", "Brian", "Charles".
2. Use the `findFirst()` method to get the first name. You'll need to assign this to an `Optional<String>`.
3. Print the first name if present.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperationsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alex", "Brian", "Charles");
    Optional<String> first = names.stream().findFirst();
    first.ifPresent(System.out::println); // Alex
  }
}
```
</details>



### 4. Matching with `anyMatch()`

1. Create a list of names: "Sophia", "Emma", "Olivia".
2. Use the `anyMatch()` method to check if any name starts with "E".
3. Print the result.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;

public class TerminalOperationsExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Sophia", "Emma", "Olivia");
    boolean anyStartsWithO = names.stream().anyMatch(name -> name.startsWith("E"));
    System.out.println(anyStartsWithO); // true
  }
}
```
</details>



### 5. Combining Multiple Terminal Operations

1. Create a list of numbers: 5, 10, 15, 20, 25.
2. Use the `filter()` method to retain numbers greater than 10.
3. Use the `collect()` method to transform the filtered stream into a list.
4. Use the `reduce()` method to compute the sum of the filtered numbers.
5. Print the filtered list and the sum.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationsExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
    List<Integer> filtered = numbers.stream()
                                    .filter(num -> num > 10)
                                    .collect(Collectors.toList());
    int sum = filtered.stream().reduce(0, Integer::sum);
    System.out.println("Filtered List: " + filtered); // [15, 20, 25]
    System.out.println("Sum: " + sum); // 60
  }
}
```
</details>

