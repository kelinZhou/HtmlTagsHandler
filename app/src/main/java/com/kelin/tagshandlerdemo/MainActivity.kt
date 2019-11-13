package com.kelin.tagshandlerdemo

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Toast
import com.kelin.tagshandler.HtmlTagsHandler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvDemo.movementMethod = LinkMovementMethod.getInstance()
        tvDemo.highlightColor = Color.TRANSPARENT
        tvDemo.text = HtmlTagsHandler.loadResource(this, R.raw.html_demo){
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }
}
