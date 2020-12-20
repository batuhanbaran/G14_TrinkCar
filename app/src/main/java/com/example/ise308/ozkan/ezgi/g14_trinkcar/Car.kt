package com.example.ise308.ozkan.ezgi.g14_trinkcar

import android.media.Image
import java.util.*

class Car {
    private var car2 = Car()

    var modelName: String? = null
    var brandName: String? = null
    var fuelType: String? = null
    var km: Double? = null
    var price: Double? = null
    var color: String? = null
    var listingDate: Date? = null
    var status: Boolean? = null
    var image: Image? = null
    var transmission : String? = null
    var gearType : String? = null


    fun createNewNote() {

        print(this.brandName + "brand")

    }


}