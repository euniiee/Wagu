package com.wagu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.wagu.dao.KorailTimeTableDAO;

@WebServlet("/StationServlet")
public class StationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String startStation = request.getParameter("startStation");
//
//		System.out.println("요청 들어옴 - startStation: " + startStation );
//		
//		KorailTimeTableDAO dao = new KorailTimeTableDAO();
//		ArrayList<String> listTerminalStation = null;
//		try {
//			// ex. ("2023-01-19", 1312, 1, "대전", "서울");
//			listTerminalStation = dao.getArriveStation( startStation);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		System.out.println("listSeatsReserved : " + listTerminalStation);		
//		 
//		// 응답을 만듦:
//		response.setContentType("application/json"); //응답의 형식 지정(명시적으로)
//		PrintWriter out = response.getWriter();
//		
//		JSONObject objPrint = new JSONObject();
//		JSONArray jsonArray = new JSONArray();
//		for(String station : listTerminalStation) {
//			JSONObject stationInner = new JSONObject();
//			dataInner.put("seat", seat);
//			jsonArray.add(dataInner);
//		}
//		objPrint.put("result", jsonArray);
//		out.println(objPrint);
	}
}
