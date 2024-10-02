package rise.tiao1.buut.user.domain

import rise.tiao1.buut.user.data.UserRepository
import javax.inject.Inject

/**
 * Use case class for deleting a user.
 *
 * This class is responsible for handling the business logic associated with deleting a user.
 *
 * @property userRepository Repository for user-related data operations.
 * @constructor Creates an instance of [DeleteUserUseCase].
 */
class DeleteUserUseCase @Inject constructor(private val userRepository: UserRepository) {

    /**
     * Deletes the specified user.
     *
     * @param user [User] object representing the user to be deleted.
     */
    suspend operator fun invoke(user: User): Unit {
        userRepository.deleteUser(user)
    }
}
