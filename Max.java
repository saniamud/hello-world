class Max {
 public static void main(String arg[]) {
int nums[] = { 10 ,30 ,76 , 36 , 65 , 9 , 65 , 221 , 98 ,88 };
int max;
 max = nums[0];
 for( int i = 1; i < 10; i++) {
if(nums[i] > max)
max = nums[i];
 }
 System.out.println("Maximuim num is:" + max );
 } 
   }