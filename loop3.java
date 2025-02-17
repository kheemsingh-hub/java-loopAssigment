//3)Display following series
//  a)1 1 2 3 5 8 13 21 34 55
//  b)1 0 2 1 3 2 4 3 5 4 6 5
//  c)1 2 4 7 11 16 22 29 37 46 56
//  d)99 80 63 48 35 24 15 8 3 0
//  e)1 4 27 256 3125
//  f)1 10 2 9 3 8 4 7 5 6 6 5 7 4 8 3 9 2 10 1
//  g)A B D G K P V
public class loop3 {
        public static void main(String[] args) {
            System.out.println("a) Fibonacci Series:");
            fibonacciSeries(10);

            System.out.println("\nb) Alternate Number Series:");
            alternateNumberSeries(12);

            System.out.println("\nd) Decreasing Number Series:");
            decreasingSeries(10);

            System.out.println("\ne) Powers Series:");
            powersSeries(5);

            System.out.println("\nf) Zigzag Number Series:");
            zigzagSeries(10);

            System.out.println("\ng) Alphabet Pattern Series:");
            alphabetSeries();
        }

        // a) Fibonacci Series
        public static void fibonacciSeries(int n) {
            int a = 1, b = 1, c;
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }

        // b) Alternate Number Series
        public static void alternateNumberSeries(int n) {
            int even = 0, odd = 1;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.print(odd + " ");
                    odd++;
                } else {
                    System.out.print(even + " ");
                    even++;
                }
            }
            System.out.println();
        }

        // d) Decreasing Number Series
        public static void decreasingSeries(int n) {
            int num = 99;
            int decrement = 19;
            for (int i = 0; i < n; i++) {
                System.out.print(num + " ");
                num -= decrement;
                decrement -= 2;
            }
            System.out.println();
        }

        // e) Powers Series
        public static void powersSeries(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.print((int) Math.pow(i, i) + " ");
            }
            System.out.println();
        }

        // f) Zigzag Number Series
        public static void zigzagSeries(int n) {
            int left = 1, right = n;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print(left + " ");
                    left++;
                } else {
                    System.out.print(right + " ");
                    right--;
                }
            }
            System.out.println();
        }

        // g) Alphabet Pattern Series
        public static void alphabetSeries() {
            char letter = 'A';
            int step = 1;
            for (int i = 0; i < 7; i++) {
                System.out.print(letter + " ");
                letter += step;
                step++;
            }
            System.out.println();
        }
    }

