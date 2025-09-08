public class SpaceTravel {
	public static void main(String[]args) {
		//to do 
		//primitive datatypes
		double distanceToMoon = 384400;//in km
		float speed = 27.5f;// in km/sec
		byte crewMember = 3;
		boolean oxygenAvailable = true;
		char rocketCode = 'w';
		double TimeTravel=distanceToMoon/(speed*3600);
		System.out.println("RocketCode:"+rocketCode);
		System.out.println("Crew Members:"+crewMember);
		System.out.println("Oxygen Available?:"+oxygenAvailable);
		System.out.println("Travel Time:"+TimeTravel+" hours");
	
	}
}
OUTPUT:
RocketCode:w
Crew Members:3
Oxygen Available?:true
Travel Time:3.882828282828283 hours
