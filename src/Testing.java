import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Testing {

    @org.junit.jupiter.api.Test
    void add() {
        String aL="ArrayList ";
        String lL="LinkedList";
        int n=20000;
        List<Integer> arrayList= new ArrayList<Integer>();
        List<Integer> linkedList=new LinkedList<Integer>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        assertTrue(addList(linkedList,n,lL)> 0 && addList(arrayList,n,aL) > 0);
    }


}