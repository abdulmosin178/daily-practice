//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//generics mean -->>writing code that work with any datatype
        //features:reduce runtime error,eliminate typecasting,code reuasable



        ArrayList list = new ArrayList();
        list.add("Mosin");
        list.add(10);  // allowed 😬

        String name = (String) list.get(0);  // need to cast

    }
    }
}