package dev.nancy.contacts

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.nancy.contacts.databinding.ContactListItemBinding

class ContactsRvAdapter(var contactsList: List<contacts>):
    RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding= ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentcontacts = contactsList.get(position)
        holder.binding.tvName.text = currentcontacts.name
        holder.binding.tvPhonenumber.text = currentcontacts.phonenumber
        holder.binding.tvEmail.text = currentcontacts.email
        holder.binding.tvAddress.text = currentcontacts.address
        Picasso.get()
            .load(currentcontacts.image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.imageView)

    }
    override fun getItemCount(): Int {
        return contactsList.size

    }
}

class ContactsViewHolder(val binding: ContactListItemBinding) :
    RecyclerView.ViewHolder(binding.root){

}




