package com.ducdh.bkdn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ducdh.bkdn.bean.Order;

/**
 * Servlet implementation class calFee
 */
@WebServlet("/calFee")
public class calFee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calFee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idOrder = request.getParameter("idOrder");
		String idCustomer = request.getParameter("idCustomer");
		String address = request.getParameter("address");
		String mapAddress = request.getParameter("mapAddress");
		String daySend = request.getParameter("daySend");
		String hoursSend = request.getParameter("hoursSend");
		int numberGif = Integer.parseInt(request.getParameter("numberGif"));
		
		Order order = new Order(idOrder, idCustomer, address + "-" + mapAddress, daySend + " " + hoursSend, numberGif, false);
		request.getSession().setAttribute("Order", order);
		
		RequestDispatcher rd = request.getRequestDispatcher("accept.jsp");
		rd.forward(request, response);
	}

}
