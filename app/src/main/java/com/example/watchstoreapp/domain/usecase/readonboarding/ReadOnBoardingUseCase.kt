package example.watchstoreapp.domain.usecase.readonboarding

import example.watchstoreapp.data.repository.Repository

import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(private val repository: Repository) {

    operator fun invoke(): Flow<Boolean> = repository.readOnBoardingState()

}