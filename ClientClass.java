package shipeiqi;
//适配器模式
public class ClientClass {
	public static void main(String args[]) {
		NewJuice newjuice = new Adapter();
		String str = newjuice.newPort("苹果", "梨子");
		System.out.println(str);
	}
}