 # Algorithm and Arrays

## Task 1. Fridge Algorithm

This is a first task in this module. You need to get milk from a fridge.

Call the methods of the `Fridge` object inside the `fridgeAlgorithm` method in the required logical order.

P.S All methods of interaction with the fridge can be found inside the `Fridge` interface.

## Task 2. Algorithm Complexity

Tasks for assessing the algorithm complexity. The following are the ratios of the constants with the BigO estimate:

```
Complexity.O_LOG_N       -> O(log N)
Complexity.O_N_2         -> O(log N^2)
Complexity.O_FACTORIAL_N -> O(!N)
Complexity.O_2_N         -> O(2 * N)
Complexity.O_N_LOG_N     -> O(N * log N)
Complexity.O_1           -> O(1)
Complexity.O_N           -> O(N)
```

### Subtasks:

* `badLinerSearch `- return the linear search complexity if the element you are looking for is at the end of the array.
* `arrayIndexItemAccess` - return the complexity of accessing an array element by index.
* `binarySorting` - return the complexity of a binary search.
* `twoCycleSorting` - return the complexity of the Two Cycle Sorting algorithm.

## Task 3. Arrays Tasks

Here are the tasks for working with the arrays.
The usage of any additional packages (such as` java.util.*`) is forbidden.

### Subtasks:

* `seasonsArray` - return a `String[]` array that will list all the seasons of the year, starting with winter.
* `generateNumbers` - generate an `int[]` array of consecutive positive integers starting at 1 of the given length (
  length parameter > 0)

```
Example:
length = 1  -> [1]
length = 3  -> [1, 2, 3]
length = 5  -> [1, 2, 3, 4, 5]
```

* `totalSum` - find the sum of all elements of the `int[]` array.

```
Example:
arr = [1, 3, 5]   -> sum = 9
arr = [5, -3, -4] -> sum = -2
````

* `findIndexOfNumber` - return the index of the first occurrence of `number` in the `arr` array. If there is no such
  element in the array, return `-1`.

```
Example:
arr = [99, -7, 102], number = -7    ->   2
arr = [5, -3, -4],   number = 10    ->  -1
````

* `reverseArray` - return the new `String[]` array obtained from the arr array by reversing the order of the elements.

```
Example:
arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
````

* `getOnlyPositiveNumbers` - return new `int[]` array obtained from `arr int[]` array by choosing positive numbers only.
  P.S. 0 is not a positive number

```
Example:
arr = [1,-2, 3]      -> [1, 3]
arr = [-1, -2, -3]   -> []
arr = [1, 2]         -> [1, 2]
````

* **[OPTIONAL]** `sortRaggedArray` - return a sorted, ragged, two-dimensional `int[][]` array following these rules:
    * incoming one-dimensional arrays must be arranged in ascending order of their length;
    * numbers in all one-dimensional arrays must be in ascending order.

```
Example:
arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
arr = [[5, 4], [7]]       -> [[7], [4, 5]]
````
