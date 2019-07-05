<%--
  Created by IntelliJ IDEA.
  User: jb
  Date: 7/3/19
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="signin" method="post">
      Email: <input type="email" name="fEmail"><p>
      Password: <input type="password" name="password"><p>

          <%@ page import="java.util.Date"%>
          <%= new Date() %><br/>
          <% out.println(request.getAttribute("aEmail")); //pour recuperer les parametres passes par la Servlet%>

      <p><input type="submit" value="Send">
  </form>
  </body>
</html>
