package com.example.semana04listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Android","iPhone","Windows Phone"
        ,"Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Se obtiene el view lstSO
        val lvSistemasOperativos: ListView = findViewById(R.id.lsvSO) as ListView
        val adaptador: Any? =
            ArrayAdapter<Any?>(this
                ,android.R.layout.simple_list_item_1
                , arrSO)

        lvSistemasOperativos.adapter = adaptador as ListAdapter?

        lvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext,
                "Posición: $position",
                Toast.LENGTH_LONG
            ).show()
        }
    }

}