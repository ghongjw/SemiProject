package _0_main;

import java.io.IOException;

import _0_welService.WelController;
import _10_Manager.MController;
import _11_0_TrainManagement.TMcontroller;
import _11_1_regTrainer.RTController;
import _11_2_deleteTrainer.deleteController;
import _11_3_newSchedule.newScheduleController;
import _11_4_scheduleManagement.SMcontroller;
import _12_0_memberSearch.MSController;
import _12_1_memberRevise.MRController;
import _1_login.LoginController;
import _201_agreement.AgreementController;
import _21_IDPW.IDPWController;
import _22_findId.FindIDService;
import _22_findId.FindId01Controller;
import _22_findId.FindIdController;
import _23_findpw.FindPWService;
import _23_findpw.FindPw01Controller;
import _23_findpw.FindPwController;
import _2_register.RegController;
import _3_UserMain.UMController;
import _3_UserMain.UMLogoutController;
import _4_perchase.PcConfirmController;
import _4_perchase.PcController;
import _5_book.BoController;
import _6_Record.RcController;
import _7_1_inbodyResister.InbodyRegController;
import _7_inbodySelect.InbodyController;
import _8_1_UserInfoUpdateB.UibController;
import _8_UserInfoUpdateA.UiaController;
import _9_UserPTUpdate.UPController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Opener {

	private Stage primaryStage;

	private String id;
	private String name;
	private String login;
	private String expireYear;
	private String expireMonth;
	private String expireDay;
	private String ptcount;

	private UMController umCon;
	private UMLogoutController umLougoutCon;
	private PcController pcCon;
	private PcConfirmController pcconfirmCon;
	private FindIDService findIdService;
	private FindPWService findPwService;
	private Opener opener;

	private TMcontroller tmCon;
	private String clickedDate;

	public void setTmCon(TMcontroller tmCon) {
		this.tmCon = tmCon;
	}

	public TMcontroller getTmCon() {
		return tmCon;
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	// welcome page오픈
	public void welcomeOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Welcome.fxml"));

		Opener opener = new Opener();

		opener.setPrimaryStage(primaryStage);
		opener.setOpener(opener);

		try {
			Parent Welcome = loader.load();
			WelController WelCon = loader.getController();
			WelCon.setOpener(opener);

			Scene scene = new Scene(Welcome);

			primaryStage.setTitle("Welcome");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 로그인 화면
	public void Login() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));

		try {
			Parent Login = loader.load();
			LoginController logincon = loader.getController();
			logincon.setOpener(opener);

			Scene scene = new Scene(Login);
			String css = this.getClass().getResource("test.css").toExternalForm();
			scene.getStylesheets().add(css);
			primaryStage.setTitle("로그인");
			primaryStage.setScene(scene);
			primaryStage.show();
//			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void idpwOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("idPw.fxml"));
		try {
			Parent idPw = loader.load();
			IDPWController idpwCon = loader.getController();
			idpwCon.setIdPw(idPw);
			idpwCon.setOpener(opener);
			Scene scene = new Scene(idPw);

			primaryStage.setTitle("아이디/비밀번호 찾기");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("아이디 비번 찾기 창에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}
	}

	public void Findid0Open() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("FindId0.fxml"));
		try {
			Parent FindId0 = loader.load();
			FindIdController fiCon = loader.getController();
			fiCon.setOpener(opener);
			findIdService = fiCon.getFindIdService();
			Scene scene = new Scene(FindId0);
			primaryStage.setTitle("아이디 찾기");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Findpw0Open() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("FindPw0.fxml"));
		try {
			Parent FindPw0 = loader.load();
			FindPwController fpCon = loader.getController();
			fpCon.setOpener(opener);
			findPwService = fpCon.getFindPwService();
			Scene scene = new Scene(FindPw0);
			primaryStage.setTitle("비밀번호 찾기");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void FindId1Open() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("FindId1.fxml"));
		try {
			Parent FindId1 = loader.load();
			FindId01Controller fi1Con = loader.getController();
			fi1Con.setOpener(opener);
			fi1Con.setfiService(findIdService);
			Scene scene = new Scene(FindId1);
			primaryStage.setTitle("아이디 찾기");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Findpw1Open() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("FindPw1.fxml"));
		try {
			Parent Findpw1 = loader.load();
			FindPw01Controller fp1Con = loader.getController();
			fp1Con.setOpener(opener);
			fp1Con.setfpService(findPwService);
			Scene scene = new Scene(Findpw1);
			primaryStage.setTitle("비밀번호 찾기");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void agreementOpen() {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("Agreement.fxml"));
		System.out.println("lo" + loader);
		try {
			Parent Agreement = loader.load();
			AgreementController agreeCon = loader.getController();
			agreeCon.setRegister(Agreement);
			agreeCon.setOpener(opener);

			Scene scene = new Scene(Agreement);
			Stage agreeStage = new Stage();

			primaryStage.setTitle("취뽀 회원 동의");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("회원 가입 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	public void registerOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Register.fxml"));

		try {
			Parent Register = loader.load();

			RegController regCon = loader.getController();
			regCon.setRegister(Register);
			regCon.setOpener(opener);

			Scene scene = new Scene(Register);
			Stage regStage = new Stage();
			ComboBox<String> branchBox = (ComboBox<String>) Register.lookup("#branchCombo");
			branchBox.getItems().addAll("영등포점", "창동점", "홍제점", "의정부점", "강남점", "송파점", "분당점", "성수부점", "노량진점", "부산점");
			primaryStage.setTitle("취뽀 회원 가입");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("회원 가입 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}
	}

	// 유저메인화면 띄우기
	public void umOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Usermain.fxml"));

		try {
			Parent umform = loader.load();
			umCon = loader.getController();
			umCon.setOpener(opener);
			umCon.setOpenerinfo(opener, id, name);
			Scene scene = new Scene(umform);
			CommonService.setId(id);

			primaryStage.setTitle("취뽀헬스장");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("유저 메인 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 로그아웃 확인 페이지
	public void logoutPg() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("logout.fxml"));
		Parent logoutForm;
		try {
			logoutForm = loader.load();

			umLougoutCon = loader.getController();
			umLougoutCon.setumConfirmForm(logoutForm);
			umLougoutCon.setUmController(umCon);
			umLougoutCon.setumLougoutCon(umLougoutCon);
			umLougoutCon.setOpener(this);
			umLougoutCon.setid(id);

			Scene scene = new Scene(logoutForm);
			Stage pcStage = new Stage();

			pcStage.setTitle("로그아웃 하시겠습니까?");
			pcStage.setScene(scene);
			pcStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 이용권 구매 화면띄우기
	public void PcOpen() {
		System.out.println("여기");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("perchase.fxml"));
		try {
			Parent pcForm = loader.load();

			pcCon = loader.getController();
			pcCon.setOpener(this);
			pcCon.setpcController(pcCon);
			Scene scene = new Scene(pcForm);

			primaryStage.setTitle("이용권 구매");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("이용권 구매 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}
	}

	// 결제창 띄우기
	public void comfirmPc() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Perchase2.fxml"));
		Parent conPcForm;
		try {
			conPcForm = loader.load();
			pcconfirmCon = loader.getController();
			pcconfirmCon.setpcConfirmForm(conPcForm);
			pcconfirmCon.setPcController(pcCon);
			pcconfirmCon.setpcConfirmController(pcconfirmCon);
			pcconfirmCon.setOpener(this);

			Scene scene = new Scene(conPcForm);
			Stage pcStage = new Stage();

			pcStage.setTitle("결제하시겠습니까?");
			pcStage.setScene(scene);
			pcStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// PT예약페이지띄우기
	public void boOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("book.fxml"));
		try {
			Parent boForm = loader.load();
			BoController boController = loader.getController();
			boController.setOpener(this);
			boController.getUserId(id);
			boController.getUserName(name);
			// boController.setboconForm(boForm);
			Scene scene = new Scene(boForm);

			primaryStage.setTitle("피티 예약");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("피티예약 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 운동 기록 페이지띄우기
	public void rcOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("record.fxml"));
		try {
			Parent rcForm = loader.load();
			RcController boController = loader.getController();
			boController.setOpener(this);
			boController.setId(id);
			boController.setName(name);
			boController.setClickedDate(clickedDate);
			Scene scene = new Scene(rcForm);
			primaryStage.setTitle("운동 기록");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("운동 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}
	}

	// INBODY 조회창 띄우기
	public void inbodySelectOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("inbodySelect.fxml"));
		try {
			Parent isForm = loader.load();
			InbodyController inbodyCon = loader.getController();
			inbodyCon.setOpener(opener, id);

			Scene scene = new Scene(isForm);
			primaryStage.setTitle("인바디");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("인바디 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}
	}

	// INBODY 입력창 띄우기
	public void inbodyInsertOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("InbodyRegister.fxml"));
		try {
			Parent irForm = loader.load();
			InbodyRegController ircon = loader.getController();
			ircon.setOpener(opener);

			Scene scene = new Scene(irForm);
			primaryStage.setTitle("인바디 기록");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("인바디 기록 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 회원정보 수정(패스워드 확인창)
	public void userInfoUpdateConfirmPwOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("UserInfoUpdate1.fxml"));
		try {
			Parent uicForm = loader.load();
			UiaController uiccon = loader.getController();
			uiccon.setOpener(opener);

			Scene scene = new Scene(uicForm);
			primaryStage.setTitle("회원정보 비밀번호 확인 화면");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("회원정보 비밀번호 확인 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 회원정보 수정
	public void userInfoUpdateOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("UserInfoUpdate2.fxml"));
		try {
			Parent uiForm = loader.load();
			UibController uicon = loader.getController();
			uicon.setOpener(opener);

			Scene scene = new Scene(uiForm);
			primaryStage.setTitle("회원정보 수정 화면");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("//회원정보 수정화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}
	}

	public void userPTUpdateOpen() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("userPTUpdate.fxml"));
		try {
			Parent pUForm = loader.load();
			UPController upcontroller = loader.getController();
			upcontroller.setOpener(opener);
			// upcontroller.getUserId(id);
			// upcontroller.getUserName(name);
			Scene scene = new Scene(pUForm);
			primaryStage.setTitle("PT 수정");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("//회원정보 수정화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}
	}

	// 10번 관리자 창 띄우기
	public void mmOpen() { // ManagementMain
		FXMLLoader loader = new FXMLLoader(getClass().getResource("M.fxml"));
		try {
			Parent mmform = loader.load();
			MController mCon = loader.getController();
			mCon.setOpener(opener);

			Scene scene = new Scene(mmform);
			primaryStage.setTitle("관리자 메인");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("관리자 메인 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 11번 트레이너관리 창 띄우기
	public void tmOpen() { // TrainerManagement
		FXMLLoader loader = new FXMLLoader(getClass().getResource("TM.fxml"));
		try {
			Parent tmform = loader.load();
			TMcontroller TMCon = loader.getController();
			TMCon.setOpener(opener);
			this.setTmCon(TMCon);

			Scene scene = new Scene(tmform);

			primaryStage.setTitle("트레이너관리");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("트레이너관리 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 11-1 트레이너 등록 창 띄우기
	public void rtOpen() { // RegTrainer
		FXMLLoader loader = new FXMLLoader(getClass().getResource("RT.fxml"));
		try {
			Parent rtform = loader.load();
			RTController RTCon = loader.getController();
			RTCon.setOpener(opener);

			Scene scene = new Scene(rtform);

			primaryStage.setTitle("트레이너 등록");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("트레이너 등록 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 11-2 트레이너 삭제 창 띄우기
	public void delOpen() { // delete
		FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteTrainer.fxml"));
		try {
			Parent delform = loader.load();
			deleteController delCon = loader.getController();
			delCon.setdelform(delform);
			delCon.setOpener(opener);

			Scene scene = new Scene(delform);
			Stage delStage = new Stage();

			delStage.setTitle("트레이너 삭제");
			delStage.setScene(scene);
			delStage.show();
		} catch (Exception e) {
			CommonService.msg("트레이너 삭제 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 11-3 트레이너 스케줄 만들겠냐는 창 띄우기
	public void newScheduleOpen() { // newSchedule
		FXMLLoader loader = new FXMLLoader(getClass().getResource("newScheduleSelect.fxml"));
		try {
			Parent newScheduleform = loader.load();
			newScheduleController newScheduleCon = loader.getController();
			newScheduleCon.setnewScheduleform(newScheduleform);
			newScheduleCon.setOpener(opener);

			Scene scene = new Scene(newScheduleform);
			Stage newScheduleStage = new Stage();

			newScheduleStage.setTitle("스케줄 생성");
			newScheduleStage.setScene(scene);
			newScheduleStage.show();
		} catch (Exception e) {
			CommonService.msg("스케줄 생성 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 11-4 트레이너 스케줄 관리창 띄우기
	public void scheduleManagementOpen() { // newSchedule
		FXMLLoader loader = new FXMLLoader(getClass().getResource("scheduleManagement.fxml"));
		try {
			Parent scheduleManagementform = loader.load();
			SMcontroller scheduleManagementCon = loader.getController();
			scheduleManagementCon.setOpener(opener);

			Scene scene = new Scene(scheduleManagementform);

			primaryStage.setTitle("스케줄 생성");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("스케줄 생성 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 12번 회원검색 창 띄우기
	public void msOpen() { // MemberSearch
		FXMLLoader loader = new FXMLLoader(getClass().getResource("memberSearch.fxml"));
		try {
			Parent msform = loader.load();
			MSController MSCon = loader.getController();
			MSCon.setOpener(opener);

			Scene scene = new Scene(msform);

			primaryStage.setTitle("회원검색");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("회원 검색 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 12-1 회원 정보 수정 창 띄우기
	public void reviseOpen() { // revise
		FXMLLoader loader = new FXMLLoader(getClass().getResource("memberRevise.fxml"));
		try {
			Parent reviseform = loader.load();
			MRController mrCon = loader.getController();
			mrCon.setOpener(opener);

			Scene scene = new Scene(reviseform);

			ComboBox<String> pointCombo = (ComboBox<String>) reviseform.lookup("#point");
			pointCombo.getItems().addAll("영등포점", "창동점", "홍제점", "의정부점", "강남점", "송파점", "분당점", "성수점", "노량진점", "부산점");

			primaryStage.setTitle("회원 정보 수정");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			CommonService.msg("회원 정보 수정 화면에 문제가 발생했습니다. 관리자에게 문의하세요.");
			e.printStackTrace();
		}

	}

	// 회원 아이디 가져오기
	public String getId() {
		return id;
	}

	// 회원 아이디 가져오기
	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	// 회원 아이디 가져오기
	public void setName(String name) {
		this.name = name;
	}

	public void setOpener(Opener opener) {
		this.opener = opener;
	}

	public Opener getOpener() {
		return opener;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}

	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	public void setExpireDay(String expireDay) {
		this.expireDay = expireDay;
	}

	public void setPtcount(String ptcount) {
		this.ptcount = ptcount;
	}

	public void setclickedDate(String clickedDate) {
		// 작동
		this.clickedDate = clickedDate;
	}

	public String getClickedDate() {
		return clickedDate;
	}
}
