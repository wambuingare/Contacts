package dev.nancy.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nancy.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts() {
        var contact=contacts("Nancy", "0789 345 645", "wambuingare@gmail.com", "344 Limuru")
        var contact1=contacts("Mary", "0122 457 812", "qantizmary@gmail.com", "211 Nakuru")
        var contact2=contacts("Stella", "0712 359 076", "matistella@gmail.com", "905 Eldoret")
        var contact3=contacts("Max", "0700 345 645", "orengomax45@gmail.com", "345 Kisumu")
        var contact4=contacts("Stasha", "0792 457 813", "stashamwangi@gmail.com", "234 Naivasha")
        var contact5=contacts("Susan", "0112 359 090", "wameresusan78@gmail.com", "067 Machakos")
        var contact6=contacts("Jackie", "0192 434 517", "jackieappiah@gmail.com", "178 Kiambu")
        var contact7=contacts("Victor", "0145 595 640", "vanvictor78@gmail.com", "103 Migori")
        var contacts8=contacts("Abi", "0754 123 450","wairimuabigael@gmail.com", "12 Marsabit")
        var contacts9=contacts("Isaac","0123 345 098","kabueisaac13@gmail.com","099 Kahawa Sukari")
        var contacts10=contacts("Janice", "0789 678 789","ndembujane45@gmail.com", "34 LavingTon")
        var contacts11=contacts("Becky",  "07900 897 564","wanguirebecca12@gmail.com","556 Nyeri")
        var contacts12=contacts("Mary",  "0756 098 567","wangarimonicah09@gmail.com","75 Westlands")
        var contacts13=contacts("Joe", "0908 345 456","njugushjoe455@gmail.com","123 Roysambu")
        var contacts14=contacts("Andrea",  "0789 345 567","mumbiandrea34@gmail.com","60 Kasarani")
        var contacts15=contacts("Tess", "0123 234 456","muthoniteresiah70@gmail.com","78 Thika")

        var contactlist = listOf(contact, contact1,contact2,contact3,contact4,contact5,contact6,contact7,contacts8,
            contacts9,contacts10,contacts11,contacts12,contacts13,contacts14,contacts15)

        var contactAdapter = ContactsRvAdapter(contactlist)

        binding.rvContacts.layoutManager =LinearLayoutManager(this)
        binding.rvContacts.adapter= contactAdapter
    }

}