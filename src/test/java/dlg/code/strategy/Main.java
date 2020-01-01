package dlg.code.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Long> longList = new ArrayList<>();
        longList.add(1L);
        longList.add(3L);
        longList.add(2L);

        System.out.println(longList);

        Collections.sort(longList, new LongComparator());

        System.out.println(longList);
    }



}
