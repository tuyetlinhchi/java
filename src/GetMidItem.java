import java.util.*;

class ListNum{
    private List<String> listNumbers;
    ListNum(List<String> listNumbers){
        this.listNumbers = listNumbers;
    }
    public String getMidItem(){
        int mid = listNumbers.size() / 2;
        float x = Float.parseFloat(listNumbers.get(mid-1));
        float y = Float.parseFloat(listNumbers.get(mid));
        if (listNumbers.size() % 2 == 0) {
            if(listNumbers.get(mid).contains(".")) return x + " " + y;
            return listNumbers.get(mid-1) + " " + listNumbers.get(mid);
        }
        else{
            if(listNumbers.get(mid).contains(".")) return ""+y;
            return listNumbers.get(mid);
        }
    }
    public String toString(){
        return getMidItem();
    }
}

public class GetMidItem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t--> 0) {
            String[] tokens = sc.nextLine().split(" ");
            ListNum list = new ListNum(Arrays.asList(tokens));
            System.out.println(list.getMidItem());
        }
    }
}