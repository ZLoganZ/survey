package admin;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Data extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        String url = "/index.html";        
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String doB = request.getParameter("doB");
            String heardFrom = request.getParameter("heardFrom");


            // store data in User object
            User user = new User(firstName, lastName, email, doB, heardFrom);
            request.setAttribute("user", user);
                    
            url = "/survey.jsp";
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}