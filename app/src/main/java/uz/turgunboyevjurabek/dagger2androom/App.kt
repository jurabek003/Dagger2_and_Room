package uz.turgunboyevjurabek.dagger2androom

import android.app.Application
import uz.turgunboyevjurabek.dagger2androom.di.companent.ApplicationComponent
import uz.turgunboyevjurabek.dagger2androom.di.companent.DaggerApplicationComponent
import uz.turgunboyevjurabek.dagger2androom.di.module.DatabaseModule

class App:Application() {
    companion object{
        lateinit var applicationComponent: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        applicationComponent= DaggerApplicationComponent
            .builder()
            .databaseModule(DatabaseModule(applicationContext))
            .build()

    }
}