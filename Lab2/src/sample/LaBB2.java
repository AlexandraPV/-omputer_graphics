package sample;


import java.awt.*;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



    @SuppressWarnings("serial")
    public class LaBB2 extends JPanel implements ActionListener {
        private static int maxWidth;
        private static int maxHeight;
        Timer timer;

        private double angle = 0;          // Для анімації масштабування
        private double scale = 1;
        private double sy = 0.95;
        private double delta = 0.01;          // Для анімації руху
        private double dx = 10;
        private double tx = 10;
        private double dy = 10; // Масштабування відбувається відносно центру координат,
        private double ty = 10;
        private double transparence = 1;
        public LaBB2 () {
            timer = new Timer(10, this);
            timer.start();
        }

        @Override
        public void actionPerformed(ActionEvent event){
            if ( scale < 0.01 ) {
                delta = -delta;
            }
            else if (scale > 0.99) {
                delta = -delta;
            }
//                if ( tx < -maxWidth/3 ) {
//                dx = -dx;
//            } else if ( tx > maxWidth/3 ) {
//
//                }
//                if ( ty < -maxHeight/3 ) {
//                dy = -dy;
//            } else if ( ty > maxHeight/3 ) {
//
//                }
                scale += delta;
            sy -=0.01;
            angle += 0.01;
           // tx += dx;
           // ty += dy;
            repaint();

        }
        private void Anim1 (Graphics2D g2d){


            //g2d.translate(-1, 0);
            //g2d.rotate(angle,210, 320);


            g2d.scale(scale, sy);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float)scale));
            // g2d.setPaint(new Color(137, 48, 228));

            Point2D center = new Point2D.Float(210, 320);
            float radius = 25;
            Point2D focus = new Point2D.Float(210, 320);
            float[] dist = {0.0f, 0.2f, 1.0f};
            Color[] colors = {Color.RED, Color.WHITE, new Color(137, 48, 228)};
            RadialGradientPaint p =
                    new RadialGradientPaint(center, radius, focus,
                            dist, colors,
                            CycleMethod.NO_CYCLE);
            g2d.setPaint(p);
            g2d.fillOval(175, 286, 70, 70);

            g2d.setPaint(Color.white);
            g2d.fillOval(180, 318, 5, 5);
            g2d.fillOval(235, 318, 5, 5);
            g2d.fillOval(208, 291, 5, 5);
            g2d.fillOval(208, 345, 5, 5);

        }

        private void Anim2 (Graphics2D g2d){

            g2d.rotate(angle, 330, 320);
            Point2D center1 = new Point2D.Float(330, 320);
            float radius1 = 25;
            Point2D focus1 = new Point2D.Float(330, 320);
            float[] dist1 = {0.0f, 0.2f, 1.0f};
            Color[] colors1 = {Color.RED, Color.WHITE, new Color(137, 48, 228)};
            RadialGradientPaint p1 =
                    new RadialGradientPaint(center1, radius1, focus1,
                            dist1, colors1,
                            CycleMethod.NO_CYCLE);
            g2d.setPaint(p1);
            g2d.fillOval(295, 286, 70, 70);

            g2d.setPaint(Color.white);
            g2d.fillOval(300, 318, 5, 5);
            g2d.fillOval(355, 318, 5, 5);
            g2d.fillOval(328, 291, 5, 5);
            g2d.fillOval(328, 345, 5, 5);

        }
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHints(rh);


            g2d.setBackground(new Color(255, 164, 0));
            g2d.clearRect(0, 0, maxWidth, maxHeight);
            GradientPaint gp = new GradientPaint(5, 25,
                    new Color(255, 255, 255), 20, 2, Color.YELLOW, true);
            g2d.setPaint(gp);

            BasicStroke bs1 = new BasicStroke(10, BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_BEVEL);
            g2d.setStroke(bs1);
            g2d.drawRect(10, 10, 480, 455);




            g2d.setPaint(new Color(0, 253, 254));

            int[] xpoints = {143, 143, 378, 378, 212, 143};
            int[] ypoints = {102, 242, 242, 175, 175, 102};

            g2d.fillPolygon(new Polygon(xpoints, ypoints, 5));

            g2d.setColor(new Color(156, 102, 0));
            BasicStroke bs2 = new BasicStroke(1, BasicStroke.CAP_ROUND,
                    BasicStroke.JOIN_BEVEL);
            g2d.setStroke(bs2);
            g2d.drawLine(378, 175, 435, 101);
            g2d.drawLine(194, 242, 305, 295);
            g2d.drawLine(331, 242, 235, 295);
            g2d.setBackground(new Color(255, 164, 0));

            Anim2 (g2d);

            Anim1 (g2d);

                g2d.setBackground(new Color(255,164,0));


        }


        public static void main(String[] args) {
            JFrame frame = new JFrame("Lab2 (var19)");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.add(new LaBB2());
            frame.setVisible(true);
            frame.setVisible(true);
            Dimension size = frame.getSize();
            Insets insets = frame.getInsets();
            maxWidth =  size.width - insets.left - insets.right - 1;
            maxHeight =  size.height - insets.top - insets.bottom - 1;


        }


    }
