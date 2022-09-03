package _8_UserInfoUpdateA;

import java.net.URL;
import java.util.ResourceBundle;

import _0_main.CommonService;
import _0_main.Opener;
import _1_login.LoginDTO;
import _3_UserMain.UMController;
import _7_1_inbodyResister.InbodyRegService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UiaController implements Initializable {

	@FXML
	private Button confirm;
	@FXML
	private Button back;
	@FXML
	private PasswordField password;

	private UiaDAO uiadao;
	private UiaService uiaservice;
	private Opener opener;
	private LoginDTO logindto;

	public void setOpener(Opener opener) {
		this.opener = opener;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		uiaservice = new UiaService();
	}

	public void confirm() {
<<<<<<< HEAD

		if (uiaservice.userinfoproc(password.getText(), UMController.staticId)) {
			CommonService.msg("확인되었습니다.");
			opener.userInfoUpdateOpen();
		} else {
			CommonService.msg("아이디 또는 비밀번호를 확인 후 다시 입력하세요.");
=======
		
		CommonService.msg("확인되었습니다.");
		opener.userInfoUpdateOpen();
		
	}
		
	public void back() {
		opener.umOpen();
>>>>>>> refs/heads/newB
		}
	}

	public void back() {

		opener.umOpen();

	}

}
