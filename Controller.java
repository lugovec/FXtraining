package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Controller {

    @FXML
    private TableView tbl;

    @FXML
    private Button btn;

    @FXML
    ChoiceBox choiceBox;

    @FXML
    Circle circle;



    public void click(ActionEvent actionEvent){

        tbl.getColumns().add(new TableColumn<>("new column"));

        tbl.setPrefWidth(tbl.getWidth() + 100);

        tbl.prefWidth(400);

        choiceBox.setItems(FXCollections.observableArrayList("red", "green", "orange", "yellow"));

        Color[] colors = new Color[]{Color.RED, Color.GREEN, Color.ORANGE, Color.YELLOW};

        choiceBox.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    circle.setFill(colors[new_val.intValue()]);
                });

        /*то же самое через анонимный класс
        choiceBox.getSelectionModel().selectedIndexProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                    }
                }
        );*/

    }



}
