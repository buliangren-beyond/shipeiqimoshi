package shipeiqi;

public class Adapter extends OldJuice implements NewJuice{

	@Override
	public String newPort(String str1, String str2) {
		String str = onePort(str1);
		str += onePort(str2);
		return str;
	}
}
