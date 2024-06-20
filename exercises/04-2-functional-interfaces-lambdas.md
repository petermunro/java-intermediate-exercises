# Lambdas

__Objective__: To understand Functional Interfaces and how you can implement them using lambdas.

Lambdas are a more concise way to implement functional interfaces.

<style>
details {
  margin: 2em;
}
</style>

### 1. Re-implement your `IntFunction` using a Lambda

Re-implement your previous solution using a lambda instead of an anonymous function.

- To do this, you can use the same variable (`IntFunction doubleIt`). Just rewrite the right-hand side of the assignment to use a lambda.

<details>
<summary>Reveal Solution</summary>

```java
public class Driver {
  public static void main(String[] args) {
    IntFunction doubleIt = i -> i * 2;
    System.out.println(doubleIt.apply(3));
  }
}
```
</details>

