package com.example.service_205

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //buton facebook jika diklik akan menampilkan halaman facebook.com
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com/ langitinspirasi"))
            startActivity(i)
        })
            //button instagram jika di klik akan menampilkan halaman instagram.com
        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.instagram.com/ langitinspirasi.co.id"))
            startActivity(i)

        })
        //mendeklarasikan variabel mediaplayer dan memanggil data mp3
        var MediaPlayer: MediaPlayer?   = MediaPlayer.create(this,R.raw.slank)

        //button yang berfungsi untuk memutar mp3
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        //button yang berdfungsi untuk melakukan pause mp3
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        //button yang berfungsi untuk melakukan stop mp3
        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }







    }
}
