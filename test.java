/**
 * Created by user on 15/03/22.
 */
public class test {
    public static void main(String[] args) {
        Circularlaylinkedlist<Integer> list=new Circularlaylinkedlist<>();
        list.addfirst(11);
        list.addlist(12);
        list.addlist(13);
        int n=list.size();
        for (int i = 0; i < n; i++) {
            System.out.println(list.first());
           list.rotate();

        }
        System.out.println(list.size());
    }

}
