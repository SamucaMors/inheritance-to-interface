package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Color color = Color.BLACK;
        Shape shape = new Circle(color,2.0);
        Rectangle rectangle = new Rectangle(color, 10.0, 2.0);

    }
}