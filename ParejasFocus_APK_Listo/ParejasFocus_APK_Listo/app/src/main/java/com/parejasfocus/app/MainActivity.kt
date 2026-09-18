package com.parejasfocus.app

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity: Activity(){
 override fun onCreate(savedInstanceState: Bundle?){
  super.onCreate(savedInstanceState)
  val t=TextView(this)
  t.text="❤️ Parejas Focus\n\nProtección Facebook activa"
  t.textSize=24f
  setContentView(t)
 }
}
