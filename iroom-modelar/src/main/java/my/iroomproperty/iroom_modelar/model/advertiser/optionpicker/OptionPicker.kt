package my.iroomproperty.iroom_modelar.model.advertiser.optionpicker

import java.io.Serializable

data class OptionPicker(

        val title: String = "",
        val selectButtonTitle: String = "",
        var selectedIndex: Int = 0,
        val options: ArrayList<String> = arrayListOf()
) : Serializable