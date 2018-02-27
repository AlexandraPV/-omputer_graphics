package sample;

import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.*;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab3 (var19)");

        Group root = new Group();
        Scene scene = new Scene(root, 577, 353);


        scene.setFill(Color.rgb(172,218,242));



        Ellipse ellipse1 = new Ellipse(229,180,80,70);
        ellipse1.setFill(Color.rgb(217,31,35));
        //ellipse1.setStroke(Color.BLACK);
        root.getChildren().add(ellipse1);

        Arc part_circle1 = new Arc(229,270, 60, 60, 35, 110);
        part_circle1.setFill(Color.rgb(255,193,167));
        root.getChildren().add(part_circle1);

        Arc part_circle2 = new Arc(229,190, 70, 60, 227, 85);
        part_circle2.setFill(Color.rgb(255,193,167));
        root.getChildren().add(part_circle2);


        Ellipse ellipse2 = new Ellipse(229,180,80,70);
        ellipse2.setFill(Color.TRANSPARENT);
        ellipse2.setStroke(Color.BLACK);
        ellipse2.setStrokeWidth(5);
        root.getChildren().add(ellipse2);


//        Arc eye1 = new Arc(142,111, 300, 100, 300, 100);
//        eye1.setFill(Color.WHITE);
//        root.getChildren().add(eye1);

        Circle eye1 = new Circle();
        eye1.setCenterX(241.0f);
        eye1.setCenterY(185.0f);
        eye1.setRadius(13.0f);
        eye1.setStrokeWidth(1.5);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.WHITE);
        root.getChildren().add(eye1);

        Circle eye1_z = new Circle();
        eye1_z.setCenterX(246.0f);
        eye1_z.setCenterY(185.0f);
        eye1_z.setRadius(3.5f);
        eye1_z.setStrokeWidth(1.5);
        eye1_z.setStroke(Color.BLACK);
        eye1_z.setFill(Color.BLACK);
        root.getChildren().add(eye1_z);


        Circle eye2 = new Circle();
        eye2.setCenterX(267.0f);
        eye2.setCenterY(185.0f);
        eye2.setRadius(13.0f);
        eye2.setStrokeWidth(1.5);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.WHITE);
        root.getChildren().add(eye2);

        Circle eye2_z = new Circle();
        eye2_z.setCenterX(262.0f);
        eye2_z.setCenterY(185.0f);
        eye2_z.setRadius(3.5f);
        eye2_z.setStrokeWidth(1.5);
        eye2_z.setStroke(Color.BLACK);
        eye2_z.setFill(Color.BLACK);
        root.getChildren().add(eye2_z);


        Polyline triangle2 = new Polyline();
        triangle2.getPoints().addAll(new Double[]{
                232.5, 210.0,
                250.5, 231.0,
                282.0, 215.0});
        triangle2.setStroke(Color.rgb(0,0, 0));
        triangle2.setFill(Color.rgb(247,185,0));
        root.getChildren().add(triangle2);

        Polyline triangle1 = new Polyline();
        triangle1.getPoints().addAll(new Double[]{
                230.5, 210.0,
                253.5, 187.0,
                287.0, 217.0,
                230.5, 210.0});
        triangle1.setStroke(Color.rgb(0,0, 0));
        triangle1.setFill(Color.rgb(247,185,0));
        root.getChildren().add(triangle1);


        Polyline eyebrows1 = new Polyline();
        eyebrows1.getPoints().addAll(new Double[]{
                220.5, 160.0,
                218.0, 172.0,
                254.0, 179.0,
                254.0, 171.0});
        //eyebrows1.setStroke(Color.rgb(0,0, 0));
        eyebrows1.setFill(Color.rgb(0,0, 0));
        root.getChildren().add(eyebrows1);

        Polyline eyebrows2 = new Polyline();
        eyebrows2.getPoints().addAll(new Double[]{
                288.5, 160.0,
                290.0, 172.0,
                254.0, 179.0,
                254.0, 171.0});
        //eyebrows2.setStroke(Color.rgb(0,0, 0));
        eyebrows2.setFill(Color.rgb(0,0, 0));
        root.getChildren().add(eyebrows2);




//        circle1.setCenterX(229.0f);
//        circle1.setCenterY(180.0f);
//        circle1.setRadius(70.0f);
//        circle1.setFill(Color.rgb(217,31,35));
//        root.getChildren().add(circle1);



//        Rectangle r = new Rectangle(170, 125, 240, 70);
//        root.getChildren().add(r);
//        r.setFill(Color.rgb(0,253,254));
//
//        Polyline triangle = new Polyline();
//        triangle.getPoints().addAll(new Double[]{
//                170.5, 56.0,
//                170.5, 125.0,
//                237.0, 125.0 });
//        triangle.setFill(Color.rgb(0,253,254));
//        triangle.setStroke(Color.rgb(0,253,254));
//        root.getChildren().add(triangle);
//
//        Line l1 = new Line(227, 196, 330, 260);
//        root.getChildren().add(l1);
//        l1.setStroke(Color.rgb(156,102,0));
//
//        Line l2 = new Line(360, 196, 253, 260);
//        root.getChildren().add(l2);
//        l2.setStroke(Color.rgb(156,102,0));
//
//        Line l3 = new Line(462, 69, 411, 125);
//        root.getChildren().add(l3);
//        l3.setStroke(Color.rgb(156,102,0));
//
//        Circle circle1 = new Circle();
//        circle1.setCenterX(229.0f);
//        circle1.setCenterY(286.0f);
//        circle1.setRadius(35.0f);
//        circle1.setFill(Color.rgb(137,48,228));
//        root.getChildren().add(circle1);
//
//        Circle circle2 = new Circle();
//
//        circle2.setCenterX(355.0f);
//        circle2.setCenterY(286.0f);
//        circle2.setRadius(35.0f);
//        circle2.setFill(Color.rgb(137,48,228));
//        root.getChildren().add(circle2);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
