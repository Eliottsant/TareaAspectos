module com.mycompany.ds {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.ds to javafx.fxml;
    exports com.mycompany.ds;
}
