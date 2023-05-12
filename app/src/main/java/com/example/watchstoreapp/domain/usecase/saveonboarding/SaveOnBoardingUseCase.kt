package example.watchstoreapp.domain.usecase.saveonboarding

import example.watchstoreapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(isCompleted: Boolean) {
        repository.saveOnBoardingState(isCompleted = isCompleted)
    }

}