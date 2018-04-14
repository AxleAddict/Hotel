package sample;
import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.xml.bind.SchemaOutputResolver;
import java.net.URL;
import java.util.ResourceBundle;
//import java.io.IOException;

public class Controller implements Initializable {

    loginmodel loginmodel = new loginmodel();


    //
    //Parent OurMenu = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
    //Parent HomePage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

    @FXML
    private Button ContactUsButton = new Button();

    @FXML
    private Button HomePageButton = new Button();

    @FXML
    private Button OrderOnlineButton = new Button();

    @FXML
    private Button OurMenuButton = new Button();

    @FXML
    private Button OrderNow1 = new Button();
    @FXML
    private Button OrderNow2 = new Button();
    @FXML
    private Button OrderNow3 = new Button();
    @FXML
    private Button OrderNow4 = new Button();
    @FXML
    private Button OrderNow5 = new Button();
    @FXML
    private Button OrderNow6 = new Button();
    @FXML
    private Button OrderNow7 = new Button();

    @FXML
    public void OnClickContactUs(ActionEvent ae) throws Exception{

        Parent ContactUs = FXMLLoader.load(getClass().getResource("ContactUs.fxml"));
        Stage primaryStage=(Stage)((Node)(ae.getSource())).getScene().getWindow();
        Scene newScene = new Scene(ContactUs, 700, 500);

        ContactUsButton.setOnAction(e -> primaryStage.setScene(newScene));
    }

    @FXML
    public void OnClickHomePage(ActionEvent ae) throws Exception{

        Parent HomePage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage primaryStage=(Stage)((Node)(ae.getSource())).getScene().getWindow();
        Scene newScene = new Scene(HomePage, 700, 500);

        primaryStage.setScene(newScene);

        //HomePageButton.setOnAction(e -> primaryStage.setScene(newScene));
    }

    @FXML
    public void OnClickOrderOnline(ActionEvent ae) throws Exception{

        Parent Login = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage primaryStage=(Stage)((Node)(ae.getSource())).getScene().getWindow();
        Scene newScene = new Scene(Login, 700, 500);

        OrderOnlineButton.setOnAction(e -> primaryStage.setScene(newScene));
    }

    @FXML
    public void OnClickOurMenu(ActionEvent ae) throws Exception{

        Parent Menu = FXMLLoader.load(getClass().getResource("OurMenu.fxml"));
        Stage primaryStage=(Stage)((Node)(ae.getSource())).getScene().getWindow();
        Scene newScene = new Scene(Menu, 700, 500);

        OurMenuButton.setOnAction(e -> primaryStage.setScene(newScene));
    }

    @FXML
    public void OnClickOrderNow(ActionEvent ae) throws Exception{

        Parent Login = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Stage primaryStage=(Stage)((Node)(ae.getSource())).getScene().getWindow();
        Scene newScene = new Scene(Login, 700, 500);

        OrderNow1.setOnAction(e -> primaryStage.setScene(newScene));
        OrderNow2.setOnAction(e -> primaryStage.setScene(newScene));
        OrderNow3.setOnAction(e -> primaryStage.setScene(newScene));
        OrderNow4.setOnAction(e -> primaryStage.setScene(newScene));
        OrderNow5.setOnAction(e -> primaryStage.setScene(newScene));
        OrderNow6.setOnAction(e -> primaryStage.setScene(newScene));
        OrderNow7.setOnAction(e -> primaryStage.setScene(newScene));
    }

    public void login(ActionEvent event) {
        System.out.println("login");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(loginmodel.isdbconnected()){
            System.out.println("db connected");

        }
        else
            System.out.println("not connected");
    }
}