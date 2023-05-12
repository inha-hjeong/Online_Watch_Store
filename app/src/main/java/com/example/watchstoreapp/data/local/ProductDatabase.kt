package example.watchstoreapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import example.watchstoreapp.data.local.dao.ProductDao
import example.watchstoreapp.domain.model.ProductItem

@Database(entities = [ProductItem::class], version = 2)
abstract class ProductDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

}