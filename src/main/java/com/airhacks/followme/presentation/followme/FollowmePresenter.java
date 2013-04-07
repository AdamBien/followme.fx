package com.airhacks.followme.presentation.followme;

import com.airhacks.followme.business.flightcontrol.boundary.Tower;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javax.inject.Inject;

/**
 *
 * @author adam-bien.com
 */
public class FollowmePresenter {

    @FXML
    Label message;
    @Inject
    Tower tower;

    public void launch() {
        message.setText(tower.readyToTakeoff());
    }
}
