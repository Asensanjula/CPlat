package lsf.zuba.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lsf.zuba.javacc.SyntaxChecker;
import lsf.zuba.javacc.controle.brain;
import lsf.zuba.vizobj.ChartParameter;

public class zuba_main  extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String zuba_query=request.getParameter("txtarea");
		
//String zuba_query = "DRAW CHART bar TO mydiv FOR {Select a,b from D;} WHICH X:a, Y:b";
		
		brain brain = new brain();
		ChartParameter chart_config = brain.chart_Obj_Produce(zuba_query);
		System.out.println(chart_config.getSql_query());
		System.out.println(chart_config.getBindTo());
		
		PrintWriter pw = response.getWriter();
		pw.println("here we go!");
		pw.println(zuba_query);
	}

	

}
