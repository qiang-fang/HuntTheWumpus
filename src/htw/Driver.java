package htw;

import htw.control.ConsoleController;
import htw.control.Controller;
import htw.control.SwingController;
import htw.view.SwingView;
import htw.view.View;

import java.io.InputStreamReader;

/**
 * This class represents a driver which contains the main function.
 */
public class Driver {

  /**
   * The main function.
   */
  public static void main(final String[] args) throws IllegalArgumentException {
    if (args.length == 1) {
      if (args[0].equals("--gui")) {
        View view = new SwingView("HTW");
        Controller controller = new SwingController(view);
        controller.start();
      }
      if (args[0].equals("--text")) {
        // create the controller
        Readable reader = new InputStreamReader(System.in);
        Controller control = new ConsoleController(reader, System.out);
        control.start();
      }
    } else if (args.length == 0) {
      View view = new SwingView("HTW");
      Controller controller = new SwingController(view);
      controller.start();
    } else {
      throw new IllegalArgumentException("Invalid command line argument");
    }
  }
}
