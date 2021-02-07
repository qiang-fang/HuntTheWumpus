package htw;

import java.awt.*;

import htw.control.Controller;
import htw.model.ReadonlyModel;
import htw.model.TypeOfDirection;
import htw.view.View;

/**
 * Mock view.
 */
public class MockView implements View {

  public void listenKeyTyped(Controller f, String keyCode) {
    switch (keyCode) {
      case "VK_UP":
        f.move(TypeOfDirection.NORTH);
        break;
      case "VK_DOWN":
        f.move(TypeOfDirection.SOUTH);
        break;
      case "VK_LEFT":
        f.move(TypeOfDirection.WEST);
        break;
      case "VK_RIGHT":
        f.move(TypeOfDirection.EAST);
        break;
      default:
        break;
    }
  }

  @Override
  public void setFeatures(Controller f) {

  }

  @Override
  public void setMazeFeatures(Controller f) {

  }

  @Override
  public void showMaze() {

  }

  @Override
  public void showWelcome() {

  }

  @Override
  public void refresh() {

  }

  @Override
  public void refreshStatusBar() {

  }

  @Override
  public void setModel(ReadonlyModel model) {

  }

  @Override
  public void removeCreationPanel() {

  }

  @Override
  public void removeMazePanel() {

  }

  @Override
  public void removeWelcomePanel() {

  }

  @Override
  public void addCreationPanel() {

  }

  @Override
  public void duckBats() {

  }

  @Override
  public void killedByWumpus() {

  }

  @Override
  public void grabbedByBats() {

  }

  @Override
  public void fallInPit() {

  }

  @Override
  public void showShootResult(int[] input) {

  }

  @Override
  public void about() {

  }

  @Override
  public void resetFocus() {

  }

  @Override
  public void showPopup(Component component) {

  }

  @Override
  public TypeOfDirection showShootDirectionDialog(TypeOfDirection[] options) {
    return null;
  }

  @Override
  public Integer showShootDistanceDialog(Integer[] options) {
    return null;
  }

  @Override
  public void showGameResult(String result) {

  }

  @Override
  public void refreshAfterDie() {

  }
}
