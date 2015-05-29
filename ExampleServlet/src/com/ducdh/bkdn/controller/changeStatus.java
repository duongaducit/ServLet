package com.ducdh.bkdn.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ducdh.bkdn.bean.Order;
import com.ducdh.bkdn.bo.ServiceBo;

/**
 * Servlet implementation class changeStatus
 */
@WebServlet("/changeStatus")
public class changeStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changeStatus() {
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
		ArrayList<Order> list = (ArrayList<Order>)request.getSession().getAttribute("listOrder");
		new ServiceBo().changeStatus(idOrder, list);
		request.getSession().setAttribute("listOrder", list);
		RequestDispatcher rd =  request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
