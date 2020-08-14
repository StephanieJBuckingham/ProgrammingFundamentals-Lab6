/* Exercise 3
 * 
 * Find the time complexity of the following java method
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
 * line 7 - c1(constant)
 * line 8 & 9 - log(n)
 **Note- since i is multiplied by two each iteration the variable i grows logarithmically (base 2)
 * line 10 - c2(constant)
 * 
 * Time Complexity = c1 + log2(n) + c2
 * Big O Notation = O(log(n))
 */
