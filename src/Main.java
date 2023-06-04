import java.util.*;
class User{
    int id;
    String email = null;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    User(){

    }
    User(int id,String email){
        this.id = id;
        this.email = email;
    }

}
public class Main{
    private static int id = 1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = "000001";
        System.out.println(Integer.parseInt(a));
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] option = s.split(" ");
            Map<String, String> user = new HashMap<>();
            switch(option[0]){
                case "C":
                    User u = new User();
                    u.setId(id);
                    System.out.printf("%06d" + " null\n", id);
                    ++id;
                    break;
                case "Set":
                    u = new User(Integer.parseInt(option[1]), option[2]);
                    user.put(option[1], option[2]);
                    System.out.printf("%06d " + u.getEmail()+"\n", u.getId());
//                case option[0]:

                default:
                    int x = Integer.parseInt(option[0]);
                    System.out.printf("%06d " + user.get(x-1)+"\n", x);
            }
        }
    }
}