
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class threadTest {

	
	public static void main(String[] args)throws InterruptedException  {
		ArrayList<Integer> listFirstThread =new ArrayList<Integer>();
		ArrayList<Integer> listSecondThread = new ArrayList<Integer>();
		List<Integer> finalList = new ArrayList<Integer>();
			
		Thread ft = new Thread(new firstThread("firstThread", listFirstThread));
		Thread st = new Thread(new secondThread("secondThread", listSecondThread ));
		
		ft.start();
		Thread.sleep(50);
		st.start();
		Thread.sleep(50);
		finalList.addAll(listFirstThread);
		finalList.addAll(listSecondThread);
		Collections.sort(finalList);	
		
			for(int i = 0; i < finalList.size()-1; i++){
				if(finalList.get(i) == finalList.get(i+1)){
					finalList.remove(i+1);
					i--;
				}
			}	
			System.out.println(finalList);
	}
}