import com.example.De1KiemThu.bai1.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {
    @Test
    void testSum_EmptyArray(){
        Assertions.assertEquals(0, ArrayUtils.sum(new int[]{}), "Tong cua mang khong co gia tri la 0");
    }
    @Test
    void testSum_SingleElement(){
        Assertions.assertEquals(5, ArrayUtils.sum(new int[]{5}), "Mang co 1 gia tri thi gia tri la gia tri cua so do");
    }
    @Test
    void testSum_MultipleElements(){
        Assertions.assertEquals(15, ArrayUtils.sum(new int[]{1,2,3,4,5}), "Gia tri cua mang nhieu gia tri la tong");
    }
    @Test
    void testSum_NegativeNumbers(){
        Assertions.assertEquals(-10, ArrayUtils.sum(new int[]{-1, -2, -3, -4}), "Gia tri tong cac so am phai dung");
    }
    @Test
    void testSum_NullArray(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> ArrayUtils.sum(null), "Mang null phai tra ve ngoai le") ;
    }

}
