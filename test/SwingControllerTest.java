import htw.MockView;
import htw.control.Controller;
import htw.control.SwingController;
import htw.model.Maze;
import htw.model.NonPerfectMaze;

class SwingControllerTest {
  private Controller controller;
  private Maze model;
  private MockView view;

  void setUp() {
    this.model = new NonPerfectMaze(4,
            6, 18, 10, 15,
            3, 570834998,1,10 );
    this.view = new MockView();
    this.controller = new SwingController(view);
  }

  void move() {
    view.listenKeyTyped(controller, "VK_UP");
  }
}