package com.delta.security.model

import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern

@Entity
@Document(collection = "user")
class User {

    @Id
     var id: String? = null


    @field:NotEmpty
    @field:NotNull
    @field:Pattern(regexp = "[a-z][A-Z]*", message = "Only lower case first name")
     var fullName: String? = null

     var organization: String? = null
    @field:NotEmpty
     var username: String? = null
    @field:NotEmpty
    var mobile: String? = null

    @field:NotEmpty
    var password: String? = null

     var isAdmin = false

    constructor(){
    }

    constructor(
        id: String?, fullName: String?, organization: String?, username: String?, mobile: String?, password: String?,
        isAdmin: Boolean
    ) {

        this.id = id
        this.fullName = fullName
        this.organization = organization
        this.username = username
        this.mobile = mobile
        this.password = password
        this.isAdmin = isAdmin
    }
}