// GCD: Greatest Common Divisor
public class GCD {
public static long gcd1(long x, long y) {
if (y == 0) return x;
return gcd1(y, x % y);
}
public static long gcd2(long x, long y) {
while (y != 0) {
long r = x % y;
x = y; y = r;
}
return x;
}
public static void main(String[] args) {
long x = Long.parseLong(args[0]);
long y = Long.parseLong(args[1]);
long z = GCD.gcd1(x, y);
System.out.println("Method 1: gcd(" + x + ", " +
y + ") = " + z);
z = GCD.gcd2(x, y);
System.out.println("Method 2: gcd(" + x + ", " +
y + ") = " + z);
}
}