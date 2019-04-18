package model

import model.interfaces.LottoInterface


abstract class Lotto{

    abstract val totalNumbOfLine:Int
    abstract val lottedNumberOfLine:Int


}


class Lotto7_35(override val totalNumbOfLine: Int = 35,
                override val lottedNumberOfLine: Int = 7) :Lotto(),LottoInterface


class Lotto6_45(override val lottedNumberOfLine: Int = 6,
                override val totalNumbOfLine: Int=45 ) :Lotto(),LottoInterface
