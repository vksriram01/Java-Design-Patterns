class base_class 
{
private short x;

public void setX (short x)
{
this.x=x;
}
public short getX ()
{
return x;
}
public short getSum()
{
return (short)(x+x);
}

public base_class()
{
System.out.println("Base Class Constructer");
x=10;
}
}