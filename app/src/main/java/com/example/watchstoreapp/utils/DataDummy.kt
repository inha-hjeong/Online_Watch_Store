package example.watchstoreapp.utils

import BackgroundCategory1
import BackgroundCategory2
import BackgroundCategory3
import BackgroundCategory4
import BackgroundCategory5
import BackgroundCategory6
import com.example.watchStoreApp.R
import example.watchstoreapp.domain.model.AboutItem
import example.watchstoreapp.domain.model.CategoryItem
import example.watchstoreapp.domain.model.ProductItem


object DataDummy {

    fun generateDummyProduct(): List<ProductItem> {
        return listOf(
            ProductItem(
                id = 1,
                title = "G-Shock",
                description = "G-Shock creates bold and out-there designs, ready to keep track of each second, minute and hour with a sleek display. Powered by a battery-operated movement, this GM-2100G-1A9 42mm is crafted from gold-tone stainless steel to offer a limited-edition take on timekeeping. ",
                image = R.drawable.product1,
                unit = "1pcs, Price",
                price = 413.0,
                size = "42mm",
                review = 4.5,
            ),
            ProductItem(
                id = 2,
                title = "G-Shock",
                description = "G-Shock creates bold and out-there designs, ready to keep track of each second, minute and hour with a sleek display. Powered by a battery-operated movement, this GM-2100G-1A9 42mm is crafted from gold-tone stainless steel to offer a limited-edition take on timekeeping. ",
                image = R.drawable.product2,
                unit = "1pcs, Price",
                price = 294.5,
                size = "50mm",
                review = 5.0
            ),
            ProductItem(
                id = 3,
                title = "BOSS",
                description = "A refined chronograph watch by BOSS. Featuring a brown strap in soft leather with a signature buckle, this watch is crafted in polished and brushed stainless steel with a blue dial for contemporary contrast. A trio of subeyes offers reliable performance, while the case is designed with premium detailing.",
                image = R.drawable.product3,
                unit = "1pcs, Price",
                price = 394.0,
                size = "44mm",
                review = 4.5
            ),
            ProductItem(
                id = 4,
                title = "Tissot",
                description = "Playing with the minds of hardcore Tissot fans, the Tissot T-Classic collection is more about preservation rather than innovation. Imbibing the idea of classic watchmaking, the collection is home to various unique timepieces such as the PRX, the Carson, and Chemin Des Tourelles.",
                image = R.drawable.product4,
                unit = "1pcs, Price",
                price = 499.5,
                size = "44",
                review = 4.7
            ),
            ProductItem(
                id = 5,
                title = "Tissot",
                description = "Playing with the minds of hardcore Tissot fans, the Tissot T-Classic collection is more about preservation rather than innovation. Imbibing the idea of classic watchmaking, the collection is home to various unique timepieces such as the PRX, the Carson, and Chemin Des Tourelles.",
                image = R.drawable.product5,
                unit = "20pcs, Price",
                price = 342.0,
                size = "44mm",
                review = 4.2
            ),
            ProductItem(
                id = 6,
                title = "Tissot",
                description = "Playing with the minds of hardcore Tissot fans, the Tissot T-Classic collection is more about preservation rather than innovation. Imbibing the idea of classic watchmaking, the collection is home to various unique timepieces such as the PRX, the Carson, and Chemin Des Tourelles.",
                image = R.drawable.product6,
                unit = "1pcs, Price",
                price = 351.5,
                size = "42mm",
                review = 3.8
            ),
            ProductItem(
                id = 7,
                title = "Swatch",
                description = "We chose the Swatch Once Again Watch for its similarity to Swatch Watches represented in MoMA’s collection. Its classic design features a round white face with black-outlined white hour and minute hands and a second hand. The day and date window keeps you on track. ",
                image = R.drawable.product7,
                unit = "1pcs, Price",
                price = 395.0,
                size = "42mm",
                review = 3.0
            ),
            ProductItem(
                id = 8,
                title = "Swatch",
                description = "We chose the Swatch Once Again Watch for its similarity to Swatch Watches represented in MoMA’s collection. Its classic design features a round white face with black-outlined white hour and minute hands and a second hand. The day and date window keeps you on track. ",
                image = R.drawable.product8,
                unit = "1pcs, Price",
                price = 506.5,
                size = "44mm",
                review = 4.2
            ),
            ProductItem(
                id = 9,
                title = "Swatch",
                description = "We chose the Swatch Once Again Watch for its similarity to Swatch Watches represented in MoMA’s collection. Its classic design features a round white face with black-outlined white hour and minute hands and a second hand. The day and date window keeps you on track. ",
                image = R.drawable.product9,
                unit = "1pcs, Price",
                price = 345.54,
                size = "42mm",
                review = 4.7
            ),
            ProductItem(
                id = 10,
                title = "Multi Watch",
                description = "Multi’s design is a playful approach to conventional timepieces, using color to create bold yet balanced combinations in wearable palettes. This watch has a two-tone leather strap in supple calf leather, a matte case with a sandblasted texture, Japanese quartz movement and scratch-resistant mineral glass lens. Water-resistant.",
                image = R.drawable.product10,
                unit = "1pcs, Price",
                price = 459.10,
                size = "44mm",
                review = 4.5
            ),
        )
    }

    fun generateDummyCategories(): List<CategoryItem> {
        return listOf(
            CategoryItem(
                title = "Casio",
                image = R.drawable.category1,
                background = BackgroundCategory1
            ),
            CategoryItem(
                title = "Boss",
                image = R.drawable.category2,
                background = BackgroundCategory2
            ),
            CategoryItem(
                title = "Tissot",
                image = R.drawable.category3,
                background = BackgroundCategory3
            ),
            CategoryItem(
                title = "Swatch",
                image = R.drawable.category4,
                background = BackgroundCategory4
            ),
            CategoryItem(
                title = "Tommy Hilfiger",
                image = R.drawable.category5,
                background = BackgroundCategory5
            ),
            CategoryItem(
                title = "G-Shock",
                image = R.drawable.category6,
                background = BackgroundCategory6
            )
        )
    }

    fun generateDummyAbout(): List<AboutItem> {
        return listOf(
            AboutItem(
                image = R.drawable.ic_orders,
                title = "Orders"
            ),
            AboutItem(
                image = R.drawable.ic_my_details,
                title = "My Details"
            ),
            AboutItem(
                image = R.drawable.ic_address,
                title = "Delivery Address"
            ),
            AboutItem(
                image = R.drawable.ic_payment,
                title = "Payment"
            ),
            AboutItem(
                image = R.drawable.ic_notification,
                title = "Notification"
            ),
        )
    }

}