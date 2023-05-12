package example.watchstoreapp.domain.usecase.deletecartusecase

import example.watchstoreapp.data.repository.Repository
import example.watchstoreapp.domain.model.ProductItem


class DeleteCartUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productItem: ProductItem) = repository.deleteCart(productItem)

}