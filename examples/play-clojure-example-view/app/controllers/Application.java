package controllers;

import play.*;
import play.mvc.*;

import views.*;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.MyController.index.render("Your new application is ready."));
    }

}
