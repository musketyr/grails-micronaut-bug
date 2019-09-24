package grailsapp

import mnlib.SomeService

class BootStrap {

    SomeService someService

    def init = { servletContext ->
        println "SomeService: $someService"
        someService.doSomething()
    }
    def destroy = {
    }
}
