package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render());
  }

  public static Result test(String name, String file) {
    return ok(test.render(name, file));
  }
  
}