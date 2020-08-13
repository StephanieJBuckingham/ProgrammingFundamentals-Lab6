/*Find the time complexity of the following java method
*/

	/*	int bar(int N) {
	*		 int result = 1;
	*		 for (int i=1; i<N; i*=2)
	*		 result+=2;
	*
	*		 return result;
	*/

/* To find the time complexity you need to add the time 
 * complexity for each line of the code. To determine the
 * Big O Notation you need to pick the fastest growing term. 
 * 
 * line 4 - c1(constant)
 * line 5 - log(n)
 * line 7 - c2(constant)
 * line 9 - c3(constant)
 * 
 * Time Complexity = c1 + log2(n) + c2 + c3
 * Big O Notation = O(log(n))
 */
