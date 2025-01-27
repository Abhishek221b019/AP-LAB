/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class One
{
    int x;
   One(int x)
   {
       this.x=x;
   }
   }
class Two extends One{
    Two(int x)
    {
        super(x);
    }
    
}
class Application
{
    public static void main(String args[])
    {
        Two ob=new Two(5);
        System.out.println("value of two is="+ob.x);
      
    }
}