package model;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Bai4 {
    public static void main(String[] args) {
        //4 in ngày giờ ttheo chỉ định
        //System.out.println(Date.from(Instant.now()));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("4\n" + dateFormat.format(Date.from(Instant.now())));
    }
}
