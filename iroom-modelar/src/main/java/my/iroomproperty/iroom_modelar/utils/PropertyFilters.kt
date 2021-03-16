package my.iroomproperty.iroom_modelar.utils

/**
 * @project :      Star Property
 * @version :      1.0
 * @author :       Mahdi <mahdico@gmail.com>
 **/
class PropertyFilters {

    companion object {

        const val SHORT_TERM = "Short Term"
        const val ROOM_RENTAL = "Room"

        fun getCategory(): ArrayList<String> {
            var catList = arrayListOf<String>()
            catList.add("Room")
            catList.add("Short Term")
            //catList.add("Room Rental")
            //catList.add("Short Term Stays")
            return catList
        }

        fun getCategoryValues(): ArrayList<String> {
            var catList = arrayListOf<String>()
            catList.add("room")
            catList.add("stays")
            //catList.add("room")
            //catList.add("short")
            return catList
        }

        fun getStatus(): ArrayList<String> {
            var catList = arrayListOf<String>()
            catList.add("Published")
            catList.add("Draft")
            catList.add("Pending")
            catList.add("Pause")
            catList.add(("Declined"))
            catList.add(("Suspended"))
            catList.add(("Expired"))
            catList.add(("Archived"))
            //catList.add("Top Performing")
            //catList.add("Lowest Viewed")
            return catList
        }

        fun getStatusValues(): ArrayList<String> {
            var catList = arrayListOf<String>()
            catList.add("active")
            catList.add("draft")
            catList.add("pending")
            //catList.add("room")
            //catList.add(STATUS_LOW)
            return catList
        }
    }
}