package workerfx;

import content.Worker;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private ArrayList<Worker> workerList = new ArrayList<>();
    private Label lblID = new Label("worker ID:");
    private Label lblHours = new Label("Hours Worked:");
    private Label lblRate = new Label("Hourly Rate:");
    private TextField txtID = new TextField();
    private TextField txtHours = new TextField();
    private TextField txtRate = new TextField();

    private Button btnAdd = new Button("Add Worker");
    private Button btnDisplay = new Button("Display Workers");

    @Override
    public void start(Stage primaryStage) {

        btnAdd.setOnAction((e) -> {
            addWorker();
            clearText();
        });

        btnDisplay.setOnAction((e) -> {
            DisplayStage ds = new DisplayStage(workerList);
            ds.show();
        });

        Scene scene = new Scene(addPane(), 300, 300);
        primaryStage.setTitle("Worker Pay Time");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane addPane() {
        GridPane pane = new GridPane();

        pane.add(lblID, 0, 0);
        pane.add(lblHours, 0, 1);
        pane.add(lblRate, 0, 2);

        pane.add(txtID, 1, 0);
        pane.add(txtHours, 1, 1);
        pane.add(txtRate, 1, 2);

        pane.add(btnAdd, 0, 3);
        pane.add(btnDisplay, 1, 3);

        return pane;
    }

    public void addWorker() {
        int id = Integer.parseInt(txtID.getText());
        int hours = Integer.parseInt(txtHours.getText());
        double rate = Double.parseDouble(txtRate.getText());
        
        Worker one = new Worker(id);
        one.setHours(hours);
        one.setRate(rate);
        
        workerList.add(one);
    }
    public void clearText(){
        txtID.clear();
        txtHours.clear();
        txtRate.clear();
        txtID.requestFocus();
    }

    public void displayWorkers() {

    }

    public static void main(String[] args) {
        launch(args);
    }

}
