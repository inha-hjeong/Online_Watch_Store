package example.watchstoreapp.domain.usecase.getselectedproduct

import example.watchstoreapp.data.repository.Repository
import example.watchstoreapp.domain.model.ProductItem


class GetSelectedProductUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productId: Int): ProductItem {
        return repository.getSelectedProduct(productId = productId)
    }

}