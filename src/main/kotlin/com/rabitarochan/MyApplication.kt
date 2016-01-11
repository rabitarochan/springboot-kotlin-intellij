package com.rabitarochan

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class MyApplication {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(MyApplication::class.java, *args)
        }
    }

}