package day_5;

public class string_buffer_and_builder {
	public static void main(String args[]) {
		string_buffer_and_builder sd = new string_buffer_and_builder();
		String[] names = {"abu","abbas","alaudeen","aysha"};
		sd.joidword(names);
		String st="";

		
	}

	private void joidword(String[] names) {
		// TODO Auto-generated method stub
		String sentence = "";
		StringBuffer sd1 = new StringBuffer("");
		for(String a:names) {
			sd1.append(a);
			
		}
		System.out.println(sd1.reverse());
	}
}	

