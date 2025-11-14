package prosto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StreamAPi {
    public static void main(String[] args) throws Exception {
        List<String> persosns = new ArrayList<>();
        persosns.add("sasha");
        persosns.add("masha");
        persosns.add("pasha");
        System.out.println(persosns);

        List<String> pers = persosns.stream()
                .filter(p -> p.startsWith("p")).toList();
        System.out.println(pers);
        StreamAPi streamAPi = new StreamAPi();
    }
    public void calculate(int n) throws Exception, IOException
    {
        if (n == 0)
            throw new Exception("n равно нулю!");
        if (n == 1)
            throw new IOException("n равно единице");
    }
}
