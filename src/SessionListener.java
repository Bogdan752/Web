import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;

@WebListener()
public class SessionListener implements HttpSessionListener {

    public void sessionCreate(HttpSessionEvent arg){
        System.out.println("Session was created.");
    }

    public void sessionDestroy(HttpSessionEvent arg){
        System.out.println("Session was destroyed.");
    }
}