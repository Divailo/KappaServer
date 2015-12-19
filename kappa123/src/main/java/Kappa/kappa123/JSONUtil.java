package Kappa.kappa123;

import com.google.gson.Gson;

import spark.ResponseTransformer;

public class JSONUtil implements ResponseTransformer {
	
	public static String toJson(Object object){
		return new Gson().toJson(object);
	}

	public String render(Object arg0) throws Exception {
		return toJson(arg0);
	}
	
//	public static ResponseTransformer json(){
//		return JSONUtil::toJson;
//	}

}
