import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
@@ -30,7 +31,7 @@ protected void doPost(HttpServletRequest request, HttpServletResponse response)
        return;
        }

        boolean validAttempt = password.equals(user.getPassword());
        boolean validAttempt = BCrypt.checkpw(password, user.getPassword());

        if (validAttempt) {
        request.getSession().setAttribute("user", user);
