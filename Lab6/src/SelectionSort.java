/*Exercise 5- Insertion and Selection Sorts
 * 
 * Trace the execution of the insertion and selection sort algorithms when executed on the
 * following array of integers: {1, 29, 14, 15, 94} Show how the array will look like after 
 * each iteration of the outer loop.
 * 
 * Insertion Sort:
 * Given a list, iterate through the element by index and insert it in the appropriate 
 * position in the list.
 * 
 * Step 1: {1, 29, 14, 15, 94}  - index 0 is sorted, single number cannot be compared = no change
 * Step 2: {1, 29, 14, 15, 94}  - index 0-1 is sorted, numbers are in ascending order = no change
 * Step 3: {1, 14, 29, 15, 94}  - index 0-2 is sorted, 14 is smaller than 29 = 14 moves to index 1
 * Step 4: {1, 14, 15, 29, 94}  - index 0-3 is sorted, 15 is smaller than 29, = 15 moves to index 2
 * Step 5: {1, 14, 15, 29, 94}  - index 0-5 is sorted, all numbers are in order= no change
 * List is sorted!
 * 
 * Selection Sort:
 * Given a list take the smallest element and switch its index with the first element in the 
 * list, next smallest is switched with next index, and so on.  
 * 
 * Step 1: {1, 29, 14, 15, 94}  -index 0 is smallest element = no change
 * Step 2: {1, 14, 29, 15, 94}  -index 2 has next smallest element(14) and switches with index 1
 * Step 3: {1, 14, 15, 29, 94}  -index 3 has next smallest element(15) and switches with index 2
 * Step 4: {1, 14, 15, 29, 94}  -index 3 has next smallest element(29) = no change
 * Step 5: {1, 14, 15, 29, 94}  -index 4 has next smallest element(94) = no change
 * List is sorted!
 * 
*/


