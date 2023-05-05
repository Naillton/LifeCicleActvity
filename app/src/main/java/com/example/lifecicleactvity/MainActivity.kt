/*
    O ciclo de vida de um actvity é composto por 7 camadas dentre elas temos:
    onCreate() -> método usado quando se cria o app.
    onStart() -> método usado quando o app inicia.
    onResume() -> método usado quando o app está em execução.
    onPause() -> método usado quando o app é colocado em segundo plano preservando o estado.
    onStop() -> método usado para parar o app, diferente do onPause o onStop não preserva o estado do app reiniciando o mesmo.
    onRestart() -> método usado para reiniciar o app depois do uso do onStop.
    onDestroy() -> método usado para encerrar o app.
*/


package com.example.lifecicleactvity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(
            this@MainActivity,
            "método onCreate() executado",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(
            this@MainActivity,
            "método onStart() executado",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            this@MainActivity,
            "método onResume() executado",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(
            this@MainActivity,
            "método onPause() executado",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(
            this@MainActivity,
            "método onRestart() executado",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(
            this@MainActivity,
            "método onStop() executado",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(
            this@MainActivity,
            "método onDestroy() executado",
            Toast.LENGTH_LONG
        ).show()
    }
}