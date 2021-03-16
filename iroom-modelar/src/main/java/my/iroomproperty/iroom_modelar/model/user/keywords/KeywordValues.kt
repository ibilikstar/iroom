package my.iroomproperty.iroom_modelar.model.user.keywords

class KeywordValues {

    var title: String = ""
    var subTitle: String = ""
    var category: String = ""
    var latitude: String = ""
    var longitude: String = ""
    var areaIds: String = ""
    var propertyTerm: String = ""
    var locationTerm: String = ""
    var orSearch: Boolean = false
    var locationId: String = ""
    var propertyId: String = ""

    constructor(title: String, subTitle: String, category: String, orSearch: Boolean) {
        this.title = title
        this.subTitle = subTitle
        this.category = category
        this.orSearch = orSearch
    }

    constructor(
        title: String,
        subTitle: String,
        category: String,
        latitude: String,
        longitude: String,
        orSearch: Boolean
    ) {
        this.title = title
        this.subTitle = subTitle
        this.category = category
        this.latitude = latitude
        this.longitude = longitude
        this.orSearch = orSearch
    }

    constructor(
        title: String,
        subTitle: String,
        category: String,
        latitude: String,
        longitude: String,
        locationId: String,
        propertyId:String,
        orSearch: Boolean
    ) {
        this.title = title
        this.subTitle = subTitle
        this.category = category
        this.latitude = latitude
        this.longitude = longitude
        this.orSearch = orSearch
        this.locationId = locationId
        this.propertyId = propertyId
    }

    constructor(
        title: String,
        subTitle: String,
        category: String,
        propertyId: Int) {
        this.title = title
        this.subTitle = subTitle
        this.category = category
        this.propertyId = propertyId.toString()
    }

    constructor(
        title: String,
        subTitle: String,
        category: String,
        orSearch: Boolean,
        areaIds: String,
        propertyTerm: String,
        locationTerm: String,
        lat: String,
        lng: String,
        locationId: String,
        propertyId: String
    ) {
        this.title = title
        this.subTitle = subTitle
        this.category = category
        this.orSearch = orSearch
        this.areaIds = areaIds
        this.propertyTerm = propertyTerm
        this.locationTerm = locationTerm
        this.latitude = lat
        this.longitude = lng
        this.propertyId = propertyId
        this.locationId = locationId
    }
}