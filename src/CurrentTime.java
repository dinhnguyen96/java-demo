
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime
{
    public static void main(String[] args)
    {
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(timeFormat.format(date));

    }
}
