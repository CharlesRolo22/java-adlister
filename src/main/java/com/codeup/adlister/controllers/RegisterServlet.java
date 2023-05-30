import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;


protected void doPost(HttpServletRequest request, HttpServletResponse response)
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        String hashWord = BCrypt.hashpw(password, BCrypt.gensalt());


        // validate input
        boolean inputHasErrors = username.isEmpty()
        || email.isEmpty()
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        }

        // create and save a new user
        User user = new User(username, email, password);
        User user = new User(username, email, hashWord);
        DaoFactory.getUsersDao().insert(user);
        response.sendRedirect("/login");
        }