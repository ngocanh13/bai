package java7;

import com.sun.applet2.preloader.event.InitEvent;
import java6.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class lophoc implements Initializable {

    public TextField ipten;
    public TextField ipphong;
    public TextField ipma;
    public ListView listview;
    public DatePicker ipday;
    public ComboBox<String> comboBox;
    public Label label;

    private ObservableList<Lop> list = FXCollections.observableArrayList();
    ObservableList<String> a = FXCollections.observableArrayList("Aptech", "Skillking");
    
    public void submit(ActionEvent actionEvent) {
        try {
            String tenlop = ipten.getText();
            String phonghoc = ipphong.getText();
            String malop = ipma.getText();
            LocalDate day = ipday.getValue();
            if(tenlop.isEmpty()|| tenlop.length() < 0){
                throw new Exception("Vui lòng điền tên lớp");
            }
            if(phonghoc.isEmpty()|| phonghoc.length() < 0){
                throw new Exception("Viu lòng nhập phòng học");
            }
            if(malop.isEmpty()|| malop.length() < 0){
                throw new Exception("Vui lòng nhập mã lớp");
            }

            Lop l = new Lop(tenlop,phonghoc,malop,day);
            list.add(l);
            render();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(e.getMessage());
            alert.show();

        }


    }
    private void render() throws Exception{ // print list student to information
        listview.setItems(list);
        listview.refresh();
    }

    public void combobox(ActionEvent event) {
        comboBox.setItems(a);
        label.setText(comboBox.getValue());
    }
}