package review;

import java.util.List;

public class MyUtils <T> { //<T extends Student>

    public void printInfos(List<T> list){
        for (T item: list){
            System.out.println(list);
        }

        System.out.println("total count: " + list.size());
    }

    public T getLastItem(List<T> list){
        return list.get(list.size()-1);
    }

    //write a method that takes list, return last item - name (student, teacher)
    //instance of

    public String getLastItemName(List<T> list) throws Exception {
        T lastItem = list.get(list.size()-1);

        //not best practice!
        if (lastItem instanceof Student){
            return ((Student) lastItem).getName();

        }else if(lastItem instanceof Teacher){
            return ((Teacher) lastItem).getName();

        }else {
            throw new Exception("some error");

        }
    }
}
