package uz.turgunboyevjurabek.dagger2androom.di.module

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import uz.turgunboyevjurabek.dagger2androom.database.AppDatabase
import uz.turgunboyevjurabek.dagger2androom.database.Dao.UserDao
import javax.inject.Singleton

@Module
class DatabaseModule(var context: Context) {

    @Singleton
    @Provides
    fun provideContext():Context=context

    @Singleton
    @Provides
    fun provideAppDatabase(context: Context):AppDatabase{
        return Room.databaseBuilder(context,AppDatabase::class.java,"my_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideUserDao(appDatabase: AppDatabase):UserDao{
        return appDatabase.userDao()
    }
}