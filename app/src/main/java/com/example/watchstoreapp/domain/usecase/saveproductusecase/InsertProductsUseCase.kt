package example.watchstoreapp.domain.usecase.saveproductusecase

import example.watchstoreapp.data.repository.Repository
import example.watchstoreapp.domain.model.ProductItem


class InsertProductsUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(products: List<ProductItem>) = repository.insertProducts(products)

}