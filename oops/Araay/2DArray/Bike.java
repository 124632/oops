class Bike
{
	String name;
	double speed;
	int cc;

	void start()
           {
	System.out.println(" Bike started.." +this.speed);
            }

	void accelerate()
            {
		double speed;
		System.out.println(" Accelerated... riding at"+speed");
		System.out.println(this.speed);
            }
}

class BikeTester
{
	public static void main(String[] args)
          {
		System.out.println(" mms");

		Bike bk = new Bike();
		bk.accelerate();
		bk.start();
		System.out.println(" mme");
           }
}