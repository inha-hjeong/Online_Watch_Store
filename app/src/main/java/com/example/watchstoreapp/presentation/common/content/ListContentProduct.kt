package example.watchstoreapp.presentation.common.content

import Black
import GilroyFontFamily
import Green
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.watchstoreapp.ui.theme.DIMENS_16dp
import com.example.watchstoreapp.ui.theme.DIMENS_2dp
import com.example.watchstoreapp.ui.theme.TEXT_SIZE_12sp
import com.example.watchstoreapp.ui.theme.TEXT_SIZE_24sp
import example.watchstoreapp.domain.model.ProductItem
import example.watchstoreapp.presentation.common.card.ProductCard
import com.example.watchStoreApp.R
import com.example.watchstoreapp.ui.theme.DIMENS_8dp

@Composable
fun ListContentProduct(
    modifier: Modifier = Modifier,
    title: String,
    products: List<ProductItem>,
    navController: NavController,
    onClickToCart: (ProductItem) -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = DIMENS_16dp, end = DIMENS_16dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = TEXT_SIZE_24sp,
                color = Black
            )
            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = stringResource(id = R.string.see_all),
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = TEXT_SIZE_12sp,
                color = Green
            )
        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(DIMENS_2dp),
            contentPadding = PaddingValues(DIMENS_8dp)
        ) {
            items(products) { product ->
                ProductCard(
                    productItem = product,
                    navController = navController,
                    onClickToCart = onClickToCart
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListContentProductPreview() {
    ListContentProduct(
        title = "Exclusive Offer",
        products = listOf(
            ProductItem(
                id = 1,
                title = "Organic Bananas",
                description = "",
                image = R.drawable.product10,
                unit = "7pcs, Priceg",
                price = 4.99,
                size = "100gr",
                review = 4.0
            ),
            ProductItem(
                id = 1,
                title = "Organic Bananas",
                description = "",
                image = R.drawable.product10,
                unit = "7pcs, Priceg",
                price = 4.99,
                size = "100gr",
                review = 4.0
            ),
            ProductItem(
                id = 1,
                title = "Organic Bananas",
                description = "",
                image = R.drawable.product10,
                unit = "7pcs, Priceg",
                price = 4.99,
                size = "100gr",
                review = 4.0
            )
        ),
        navController = rememberNavController(),
        onClickToCart = {}
    )
}