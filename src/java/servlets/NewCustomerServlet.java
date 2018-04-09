package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            // Redirect user back to the index page if no sign up trigger found
            getServletContext().getRequestDispatcher("/index.html").forward(request, response);
            return;
        }

        // Get input field values
        String firstName = request.getParameter("input_first_name").trim();
        String lastName = request.getParameter("input_last_name").trim();
        String phone = request.getParameter("input_phone").trim();
        String address = request.getParameter("input_address").trim();
        String city = request.getParameter("input_city").trim();
        String state = request.getParameter("input_state").trim();
        String zipCode = request.getParameter("input_zip_code").trim();
        String email = request.getParameter("input_email").trim();

        // Validate required fields
        if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty()
                || city.isEmpty() || state.isEmpty() || zipCode.isEmpty() || email.isEmpty()) {
            request.setAttribute("error_message", "Please fill out all the form fields.");
            getServletContext().getRequestDispatcher("/new_customer.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/success.html").forward(request, response);
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
