import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static List<String> splitString(String str, char escape) {
        List<String> res = new ArrayList<String>();
        // Your Logic goes here
        String crr = "";
        for(char a: str.toCharArray()) {
            if(a == escape) {
                res.add(crr);
                crr = "";
                continue;
            }
            crr += a;
        }

        if(!(crr.equals(""))) {
            res.add(crr);
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "My name is 'Ashok Kumar Gowda' I have 12+ years of experience I work for 'IBM India Pvt Ltd' ";

        List<String> result = splitString(str, '\'');

        for (String a : result) {
            System.out.println(a);
        }
    }
}
