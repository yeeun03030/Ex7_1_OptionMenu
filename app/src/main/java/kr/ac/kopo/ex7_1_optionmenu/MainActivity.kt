package kr.ac.kopo.ex7_1_optionmenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.graphics.rotationMatrix

class MainActivity : AppCompatActivity() {
    lateinit var linear : LinearLayout
    lateinit var editDegree : EditText
    lateinit var imgV : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linear = findViewById<LinearLayout>(R.id.linear)
        editDegree = findViewById<EditText>(R.id.editDegree)
        imgV = findViewById<ImageView>(R.id.imgV)
    }

    // 옵션메뉴 등록
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)

        menuInflater.inflate(R.menu.optionmenu, menu)

        return true
    }

    // 항목이 선택되었을 때 이벤트 처리할 수 있는 메소드
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.itemRotate -> {
                imgV.rotation += editDegree.text.toString().toFloat()
                return true
            }
            R.id.han -> {
                imgV.setImageResource(R.drawable.han)
                item.setChecked(true)
                return true
            }
            R.id.chu -> {
                imgV.setImageResource(R.drawable.chu)
                item.setChecked(true)
                return true
            }
            R.id.bum -> {
                imgV.setImageResource(R.drawable.bum)
                item.setChecked(true)
                return true
            }
        }

        return false
    }
}