package com.fajar.intentfajarniboss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnMoveActivity: Button
    private lateinit var btnMoveWithData: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveActivity=findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        btnMoveWithData =findViewById(R.id.btn_move_with_data)
        btnMoveWithData.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
       if (v !=null){
           when(v.id){
               R.id.btn_move_activity-> run{
                   val intent=Intent (this, MoveActivity::class.java)
                   startActivity(intent)
               }
               R.id.btn_move_with_data-> run{
                   val intent=Intent(this, MoveWithDataActivity::class.java)
                   val bundle=Bundle()
                   bundle.putString("Nama", "nama saya fajar kurniawan")
                   bundle.putString("Alamat", "saya tinggal di Blitar")
                   bundle.putString("Quotes", "Quotes hari ini adalah Bidadariku,Tugasku hanya merawat sayapmu tetapi tidak untuk terbang bersamamu:) ~4 November 2021~")
                   intent.putExtras(bundle)
                   startActivity(intent)
               }

           }
       }
    }
}