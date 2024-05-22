package Generics;

public class CustomGeneric1 <T>{
    private T my_property;

    public CustomGeneric1(T property)
    {
        this.my_property = property;
    }
    public <T> void print_prop()
    {
        System.out.println(this.my_property);
    }
}
