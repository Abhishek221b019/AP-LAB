/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother
{
    int x;
   static  void show()
    {
        System.out.println("Hello World");
    }
}
class Child extends Mother{
    static void show()
    {
        System.out.println("Hello JUET");
    }
    
}
class Application
{
    public static void main(String args[])
    {
        Mother ob=new Mother();
        ob.show();
        Child ob1=new Child();
        ob1.show();
        Mother m1=new Child();
        m1.show();
    }
}