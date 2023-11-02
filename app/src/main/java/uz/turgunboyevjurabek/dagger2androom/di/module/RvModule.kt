package uz.turgunboyevjurabek.dagger2androom.di.module

import dagger.Module
import dagger.Provides
import uz.turgunboyevjurabek.dagger2androom.adapter.RvAdapter
import uz.turgunboyevjurabek.dagger2androom.madels.Entity
import javax.inject.Singleton

@Module
class RvModule {

    @Singleton
    @Provides
    fun provideRvAdapter():RvAdapter{
        return RvAdapter()
    }


}