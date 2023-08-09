package finalizeKeyword;
//finalize keyword is used for a garbageCollections
public class A {
@Override
	public  void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(1000);
	}
	public static void main(String[] args) {
		A a1= new A();
		a1=null;
		System.gc();
	}
}
