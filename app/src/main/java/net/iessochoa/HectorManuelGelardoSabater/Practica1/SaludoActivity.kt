package net.iessochoa.HectorManuelGelardoSabater.Practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SaludoActivity : AppCompatActivity() {
    companion object {
        //Permite recibir un texto que mostrará por pantalla
        val EXTRA_NOMBRE = "practica1.SaludoActivity.nombre"
    }

    private lateinit var tvSaludo: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        //asignamos la instancia de tvSaludo en onCreate
        tvSaludo=findViewById(R.id.tvSaludo)
        //recuperamos el valor enviado por MainActivity
        val nombre=intent.getStringExtra(EXTRA_NOMBRE)
//mostramos el valor
        tvSaludo.text="Hola "+nombre+"!!"
    }
}