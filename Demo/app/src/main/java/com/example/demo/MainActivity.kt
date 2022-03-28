package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // khai báo biến trong kolin
//        var a: String = ""
//        a = "Vu Van Giang"
//        a.toInt()  // ép kiểu
//        val b: String = "Giang"  // biến không thể thay đổi được
        // cách sửa lỗi Null Safety
//        var ten : String? = "Giang" //them dấu ? để cho phép chuyển đổi kiểu dl sang null được gép sau kdl: String?
        // ngược lại thêm 2 dấu !! thì sẽ không được phép gán sang null
        // và 2 dấu chấm than dduwwocj ghép ở ngay sau giá trị "Giang"!!
//        ten = null
        // Cách sử dụng câu lệnh if và else
//        var a: Int = 10
//        var  b: Int = 15
//        if (a>b){
//            Log.d("AAA", "Giá Trị lớn nhất là:" + a)
//        } else{
//            Log.d("AAA", "Giá trị lớn nhất là: " + b)
//        }
        // Câu Lệnh When truong hop nhieu dieu kien và tìm điều kiện đúng nhất in ra
//        var ten : String = "tuan"
//      when(ten){
//          "hien" -> Log.d("AAA", "chao ban hien")
//          "giang" -> Log.d("AAA", "chao ban giang")
//          "tuan" -> Log.d("AAA", "chao ban tuan")
//      }
//        var a: Int = 5
//        when(a){
//            1,2,3-> Log.d("AAA", "quý 1")
//            4,5,6 -> Log.d("AAA", "quý 2")
//            7,8,9 -> Log.d("AAA", "quý 3")
//            10,11,12 -> Log.d("AAA", "quý 4")
//
//        }
        // cách viết tắt giá trị từ a đến b
//        var a: Int = 5
//        when(a) {
//            in 1..3 -> Log.d("AAA", "quý 1") // in 1..3 là khai báo tắt của giá trị 1,2,3
//            in 4..6 -> Log.d("AAA", "quý 2")
//            in 7..9 -> Log.d("AAA", "quý 3")
//            in 10..12 -> Log.d("AAA", "quý 4")
//        }
        // trường hợp tất cả các trường hợp ko đúng dùng else
//        var a: Int = 15
//        when (a) {
//            in 1..3 -> Log.d("AAA", "quý 1")
//            in 4..6 -> Log.d("AAA", "quý 2")
//            in 7..9 -> Log.d("AAA", "quý 3")
//            in 10..12 -> Log.d("AAA", "quý 4")
//            else -> Log.d("AAA", "khong co gia tri cua quy")
//        }
        //vòng white lặp lại không giới hạn
//        var a: Int = -1
//        while (a<10) {
//            if (a < 0) {
//                Log.d("AAA", "không cần hiển thị vì a =" +a)
//                a++
//            } else {
//                Log.d("AAA", "Chào bạn lần thứ: " + a)
//                a++
//            }
//        }
        // vòng lặp for trong khoảng

//        for (i in 0..10){
//            Log.d("AAA", "i =" +i)
//        }
        //      về hàm for lặp từ dưới lên trên

//        var a : Int = 5
//        for (i in 0 until a){
//            Log.d("AAA", "i=" +i)
//        }
        // ví dụ hàm for lặp từ trên xuống

//        var a : Int = 5
//        for (i in a downTo 0){
//            Log.d("BBB", "i=" +i)
//        }
        // vòng for mỗi lần thực hiện nhẩy lên 2 giá trị
//        var a: Int = 10
//        for (i in 0..10 step 2){
//            Log.d("BBBB", "i=" +i)
//        }
        
    }
}