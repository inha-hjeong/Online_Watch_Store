package example.watchstoreapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import example.watchstoreapp.data.repository.OnBoardingOperationImpl
import example.watchstoreapp.data.repository.Repository
import example.watchstoreapp.domain.repository.OnBoardingOperations
import example.watchstoreapp.domain.usecase.UseCases
import example.watchstoreapp.domain.usecase.addcartusecase.AddCartUseCase
import example.watchstoreapp.domain.usecase.deletecartusecase.DeleteCartUseCase
import example.watchstoreapp.domain.usecase.getallcartusecase.GetAllCartUseCase
import example.watchstoreapp.domain.usecase.getallproduct.GetAllProductUseCase
import example.watchstoreapp.domain.usecase.getselectedproduct.GetSelectedProductUseCase
import example.watchstoreapp.domain.usecase.readonboarding.ReadOnBoardingUseCase
import example.watchstoreapp.domain.usecase.saveonboarding.SaveOnBoardingUseCase
import example.watchstoreapp.domain.usecase.saveproductusecase.InsertProductsUseCase
import example.watchstoreapp.domain.usecase.searchproductusecase.SearchProductUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperation(
        @ApplicationContext context: Context
    ): OnBoardingOperations = OnBoardingOperationImpl(context = context)

    @Provides
    @Singleton
    fun provideUseCase(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            insertProductsUseCase = InsertProductsUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getSelectedProductUseCase = GetSelectedProductUseCase(repository),
            getAllProductUseCase = GetAllProductUseCase(repository),
            getAllCartUseCase = GetAllCartUseCase(repository),
            addCartUseCase = AddCartUseCase(repository),
            deleteCart = DeleteCartUseCase(repository),
            searchProductUseCase = SearchProductUseCase(repository)
        )
    }

}