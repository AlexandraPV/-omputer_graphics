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

        Polyline hvost1 = new Polyline();
        hvost1.getPoints().addAll(new Double[]{
                125.5, 158.0,
                123.0, 170.0,
                159.0, 175.5,
                159.0, 172.0});

        hvost1.setFill(Color.rgb(0,0, 0));
        root.getChildren().add(hvost1);

        Polyline hvost2 = new Polyline();
        hvost2.getPoints().addAll(new Double[]{
                141.5, 147.0,
                134.0, 154.0,
                162.0, 177.5});

        hvost2.setFill(Color.rgb(0,0, 0));
        root.getChildren().add(hvost2);

        Polyline hvost3 = new Polyline();
        hvost3.getPoints().addAll(new Double[]{
                135.5, 175.0,
                137.5, 182.0,
                158.0, 175.5});

        hvost3.setFill(Color.rgb(0,0, 0));
        root.getChildren().add(hvost3);



        Ellipse ellipse1 = new Ellipse(229,180,80,70);
//        ellipse1.setFill(Color.rgb(217,31,35));
        //ellipse1.setStroke(Color.BLACK);
//       root.getChildren().add(ellipse1);






//        Ellipse ellipse2 = new Ellipse(229,180,80,70);
//        ellipse2.setFill(Color.TRANSPARENT);
//        ellipse2.setStroke(Color.BLACK);
//        ellipse2.setStrokeWidth(5);
//        root.getChildren().add(ellipse2);

        CubicCurve cubiccurve1 = new CubicCurve(
                227.5, 125.0,
                125.5, 110.0,
                197.0, 83.0,
                227.5, 125.0);
        cubiccurve1.setStrokeWidth(5);
        cubiccurve1.setStroke(Color.rgb(0,0, 0));
        cubiccurve1.setFill(Color.rgb(217,31,35));
//        root.getChildren().add(cubiccurve1);


        CubicCurve cubiccurve2 = new CubicCurve(
                240.5, 113.0,
                138.5, 105.0,
                210.0, 68.0,
                240.5, 113.0);
        cubiccurve2.setStrokeWidth(4);
//        cubiccurve2.setStroke(Color.rgb(0,0, 0));
//        cubiccurve2.setFill(Color.rgb(217,31,35));
        cubiccurve2.setRotate(17);
//        root.getChildren().add(cubiccurve2);


        Shape sss = (Shape) Shape.union(cubiccurve1, cubiccurve2);
        //sss.setStrokeWidth(5);
        sss.setFill(Color.rgb(217,31,35));
        //sss.setStroke(Color.BLACK);
        //cubiccurve1.setStrokeWidth(5);
        //root.getChildren().add(sss);

        sss = (Shape) Shape.union(sss, ellipse1 );
        //sss.setStrokeWidth(5);
        sss.setFill(Color.rgb(217,31,35));
        //sss.setStroke(Color.BLACK);
        //cubiccurve1.setStrokeWidth(5);
        root.getChildren().add(sss);

        Ellipse ellipse21 = new Ellipse(185,200,7,9);
        ellipse21.setFill(Color.rgb(170,32,21));
        ellipse21.setRotate(324);
        root.getChildren().add(ellipse21);

        Ellipse ellipse24 = new Ellipse(205,190,7,15);
        ellipse24.setFill(Color.rgb(170,32,21));
        ellipse24.setRotate(1);
        root.getChildren().add(ellipse24);

        Ellipse ellipse25 = new Ellipse(265,135,5,20);
        ellipse25.setFill(Color.rgb(233,69,79));
        ellipse25.setRotate(-55);
        root.getChildren().add(ellipse25);

        Ellipse ellipse22 = new Ellipse(275,190,15,19);
        ellipse22.setFill(Color.rgb(170,32,21));
       // ellipse22.setRotate(324);
        root.getChildren().add(ellipse22);

        Ellipse ellipse23 = new Ellipse(238,192,15,21);
        ellipse23.setFill(Color.rgb(170,32,21));
        // ellipse22.setRotate(324);
        root.getChildren().add(ellipse23);


        Arc part_circle1 = new Arc(229,270, 60, 60, 35, 110);
        part_circle1.setFill(Color.rgb(255,193,167));
        root.getChildren().add(part_circle1);

        Arc part_circle2 = new Arc(229,190, 70, 60, 227, 85);
        part_circle2.setFill(Color.rgb(255,193,167));
        root.getChildren().add(part_circle2);


        Shape sss1 = (Shape) Shape.union(cubiccurve2, cubiccurve1);
        sss1.setStrokeWidth(4);
