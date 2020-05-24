import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/authorization")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("pass");

        HttpSession session = null;
        RequestDispatcher dispatcher = null;
        session = request.getSession();
        session.setAttribute("user", login);
        dispatcher = request.getRequestDispatcher("logout.jsp");

        try {
            DataBaseConnect.createUser(login, password);
            response.addCookie(new Cookie("login", login));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
					throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
    }
}