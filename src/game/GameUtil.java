package game;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class GameUtil {
	public static void alert(String msg) {
		Alert a = new Alert(AlertType.INFORMATION);
		a.setTitle("알림");
		a.setHeaderText(null);
		a.setContentText(msg);
		a.show();
	}
}