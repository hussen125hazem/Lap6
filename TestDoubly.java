/**
 * Created by user on 15/03/22.
 */
public class TestDoubly {
    public static void main(String[] args) {
        Doublylinkedlist<String>list=new Doublylinkedlist<>();
        list.addlast("hussen");
       list.addlast("mohsen");
        list.addlast("abrahem");
       // System.out.println(list.size());
        //System.out.println(list.first());
        int n=list.size();
        for (int i = 0; i < n; i++) {
            System.out.println(list.removelast());


        }
        System.out.println(list.size());
    }
}
