package Generics;

import java.io.Serializable;

public class CustomGeneric2 <T extends Number & Serializable>{
    private T my_property;

    public CustomGeneric2(T property)
    {
        this.my_property = property;
    }
    public <T> void print_prop()
    {
        System.out.println(this.my_property);
    }
}
