/**
 * This will find the distance between a point and a plane
 * 1. I will first take in the point and the equation of the plane 
 *2. I will then find a point on a plane and the vector between that point and the point above the plane  
 * 3.find the magnitude of the projection of the vector we find in 2 unto the vectos from the plane equation
 * @author Anton M. Kopti
 *
 */
import java.util.*;
public class DistBetPointAndPlane extends BasicVectorProp
{
	//data
	public double [] coordinate = new double[3];
	public double []  equation = new double[4];
	Scanner sc = new Scanner(System.in);
	
	//constructors 
	public DistBetPointAndPlane()
	{
		
	}
	//methods 
	public void getter()
	{
		
		System.out.println("please input in the 3 numbers of the coordinate away from the plane.");
		for(int i=0;i<3;i++)
		{
			coordinate[i]=sc.nextDouble();
		}
		System.out.println("Please input in the 4 coefficients of the equation of the plane");
		for(int i=0;i<4;i++)
		{
			equation[i]= sc.nextDouble();
		}
	}
	public void distance()
	{
		getter();
		double[] temp = {(coordinate[0]-(equation[3]/equation[0])),coordinate[1],coordinate[2]};
		double temp2 [] = {equation[0],equation[1],equation[2]};
		double x = mag(projection(temp,temp2));
		System.out.println(x);
	}
	//main
	public static void main(String args[])
	{
		DistBetPointAndPlane dbp = new DistBetPointAndPlane();
		dbp.distance();
	}
}
