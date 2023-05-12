package example.watchstoreapp.domain.usecase.getallcartusecase

import example.watchstoreapp.data.repository.Repository
import example.watchstoreapp.domain.model.ProductItem
import kotlinx.coroutines.flow.Flow

class GetAllCartUseCase(
    private val repository: Repository
) {

    operator fun invoke(isCart: Boolean): Flow<List<ProductItem>> =
        repository.getAllProductCart(isCart)

}