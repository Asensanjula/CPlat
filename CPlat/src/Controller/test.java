package Controller;
import org.json.JSONArray;
import org.json.JSONObject;



import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

    @Path("/helloworld")
    public class test {
        @GET
        @Produces("application/json")
    	public Response generateJson(){
    		
    		
    		return Response.status(200).entity("helloa").build();
    	
    	}
    	           

    } 