package my.iroomproperty.iroom_modelar.model.user

class ChatRoomDetails {

    var agentId: String? = null
    var agentName: String? = null
    var agentEmail: String? = null
    var agentPhoto: String? = null
    var propertyId: String? = null
    var propertyName: String? = null
    var propertyImage: String? = null
    var propertyPrice: String? = null

    constructor(
        agentId: String?,
        agentName: String?,
        agentEmail: String?,
        agentPhoto: String?,
        propertyId: String?,
        propertyName: String?,
        propertyImage: String?,
        propertyPrice: String?
    ) {
        this.agentId = agentId
        this.agentName = agentName
        this.agentEmail = agentEmail
        this.agentPhoto = agentPhoto
        this.propertyId = propertyId
        this.propertyName = propertyName
        this.propertyImage = propertyImage
        this.propertyPrice = propertyPrice
    }
}