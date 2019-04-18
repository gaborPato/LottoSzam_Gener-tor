package model.interfaces

import kotlin.random.Random

interface LottoInterface {




    fun addSzelveny(userNumber:IntArray,lineNumber:Int,totalNumbOfLine:Int,lottedNumberOfLine:Int): Array<ArrayList<Int>?> {

        var valueFix=0
        for (i in 0 until userNumber.size){
            if(userNumber[i] in 1..totalNumbOfLine) {
                valueFix++

            }else userNumber[i]=0
        }


        val result: Array<ArrayList<Int>?> = arrayOfNulls(lineNumber)

        for (i in 0 until lineNumber){
            val set=HashSet<Int>()
            var j=valueFix
            while (j<lottedNumberOfLine){
                for (un:Int in userNumber ){
                    if(un>0 )
                        set.add(un)
                }
                if(set.add(Random.nextInt(totalNumbOfLine)+1))
                    j++
            }
            val list:ArrayList<Int> = ArrayList(set)
            list.sort()


            result[i]=list
        }
        return result
    }

}