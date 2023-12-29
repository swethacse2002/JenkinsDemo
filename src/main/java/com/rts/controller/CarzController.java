package com.rts.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rts.bean.Carz;
import com.rts.dao.CarzDAO;

/**
 * Servlet implementation class CarzController
 */
public class CarzController extends HttpServlet {
	
		CarzDAO dao = new CarzDAO();

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			String requestFrom = request.getParameter("carz_button");

			if (requestFrom.equals("registerCarz")) {
				String CarNo = request.getParameter("CarNo");
				String Manufacture = request.getParameter("Manufacture");
				String Model = request.getParameter("Model");
				int KmsRan = Integer.parseInt(request.getParameter("KmsRan"));
				int PriceExpected = Integer.parseInt(request.getParameter("PriceExpected"));
				int NoOfOwners = Integer.parseInt(request.getParameter("NoOfOwners"));

				Carz bean = new Carz(CarNo,Manufacture,Model,KmsRan,PriceExpected,NoOfOwners);
				int n = dao.registerCarz(bean);

				if (n == 1) {
					response.sendRedirect("Success.jsp");
				} else {
					response.sendRedirect("registration.jsp");
				}
			}

		}
	}
