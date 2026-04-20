
public class main {
	Calculator app = new Calculator();
    
    System.out.println("--- CHƯƠNG TRÌNH MÁY TÍNH NHÓM ---");
    
    // Test các phép tính cơ bản
    double soA = 10;
    double soB = 5;
    
    System.out.println("Phép cộng (" + soA + " + " + soB + ") = " + app.cong(soA, soB));
    System.out.println("Phép trừ (" + soA + " - " + soB + ") = " + app.tru(soA, soB));
    System.out.println("Phép nhân (" + soA + " * " + soB + ") = " + app.nhan(soA, soB));
    System.out.println("Phép chia (" + soA + " / " + soB + ") = " + app.chia(soA, soB));
    
    System.out.println("----------------------------------");
    
    // Test phương trình bậc nhất
    app.giaiPhuongTrinhBacNhat(2, -4); // 2x - 4 = 0 => x = 2.0
    app.giaiPhuongTrinhBacNhat(0, 5);  // 0x + 5 = 0 => Vô nghiệm
    app.giaiPhuongTrinhBacNhat(0, 0);  // 0x + 0 = 0 => Vô số nghiệm
}
}
