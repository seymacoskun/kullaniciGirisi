import java.util.Scanner;
public class Kullanici 
{
	public static void main(String[] args) 
	{
		String userName, password;
		Scanner inp = new Scanner(System.in);
		System.out.println("Kullanici adi giriniz: ");
		userName = inp.nextLine();
		System.out.println("Sifre giriniz: ");
		password = inp.nextLine();
		
		if(userName.equals("Alaaddin34") && password.equals("Kalitelisifre17")) 
		{
			System.out.println("Giris Basarili");
		}else {
			System.out.println("Basarisiz deneme. Sifrenizi sifirlamak ister misiniz?: ");
			password = inp.nextLine();
			if(password.equals("evet")) 
			{
				System.out.println("Yeni sifreyi giriniz: ");
				password = inp.nextLine();
			}
			
			if(password.equals("Kalitelisifre17")) 
			{
				System.out.println("Yeni sifre eskisiyle ayni olamaz! ");
			}else {
				System.out.println("Sifre basariyla olusturuldu.");
			}
		}
	}
}
