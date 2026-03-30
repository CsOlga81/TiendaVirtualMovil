package com.olga.tiendavirtualmovil.adapter
import android.view.LayoutInflater
import com.olga.tiendavirtualmovil.R
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.olga.tiendavirtualmovil.model.Producto

class ProductoAdapter (
    private val listaProductos: List<Producto>
) : RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>() {

    override fun getItemCount(): Int {
        return listaProductos.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_producto, parent, false)
        return ProductoViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val producto = listaProductos[position]

        holder.txtNombre.text = producto.nombre
        holder.txtPrecio.text = producto.precio.toString()
    }
    class ProductoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val txtNombre = itemView.findViewById<TextView>(R.id.txtNombreProducto)
        val txtPrecio = itemView.findViewById<TextView>(R.id.txtPrecio)
    }
}