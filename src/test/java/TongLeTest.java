import com.example.De1KiemThu.bai1.TongLe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TongLeTest {
    @Test
    void tongLe(){
        Assertions.assertEquals(9, TongLe.tongLe(new int[]{1,2,3,4,5}), "Tong Le");
    }
}
