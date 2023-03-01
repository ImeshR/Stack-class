public class bracketCheck {

	private String inputstr;
	
	public bracketCheck(String in) {
		inputstr = in;
	}
	
	public void checkB() {
		int size = inputstr.length();
		stackx Bstack = new stackx(size);
		
		for(int i = 0; i < size; i++)
		{
			if (inputstr.charAt(i) == '(') {
				Bstack.push('(');
			}
			
			else if (inputstr.charAt(i) == ')') {
				Bstack.pop();
			}
		}
		
		if (!Bstack.isEmpty()) {
			System.out.println("Invalid string");
		}
		
		else {
			System.out.println("Valid string");
		}
	}
}