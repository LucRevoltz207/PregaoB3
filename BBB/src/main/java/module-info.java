module com.example.bbb {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;


    opens com.example.bbb to javafx.fxml;
    exports com.example.bbb;
    exports entity;
    opens entity to javafx.fxml;
}