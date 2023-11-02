package uz.turgunboyevjurabek.dagger2androom.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.turgunboyevjurabek.dagger2androom.databinding.ItemRvBinding
import uz.turgunboyevjurabek.dagger2androom.madels.Entity

class RvAdapter :
    RecyclerView.Adapter<RvAdapter.Vh>() {
    private val list: ArrayList<Entity> = ArrayList<Entity>()
    inner class Vh(val itemRv: ItemRvBinding) : RecyclerView.ViewHolder(itemRv.root) {
        fun onBind(entity: Entity) {
            itemRv.itemName.text=entity.name
            itemRv.itemLastName.text=entity.lastName

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
    // Ma'lumotlarni yangilash uchun funksiya
    fun updateData(newData: List<Entity>) {
        if (list.isNotEmpty()){
            list.clear()
        }
        list.addAll(newData)
        notifyDataSetChanged()
    }
}