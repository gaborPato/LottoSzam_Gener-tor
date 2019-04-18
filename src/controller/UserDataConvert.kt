package controller

object UserDataConvert {



    fun userDataCheck(userData:String):IntArray{

        val userIntArray = checkIntegrity(userData)
        if(userIntArray is IntArray)
            return userIntArray





        return IntArray(0)
    }

    private fun checkIntegrity(userData: String):Any{

        val result:Any

       try {
           val split = userData.split(",")

           if(split.size>5) return "error"

            result=IntArray(split.size)
           var i=0
           for (sp:String in split){
               val toint = sp.toInt()
               result[i++]=toint


           }
       }catch (e:Exception){
           return "error"
       }

        return result
    }
}