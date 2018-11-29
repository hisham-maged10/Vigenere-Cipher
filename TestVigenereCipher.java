/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
public class TestVigenereCipher
{
	public static void main(String[] args)
	{
		testing();
	}	
	public static void testing()
	{
		VigenereCipher vc=new VigenereCipher("flute");
		System.out.println(vc.getEncrypted());
	}
}