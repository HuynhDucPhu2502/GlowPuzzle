module me.huynhducphu.glowpuzzle {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.huynhducphu.glowpuzzle to javafx.fxml;
    exports me.huynhducphu.glowpuzzle;
}