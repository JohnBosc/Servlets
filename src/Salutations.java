import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/salutations"})
public class Salutations extends HttpServlet {
    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        out.println("<html><body> <h1>Result sample</h1> <p>Hello " + surname + " " + name + "</p> </body></html> ");
    }
}
