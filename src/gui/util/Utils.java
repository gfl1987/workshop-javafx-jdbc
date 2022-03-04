package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {
	
	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	public static Integer tryParseToInt(String str) { //m�todo de convers�o da caixa para n�mero inteiro
		try {
		return Integer.parseInt(str);
		}
		catch (NumberFormatException e) {
			return null;
		}
	}

}
