package uz.turgunboyevjurabek.dagger2androom.database

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.turgunboyevjurabek.dagger2androom.database.Dao.UserDao
import uz.turgunboyevjurabek.dagger2androom.madels.Entity

@Database(entities = [Entity::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun userDao():UserDao
}