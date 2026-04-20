
public class baitap {
	// 1. Thành viên làm hàm CỘNG
    public double cong(double a, double b) {
        return a + b;
    }

    // 2. Thành viên làm hàm TRỪ
    public double tru(double a, double b) {
        return a - b;
    }

    // 3. Thành viên làm hàm NHÂN
    public double nhan(double a, double b) {
        return a * b;
    }

    // 4. Thành viên làm hàm CHIA
    public double chia(double a, double b) {
        if (b == 0) {
            System.out.println("Lỗi: Không thể chia cho 0!");
            return 0; // Trả về 0 tạm thời nếu lỗi
        }
        return a / b;
    }

    // 5. Nhóm trưởng làm hàm Giải Phương Trình Bậc Nhất (ax + b = 0)
    public void giaiPhuongTrinhBacNhat(double a, double b) {
        System.out.print("Giải phương trình " + a + "x + " + b + " = 0: ");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm x = " + x);
        }
    }
}
