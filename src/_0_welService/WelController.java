package _0_welService;

import java.net.URL;
import java.util.ResourceBundle;

import _0_main.Opener;
import javafx.fxml.Initializable;

public class WelController implements Initializable {
	private Opener opener;

	public void setOpener(Opener opener) {
		this.opener = opener;
	}
	public void nextPage() {

		opener.Login();
		System.out.println("haha");

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
