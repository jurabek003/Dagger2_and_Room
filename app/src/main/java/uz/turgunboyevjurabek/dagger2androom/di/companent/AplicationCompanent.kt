package uz.turgunboyevjurabek.dagger2androom.di.companent

import dagger.Component
import uz.turgunboyevjurabek.dagger2androom.MainActivity
import uz.turgunboyevjurabek.dagger2androom.database.AppDatabase
import uz.turgunboyevjurabek.dagger2androom.di.module.DatabaseModule
import uz.turgunboyevjurabek.dagger2androom.di.module.RvModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class,RvModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)

    //fun getRoomData():AppDatabase

}