class Printer{
	public void printer() {
		System.out.println("我是最基础的打印机，只有基本的打印功能");
	}
}
class ColorPrinter extends Printer{
	@Override
	public void printer() {
		System.out.println("我是彩色打印机，能打印彩色纸");
	}
}
class BlackPrinter extends Printer{
	@Override
	public void printer() {
		System.out.println("我是黑白打印机，能够打印黑白纸");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer1 = new ColorPrinter();
		printer1.printer();
		Printer printer2 = new BlackPrinter();
		printer2.printer();
	}

}
