package com.wagu.servlet;
//package servlet;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import com.wagu.dao.KorailSearchDAO;
//import com.wagu.dto.KorailSearchDTO;
//
//@WebServlet("/KorailTimetableServlet")
//public class KorailTimetableServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//    
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		String startStation = request.getParameter("station_start");
//		System.out.print(startStation);
//		String arriveStation = request.getParameter("station_arrive");
////		String startDate = request.getParameter("startdate");
////		String endDate = request.getParameter("enddate");
//		int adult = Integer.parseInt(request.getParameter("adult"));
//		int child = Integer.parseInt(request.getParameter("child"));
//		
////		request.setAttribute("startdate", startDate);
////		request.setAttribute("enddate", endDate);
//	
//		
//		//나중엔 코레일 타임테이블 페이지로 와야함
//		RequestDispatcher rd = request.getRequestDispatcher("page/korailTimeTable.jsp");
//		request.setAttribute("station_start", startStation);
//		request.setAttribute("station_arrive", arriveStation);
//		request.setAttribute("adult", adult);
//		request.setAttribute("child", child);
//		rd.forward(request,response);
//	}
//
//
//}
