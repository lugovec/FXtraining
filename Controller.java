package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class Controller {

    @FXML
    private TableView tbl;

    @FXML
    private Button btn;

    public void click(ActionEvent actionEvent){

        tbl.getColumns().add(new TableColumn<>("new column"));

        tbl.setPrefWidth(tbl.getWidth() + 100);

        tbl.prefWidth(400);


    }



}
