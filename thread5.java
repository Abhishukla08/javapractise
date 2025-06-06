//program1 date 6-june
import java.util.*;
import java.util.stream.Collectors;

public class thread5 {
    public static void main(String[] args) {
        ArrayList<String>  st=new ArrayList<>();
        st.add("news");
        st.add("articles");
        st.add("vlogs");
        Collections.sort(st,new Comparator<String>(){
            public int compare(String a,String b){
                return a.compareTo(b);
            }
        });
        System.out.println(st);
        }
    }
//program2
class thread551 {
    public static void main(String[] args) {
        ArrayList<String>  st=new ArrayList<>();
        st.add("news");
        st.add("articles");
        st.add("vlogs");
        Collections.sort(st,(d, f)->d.compareTo(f));
        System.out.println(st);
    }
}
//program3
class stremap{
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,25,72,8,99);
        List<Integer> evenlist=list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(evenlist);

    }
}
