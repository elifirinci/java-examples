import java.util.*;
public class Sets{
    public static void main(String[] args){
        //Sets
        //HashSet
        HashSet hash=new HashSet();
        hash.add(1);
        hash.add(null);
        hash.add(8);
        hash.add("20");
        Iterator itr=hash.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("***************************************\n");
        //LinkedHashSet
        LinkedHashSet linked=new LinkedHashSet();
        linked.add(1);
        linked.add(null);
        linked.add(8);
        linked.add("20");
        Iterator itr1=linked.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("***************************************\n");
        //TreeSet
        TreeSet tree=new TreeSet();
        tree.add(1);
        tree.add(8);
        tree.add(20);
        tree.add(2);
        /*try{
            tree.add(null);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        Iterator itr2=tree.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
        
    }
}
