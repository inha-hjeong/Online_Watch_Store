package example.watchstoreapp.domain.usecase.getallproduct

import example.watchstoreapp.data.repository.Repository
import example.watchstoreapp.domain.model.ProductItem
import kotlinx.coroutines.flow.Flow

class GetAllProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<List<ProductItem>> = repository.getAllProduct()

}