package views;

import game.MainGame;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController {
	@FXML
	private Canvas canvas;
	
	private MainGame game;

	@FXML
	public
	Label lblFlag = new Label();

	@FXML
	public void initialize() {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		game = new MainGame(gc);
		game.render();
		game.initGame();
	}
	
	public void clickHandle(MouseEvent e) {
		game.clickHandle(e, lblFlag);
	}
}
