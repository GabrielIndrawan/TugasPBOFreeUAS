
module com.example.tugaspbofreeuas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tugaspbofreeuas to javafx.fxml;
    exports com.example.tugaspbofreeuas;

}