package workerfx;

import content.Worker;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DisplayStage extends Stage {

    private ArrayList<Worker> workerList = new ArrayList<>();

    public DisplayStage(ArrayList<Worker> workerList) {
        this.workerList = workerList;
        setScene(addScene());
    }

    private Scene addScene() {
//        GridPane pane = new GridPane();

        String elements = new String();
        for (int sub = 0; sub < workerList.size(); sub++) {
            Worker two = workerList.get(sub);
            elements += "Worker " + two.getNumber() + " pay is " + two.getPay() + "\n";
            
//            elements = "Worker " + two.getNumber() + " pay is " + two.getPay();
//            Label lblWorker = new Label(elements);
//            pane.add(lblWorker, 0, sub);
        }

        TextArea txtDisplay = new TextArea(elements);
        Pane pane = new Pane(txtDisplay);

        Scene scene = new Scene(pane, 300, 300);
        return scene;
    }

}
