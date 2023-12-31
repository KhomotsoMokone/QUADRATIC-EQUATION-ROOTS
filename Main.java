import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 */

/**
 * @author khomo
 *
 */
public class Main extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage primary) throws Exception {
		// TODO Auto-generated method stub
		The_Pane TP = new The_Pane();
		Scene scene = new Scene(TP,600,500);
		primary.setScene(scene);
		primary.show();
		
	}

}
