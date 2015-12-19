package Kappa.kappa123;

import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;

public class Controller {
	
	final PositionServices service;
	
	public Controller(final PositionServices service){
		this.service = service;
		initEverything();
	}
	
	public void initEverything(){
		getBoardState();
		summonToPosition();
	}
	
	//gets json output of the board
	//free space have null as Names
	public void getBoardState(){
		get("/positions", new Route(){
			public Object handle(Request arg0, Response arg1) throws Exception {
				return JSONUtil.toJson(service.getBoard());
			}
		});
	}
	
	public void summonToPosition(){
		put("/position/:playerID", new Route(){
			public Object handle(Request req, Response res) throws Exception {
					//request parameteres
					int playerID = Integer.parseInt(req.params(":playerID"));
					String cardName = req.queryParams("name");
					int att = Integer.parseInt(req.queryParams("att"));
					int def = Integer.parseInt(req.queryParams("def"));
					
					//check for free places
					int positionToPut = service.getFirstAvailableSpot(playerID);
					if(positionToPut != -1){
					Position newPosition = new Position(positionToPut, cardName, att, def);
					service.getBoard().get(positionToPut).setStats(cardName, att, def);
					return JSONUtil.toJson(newPosition);
					}else{
						return null;
					}
			}
		});
	}
	

}
