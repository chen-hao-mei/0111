package chen;

public class Example {
    String str=new String("good");
    char ch[]={'a','b','c'};

    public static void main(String[] args){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str + " and " + ex.ch[0]);
    }

    public void change(String str, char[] ch){
        str="tesk ok";
        ch[0]='g';
    }
}
