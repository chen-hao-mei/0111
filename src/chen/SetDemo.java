package chen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args){
       Set set= (Set) new HashSet();
        set.add(1);
        set.add("河池学院");
        set.add(55.5F);
        set.add(false);
        set.add(1);

        System.out.println("当前集合的元素个数：" + set.size());

        Iterator integer=set.iterator();
        while (integer.hasNext()){
            System.out.println("集合内的元素："+integer.next());
        }
    }
}
