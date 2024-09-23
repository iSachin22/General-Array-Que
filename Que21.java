        					 //  HERE AM SOLVING JAVA QUESTIONS ....


//            HOW MANY MONKEYS ARE STILL ON TREE IF A SINGLE MONKEY CAN EAT ... BANANA AND PENUTS ??

import java.util.*;
class Que21{

public static void main(String args[]){
  int penuts,banana,m,k,n;
  Scanner sc=new Scanner (System.in);
  System.out.println("enter no of monkeys: ");
  n=sc.nextInt();
  
  System.out.println("enter total no of bananas: ");
  banana=sc.nextInt();
  
  System.out.println("enter total no of peanuts:");
  penuts=sc.nextInt();

  System.out.println("enter total no of bananas and peanuts can be eatable by a single monkey \t ");
  k=sc.nextInt();
  m=sc.nextInt();

  n = n- (banana/k);
  int all= n-(penuts/m);
  
  System.out.printf(" %d monkeys are on the tree :",all);



  }

}


//					   LEAP YEAR OR NOT.....

class Que22{

public static void main(String args[]){
  int year;
  Scanner sc= new Scanner (System.in);
  System.out.println("enter the year:");
  year =sc.nextInt();
  
 if(year%4==0){
   System.out.println("year is leap year:");

    }else {
   
  System.out.println("year is not leap year:");
      }
  }

}



//      QUE 23 .......PARKING  MALL.....IN ROW AND COL



    class Que23{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt(); // Number of rows
        int C = sc.nextInt(); // Number of columns

        int[][] M = new int[R][C];

        // Read the elements of the matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        int maxOnes = 0;
        int maxRow = -1;

        for (int i = 0; i < R; i++) {
            int onesCount = 0;
            for (int j = 0; j < C; j++) {
                if (M[i][j] == 1) {
                    onesCount++;
                }
            }

            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                maxRow = i;
            }
        }

        System.out.printf("maximum one in %d row ",maxRow); // Row index starts from 1
    }
}




//            QUE 27..............


 class Que27{

public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
  System.out.println("enter the size of array:");
  int size=sc.nextInt();

  int a[]=new int[size];
  int term1=0, term2=0;

  for(int i=0;i<a.length;i++){
     a[i]=sc.nextInt();
    }

    for(int i=0;i<a.length;i++){
     
         if(i==0||i==1){

                  a[i]= 0 ;

            }else if(i%2==0){

                     term1 +=1;
                     a[i]= term1;
                }else if(i%2!=0){

                    term2=term2+1;
                    a[i]=term2;
                }
             
       }
     
      for(int i=0;i<a.length;i++){

         System.out.print(a[1]);

              }
	System.out.println();
	System.out.println("enter index no:");
        int index=sc.nextInt();
      for(int i=0;i<a.length;i++){

     int c=a[i]/2;
       System.out.print(c);
           }

 }

}


      //       QUE  29  ............  


 class Que29{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String number = scanner.nextLine();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (i % 2 == 0) { // Even position
                evenSum += digit;
            } else { // Odd position
                oddSum += digit;
            }
        }

        int difference = oddSum - evenSum;
        System.out.println("Difference between odd and even position digits: " + difference);

        scanner.close();
    }
}



		//      QUE  40.........




   class Que40 {
    public static int[] merge(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }

        int[] m = new int[a.length + b.length];
        int i = 0, j = 0, k = m.length - 1;

        // Merge the elements from both arrays in descending order
        while (i < a.length && j < b.length) {
            if (a[i] >= b[j]) {
                m[k--] = a[i++];
            } else {
                m[k--] = b[j++];
            }
        }

        // Copy any remaining elements from a to m
        while (i < a.length) {
            m[k--] = a[i++];
        }

        // Copy any remaining elements from b to m
        while (j < b.length) {
            m[k--] = b[j++];
        }

        return m;
    }

    public static void main(String[] args) {
        int[] a = {10, 8, 6, 4, 2};
        int[] b = {9, 7, 5, 3, 1};

        int[] merged = merge(a, b);
        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}      


		//Que41    SORT EVEN AND ODD FROM THE ARRAY......


	class Que41{

        public static void main(String args[]){
	   Scanner sc=new Scanner (System.in);
	   System.out.println ("enter how many elements you want to store in array :");
           int n=sc.nextInt();

           int a[]=new int[n];
	   System.out.printf("enter %d array elements :",n);

           for(int i=0;i<a.length;i++){

		a[i]=sc.nextInt();
		
		}
          boolean flag=false;
          
    
          for(int i=0;i<a.length;i++){

	    if(a[i]%2==0){
              flag=true;

                    } 
     
		}

         for(int i=0;i<a.length;i++){ 
	 if(a[i]%2!=0){
           
                    }   
          }
       
           if(flag){

	      System.out.printf(" even = %d ",flag);
              System.out.println();
               }
          if(!flag){
          
               System.out.printf("odd = %d ",!flag);

                }

    }

}
		

       // DELETION A SPECIFIC BLOCK IN ARRAY..........


     class Que42{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the position to delete (1-based indexing): ");
        int position = scanner.nextInt();

        if (position < 1 || position > size) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the left using System.arraycopy
            System.arraycopy(array, position, array, position - 1, size - position);

            // Reduce the size of the array by 1
            size--;

            System.out.println("Array after deletion:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}



		// 	Second largest element   QUE43



    class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}   


	//  EVEN ODD ELEMENTS IN ARRAY ELEMENTS.........


class EvenOddElements{

public static void main(String args[]){
   Scanner sc=new Scanner (System.in);
   System.out.println("enter size of array :");
   int n=sc.nextInt();

   int a[]=new int[n];
   System.out.println("enter the array Element");
   for(int i=0;i<a.length;i++){

   a[i]=sc.nextInt();

         }
  
  System.out.println(" Even elements are:");

     for(int i=0;i<a.length;i++){

      if(a[i]%2==0){

        System.out.printf("   %d ",a[i]);

                 }

              
      }    
        System.out.println();

     
       System.out.println(" Odd elements are:");

     for(int i=0;i<a.length;i++){

      if(a[i]%2!=0){

        System.out.printf("   %d ",a[i]);

                 }

              
      }    

  }

}


		//   	QUE 48.....CEILLING AND FLOOR....



class Que48{

public static void main(String args[]){
   int a[]={8,4,7,3,2,9,6,10};
   Scanner sc=new Scanner (System.in);
   System.out.println("enter a number  you want to find cell and floor: ");
   int n=sc.nextInt();
   
	int cell=100000;
 	int floor=0;
   for(int i=0;i<a.length;i++){

   	if(a[i]==n){

      System.out.println("number is already present in a array ");
                
                   }else if( (a[i]>floor) && a[i]<n){       //imp for floor

                        floor=a[i];

                    }else if( (a[i]<cell) && a[i]>n ){        //  cell......

              		  cell=a[i];

                            }
	

	      }     //  for loop close....

         System.out.printf(" floor is %d ",floor);
         System.out.printf(" cell is %d ",cell);


  }

}


	//	Que49....  SMALLEST MISSING ELEMENT...


  class Que49{

public static void main(String args[]){
  Scanner sc=new Scanner (System.in);  
  int a[]={1,2,3,4,5,7,9,10};
  int small=10000;
  int count=0;
  for(int i=0;i<a.length;i++){
     
		count++;
          if(count!=a[i] && a[i]<small ){
               small=count;

               }

          }
  System.out.printf("smallest missing element: %d ",small);

  }

}


		//   QUE 50...NEXT GREATER ELEMENT IN ARRAY ...: 5 3 10 9 6 13



    class Que50 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            System.out.print(nextGreater + " ");
        }
    }
}


		//  QUE  72... RIGHT SUM OF DIAGONAL MATRIX.......



