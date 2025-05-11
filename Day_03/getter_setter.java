class Student {
	private int prn = 1807;

	public int getNum(){
		return prn;
	}

	public void setNum(int prn ){
		this.prn = prn;
	}
}

class Client{
	public static void main(String [] args){
		Student obj = new Student();
		System.out.println("Initial PRN : " + obj.getNum());
		obj.setNum(718);
		System.out.println("Updated PRN : " + obj.getNum());
	}
}

