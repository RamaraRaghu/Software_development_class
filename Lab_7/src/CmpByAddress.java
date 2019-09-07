import java.util.Comparator;
public class CmpByAddress implements Comparator {
	
	

	@Override
	public int compare(Object object1, Object object2) {
		if(object1 instanceof Person && object2 instanceof Person){
			return ((Person)object1).getAddress().compareTo(((Person) object2).getAddress());
		}
		return 0;
	}
}
