package uz.turgunboyevjurabek.dagger2androom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import uz.turgunboyevjurabek.dagger2androom.adapter.RvAdapter
import uz.turgunboyevjurabek.dagger2androom.database.AppDatabase
import uz.turgunboyevjurabek.dagger2androom.database.Dao.UserDao
import uz.turgunboyevjurabek.dagger2androom.databinding.ActivityMainBinding
import uz.turgunboyevjurabek.dagger2androom.madels.Entity
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(){
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    @Inject
    lateinit var userDao: UserDao
    @Inject
    lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        App.applicationComponent.inject(this)
        //App.applicationComponent.getRoomData()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        addView()
        getAllUsers()
    }

    private fun getAllUsers() {
        GlobalScope.launch(Dispatchers.IO) {
            rvAdapter.updateData(userDao.getUser())

            GlobalScope.launch(Dispatchers.Main) {
                binding.rvAdapter.adapter=rvAdapter
            }
        }
    }

    private fun addView() {
        val list=ArrayList<Entity>()

        binding.addBtn.setOnClickListener {

            GlobalScope.launch(Dispatchers.Default) {
                val entity=Entity("jurabek","turg'unboyev")
                userDao.addUser(entity)
                list.add(entity)
            }
        }


    }
}