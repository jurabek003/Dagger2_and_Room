package uz.turgunboyevjurabek.dagger2androom.madels

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Entity {
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null

    var name:String?=null
    var lastName:String?=null

    constructor(id: Int?, name: String?, lastName: String?) {
        this.id = id
        this.name = name
        this.lastName = lastName
    }

    constructor()

}