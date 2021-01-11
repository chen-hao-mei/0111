package chen;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        List list=new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add(55.5F);
        list.add(false);
        list.add(33);

        System.out.println("当亲集合的个数" + list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