class Que72 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix:");
        int n = sc.nextInt();

        // Validate matrix size to be square

        if (n <= 0) {
            System.out.println("Invalid matrix size: Please enter a positive integer.");
            return;
        }

        int[][] matrix = new int[n][n];

        System.out.printf("Enter the elements of the %d x %d matrix:\n", n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate the right diagonal sum efficiently

        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += matrix[i][n - 1 - i]; // Access elements on the right diagonal directly
        }

        System.out.println("The sum of the elements on the right diagonal is: " + rightSum);
    }
}



// 	QUE 53  X APPEARS MORE THAT N/2 TIMES IN UNSORTED ARRAY OF N INTEGERS.....


class Que53{

public static void main(String args[]){
  int a[]={1,3,2,4,2,5,2,6,2,2};
  Scanner sc=new Scanner (System.in);

  System.out.println("enter the number you want to search..: ");
  int n=sc.nextInt();

  for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){

	if(a[i]>a[j]){

          int temp=a[i];
              a[i]=a[j];
              a[j]=temp;

                    }
 
              }
 
         }  

     System.out.println("sorted array in ascending order is ");
             
                 int count=0;
       for(int i=0;i<a.length;i++){
                   
                       if(a[i]==n){
                             count++;
                                  }
   		  System.out.printf("%d ",a[i]); 

                                 }

	         if(count>=(a.length/2)){

                System.out.printf("\n %d appears more than %d times ",n,a.length/2);
					}
    


  }
}


//	QUWE 55	....  Write a program in C to move all zeroes to the end of a given array...


class Que55{

public static void main(String args[]){
 Scanner sc=new Scanner (System.in);
 int a[]={5,1,0,9,0,3,0,6,7,8} ;

 for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){

           if(a[i]==0){

                 int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
   
                      }          

               }

           }
   
   System.out.print("array after sorting \n"); 

   for(int i=0;i<a.length;i++){

        System.out.printf("%d ",a[i]); 

            }

  }

}


//  QUE 56      to count the number of inversion in a given array....


class Que56{

public static void main(String args[]){
  int a[]={ 1 ,9 ,6 ,4 ,5};
    int count=0;

  for(int i=0;i<a.length;i++){
     for(int j=i+1;j<a.length;j++){

         if(a[i]>a[j]){

            int f=a[i];
            int s=a[j];
         System.out.printf(" (%d,%d) , ",f,s);
                   count++;
                      }
            }
  

        }

   System.out.printf("\n inversion formed %d times ",count); 

  }

}


















