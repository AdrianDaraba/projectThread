import java.util.ArrayList;

 class secondThread implements Runnable{

	String name;
	ArrayList<Integer> list;
	
	public secondThread(String name, ArrayList<Integer> list) {
		this.name = name;
		this.list = list;
	}
	
	public void run(){	
		int i = 1;
		while(i*11 < 250){
			list.add(i*11);
			i++;
		}
		//System.out.print(list);
	}
}	