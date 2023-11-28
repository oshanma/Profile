package com.example.oshanmaharjan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button= findViewById<Button>(R.id.button)
        button.setOnClickListener {

            Log.v("Hello world","Button clicked")
            Toast.makeText(this,"Hello to you too!", Toast.LENGTH_SHORT).show()


        }
    }
}
//<TextView
//            android:id="@+id/Hello_world"
//            android:layout_width="wrap_content"
//            android:layout_height="wrap_content"
//            android:layout_below="@id/imageView"
//            android:layout_marginTop="10dp"
//            android:layout_marginEnd="117dp"
//            android:textColor="@android:color/black"
//            android:textSize="24sp"
//            android:textStyle="bold"
//            tools:text="Hello World" />