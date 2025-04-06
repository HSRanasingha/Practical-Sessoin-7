class Rectangle{
	
	int height=3;
	int width=4;
	
	Rectangle(){
	height=3;
	width=4;	
	}
	
	Rectangle(int height, int width){
		this.height=height;
		this.width=width;
		System.out.println("just created a rectangle object with size (h*w) "+height+"*"+width);
		print(width,height);
	}
	
	void get_detail(){
		System.out.println("Height is "+height+" , Width is "+width);
	}
	
	
	void print(int width, int height){
		
		for(int j=0; j<height;j++){ // for lines ; height
			for(int i=0; i<width;i++){ //for *s; width
	          System.out.print("* ");// * in each line
			   }
			   System.out.println(); // line braker
			}
	}
}

class main2{
	public static void main(String[] args){
		Rectangle r1=new Rectangle();
		System.out.println("r1 Height is "+r1.height+" , Width is "+r1.width);
		System.out.println();
		
		Rectangle r2=new Rectangle(5,7);
		System.out.println("r2 Height is "+r2.height+" , Width is "+r2.width);
		System.out.println();
		
		Rectangle r3=new Rectangle(7,10);
		System.out.println("r3 Height is "+r3.height+" , Width is "+r3.width);
		System.out.println();
		
		Rectangle r4=new Rectangle(10,13);
		System.out.println("r4 Height is "+r4.height+" , Width is "+r4.width);
		System.out.println();
		
		Rectangle r5=r1;
		System.out.println("r5 Height is "+r5.height+" , Width is "+r5.width);
		System.out.println();
		
		r1.height=7;
		r1.width=10;
		r1.get_detail();
		//r1.print(3,4);
		
		/*for(int i=0; i<3;i++){
			for(int j=0; j<4;j++){
				System.out.println("*");
			}
		}*/
	}
	
}

class main{
	public static void main(String[] args){
		System.out.println("find if the number is even or odd : ");
		for(int i=1; i<=10; i++){
			
			if(i%2==0){
			System.out.println("Value of i is "+i+". it is even");
			}
			else{
			System.out.println("Value of i is "+i+". it is odd");	
			}
		}
		
		System.out.println("      ");
		System.out.println("find if the number is a multiplier of 4 or not : ");
		for(int i=1; i<=10; i++){
			
			if(i%4==0){
			System.out.println("Value of i is "+i+". it is multiplier of 4");
			}
			else{
			System.out.println("Value of i is "+i+". it is not a multiplier of 4");	
			}
		}
		
	} 
}

