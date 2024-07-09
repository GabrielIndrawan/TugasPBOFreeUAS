package com.example.tugaspbofreeuas;

import com.example.tugaspbofreeuas.models.Mahasiswa;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class LogController {
    @FXML
    private TableView<Mahasiswa> tblHistori;
    @FXML
    private TableColumn<Mahasiswa,String> clmLog;

}
