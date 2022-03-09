package com.zeroheat.zeroheatapp.utils

import org.json.JSONObject

class ServerUtil {

    interface JsonResponseHandler {
        fun onResponse(jsonObj:JSONObject)
    }

    companion object{
        private val Base_URL = "http://54.180.52.26"
    }


}