package package1;
//TODO Auto-generated method stub
class Time{
	int hour;
	int minute;
	int second;
	
	Time(int h, int m, int s){
	hour = h;
	minute = m;
	second = s;
	}
	int getHour() {
		return hour;
	}
	int getMinute() {
		return minute;
	}
	int getSecond() {
		return second;
	}
	void setHour(int h) {
		hour = h;
	}
	void setMinute(int m) {
		minute = m;
	}
	void setSecond(int s) {
		second = s;
	}
	void setTime(int h,int m,int s) {
		hour = h;
		minute = m;
		second = s;
	System.out.println("The Actual time is "+hour+":"+minute+":"+second);
	}
	public String toString() {
		System.out.println("hh:mm:ss "+hour+":"+minute+":"+second);
		return hour+":"+minute+":"+second;
	}
		int nextSecond() {
		return second+1;
	}
		int previousSecond() {
			return second-1;
		}
}

public class AssignmentTime1 {

	public static void main(String[] args) {
		Time time = new Time(04,06,10);
//        time.setHour(23);
//        time.setMinute(10);
//        time.setSecond(03);
        time.setTime(04, 06, 45);
        time.toString();
//        System.out.println("The time is "+time.getHour()+":"+time.getMinute()+":"+time.getSecond()); 
       System.out.println("The next time is "+time.getHour()+":"+time.getMinute()+":"+time.nextSecond());
       System.out.println("The previous time is "+time.getHour()+":"+time.getMinute()+":"+time.previousSecond()); 
	
	}
	

}
