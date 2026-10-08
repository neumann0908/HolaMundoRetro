package com.tuusuario.holamundoretro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Esto le dice a la app que cargue el diseño que creamos en activity_main.xml
        setContentView(R.layout.activity_main)
    }
}
