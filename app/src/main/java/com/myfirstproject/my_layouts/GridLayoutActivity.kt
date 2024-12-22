package com.myfirstproject.my_layouts

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GridLayoutActivity : AppCompatActivity() {
    private var num1 = ""
    private var num2 = ""
    private var sign = "x"
    private var prev = "x"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_layout)


        var number = findViewById<TextView>(R.id.key)
        findViewById<Button>(R.id.button31).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=1
                number.text = num1
            }else {
                num2+=1
                number.text = num1 + sign + num2

            }

            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button41).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=0
                number.text = num1
            }else {
                num2+=0
                number.text = num1 + sign+ num2
            }

        }

        findViewById<Button>(R.id.button32).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=2
                number.text = num1
            }else {
                num2+=2
                number.text = num1 + sign + num2
            }
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button33).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=3
                number.text = num1
            }else {
                num2+=3
                number.text = num1 + sign + num2
            }
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button21).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=4
                number.text = num1
            }else {
                num2+=4
                number.text = num1 + sign + num2
            }
          //  Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button22).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=5
                number.text = num1
            }else {
                num2+=5
                number.text = num1 + sign + num2
            }
           // Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button23).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=6
                number.text = num1
            }else {
                num2+=6
                number.text = num1 + sign + num2
            }
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button11).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=7
                number.text = num1
            }else {
                num2+=7
                number.text = num1 + sign + num2
            }
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button12).setOnClickListener {
            if (sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=8
                number.text = num1
            } else {
                num2 += 8
                number.text = num1 + sign + num2
            }
        }

        findViewById<Button>(R.id.button13).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+=9
                number.text = num1
            }else {
                num2+=9
                number.text = num1 + sign + num2
            }
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.button43).setOnClickListener {
            if(sign == "x") {
                if(prev=="=") {
                    num1 = ""
                    prev = "x"
                }
                num1+="."
                number.text = num1
            }else {
                num2+="."
                number.text = num1 + sign + num2
            }
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button04).setOnClickListener {
            sign="/"
            number.text = (num1 + sign)
        }
        findViewById<Button>(R.id.button14).setOnClickListener {
            sign="X"
            number.text = (num1 + sign)

        }
        findViewById<Button>(R.id.button24).setOnClickListener {
            sign="-"

            number.text = (num1 + sign)
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.button34).setOnClickListener {
            sign="+"
            number.text = (num1 + sign)
            //number.text = "0"
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.button44).setOnClickListener {
           prev =  "="
           var number1 = num1.toInt()
           var number2 = num2.toInt()
           if(sign == "+") {
               if(num1 == "" || num2 == "") {
                   Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
               }else{
                   number1+=number2
                   number.text= number1.toString()
                   num1 = number1.toString()
               }
           }
            else if(sign == "-") {
               if(num1 == "" || num2 == "") {
                   Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
               }else{
                   number1-=number2
                   number.text= number1.toString()
                   num1 = number1.toString()
               }
            }
            else if(sign == "X") {
               if(num1 == "" || num2 == "") {
                   Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
               }else{
                   number1*=number2
                   number.text= number1.toString()
                   num1 = number1.toString()
               }
            }
            else if(sign == "/") {
               if(num1 == "" || num2 == "") {
                   Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
               }else{
                   number1/=number2
                   number.text= number1.toString()
                   num1 = number1.toString()
               }
            }
            else if(sign == "%") {
               if(num1 == "" || num2 == "") {
                   Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
               }else{
                   number1%=number2
                   number.text= number1.toString()
                   num1 = number1.toString()
               }

            }else if(sign == "x") {
               Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show()
           }

            num2 = ""
            sign = "x"
        }
        findViewById<Button>(R.id.button01).setOnClickListener {

            number.text = "0"
            num1 = ""
            num2 = ""
            sign = "x"
            prev = "x"
            //number.text = "0"
            //Toast.makeText(this, "Value of num1: $num1", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.button02).setOnClickListener {
            var str = number.text.toString().toInt()
            str*=(-1)
            number.text = str.toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}