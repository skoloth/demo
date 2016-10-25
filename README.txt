
Q) Given the following class, write 3 methods that can be used to return an array that has no duplicates.

Implementation exist in UniqueNumberGenerator.java class and UniqueNumberGeneratorTest.java is test.
The Executor.java has main method which runs all three solutions.

Solution1:
Using List and iterating to check if already added and then converting into array int
Disadvantage: We have to use iterate the loop to check against each element if duplicate exist
              causing performance overhead
              

Solution2:
Using HashSet - This approach duplicate
Disadvantage : Does not preserve order

Solution3: Using LinkedHashSet which preserve both order and remove duplicates.

Solution4: Using arrays and trying to iterate without using collections. This approach isn't
effective and doesn't work as Arrays are fixed size.