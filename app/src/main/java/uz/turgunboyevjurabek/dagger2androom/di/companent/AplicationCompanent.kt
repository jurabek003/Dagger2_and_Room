package uz.turgunboyevjurabek.dagger2androom.di.companent

import dagger.Component
import uz.turgunboyevjurabek.dagger2androom.di.module.DatabaseModule


@Component(modules = [DatabaseModule::class])
interface ApplicationComponent {

}