package servlets;

import beans.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if (request.getParameter("input_login") == null) {
            // Simply redirect user back to the index page if no login trigger was found
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }

        // Get input field values
        String username = request.getParameter("input_username");
        String password = request.getParameter("input_password");

        // Validate login
        HttpSession session = request.getSession(true);

        if (session.getAttribute("user") == null) {
            // Failed logins redirect to failed page
            getServletContext().getRequestDispatcher("/login_failure.jsp").forward(request, response);
            return;
        }
        
        User user = (User) session.getAttribute("user");

        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            // Redirect to account activity
            user.setLoggedIn(true);
            session.setAttribute("user", user);
            getServletContext().getRequestDispatcher("/account_activity.jsp").forward(request, response);
            return;
        }
        
        // Failed logins redirect to failed page
        getServletContext().getRequestDispatcher("/login_failure.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
