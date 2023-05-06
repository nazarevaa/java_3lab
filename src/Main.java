import java.util.*;

public class Main {

    static void addList(List<Integer> list, int size, String isList) {
        long start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println(isList+"  add     : " + elapsed+" ms");

    }
    static void get(List<Integer> list,int size,String isList){
        long start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            list.get(i);
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println(isList+"  get     : " + elapsed+" ms");

    }
    static  void contains(List<Integer> list,int size,String isList){
        long start = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            list.contains(i);
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println(isList+"  contains: " + elapsed+" ms");
    }
    static void delete(List<Integer> list,int size,String isList){

        long start = System.currentTimeMillis();
        for (int i=0;i<size/2;i++){
            list.remove(i);
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println(isList+"  delete  : " + elapsed+" ms");

    }


    public static void main(String[] args) {
        String aL="ArrayList ";
        String lL="LinkedList";
        int n=20000;
        List<Integer> arrayList= new ArrayList<Integer>();
        List<Integer> linkedList=new LinkedList<Integer>();
        addList(arrayList,n,aL);
        contains(arrayList,n,aL);
        get(arrayList,n,aL);
        delete(arrayList,n,aL);
        System.out.println();
        addList(linkedList,n,lL);
        contains(linkedList,n,lL);
        get(linkedList,n,lL);
        delete(linkedList,n,lL);

    }
}
