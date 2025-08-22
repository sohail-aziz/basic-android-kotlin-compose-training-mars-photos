package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotoRepository
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() {

        runTest {
            val repository = NetworkMarsPhotoRepository(
                marsApiService = FakeMarsApiService()
            )

            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
    }
}