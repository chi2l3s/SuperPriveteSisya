package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    private static final String[] STRINGS = {"Первая строка", "Вторая строка", "Третья строка"};
    private static final Duration DURATION = Duration.seconds(1);

    @Override
    public void start(Stage primaryStage) {
        for (int i = 0; i < STRINGS.length; i++) {
            Stage stage = new Stage();
            Text text = new Text(STRINGS[i]);
            StackPane root = new StackPane(text);
            Scene scene = new Scene(root, 200, 200);

            FadeTransition ft = new FadeTransition(DURATION, root);
            ft.setFromValue(1.0);
            ft.setToValue(0.0);
            ft.setCycleCount(2);
            ft.setAutoReverse(true);

            stage.setScene(scene);
            stage.show();

            ft.play();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}




