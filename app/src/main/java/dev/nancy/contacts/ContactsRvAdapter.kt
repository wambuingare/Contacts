package dev.nancy.contacts

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class ContactsRvAdapter(var contactsList: List<contacts>):
    RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentcontacts = contactsList.get(position)
        holder.tvName.text=currentcontacts.name
        holder.tvPhonenumber.text=currentcontacts.phonenumber
        holder.tvEmail.text=currentcontacts.email
        holder.tvAddress.text=currentcontacts.address
    }

    override fun getItemCount(): Int {
        return contactsList.size

    }
}

class ContactsViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhonenumber=itemView.findViewById<TextView>(R.id.tvPhonenumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvAddress=itemView.findViewById<TextView>(R.id.tvAddress)

}




