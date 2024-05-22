import Generics.CustomGeneric1;
import Generics.CustomGeneric2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        CustomGeneric1<Integer> generic1_1 = new CustomGeneric1<>(1);
        CustomGeneric1<String> generic1_2 = new CustomGeneric1<>("Str");
        generic1_1.print_prop();
        generic1_2.print_prop();

        CustomGeneric2<Integer> generic2_1 = new CustomGeneric2<>(254);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(98);
        print_func(list);
    }

    public static void print_func(List<?> my_list)
    {
        System.out.println(my_list);
    }
    /**
     * can use List<? extends Number> to specify bounds
     */
}
