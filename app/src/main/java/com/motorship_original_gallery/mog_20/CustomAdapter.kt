package com.motorship_original_gallery.mog_20


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.motorship_original_gallery.mog_20.MenuPrincipal
import android.content.ClipData.Item
class CustomAdapter(context: Context, private val itemList: List<Item>) : BaseAdapter() {
    data class Item(
        val imageResource: Int,
        val title: String,
        val description: String
    )

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): Any {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.list_item, null)
            viewHolder = ViewHolder()
            viewHolder.imageView = view.findViewById(R.id.imageView)
            viewHolder.titleTextView = view.findViewById(R.id.textViewTitle)
            viewHolder.descriptionTextView = view.findViewById(R.id.textViewDescription)
            viewHolder.button1 = view.findViewById(R.id.button1)
            viewHolder.button2 = view.findViewById(R.id.button2)
            viewHolder.button3 = view.findViewById(R.id.button3)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val item = itemList[position]

        // Asignar la imagen y otros datos a las vistas
        viewHolder.imageView.setImageResource(item.imageResource)
        viewHolder.titleTextView.text = item.title
        viewHolder.descriptionTextView.text = item.description

        // Configurar clics de botones si es necesario
        viewHolder.button1.setOnClickListener { /* Acción para Botón 1 */ }
        viewHolder.button2.setOnClickListener { /* Acción para Botón 2 */ }
        viewHolder.button3.setOnClickListener { /* Acción para Botón 3 */ }

        return view
    }

    private class ViewHolder {
        lateinit var imageView: ImageView
        lateinit var titleTextView: TextView
        lateinit var descriptionTextView: TextView
        lateinit var button1: Button
        lateinit var button2: Button
        lateinit var button3: Button
    }
}