/*
---------------outputs---------------

Microsoft Windows [Version 10.0.22631.5126]
(c) Microsoft Corporation. All rights reserved.

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
Value of i is0
Value of i is1
Value of i is2
Value of i is3
Value of i is4
Value of i is5
Value of i is6
Value of i is7
Value of i is8
Value of i is9

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
Value of i is 0
Value of i is 1
Value of i is 2
Value of i is 3
Value of i is 4
Value of i is 5
Value of i is 6
Value of i is 7
Value of i is 8
Value of i is 9

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
Value of i is 0 it is even
Value of i is 1 it is even
Value of i is 2 it is even
Value of i is 3 it is even
Value of i is 4 it is even
Value of i is 5 it is even
Value of i is 6 it is even
Value of i is 7 it is even
Value of i is 8 it is even
Value of i is 9 it is even

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
Value of i is 0 it is even
Value of i is 1 it is odd
Value of i is 2 it is even
Value of i is 3 it is odd
Value of i is 4 it is even
Value of i is 5 it is odd
Value of i is 6 it is even
Value of i is 7 it is odd
Value of i is 8 it is even
Value of i is 9 it is odd

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:16: error: not a statement
                for(int i=0; i<10; i+2){
                                    ^
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
Value of i is 0. it is even
Value of i is 1. it is odd
Value of i is 2. it is even
Value of i is 3. it is odd
Value of i is 4. it is even
Value of i is 5. it is odd
Value of i is 6. it is even
Value of i is 7. it is odd
Value of i is 8. it is even
Value of i is 9. it is odd
Value of i is 1. it is not a multiplier of 4
Value of i is 2. it is not a multiplier of 4
Value of i is 3. it is not a multiplier of 4
Value of i is 4. it is multiplier of 2
Value of i is 5. it is not a multiplier of 4
Value of i is 6. it is not a multiplier of 4
Value of i is 7. it is not a multiplier of 4
Value of i is 8. it is multiplier of 2
Value of i is 9. it is not a multiplier of 4
Value of i is 10. it is not a multiplier of 4

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>javac main
error: Class names, 'main', are only accepted if annotation processing is explicitly requested
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>java main
Error: Main method must return a value of type void in class main, please
define the main method as:
   public static void main(String[] args)

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
find if the number is even or odd :
Value of i is 0. it is even
Value of i is 1. it is odd
Value of i is 2. it is even
Value of i is 3. it is odd
Value of i is 4. it is even
Value of i is 5. it is odd
Value of i is 6. it is even
Value of i is 7. it is odd
Value of i is 8. it is even
Value of i is 9. it is odd
find if the number is a multiplier of 4 or not :
Value of i is 1. it is not a multiplier of 4
Value of i is 2. it is not a multiplier of 4
Value of i is 3. it is not a multiplier of 4
Value of i is 4. it is multiplier of 2
Value of i is 5. it is not a multiplier of 4
Value of i is 6. it is not a multiplier of 4
Value of i is 7. it is not a multiplier of 4
Value of i is 8. it is multiplier of 2
Value of i is 9. it is not a multiplier of 4
Value of i is 10. it is not a multiplier of 4

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
find if the number is even or odd :
Value of i is 0. it is even
Value of i is 1. it is odd
Value of i is 2. it is even
Value of i is 3. it is odd
Value of i is 4. it is even
Value of i is 5. it is odd
Value of i is 6. it is even
Value of i is 7. it is odd
Value of i is 8. it is even
Value of i is 9. it is odd

find if the number is a multiplier of 4 or not :
Value of i is 1. it is not a multiplier of 4
Value of i is 2. it is not a multiplier of 4
Value of i is 3. it is not a multiplier of 4
Value of i is 4. it is multiplier of 2
Value of i is 5. it is not a multiplier of 4
Value of i is 6. it is not a multiplier of 4
Value of i is 7. it is not a multiplier of 4
Value of i is 8. it is multiplier of 2
Value of i is 9. it is not a multiplier of 4
Value of i is 10. it is not a multiplier of 4

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
find if the number is even or odd :
Value of i is 0. it is even
Value of i is 1. it is odd
Value of i is 2. it is even
Value of i is 3. it is odd
Value of i is 4. it is even
Value of i is 5. it is odd
Value of i is 6. it is even
Value of i is 7. it is odd
Value of i is 8. it is even
Value of i is 9. it is odd

find if the number is a multiplier of 4 or not :
Value of i is 1. it is not a multiplier of 4
Value of i is 2. it is not a multiplier of 4
Value of i is 3. it is not a multiplier of 4
Value of i is 4. it is multiplier of 4
Value of i is 5. it is not a multiplier of 4
Value of i is 6. it is not a multiplier of 4
Value of i is 7. it is not a multiplier of 4
Value of i is 8. it is multiplier of 4
Value of i is 9. it is not a multiplier of 4
Value of i is 10. it is not a multiplier of 4

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
find if the number is even or odd :
Value of i is 1. it is odd
Value of i is 2. it is even
Value of i is 3. it is odd
Value of i is 4. it is even
Value of i is 5. it is odd
Value of i is 6. it is even
Value of i is 7. it is odd
Value of i is 8. it is even
Value of i is 9. it is odd
Value of i is 10. it is even

find if the number is a multiplier of 4 or not :
Value of i is 1. it is not a multiplier of 4
Value of i is 2. it is not a multiplier of 4
Value of i is 3. it is not a multiplier of 4
Value of i is 4. it is multiplier of 4
Value of i is 5. it is not a multiplier of 4
Value of i is 6. it is not a multiplier of 4
Value of i is 7. it is not a multiplier of 4
Value of i is 8. it is multiplier of 4
Value of i is 9. it is not a multiplier of 4
Value of i is 10. it is not a multiplier of 4

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:2: error: invalid method declaration; return type required
        print(int width, int height){
        ^
Rectangle.java:9: error: not a statement
                Rectangle 1=new Rectangle();
                ^
Rectangle.java:9: error: ';' expected
                Rectangle 1=new Rectangle();
                         ^
3 errors

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:2: error: invalid method declaration; return type required
        print(int width, int height){
        ^
Rectangle.java:9: error: not a statement
                Rectangle 1=new Rectangle();
                ^
Rectangle.java:9: error: ';' expected
                Rectangle 1=new Rectangle();
                         ^
3 errors

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:2: error: invalid method declaration; return type required
        print(int width, int height){
        ^
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:11: error: cannot find symbol
                r1.print(3,4);
                  ^
  symbol:   method print(int,int)
  location: variable r1 of type Rectangle
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:2: error: invalid method declaration; return type required
        print(int width, int height){
        ^
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:2: error: invalid method declaration; return type required
        print(int width, int height){
        ^
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:2: error: invalid method declaration; return type required
        print(int width, int height){
        ^
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:11: error: cannot find symbol
                r1.width=3;
                  ^
  symbol:   variable width
  location: variable r1 of type Rectangle
Rectangle.java:12: error: cannot find symbol
                r1.height=4;
                  ^
  symbol:   variable height
  location: variable r1 of type Rectangle
2 errors

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
*
*
*
*
*
*
*
*
*
*
*
*
*

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
find if the number is even or odd :
Value of i is 1. it is odd
Value of i is 2. it is even
Value of i is 3. it is odd
Value of i is 4. it is even
Value of i is 5. it is odd
Value of i is 6. it is even
Value of i is 7. it is odd
Value of i is 8. it is even
Value of i is 9. it is odd
Value of i is 10. it is even

find if the number is a multiplier of 4 or not :
Value of i is 1. it is not a multiplier of 4
Value of i is 2. it is not a multiplier of 4
Value of i is 3. it is not a multiplier of 4
Value of i is 4. it is multiplier of 4
Value of i is 5. it is not a multiplier of 4
Value of i is 6. it is not a multiplier of 4
Value of i is 7. it is not a multiplier of 4
Value of i is 8. it is multiplier of 4
Value of i is 9. it is not a multiplier of 4
Value of i is 10. it is not a multiplier of 4

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
*
*
*
*
*
*
*
*
*
*
*
*
*

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
*
*
*
*
*
*
*
*
*
*
*
*
*

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:50: error: reached end of file while parsing
}
 ^
1 error

C:\Users\2022ict78\Desktop\IT1214\s7>
C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
*
*
*
*
*
*
*
*
*
*
*
*

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
************
C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
*
*
*

*
*
*

*
*
*

*
*
*


C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
***
***
***
***

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
* * *
* * *
* * *
* * *

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
just created a rectangle object with size (h*w) 5*3
* * *
* * *
* * *
* * *
* * *

C:\Users\2022ict78\Desktop\IT1214\s7>
C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
just created a rectangle object with size (h*w) 5*3
* * *
* * *
* * *
* * *
* * *
just created a rectangle object with size (h*w) 10*4
* * * *
* * * *
* * * *
* * * *
* * * *
* * * *
* * * *
* * * *
* * * *
* * * *

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
just created a rectangle object with size (h*w) 2*2
* *
* *

just created a rectangle object with size (h*w) 5*5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

just created a rectangle object with size (h*w) 7*7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *

just created a rectangle object with size (h*w) 10*10
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *

C:\Users\2022ict78\Desktop\IT1214\s7>
C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
just created a rectangle object with size (h*w) 2*3
* * *
* * *

just created a rectangle object with size (h*w) 5*7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *

just created a rectangle object with size (h*w) 7*10
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *

just created a rectangle object with size (h*w) 10*13
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:7: error: not a statement
                this height=height;
                ^
Rectangle.java:7: error: ';' expected
                this height=height;
                    ^
Rectangle.java:8: error: not a statement
                this width=width;
                ^
Rectangle.java:8: error: ';' expected
                this width=width;
                    ^
4 errors

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java
Rectangle.java:7: error: not a statement
                this height=height;
                ^
Rectangle.java:7: error: ';' expected
                this height=height;
                    ^
Rectangle.java:8: error: not a statement
                this width=width;
                ^
Rectangle.java:8: error: ';' expected
                this width=width;
                    ^
4 errors

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
just created a rectangle object with size (h*w) 2*3
* * *
* * *
Height is 2 , Width is 3

just created a rectangle object with size (h*w) 5*7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
Height is 5 , Width is 7

just created a rectangle object with size (h*w) 7*10
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
Height is 7 , Width is 10

just created a rectangle object with size (h*w) 10*13
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
Height is 10 , Width is 13


C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
just created a rectangle object with size (h*w) 2*3
* * *
* * *
Height is 2 , Width is 3

just created a rectangle object with size (h*w) 5*7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
Height is 5 , Width is 7

just created a rectangle object with size (h*w) 7*10
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
Height is 7 , Width is 10

just created a rectangle object with size (h*w) 10*13
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
Height is 10 , Width is 13

Height is 2 , Width is 3

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main
find if the number is even or odd :
Value of i is 1. it is odd
Value of i is 2. it is even
Value of i is 3. it is odd
Value of i is 4. it is even
Value of i is 5. it is odd
Value of i is 6. it is even
Value of i is 7. it is odd
Value of i is 8. it is even
Value of i is 9. it is odd
Value of i is 10. it is even

find if the number is a multiplier of 4 or not :
Value of i is 1. it is not a multiplier of 4
Value of i is 2. it is not a multiplier of 4
Value of i is 3. it is not a multiplier of 4
Value of i is 4. it is multiplier of 4
Value of i is 5. it is not a multiplier of 4
Value of i is 6. it is not a multiplier of 4
Value of i is 7. it is not a multiplier of 4
Value of i is 8. it is multiplier of 4
Value of i is 9. it is not a multiplier of 4
Value of i is 10. it is not a multiplier of 4

C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
just created a rectangle object with size (h*w) 2*3
* * *
* * *
r1 Height is 2 , Width is 3

just created a rectangle object with size (h*w) 5*7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
r2 Height is 5 , Width is 7

just created a rectangle object with size (h*w) 7*10
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
r3 Height is 7 , Width is 10

just created a rectangle object with size (h*w) 10*13
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
r4 Height is 10 , Width is 13

r5 Height is 2 , Width is 3

C:\Users\2022ict78\Desktop\IT1214\s7>
C:\Users\2022ict78\Desktop\IT1214\s7>javac Rectangle.java

C:\Users\2022ict78\Desktop\IT1214\s7>java main2
r1 Height is 3 , Width is 4

just created a rectangle object with size (h*w) 5*7
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
* * * * * * *
r2 Height is 5 , Width is 7

just created a rectangle object with size (h*w) 7*10
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * * * * * * * *
r3 Height is 7 , Width is 10

just created a rectangle object with size (h*w) 10*13
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
* * * * * * * * * * * * *
r4 Height is 10 , Width is 13

r5 Height is 3 , Width is 4

Height is 7 , Width is 10

C:\Users\2022ict78\Desktop\IT1214\s7>
*/