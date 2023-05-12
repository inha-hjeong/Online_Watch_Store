package example.watchstoreapp.domain.usecase

import example.watchstoreapp.domain.usecase.addcartusecase.AddCartUseCase
import example.watchstoreapp.domain.usecase.deletecartusecase.DeleteCartUseCase
import example.watchstoreapp.domain.usecase.getallcartusecase.GetAllCartUseCase
import example.watchstoreapp.domain.usecase.getallproduct.GetAllProductUseCase
import example.watchstoreapp.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import example.watchstoreapp.domain.usecase.readonboarding.ReadOnBoardingUseCase
import example.watchstoreapp.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import example.watchstoreapp.domain.usecase.saveproductusecase.InsertProductsUseCase
import example.watchstoreapp.domain.usecase.searchproductusecase.SearchProductUseCase


data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val insertProductsUseCase: InsertProductsUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getSelectedProductUseCase: GetSelectedProductUseCase,
    val getAllProductUseCase: GetAllProductUseCase,
    val getAllCartUseCase: GetAllCartUseCase,
    val addCartUseCase: AddCartUseCase,
    val deleteCart: DeleteCartUseCase,
    val searchProductUseCase: SearchProductUseCase
)