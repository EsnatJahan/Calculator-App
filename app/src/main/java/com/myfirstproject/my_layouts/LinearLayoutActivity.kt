package com.myfirstproject.my_layouts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LinearLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_linear_layout)
        var fname = ""
        var lname = ""
        var mail = ""
        var gen= ""
        var pas = ""
        var cpas = ""

        val firstNameField = findViewById<EditText>(R.id.firstname)
        val lastNameField = findViewById<EditText>(R.id.lastname)
        val emailField = findViewById<EditText>(R.id.email)
        val genderField = findViewById<EditText>(R.id.gender)
        val passwordField = findViewById<EditText>(R.id.pass)
        val confirmPasswordField = findViewById<EditText>(R.id.cpass)


        findViewById<Button>(R.id.btnsubmit).setOnClickListener {
            fname = firstNameField.text?.toString()?.trim() ?: ""
            lname = lastNameField.text?.toString()?.trim() ?: ""
            mail = emailField.text?.toString()?.trim() ?: ""
            gen = genderField.text?.toString()?.trim() ?: ""
            pas = passwordField.text?.toString()?.trim() ?: ""
            cpas = confirmPasswordField.text?.toString()?.trim() ?: ""

            if (fname.isEmpty() || lname.isEmpty() || mail.isEmpty() || gen.isEmpty() || pas.isEmpty() || cpas.isEmpty()) {
                Toast.makeText(this, "All the field must be filled", Toast.LENGTH_SHORT).show()
            } else if (pas != cpas) {
                Toast.makeText(this, "Confirm Your Password Correctly", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_SHORT).show()
            }

        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}