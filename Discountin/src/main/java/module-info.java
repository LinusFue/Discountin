module at.browser.discountin {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.browser.discountin to javafx.fxml;
    exports at.browser.discountin;
}