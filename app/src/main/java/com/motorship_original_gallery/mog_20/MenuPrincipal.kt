package com.motorship_original_gallery.mog_20

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.motorship_original_gallery.mog_20.R.id.listviewPrincipal

class MenuPrincipal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val itemList = listOf(
            CustomAdapter.Item(R.drawable.almuerzo_cohete, "@Oxcar12", "Patatas julianas con verduras"),
            CustomAdapter.Item(R.drawable._24254878_icono_de_monta_a_escalada_esquema_de_escalada_de_monta_a_icono_vectoriales_para_dise_o_web_aislado_transformed__1__removebg_preview, "@Solsex23", "Descripción 2"),
            CustomAdapter.Item(R.drawable.apreton_de_manos, "@mario_16_", "Descripción 3")
            // Agrega más elementos si es necesario
        )
        val customAdapter = CustomAdapter(applicationContext, itemList)
        val listView = findViewById<ListView>(R.id.listviewPrincipal)
        listView.adapter = customAdapter
    }
}