package controller

import model.Lotto6_45
import model.Lotto7_35
import java.util.*

object LottoService {

    val hatosLotto:(Int , IntArray) ->  Array<ArrayList<Int>?> ={mezo,userSzamok

    ->
        Lotto6_45().addSzelveny(lineNumber = mezo,
            userNumber = userSzamok,
            totalNumbOfLine = Lotto6_45().totalNumbOfLine,
            lottedNumberOfLine = Lotto6_45().lottedNumberOfLine)
    }
    val hetesLotto:(Int , IntArray) ->  Array<ArrayList<Int>?> ={mezo,userSzamok

        ->
        Lotto7_35().addSzelveny(lineNumber = mezo,
            userNumber = userSzamok,
            totalNumbOfLine = Lotto7_35().totalNumbOfLine,
            lottedNumberOfLine = Lotto7_35().lottedNumberOfLine)
    }
    fun getSzelveny(m:Int,sz:IntArray,action: (Int,IntArray)->Array<ArrayList<Int>?>): Array<ArrayList<Int>?> {

        return action(m,sz)
    }
}