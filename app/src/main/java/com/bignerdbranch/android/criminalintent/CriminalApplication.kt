package com.bignerdbranch.android.criminalintent

import android.app.Application

class CriminalApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }

}