package dev.nancy.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import dev.nancy.contacts.databinding.ActivityMainBinding
import dev.nancy.contacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate((layoutInflater))
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras() {
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        var phone = intent.extras?.getString("PHONE")
        var email = intent.extras?.getString("EMAIL")
        var image = binding.ivcontact

        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
//        Toast.makeText(this, phone, Toast.LENGTH_LONG).show()
//        Toast.makeText(this, email, Toast.LENGTH_LONG).show()
//        Toast.makeText(this, address, Toast.LENGTH_LONG).show()

//        binding.tvname.text = "NAME"
            Picasso.get().load(intent.getStringExtra("IMAGE")).resize(300, 300).centerCrop().into(binding.ivcontact)
//                .placeholder(R.drawable.ic_baseline_person_24).into(holder.binding.ivContact)
        }
    }
