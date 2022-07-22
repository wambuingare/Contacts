package dev.nancy.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        Toast.makeText(baseContext, "ABCD", Toast.LENGTH_LONG).show()
        getExtras()
    }
    fun getExtras(){
        var name = intent.extras?.getString("NAME","ABCD")
        var address = intent.extras?.getString("ADDRESS")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
    }
}