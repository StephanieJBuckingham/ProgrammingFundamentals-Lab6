/* Exercise 2
 * 
 * Find the time complexity of the following java method
*/

	/* int foo(int N) {
	*	 int result = 0;
	*	 for (int i=0; i<N; i++)
	*	 result++;
	*	 for (int j=0; j<1000000; j++)
	*	 result+=j;
	*
	*	 return result;
	*/

/*To find the time complexity you need to add the time 
 * complexity for each line of the code. To determine the
 * Big O Notation you need to pick the fastest growing term. 
 * 
 * line 7 - c1(constant)
 * line 8 & 9 - n
 * line 10 & 11 - c3(constant)
 * 
 * Time Complexity = c1 + n + c3 
 * Big O Notation = O(n)
 */