//        sss1.setFill(Color.TRANSPARENT);
//        sss1.setStroke(Color.BLACK);

        //root.getChildren().add(sss1);


        sss1 = (Shape) Shape.union(ellipse1, sss1);
        sss1.setStrokeWidth(4);
        sss1.setFill(Color.TRANSPARENT);
        sss1.setStroke(Color.BLACK);

        root.getChildren().add(sss1);

        Circle eye1 = new Circle();
        eye1.setCenterX(246.0f);
        eye1.setCenterY(185.0f);
        eye1.setRadius(14.0f);
        eye1.setStrokeWidth(1.5);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.WHITE);
        root.getChildren().add(eye1);

        Circle eye1_z = new Circle();
        eye1_z.setCenterX(251.0f);
        eye1_z.setCenterY(185.0f);
        eye1_z.setRadius(3.5f);
        eye1_z.setStrokeWidth(1.5);
        eye1_z.setStroke(Color.BLACK);
        eye1_z.setFill(Color.BLACK);
        root.getChildren().add(eye1_z);


        Circle eye2 = new Circle();
        eye2.setCenterX(272.50f);
        eye2.setCenterY(185.0f);
        eye2.setRadius(14.0f);
        eye2.setStrokeWidth(1.5);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.WHITE);
        root.getChildren().add(eye2);

        Circle eye2_z = new Circle();
        eye2_z.setCenterX(267.0f);
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
        //triangle2.setStrokeLineCap(StrokeLineCap.ROUND);
        triangle2.setStrokeLineJoin(StrokeLineJoin.ROUND);

        triangle2.setStroke(Color.TRANSPARENT);
        triangle2.setFill(Color.rgb(247,185,0));
        root.getChildren().add(triangle2);



        QuadCurve quadcurce1 = new QuadCurve(232.5, 210.0, 238.5, 221.0, 250.5, 231.0);
        quadcurce1.setFill(Color.rgb(247,185,0));
        quadcurce1.setStroke(Color.BLACK);
        root.getChildren().add(quadcurce1);

        QuadCurve quadcurce2 = new QuadCurve(250.5, 231.0, 265.5, 225.0, 282.0, 215.0);
        quadcurce2.setFill(Color.rgb(247,185,0));
        quadcurce2.setStroke(Color.BLACK);
        root.getChildren().add(quadcurce2);

        Circle circle2 = new Circle(250.5, 228.5, 3);
        circle2.setFill(Color.rgb(247,185,0));
        root.getChildren().add(circle2);

        QuadCurve quadcurce3 = new QuadCurve(248.0, 228.7, 250.5, 231.0, 253.0, 230.0);
        quadcurce3.setFill(Color.rgb(247,185,0));
        quadcurce3.setStroke(Color.BLACK);
        root.getChildren().add(quadcurce3);



        Polyline triangle1 = new Polyline();
        triangle1.getPoints().addAll(new Double[]{
                230.5, 210.0,
                258.5, 187.0,
                287.0, 217.0,
                230.5, 210.0});
        triangle1.setStrokeLineCap(StrokeLineCap.ROUND);
        //triangle2.setStrokeWidth(1);
        triangle1.setStrokeLineJoin(StrokeLineJoin.ROUND);
       triangle1.setStroke(Color.BLACK);
        triangle1.setFill(Color.rgb(247,185,0));
        root.getChildren().add(triangle1);


//        QuadCurve quadcurce4 = new QuadCurve(253.5, 187.0, 200.5, 240.0, 287.0, 217.0);
//        quadcurce4.setFill(Color.rgb(247,185,0));
//        quadcurce4.setStroke(Color.BLACK);
//        root.getChildren().add(quadcurce4);

        Polyline eyebrows1 = new Polyline();
        eyebrows1.getPoints().addAll(new Double[]{
                225.5, 161.0,
                223.0, 173.0,
                259.0, 180.5,
                259.0, 172.0});

        eyebrows1.setFill(Color.rgb(0,0, 0));
        root.getChildren().add(eyebrows1);

        Polyline eyebrows2 = new Polyline();
        eyebrows2.getPoints().addAll(new Double[]{
                293.5, 161.0,
                295.0, 173.0,
                259.0, 180.5,
                259.0, 172.0});



        eyebrows2.setFill(Color.rgb(0,0, 0));
        root.getChildren().add(eyebrows2);




        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
