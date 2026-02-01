import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrcCollctn {


    public void prcMapwith(){

        Map<Integer, String> hm1 =new HashMap<>();

        hm1.put(3, "Geks");
        hm1.put(1, "For");
        hm1.put(2, "Geeks");
        hm1.put(1, "Geeks");

        Map.Entry mapckc;

        Map<List<Integer>, List<String>> hm2=new HashMap<>();
        List<Integer> lisat= new ArrayList<>();


        System.out.println("map values :"+ hm1);

        System.out.println(hm1.entrySet());

        for (Map.Entry mapelemnt: hm1.entrySet()){

            System.out.println(mapelemnt);
            System.out.println( mapelemnt.getKey());
            mapelemnt.setValue("bvhvh");

        }

        System.out.println("after settingg value:");
    }

    public static void main(String[] args) {
        PrcCollctn obj=new PrcCollctn();
        obj.prcMapwith();
    }
}
