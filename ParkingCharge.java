package org.percholas;

public class ParkingCharge{
	 public static void main(String args[]) {
		 MallParking  mall = new MallParking();
		 HospitalParking hospital = new HospitalParking();
		 double TicketMoney;
		 TicketMoney=hospital.processTicker(2);
		 System.out.println("Price for hospital parking is $"+TicketMoney);
		 TicketMoney=mall.processTicker(51);
		 System.out.println("Price for mall parking is $"+TicketMoney);
	 }
	 }

//interface

interface ParkingSystem {
	//fields
	public static final double nightonly = 30;
	public static final double morning = 20;
	public static final double twentyFour = 45;
	public static final double surcharge=0.20;
	

	double processTicker(int time);
}
//class HospitalParking
class HospitalParking extends MallParking implements ParkingSystem{
	MallParking mall = new MallParking();
	 @Override
		public double processTicker(int time) {
		
			double money = mall.parkingSystem(time);
			double Ticket = money + (money*surcharge);
			return Ticket;
		}
}

//class MallParking
 
 class MallParking implements ParkingSystem{
	 @Override
		public double processTicker(int time) {
			double money = parkingSystem(time);
			double Ticket = money + (money*surcharge);
			
			return Ticket;
		}
	 
	 public double parkingSystem(int time) {
	if(time>=5 && time<=17) {
		 return morning;
	 }else if(time>=17 && time <=0) {
		 return nightonly;
	 }else if(time>0&&time<5) {
		 return twentyFour;
	 }return 0;
}}
 
 
 
