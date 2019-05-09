class Array {
public static void main(String args[]) {
int i,j;
int arr[][] = new int[2][3];
for(i = 0; i < 2; ++i) {
for(j = 0; j < 3; ++j) {
 arr[i][j] = (i*4) + 1 +i;
 System.out.print(arr[i][j] + " ");
}
System.out.println();
}
}
}