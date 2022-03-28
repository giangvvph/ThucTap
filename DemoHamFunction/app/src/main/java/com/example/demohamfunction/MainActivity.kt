package com.example.demohamfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hàm là tập hợp các câu lệnh để sử dụng chung 1 mục đích là tạo ra 1 chức năng hành động nào đó
        // cách tạo và gọi ra một hàm lưu ý hàm đc viết bên ngoài ngoặc onCreat và gọi hàm ở bên trong onCreat
        Showname()
    }
//    fun Showname(){
//        Log.d("HHH", "Hàm Showname đã được gọi")
//    }
    // khi chuyền vào tham số cho hàm
    fun Showname (ten : String = "Giang"){
        Log.d("KKK",ten)
    }
}