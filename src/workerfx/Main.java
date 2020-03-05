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

/*
WorkerFX Homework
1.	create a JavaFX project called WorkerFX
2.	to the project add a content folder
3.	to content, add Worker class
4.	Above the start method, add a private ArrayList called workerList that holds Worker objects
5.	Above the start method, add a private
a.	TextField called txtID
b.	Label called lblID with the text “Worker ID:”
c.	TextField called txtHours
d.	Label called lblHours with the text “Hours Worked:”
e.	TextField called txtRate
f.	Label called lblRate with the text “Hourly Rate:”
g.	Button btnAdd with the text “Add Worker”
h.	Button btnDisplay with the text “Display Workers”
6.	Below the start method, add a private method called addPane that 
a.	Does not take any parameters
b.	Returns a GridPane object that contains all of the nodes found above the start method
c.	Is used by the Scene object
7.	Below the start method, addWoker method
a.	No para, no return
b.	Worker object based on the data input
c.	Add the worker to ArrayList
d.	Is called by btnAdd click event;
8.	When the btnAdd is clicked
a.	All the text is cleard (clear)
b.	The txtID gets focus (requestFocus)
9.	To the content folder (should be in a separate folder, ont content)
a.	Add a class called DisplayStage that is a child of the Stage class
10.	D
11.	To DisplayStage add a private method called getScene that
a.	No para
b.	Returns a Scene object
c.	Builds a String that contains all of the data found in the workerList
d.	Has a textArea called txtDisplay that contains the built String
e.	Has a Pane object that references txtDisplay
f.	Has a Scene object that reference the Pane object
12.	In the DisplayStage constructor
a.	Use the getScene method to add a Scene to the DisplayStage;

*/