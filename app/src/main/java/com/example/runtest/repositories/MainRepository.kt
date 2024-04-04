package com.example.runtest.repositories

import com.example.runtest.db.Run
import com.example.runtest.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(val runDao: RunDao) {

    suspend fun insertRun(run: Run){
        runDao.insertRun(run)
    }
    suspend fun deleteRun(run: Run){
        runDao.deleteRun(run)
    }
    fun getAllRunsSortedByTimeInMillis(){
        runDao.getAllRunsSortedByDate()
    }
    fun getAllRunsSortedByCaloriesBurned(){
        runDao.getAllRunsSortedByDate()
    }
    fun getAllRunsSortedByAvgSpeed(){
        runDao.getAllRunsSortedByAvgSpeed()
    }
    fun getAllRunsSortedByDistance(){
        runDao.getAllRunsSortedByDistance()
    }
    fun getTotalTimeInMillis(){
        runDao.getTotalTimeInMillis()
    }
    fun getTotalCaloriesBurned(){
        runDao.getTotalCaloriesBurned()
    }
    fun getTotalDistance(){
        runDao.getTotalDistance()
    }
    fun getTotalAvgSpeed(){
        runDao.getTotalAvgSpeed()
    }

}