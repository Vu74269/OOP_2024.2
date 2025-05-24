/**
 * 
 */
/**
 * 
 */
module AimsProject {
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.controls;
    exports hust.soict.hedspi.test.screen.customer.store;
    opens hust.soict.hedspi.test.screen.customer.store to javafx.graphics;
    exports hust.soict.hedspi.aims.screen.customer.controller;
    opens hust.soict.hedspi.aims.screen.customer.controller to javafx.fxml;
    exports hust.soict.hedspi.aims.media to javafx.base;
    opens hust.soict.hedspi.aims.media to javafx.base;
}