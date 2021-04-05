package com.demo.scdp

import com.demo.scdp.service.UserServiceImpl
import spock.lang.Specification


class TestSpec extends Specification {

    def "should return name"() {
        println "************** Groovy Test **************"

        setup: "that temperature readings are within limits"
        UserServiceImpl userService = new UserServiceImpl()

        when: "we ask for the full name of the customer"
        def result = userService.buildFullName(name, lastName)

        then: "we get full name"
        result == fullName

        where: "some scenarios are"
        name     | lastName   || fullName
        "Ivan "  | "Ivanov"   || "Ivan Ivanov"
        "Denys " | "Sosuliev" || "Denys Sosuliev"
        "Ivan "  | "Petrov"   || "Ivan Petrov"
        "Test "  | "test"     || "Test test"

    }
}
