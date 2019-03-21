import Model.*;
import Model.Utils.*;
import Repository.*;
import Controller.*;
import View.View;





public class main {


    public static void main(String[] args){

        RecipeRepository r=new RecipeRepository();
        Controller c=new Controller(r);
        View v=new View(c);
        MyIList<String> s=new MyList<String>();
        s.push("ceva");
        System.out.print(s.toStr());


        v.start();








    };
}
