package sample;

import javafx.scene.paint.Color;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
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

        Polyline hvost1 = new Polyline();
        hvost1.getPoints().addAll(new Double[]{
                125.5, 158.0,
                123.0, 170.0,
                159.0, 175.5,
                159.0, 172.0});
        hvost1.setFill(Color.rgb(0,0, 0));


        Polyline hvost2 = new Polyline();
        hvost2.getPoints().addAll(new Double[]{
                141.5, 147.0,
                134.0, 154.0,
                162.0, 177.5});
        hvost2.setFill(Color.rgb(0,0, 0));


        Polyline hvost3 = new Polyline();
        hvost3.getPoints().addAll(new Double[]{
                135.5, 175.0,
                137.5, 182.0,
                158.0, 175.5});
        hvost3.setFill(Color.rgb(0,0, 0));


        Ellipse ellipse1 = new Ellipse(229,180,80,70);


        CubicCurve cubiccurve1 = new CubicCurve(
                227.5, 125.0,
                125.5, 110.0,
                197.0, 83.0,
                227.5, 125.0);
        cubiccurve1.setStrokeWidth(5);
        cubiccurve1.setStroke(Color.rgb(0,0, 0));
        cubiccurve1.setFill(Color.rgb(217,31,35));


        CubicCurve cubiccurve2 = new CubicCurve(
                240.5, 113.0,
                138.5, 105.0,
                210.0, 68.0,
                240.5, 113.0);
        cubiccurve2.setStrokeWidth(4);
        cubiccurve2.setRotate(17);


        Shape sss = (Shape) Shape.union(cubiccurve1, cubiccurve2);
        sss.setFill(Color.rgb(217,31,35));
        sss = (Shape) Shape.union(sss, ellipse1 );
        sss.setFill(Color.rgb(217,31,35));


        Ellipse ellipse21 = new Ellipse(185,200,7,9);
        ellipse21.setFill(Color.rgb(170,32,21));
        ellipse21.setRotate(324);


        Ellipse ellipse24 = new Ellipse(205,190,7,15);
        ellipse24.setFill(Color.rgb(170,32,21));
        ellipse24.setRotate(1);


        Ellipse ellipse25 = new Ellipse(265,135,5,20);
        ellipse25.setFill(Color.rgb(233,69,79));
        ellipse25.setRotate(-55);


        Ellipse ellipse22 = new Ellipse(275,190,15,19);
        ellipse22.setFill(Color.rgb(170,32,21));


        Ellipse ellipse23 = new Ellipse(238,192,15,21);
        ellipse23.setFill(Color.rgb(170,32,21));


        Arc part_circle1 = new Arc(229,270, 60, 60, 35, 110);
        part_circle1.setFill(Color.rgb(255,193,167));


        Arc part_circle2 = new Arc(229,190, 70, 60, 227, 85);
        part_circle2.setFill(Color.rgb(255,193,167));


        Shape sss1 = (Shape) Shape.union(cubiccurve2, cubiccurve1);
        sss1.setStrokeWidth(4);


        sss1 = (Shape) Shape.union(ellipse1, sss1);
        sss1.setStrokeWidth(4);
        sss1.setFill(Color.TRANSPARENT);
        sss1.setStroke(Color.BLACK);


        Circle eye1 = new Circle();
        eye1.setCenterX(246.0f);
        eye1.setCenterY(185.0f);
        eye1.setRadius(14.0f);
        eye1.setStrokeWidth(1.5);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.WHITE);


        Circle eye1_z = new Circle();
        eye1_z.setCenterX(251.0f);
        eye1_z.setCenterY(185.0f);
        eye1_z.setRadius(3.5f);
        eye1_z.setStrokeWidth(1.5);
        eye1_z.setStroke(Color.BLACK);
        eye1_z.setFill(Color.BLACK);


        Circle eye2 = new Circle();
        eye2.setCenterX(272.50f);
        eye2.setCenterY(185.0f);
        eye2.setRadius(14.0f);
        eye2.setStrokeWidth(1.5);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.WHITE);


        Circle eye2_z = new Circle();
        eye2_z.setCenterX(267.0f);
        eye2_z.setCenterY(185.0f);
        eye2_z.setRadius(3.5f);
        eye2_z.setStrokeWidth(1.5);
        eye2_z.setStroke(Color.BLACK);
        eye2_z.setFill(Color.BLACK);





        Polyline triangle2 = new Polyline();
        triangle2.getPoints().addAll(new Double[]{
                232.5, 210.0,
                250.5, 231.0,
                282.0, 215.0});
        triangle2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        triangle2.setStroke(Color.TRANSPARENT);
        triangle2.setFill(Color.rgb(247,185,0));



        QuadCurve quadcurce1 = new QuadCurve(232.5, 210.0, 238.5, 221.0, 250.5, 231.0);
        quadcurce1.setFill(Color.rgb(247,185,0));
        quadcurce1.setStroke(Color.BLACK);


        QuadCurve quadcurce2 = new QuadCurve(250.5, 231.0, 265.5, 225.0, 282.0, 215.0);
        quadcurce2.setFill(Color.rgb(247,185,0));
        quadcurce2.setStroke(Color.BLACK);


        Circle circle2 = new Circle(250.5, 228.5, 3);
        circle2.setFill(Color.rgb(247,185,0));


        QuadCurve quadcurce3 = new QuadCurve(248.0, 228.7, 250.5, 231.0, 253.0, 230.0);
        quadcurce3.setFill(Color.rgb(247,185,0));
        quadcurce3.setStroke(Color.BLACK);




        Polyline triangle1 = new Polyline();
        triangle1.getPoints().addAll(new Double[]{
                230.5, 210.0,
                258.5, 187.0,
                287.0, 217.0,
                230.5, 210.0});
        triangle1.setStrokeLineCap(StrokeLineCap.ROUND);
        triangle1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        triangle1.setStroke(Color.BLACK);
        triangle1.setFill(Color.rgb(247,185,0));




        Polyline eyebrows1 = new Polyline();
        eyebrows1.getPoints().addAll(new Double[]{
                225.5, 161.0,
                223.0, 173.0,
                259.0, 180.5,
                259.0, 172.0});
        eyebrows1.setFill(Color.rgb(0,0, 0));


        Polyline eyebrows2 = new Polyline();
        eyebrows2.getPoints().addAll(new Double[]{
                293.5, 161.0,
                295.0, 173.0,
                259.0, 180.5,
                259.0, 172.0});
        eyebrows2.setFill(Color.rgb(0,0, 0));


        root.getChildren().addAll(
                hvost1,
                hvost2,
                hvost3,
                sss,
                ellipse21,
                ellipse24,
                ellipse25,
                ellipse22,
                ellipse23,
                part_circle1,
                part_circle2,
                sss1,
                eye1,
                eye1_z,
                eye2,
                eye2_z,
                triangle2,
                quadcurce1,
                quadcurce2,
                circle2,
                quadcurce3,
                triangle1,
                eyebrows1,
                eyebrows2


        );

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(3000), root);
        fadeTransition.setFromValue(1.0f);
        fadeTransition.setToValue(0.3f);
        fadeTransition.setCycleCount(2);
        fadeTransition.setAutoReverse(true);

        Path path = new Path();
        path.getElements().add(new MoveTo(50,300)); // вказання початкової позиції, з якої починається траекторія
        path.getElements().add(new CubicCurveTo(150, 250, 300, 200, 400, 150));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000)); // встановлення часу анмації
        pathTransition.setPath(path); // прив'язування траекторії
        pathTransition.setNode(root); // вибір об'єкта, який буде анімуватися

        // Створення ефекту переміщення
//        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(2000), root);
//        translateTransition.setFromX(50);
//        translateTransition.setToX(350);
//        translateTransition.setFromY(50);
//        translateTransition.setToY(0);
//        translateTransition.setCycleCount(2);
//        translateTransition.setAutoReverse(true);

        // Створення повороту об'єкту
        RotateTransition rotateTransition = new RotateTransition(Duration.millis(3000), root);
        rotateTransition.setByAngle(360f);
        rotateTransition.setCycleCount(1);
        rotateTransition.setAutoReverse(true);


        // Масштабування об'єкту
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(2000), root);
        scaleTransition.setToX(0.5f);
        scaleTransition.setToY(0.5f);
        scaleTransition.setCycleCount(4);
        scaleTransition.setAutoReverse(true);

        // Створення можливості паралельно виконувати анімацію
        ParallelTransition parallelTransition =  new ParallelTransition();
        parallelTransition.getChildren().addAll(fadeTransition,pathTransition,rotateTransition,scaleTransition );



        parallelTransition.play();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
