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
        var contact=contacts("Nancy", "0789 345 645", "wambuingare@gmail.com", "344 Limuru","https://media.istockphoto.com/photos/excited-woman-wearing-rainbow-cardigan-picture-id1327495437?b=1&k=20&m=1327495437&s=170667a&w=0&h=Vbl-XLyAnBoTkyGXXi-X1CFzuSHlNcn-dqB-sCosxFo=")
        var contact1=contacts("Mary", "0122 457 812", "qantizmary@gmail.com", "211 Nakuru", "https://images.unsplash.com/photo-1517598024396-46c53fb391a1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8YWZyaWNhbiUyMGltYWdlc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contact2=contacts("Stella", "0712 359 076", "matistella@gmail.com", "905 Eldoret", "https://images.unsplash.com/photo-1644502934571-c9fe89d4cde0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact3=contacts("Max", "0700 345 645", "orengomax45@gmail.com", "345 Kisumu","https://images.unsplash.com/photo-1533729406352-547e97a7a8a1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTl8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact4=contacts("Stasha", "0792 457 813", "stashamwangi@gmail.com", "234 Naivasha","https://images.unsplash.com/photo-1560800452-f2d475982b96?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjF8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact5=contacts("Susan", "0112 359 090", "wameresusan78@gmail.com", "067 Machakos", "https://images.unsplash.com/photo-1617712634544-b270f8ab29ee?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact6=contacts("Jackie", "0192 434 517", "jackieappiah@gmail.com", "178 Kiambu", "https://images.unsplash.com/photo-1623982940710-ee76fe4b9281?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzR8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact7=contacts("Victor", "0145 595 640", "vanvictor78@gmail.com", "103 Migori", "https://images.unsplash.com/photo-1519278290-80967b99ea2d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mzh8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contacts8=contacts("Abi", "0754 123 450","wairimuabigael@gmail.com", "12 Marsabit", "https://images.unsplash.com/photo-1572568895161-ba8446444d5a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8YWZyaWNhbiUyMGltYWdlc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contacts9=contacts("Isaac","0123 345 098","kabueisaac13@gmail.com","099 Kahawa Sukari", "https://images.unsplash.com/photo-1644501781471-7c291b03a6c6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contacts10=contacts("Janice", "0789 678 789","ndembujane45@gmail.com", "34 LavingTon", "https://images.unsplash.com/photo-1517598024396-46c53fb391a1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8YWZyaWNhbiUyMGltYWdlc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contacts11=contacts("Becky",  "07900 897 564","wanguirebecca12@gmail.com","556 Nyeri", "https://images.unsplash.com/photo-1610473199625-5515de4d26f3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YWZyaWNhbiUyMGltYWdlc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contacts12=contacts("Mary",  "0756 098 567","wangarimonicah09@gmail.com","75 Westlands", "https://media.istockphoto.com/photos/cropped-shot-of-an-africanamerican-young-woman-using-smart-phone-at-picture-id1313901506?b=1&k=20&m=1313901506&s=170667a&w=0&h=Dg9qzoAe0pYsBceTUZ6lzaWeUuG3ZQ2WZuLqXvYc718=")
        var contacts13=contacts("Joe", "0908 345 456","njugushjoe455@gmail.com","123 Roysambu", "https://images.unsplash.com/photo-1610473199625-5515de4d26f3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YWZyaWNhbiUyMGltYWdlc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contacts14=contacts("Andrea",  "0789 345 567","mumbiandrea34@gmail.com","60 Kasarani", "https://images.unsplash.com/photo-1572568895161-ba8446444d5a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8YWZyaWNhbiUyMGltYWdlc3xlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60")
        var contacts15=contacts("Tess", "0123 234 456","muthoniteresiah70@gmail.com","78 Thika", "https://images.unsplash.com/photo-1644501781471-7c291b03a6c6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGFmcmljYW4lMjBpbWFnZXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")


        var contactlist = listOf(contact, contact1,contact2,contact3,contact4,contact5,contact6,contact7,contacts8,
            contacts9,contacts10,contacts11,contacts12,contacts13,contacts14,contacts15)

        var contactAdapter = ContactsRvAdapter(contactlist)

        binding.ivcontacts.layoutManager =LinearLayoutManager(this)
        binding.ivcontacts.adapter= contactAdapter
    }

}