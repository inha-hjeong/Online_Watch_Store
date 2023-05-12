package example.watchstoreapp.domain.usecase.searchproductusecase

import example.watchstoreapp.data.repository.Repository


class SearchProductUseCase(
    private val repository: Repository
) {

    operator fun invoke(query: String) = repository.searchProduct(query)

}