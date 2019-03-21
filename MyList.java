package Model.Utils;

import java.util.LinkedList;
import java.util.Queue;

public class MyList<T> implements MyIList<T> {
    Queue<T> list;

    public MyList() {
        list = new LinkedList<T>();
    }

    @Override
    public T pop() {
        return list.poll();
    }

    @Override
    public void push(T v) {
        list.add(v);
    }

    @Override
    public String toStr() {
        String s = "";
        for(T elem: list)
        {
            s += elem.toString() + "\n";
        }
        return s;
    }

    public Queue<T> getList() {
        return list;
    }
}

