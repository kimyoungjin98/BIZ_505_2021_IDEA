package com.callor.hello

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MainController {

    @ResponseBody
    @RequestMapping(value=["/"], method = [RequestMethod.GET])
    fun home():String{

        return "나는 코틀린 컨트롤러입니다"
    }

}