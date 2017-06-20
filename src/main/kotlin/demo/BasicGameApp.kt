package demo

import javafx.application.Application
import com.almasb.fxgl.app.GameApplication
import com.almasb.fxgl.settings.GameSettings

class BasicGameApp : GameApplication() {

    override fun initSettings(settings: GameSettings) {
        with(settings) {
            width = 800
            height = 600
            title = "Basic Game App"
            version = "0.1"
            // other settings
        }
    }
}

fun main(args: Array<String>) {
    Application.launch(BasicGameApp::class.java, *args)
}