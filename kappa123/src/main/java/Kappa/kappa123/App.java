package Kappa.kappa123;

import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	port(420);
    	
    	PositionServices ps = new PositionServices();
    	//deprecated maina
//    	ps.createPosition(1, "SINEOK", 418. 814);
//    	ps.createPosition(2, "BQL", 419, 914);
//    	ps.createPosition(3, "DRAKON", 420, 24);
    	
    	
    	new Controller(ps);
    }
}
