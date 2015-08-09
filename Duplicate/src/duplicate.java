import java.util.ArrayList;
import java.util.HashSet;


public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
list.add(1);
list.add(1);
list.add(3);
list.add(3);
list.add(4);
list.add(4);
list.add(4);
int count=0;
HashSet hash1=new HashSet();
for(int i=0;i<list.size();i++)
{
	hash1.add(list.get(i));
}
int arraySize=list.size();
int hashSize=hash1.size();
count=arraySize-hashSize;
System.out.println(count);
	}

}
