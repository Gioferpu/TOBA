package servlets;

import beans.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hp Envy
 */
public class NewCustomerServlet extends HttpServlet {

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
        if (request.getParameter("input_sign_up") == null) {
            // Show page for new customer
            getServletContext().getRequestDispatcher("/new_customer.jsp").forward(request, response);
            return;
        }

        // Get input field values
        User user = new User();
        user.setFirstName(request.getParameter("input_first_name").trim());
        user.setLastName(request.getParameter("input_last_name").trim());
        user.setPhone(request.getParameter("input_phone").trim());
        user.setAddress(request.getParameter("input_address").trim());
        user.setCity(request.getParameter("input_city").trim());
        user.setState(request.getParameter("input_state").trim());
        user.setZipCode(request.getParameter("input_zip_code").trim());
        user.setEmail(request.getParameter("input_email").trim());
        
        // Validate required fields
        if (user.getFirstName().isEmpty() || user.getLastName().isEmpty() || 
                user.getPhone().isEmpty() || user.getAddress().isEmpty() || 
                user.getCity().isEmpty() || user.getState().isEmpty() || 
                user.getZipCode().isEmpty() || user.getEmail().isEmpty()) {
            request.setAttribute("message", "Please fill out all the form fields.");
            getServletContext().getRequestDispatcher("/new_customer.jsp").forward(request, response);
            return;
        }
        
        // Initialize the user witha username and password
        user.setUsername(user.getLastName() + user.getZipCode());
        user.setPassword("welcome1");
        
        // Add the user to a session
        HttpSession session = request.getSession(true);
        session.setAttribute("user", user);
        
        getServletContext().getRequestDispatcher("/success.jsp").forward(request, response);
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
