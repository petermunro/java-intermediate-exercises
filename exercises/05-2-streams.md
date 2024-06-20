# Streams - Intermediate Operations

__Objective__: To understand and apply intermediate operations in Java Streams API.

### Step-by-Step Exercise

Follow these steps:

1. **Create a List of Strings**
   - Create a list of names: "John", "Emma", "Michael", "Sophia", "Daniel".
   - Convert the list to a stream.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Emma", "Michael", "Sophia", "Daniel");
    Stream<String> nameStream = names.stream();
  }
}
```
</details>

2. **Filtering with `filter()` and Transforming with `map()`**
   - Use the `filter` method to retain names that end with "a".
   - Use the `map` method to transform each name to its uppercase form.
   - Print the transformed names.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Emma", "Michael", "Sophia", "Daniel");
    names.stream()
         .filter(name -> name.endsWith("a"))
         .map(String::toUpperCase)
         .forEach(System.out::println); // EMMA, SOPHIA
  }
}
```
</details>

3. **Flattening with `flatMap()`**
   - Create a list of lists containing names: [["John", "Emma"], ["Michael", "Sophia"], ["Daniel", "Olivia"]].
   - Use `flatMap` to flatten the lists into a single stream of names.
   - Print each name.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    List<List<String>> listOfLists = Arrays.asList(
      Arrays.asList("John", "Emma"),
      Arrays.asList("Michael", "Sophia"),
      Arrays.asList("Daniel", "Olivia")
    );
    listOfLists.stream()
               .flatMap(List::stream)
               .forEach(System.out::println); // John, Emma, Michael, Sophia, Daniel, Olivia
  }
}
```
</details>

4. **Sorting with `sorted()` and Removing Duplicates with `distinct()`**
   - Create a list of names with duplicates: "Sophia", "Emma", "John", "Sophia", "Michael", "Emma".
   - Use the `distinct` method to remove duplicates.
   - Use the `sorted` method to sort the names alphabetically.
   - Print the sorted, distinct names.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Sophia", "Emma", "John", "Sophia", "Michael", "Emma");
    names.stream()
         .distinct()
         .sorted()
         .forEach(System.out::println); // Emma, John, Michael, Sophia
  }
}
```
</details>

5. **Limiting with `limit()` and Skipping with `skip()`**
   - Create an infinite stream of integers starting from 1.
   - Use the `skip` method to skip the first 3 elements.
   - Use the `limit` method to take the next 5 elements.
   - Print the limited numbers.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    Stream.iterate(1, n -> n + 1)
          .skip(3)
          .limit(5)
          .forEach(System.out::println); // 4, 5, 6, 7, 8
  }
}
```
</details>

6. **Combining Multiple Operations**
   - Create a list of names: "Alex", "Brian", "Charles", "Diana", "Elaine", "Frank".
   - Use the `filter` method to retain names that contain the letter "a".
   - Use the `map` method to get the length of each name.
   - Use the `distinct` method to remove duplicate lengths.
   - Use the `sorted` method to sort the lengths in descending order.
   - Print the sorted lengths.

<details>
<summary>Reveal Solution</summary>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class StreamExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alex", "Brian", "Charles", "Diana", "Elaine", "Frank");
    names.stream()
         .filter(name -> name.contains("a"))
         .map(String::length)
         .distinct()
         .sorted(Comparator.reverseOrder())
         .forEach(System.out::println); // 7, 5, 4
  }
}
```
</details>

