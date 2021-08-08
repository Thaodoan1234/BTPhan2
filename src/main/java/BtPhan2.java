import java.util.Locale;
import java.util.Scanner;

public class BtPhan2 {
    public static void main(String[] args) {

/**bài tập 1: nhập số nguyên bất kỳ trong khoảng 1 -> 9 và đọc giá trị */
    /*
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter number:");
        int a = num.nextInt();

        if (1 <= a && a <= 9) {
            if (a == 1)        { System.out.println("the value of the number is một");}
            else if (a == 2)   { System.out.println("the value of the number is hai");}
            else if (a == 3)   { System.out.println("the value of the number is ba");}
            else if (a == 4)   { System.out.println("the value of the number is bốn");}
            else if (a == 5)   { System.out.println("the value of the number is năm");}
            else if (a == 6)   { System.out.println("the value of the number is sáu");}
            else if (a == 7)   { System.out.println("the value of the number is bảy");}
            else if (a == 8)   { System.out.println("the value of the number is tám");}
            else               { System.out.println("the value of the number is chín");}
        }
        else {
            System.out.println("Could not read the numeric value entered");
        }
     */

 /**bài tập 2: nhập 1 chữ cái và chuyển hoa <-> thường */  //run failed
   /*
       String  charactors;
       int d, a;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 1 character: ");
       charactors = sc.next();

       a = Integer.parseInt(charactors);
       if (a >= 97 && a <122) {
           a = a - 32;
           System.out.println(charactors.toUpperCase());  //thường --> hoa
       }
       else if (a >= 65 && a <= 90) {
           a = a + 32;
           System.out.println(charactors.toLowerCase());   //hoa --> thường
       }
       else {
           System.out.println("not a character");
       }
  */

 /**bài tập 3: Giải phương trình bậc nhất ax+b=0 */
   /*
      float a ,b, x;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter coefficient a:");
      a = sc.nextInt();
      System.out.println("Enter coefficient b: ");
      b = sc.nextInt();

      if (a == 0) {
          if (b == 0) {
              System.out.println("The equation has infinitely many solutions");
          }
          else  {
              System.out.println("The equation has no solution");
          }
      }
      else {
          x = - b / a;
          System.out.println("The equation has only 1 solution: " + x);
      }
    */

    /**Bài tập 4: Giải phương trình bậc 2 */
    /*    float a = 2.0F;
        float b = 2.0F;
        float c = 2.0F;

        float delta = b * b - 4 * a * c;

        float x1 , x2;
        if (delta > 0) {
            float deltaSqrt = (float) Math.sqrt(delta);
            x1 = (-b + deltaSqrt) / (2.0F * a);
            x2 = (-b + deltaSqrt) / (2.0F * a);
            System.out.println("The equation has two solutions: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (delta == 0) {
            float deltaSqrt = (float) Math.sqrt(delta);
            x1 = x2 = - b / (2 * a);
            System.out.println("Equation with double solution x1 = x2 = " + x1);
        }
        else {
            System.out.println("The equation has no solution");
        }  */

/**bài tập 5: nhập 4 số nguyên a,b,c,d tìm giá trị min */

   /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i < n; i++) {
            if(min > arr[i])
                { min = arr[i];}
            }
        System.out.println("Minimum value of array is " + min);
      */

/**bài tập 6: nhập số nguyên a,b,c,d xắp xếp theo thứ tự tăng dần */

    /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        int temp = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    */

/**bài 7: tính tiền taxi từ số km nhập vào biết:
 *  1 km đầu giá 15k
 *  từ km 2 -> 5 giá 13,5k
 *  từ 6km -> ... giá 11k
 *  trên 120 km thù giảm 10% bill
 */

 /*
   int price1 = 15000, price2 = 13500, price3 = 11000;
   float n, total;
   Scanner sc = new Scanner(System.in);
   System.out.print("The distance traveled (Km): ");
   n = sc.nextInt();

   if (n <= 1) {
       total = n * price1;
       System.out.println("Total: " + total);
   }
   if (n <= 5) {
       total = price1 + (n - 1) * price2;
       System.out.println("Total: " + total);
   }
   if (n > 5) {
       total = price1 + 4 * price2 + (n - 5) * price3;
       if (n > 120) {
           float total1;
           total1 = (total *10) /100;
           System.out.println("Total: " + total1);
       }
       else {
           System.out.println("Total: " + total);
       }
   }

*/

/**bài 8: Nhập vào tháng năm, cho biết tháng đó có bao nhiêu ngày */
   /*
     int year, month;
     Scanner sc = new Scanner(System.in);
     System.out.println("Year: ");
     year = sc.nextInt();
     System.out.println("Month: ");
     month = sc.nextInt();

     if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||month == 10 || month == 12) {
         System.out.println("Month has 31 days");
     }
     if (month == 4 || month == 6 || month == 9 || month == 11)  {
         System.out.println("Month has 30 days");
     }
     if (month == 2) {
         if (year % 4 == 0 || year % 400 == 0) {
             System.out.println("Month has 29 days");
         }
         else {
             System.out.println("Month has 28 days");
         }
     }
  */

/** bài 9: Nhập độ dài ba cạnh của tam giác, kiểm tra xem là tam giác gì? */

  /*
     float a, b, c;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter long sides a:");
     a = sc.nextInt();
     System.out.println("enter long sides b:");
     b = sc.nextInt();
     System.out.println("enter long sides c:");
     c = sc.nextInt();

     if (a+b > c && a+c > b && b+c >a ){

         if (a == b && b == c){
             System.out.println("This is an equilateral triangle");
         }

         else if (a==b || a==c || b==c){
             System.out.println("This is an isosceles triangle");
         }

         else if (( a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)){
             System.out.println("This is a right triangle");
         }

         else if ((a*a > b*b + c*c) || (b*b > a*a + c*c) || (c*c > a*a + b*b)) {
             System.out.println("This is an obtuse triangle");
         }
         else {
             System.out.println("This is an acute triangle");
         }

     }
     else {
         System.out.println("This is not a triangle");
     }

   */

    }
}
