package com.airhacks.followme.presentation.followme;

import com.airhacks.followme.business.flightcontrol.boundary.Tower;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.inject.Inject;

/**
 *
 * @author adam-bien.com
 */
public class FollowmePresenter implements Initializable {

    @FXML
    Label message;
    @Inject
    Tower tower;

    @Inject
    private String prefix;

    @Inject
    private String happyEnding;

    private String theVeryEnd;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //fetched from followme.properties
        this.theVeryEnd = rb.getString("theEnd");
    }

    public void launch() {
        message.setText(prefix + tower.readyToTakeoff() + happyEnding + theVeryEnd);
    }

}
