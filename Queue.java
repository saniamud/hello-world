class Queue {
public static void main(String args[]) {
 char q[] ;
int putloc ,getloc;
Queue(int size) {
 q = new char [size];
putloc = getloc = 0;
}
void put(char ch) {
if(putloc == q.length) {
System.out.println(" - queue is full.");
return;
} 
q[putloc++] = ch;
}
char get() {
if(getloc == putloc) {
System.out.println(" queue iss empty");
return (char) 0;
}
return q[getloc++] ;
}
} 
}

