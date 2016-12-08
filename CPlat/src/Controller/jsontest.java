package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONObject;




@Path("/jsontest")
public class jsontest {
	@GET
	@Produces("application/json")
	public Response generateAmnegJson(){
	
		
		JSONArray jsonArray = new JSONArray();
		JSONObject bindto = new JSONObject();
		JSONObject xsitem = new JSONObject();
		JSONArray column = new JSONArray();
		JSONArray A = new JSONArray();
		JSONArray B = new JSONArray();
		JSONArray data1 = new JSONArray();
		JSONArray data2 = new JSONArray();
		
		JSONObject type = new JSONObject();
		JSONObject xtype = new JSONObject();
		
		bindto.put("bindto", "matrix");
		//xsitem.put("data1", "A");
		//xsitem.put("data2", "B");
		
		A.put("A");
		A.put("2013-01-01");
		A.put("2013-01-10");
		
		B.put("B");
		B.put("2013-01-01");
		B.put("2013-01-10");
		
		data1.put("data1");
		data1.put(30);
		data1.put(90);
		
		data2.put("data2");
		data2.put(40);
		data2.put(60);
		
		//column.put(A);
		//column.put(B);
		column.put(data1);
		column.put(data2);
		
		type.put("type", "bar");
		xtype.put("xtype", "");//timeseries
		
		
		jsonArray.put(bindto);
		jsonArray.put(xsitem);
		jsonArray.put(column);
		jsonArray.put(type);
		jsonArray.put(xtype);
		
	
				 
			
		
		
		
		return Response.status(200).entity(jsonArray.toString()).build();
	}
}
