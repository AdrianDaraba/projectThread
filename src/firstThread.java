
import java.util.ArrayList;

class firstThread implements Runnable{
		
		String name;
		ArrayList <Integer> list;
		
		public firstThread(String name, ArrayList<Integer> list){
			this.name = name;
			this.list = list;
		}
		
		public void run(){
				int i = 1;
				while(i*3 <250){
				list.add(i*3);
				i++;
				}	
				//System.out.print(list);		
		}
				
}
