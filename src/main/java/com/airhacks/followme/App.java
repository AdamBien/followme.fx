package com.airhacks.followme;

import com.airhacks.afterburner.injection.InjectionProvider;
import com.airhacks.followme.presentation.followme.FollowmeView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author adam-bien.com
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        System.setProperty("happyEnding", " Enjoy the flight!");
        FollowmeView appView = new FollowmeView();
        Scene scene = new Scene(appView.getView());
        stage.setTitle("followme.fx");
        final String uri = getClass().getResource("app.css").toExternalForm();
        scene.getStylesheets().add(uri);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        InjectionProvider.forgetAll();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
