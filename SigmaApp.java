    //Libraries
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Toolkit;


/**
 *      SigmaApp class: The main class of the application sigma.
 *     @author Gil-Novoa-Sarmiento
 */

public class SigmaApp extends SingleFrameApplication {

    
     // At startup create and show the main MapFrame of the application.
   
    @Override protected void startup() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        show(new SigmaView(this));
        JFrame mainframe = this.getMainFrame();
        mainframe.setResizable(false);
        mainframe.setLocation((int) (screenSize.getWidth() - mainframe.getWidth()) / 2 , (int) screenSize.getHeight() - mainframe.getHeight());
    }

    
     // This method is to initialize the specified window by injecting resources.
     // Windows shown in our application come fully initialized from the GUI builder, so this additional configuration is not needed.
     
    
    @Override protected void configureWindow(java.awt.Window root) {
    }
    
    @Override protected void shutdown() {
         exit();
     }

/**
*       getApplication Method: A convenient static getter for the application instance.
*     @return the instance of SigmaApp
*/
    public static SigmaApp getApplication() {
        return Application.getInstance(SigmaApp.class);
    }
/**
*       Main method launching the application.
*/
    public static void main(String[] args) {
        launch(SigmaApp.class, args);
    }
}
