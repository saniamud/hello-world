class Min {
 public static void main(String args[]) { 
int nums[] = new int[10] ;

int min;
nums[0] = 99;
nums[1] = -10;
nums[2] = 45;
nums[3] = 1;
nums[4] = 76;
nums[5] = 64;
nums[6] = 1;
nums[7] = 88;
nums[8] = 67;
nums[9] = 4;
min = nums[0];
for(int i= 1; i < 10; i++) {
if(nums[i] < min);
min = nums[i];

}
 System.out.println("minimum is " + min);
}  
 }
