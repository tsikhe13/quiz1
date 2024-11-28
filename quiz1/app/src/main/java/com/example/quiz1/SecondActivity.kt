import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quiz1.R

class SecondActivity : AppCompatActivity() {

    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val clickButton = findViewById<Button>(R.id.clickButton)

        numberTextView.text = number.toString()

        clickButton.setOnClickListener {
            number -= 1
            numberTextView.text = number.toString()
        }
    }
}
