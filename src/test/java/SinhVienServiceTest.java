import com.example.De1KiemThu.bai2.SinhVien;
import com.example.De1KiemThu.bai2.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinhVienServiceTest {
    private SinhVienService service;

    @BeforeEach
    void setUp() {
        service = new SinhVienService(); // Tránh khởi tạo lại nhiều lần
    }

    @Test
    void testUpdateSinhVien_ValidData() {
        SinhVien sv = new SinhVien("SV01", "Nguyen Van A", 20, 7.5f, 3, "CNTT");

        service.update(sv, "Le Van B", 21, 8.0f, 4, "An ninh mạng");

        assertAll(
                () -> assertEquals("Le Van B", sv.getTen()),
                () -> assertEquals(21, sv.getTuoi()),
                () -> assertEquals(8.0f, sv.getDiemTrungBinh()),
                () -> assertEquals(4, sv.getKyHoc()),
                () -> assertEquals("An ninh mạng", sv.getChuyenNganh())
        );
    }

//    @Test
//    void testUpdateSinhVien_NullStudent() {
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> service.update(null, "Nguyen Van B", 22, 7.0f, 5, "Kinh tế")
//        );
//        assertEquals("Sinh viên không được null", exception.getMessage());
//    }
//
//    @Test
//    void testUpdateSinhVien_EmptyFields() {
//        SinhVien sv = new SinhVien("SV02", "Nguyen Van C", 22, 6.5f, 4, "Cơ khí");
//
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> service.update(sv, "", 23, 7.5f, 5, "")
//        );
//        assertEquals("Tên và chuyên ngành không được để trống", exception.getMessage());
//    }
//
//    @Test
//    void testUpdateSinhVien_InvalidAge() {
//        SinhVien sv = new SinhVien("SV03", "Nguyen Van D", 19, 7.0f, 2, "Kế toán");
//
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> service.update(sv, "Tran Van E", -5, 8.0f, 3, "Marketing")
//        );
//        assertEquals("Tuổi không hợp lệ", exception.getMessage());
//    }
//
//    @Test
//    void testUpdateSinhVien_InvalidScore() {
//        SinhVien sv = new SinhVien("SV04", "Nguyen Van E", 22, 9.0f, 6, "Y dược");
//
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> service.update(sv, "Tran Van F", 23, 11.0f, 7, "Dược học")
//        );
//        assertEquals("Điểm trung bình phải từ 0 đến 10", exception.getMessage());
//    }
}
