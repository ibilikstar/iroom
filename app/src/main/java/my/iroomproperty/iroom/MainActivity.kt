package my.iroomproperty.iroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.iroomproperty.iroom_modelar.utils.PropertyFilters

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PropertyFilters.ROOM_RENTAL
    }
}