class Date{
	int month;
	int day;
	int year;

	Date(){
		month=6;
		day=10;
		year=18;
	}
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
class DisplayData{
	public static void main(String[] args){
		//Date d=new Date();
		Date d=new Date(6,10,18);
		System.out.println(d.day+"/"+d.month+"/"+d.year);
	}
}