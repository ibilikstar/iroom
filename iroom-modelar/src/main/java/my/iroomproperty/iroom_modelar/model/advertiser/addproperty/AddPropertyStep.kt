package my.iroomproperty.iroom_modelar.model.advertiser.addproperty

import com.google.gson.annotations.SerializedName

data class AddPropertyStep(

        @field:SerializedName("stepName")
        val stepName: String? = "",

        var showRightImage: Boolean = true,
        var isStepCompleted: Boolean = false,
        var isStepAccessible:Boolean = false,
        val stepAction: () -> Unit
)