package uz.turgunboyevjurabek.dagger2androom.madels

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Entity {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null

    var name:String?=null
    var lastName:String?=null

    constructor( name: String?, lastName: String?) {
        this.name = name
        this.lastName = lastName
    }

    constructor()

}