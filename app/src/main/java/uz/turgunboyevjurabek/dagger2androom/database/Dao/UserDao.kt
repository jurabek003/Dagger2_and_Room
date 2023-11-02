package uz.turgunboyevjurabek.dagger2androom.database.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import uz.turgunboyevjurabek.dagger2androom.madels.Entity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(list: List<Entity>)

    @Query("select *from Entity")
    fun getUser():List<Entity>

}