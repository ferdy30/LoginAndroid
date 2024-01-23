package com.example.loginfirebasekotlinapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuopciones, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.opcion1) {
            Toast.makeText(this, "Se seleccionó la primer opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this, "Se seleccionó la segunda opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
        if (id == R.id.opcion3) {
            Toast.makeText(this, "Se seleccionó la tercer opción", Toast.LENGTH_LONG).show()
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}