import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.Date;
import java.util.LinkedList;



class LogItem {
    private Long ts;
    private String s;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
    static {
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+7"));
    }
    public LogItem(long ts, String s) {
        this.ts = ts;
        this.s = s;
    }
    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(dateFormat.format(new Date(ts))).append("|").append(this.s).append(';').toString();
    }
}

//public class Main{
public class Datetime {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        LinkedList<LogItem> al = new LinkedList<>();
        long maxts = 0;
        int maxidx = 0;

        for (int i = 0; i < n; ++i) {
            String tmp = br.readLine().trim();
            String[] tmp2 = tmp.split(" ");

            long ts = Long.parseLong(tmp2[0]);
            String s = tmp.substring(tmp2[0].length(), tmp.length());

            al.add(new LogItem(ts, s));

            if (ts >= maxts) {
                maxts = ts;
                maxidx = i;
            }
        }

        pw.println("LASTEST LOG: " + al.get(maxidx));

        StringBuilder builder = new StringBuilder();

        al.forEach(x -> {
            builder.append(x.toString()).append('\n');
        });

        pw.print(builder);

        br.close();
        pw.close();
    }
}