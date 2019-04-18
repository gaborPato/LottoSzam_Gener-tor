package view

import controller.LottoService
import controller.UserDataConvert
import model.Lotto6_45
import model.Lotto7_35
import java.util.*

fun main(args: Array<String>) {

    //valtozok
    var mezoOk=false

    var mezo=0
    var szamok: IntArray

    //parameteres inditasa:
    val argsStart = argsStart(args)


    //megjatsott sorok szamanak bekerese:
    val sc=Scanner(System.`in`)
    while (!mezoOk){
        println("mezok szama:")
        val mezoString=sc.nextLine()
        try {
            mezo=mezoString.toInt()
            if (mezo>0 ) mezoOk=true
            else println("pozitiv kell")
        }catch (e:Exception){
            println("nem szamot irtal")
        }
    }

//fix szamok bekerese:

do {

    println("fix szamok vesszővel elválasztva(Maximum 5 darab):")
    println()
    val nextLine:String = sc.nextLine()
     szamok = UserDataConvert.userDataCheck(nextLine)//hiba esetén úres IntArray

    if(szamok.isEmpty())
        println("Valamit elkurtál szépöcsém \n pelda:12,34,44")
    else break

}while (true)
    sc.close()


    var lottoSor: Array<ArrayList<Int>?>// = arrayOfNulls(mezo)
    lottoSor = when (argsStart) {
        "6" -> LottoService.getSzelveny(mezo,szamok,LottoService.hatosLotto) //Lotto6_45().addSzelveny(lineNumber = mezo, userNumber = szamok)
        else -> LottoService.getSzelveny(mezo,szamok,LottoService.hetesLotto)//Lotto7_35().addSzelveny(lineNumber = mezo,userNumber = szamok)

    }




    for (sz in lottoSor){
        println(sz)
    }
}

fun argsStart(param: Array<String>):String {
    println(param[0])
    if(param.isEmpty()){
        println("nincs parameter \n" +
                "Use \"6\" or \"7\"\n" +
                ".....exit")
        System.exit(0)
    }
    if( !param[0].equals("6") && !param[0].equals("7")){
         println("hibas parameter.. \nUse \"6\" or \"7\"\n.....exit")
        System.exit(0)
        return ""
    }
    return param[0]


}



