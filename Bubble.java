class Bubble {
 public static void main(String argss[]) {
int nums[] = { 99, 78, 98, 98 ,45, 34, 23, 23,  12, 10};
int a ,b ,t;
int size;
size = 10;
System.out.print("original arra is;");
for(int i=0; i < size; i++)
System.out.print(" "+ nums[i]);
System.out.println();
  for(a=1; a < size; a++)
for(b = size-1; b >= a; b--) {
if(nums[b-1] > nums[b]) {
 t = nums[b-1];
nums[b-1] = nums[b];
nums[b] = t;
}
}
System.out.println("sorted array is ;");
for(int i = 0; i < size; i++)
System.out.print(" " + nums[i]);
System.out.println();
}
}


