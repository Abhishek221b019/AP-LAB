class Mother 
{
    int x=5;
    public void show()
    {
        System.out.println(x);
    }
}
class Child extends Mother 
{
}
class Main {
 public static void main (String args[]){
 Mother m= new Mother();
 m.show( ); 
 Child ch=new Child(); 
 ch.show();
 }
}
