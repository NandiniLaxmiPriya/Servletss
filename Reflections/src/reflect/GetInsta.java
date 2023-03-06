package reflect;
class World{
	public void heh() {
		System.out.println("hm");
	}
}
public class GetInsta {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c =  Class.forName("World");
		System.out.println(c.getName());

	}

}
