import com.example.De1KiemThu.bai1.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.De1KiemThu.bai1.TongSoChanTrongDay;

public class TongSoChanTest {
    @Test
    void testDayDuong(){
        Assertions.assertEquals(30, TongSoChanTrongDay.tongChan(new int[]{1,2,3,4,5,6,7,8,9,10,11}), "Tong chan");
    }
}
