# Exercise: Understanding Covariance and Contravariance in Java

1. **Covariance with Generics:**
   - Create a class `Animal` with a method `makeSound()`.
   - Create a subclass `Dog` that overrides the `makeSound()` method.
   - Write a method `printAnimalSounds` that takes a `List<? extends Animal>` and iterates through the list to call `makeSound()` on each element.
   - Create a list of `Dog` objects and pass it to the `printAnimalSounds` method.

2. **Contravariance with Generics:**
   - Create a method `addAnimalsToList` that takes a `List<? super Dog>` and adds instances of `Dog` to the list.
   - Create a list of `Animal` objects and pass it to the `addAnimalsToList` method. Verify that the method works correctly.

3. **Combining Covariance and Contravariance:**
   - Create a method `transferAnimals` that takes two lists: one with `List<? extends Animal>` as the source and another with `List<? super Animal>` as the destination. The method should transfer all elements from the source list to the destination list.
   - Create a list of `Dog` objects and a list of `Animal` objects, and use the `transferAnimals` method to transfer dogs to the animals list.

