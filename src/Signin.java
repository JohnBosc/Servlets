import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/signin"})
public class Signin extends HttpServlet {
    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException {

        try {
            String mail = request.getParameter("fEmail");
            System.out.println("Email = " + mail);
            if (mail != null) {
                request.setAttribute("aEmail", mail.toLowerCase());
            }

            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);

        }catch (IOException e) {
            throw new ServletException(e);
        }

    }
}
