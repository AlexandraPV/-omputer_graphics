package sample;

import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class MyJavaFXApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab1 (var19)");

        Group root = new Group();
        Scene scene = new Scene(root, 577, 353);


        scene.setFill(Color.rgb(255,164,0));

        Rectangle r = new Rectangle(170, 125, 240, 70);
        root.getChildren().add(r);
        r.setFill(Color.rgb(0,253,254));

        Polyline triangle = new Polyline();
        triangle.getPoints().addAll(new Double[]{
                170.5, 56.0,
                170.5, 125.0,
                237.0, 125.0 });
        triangle.setFill(Color.rgb(0,253,254));
        triangle.setStroke(Color.rgb(0,253,254));
        root.getChildren().add(triangle);

        Line l1 = new Line(227, 196, 330, 260);
        root.getChildren().add(l1);
        l1.setStroke(Color.rgb(156,102,0));

        Line l2 = new Line(360, 196, 253, 260);
        root.getChildren().add(l2);
        l2.setStroke(Color.rgb(156,102,0));

        Line l3 = new Line(462, 69, 411, 125);
        root.getChildren().add(l3);
        l3.setStroke(Color.rgb(156,102,0));

        Circle circle1 = new Circle();
        circle1.setCenterX(229.0f);
        circle1.setCenterY(286.0f);
        circle1.setRadius(35.0f);
        circle1.setFill(Color.rgb(137,48,228));
        root.getChildren().add(circle1);

        Circle circle2 = new Circle();

        circle2.setCenterX(355.0f);
        circle2.setCenterY(286.0f);
        circle2.setRadius(35.0f);
        circle2.setFill(Color.rgb(137,48,228));
        root.getChildren().add(circle2);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
