package example.watchstoreapp.domain.usecase.addcartusecase

import example.watchstoreapp.data.repository.Repository
import example.watchstoreapp.domain.model.ProductItem

class AddCartUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(productItem: ProductItem) = repository.addCart(productItem)

}