package shipeiqi;
//������ģʽ
public class ClientClass {
	public static void main(String args[]) {
		NewJuice newjuice = new Adapter();
		String str = newjuice.newPort("ƻ��", "����");
		System.out.println(str);
	}
}