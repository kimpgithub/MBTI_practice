package com.example.mbti_practice

abstract class MBTI(val type: String) {
    abstract fun describeCharacteristics()

}
class Analysts(type: String) : MBTI(type) {
    override fun describeCharacteristics() {
        println("**$type**형은 논리적이고 분석적인 사고방식을 가지고 있으며, 문제 해결 능력과 객관적인 판단력에 뛰어납니다.")
    }
}
class Diplomats(type: String) : MBTI(type) {
    override fun describeCharacteristics() {
        println("**$type**형은 따뜻하고 유연하며, 사람들과의 관계 형성에 능숙하고, 협력과 소통을 중요시합니다.")
    }
}
class Sentinels(type: String) : MBTI(type) {
    override fun describeCharacteristics() {
        println("**$type**형은 현실적이고 실용적인 사고방식을 가지고 있으며, 계획과 조직에 능숙하고, 안정과 질서를 중요시합니다.")
    }
}
class Explorers(type: String) : MBTI(type) {
    override fun describeCharacteristics() {
        println("**$type**형은 창의적이고 독립적인 사고방식을 가지고 있으며, 새로운 경험과 가능성을 추구하고, 변화와 유연성을 중요시합니다.")
    }
}
fun main() {
    val mbtiList = arrayOf(
        Analysts("INTJ"),
        Diplomats("ENFP"),
        Sentinels("ISTJ"),
        Explorers("ENTP")
    )

    for (mbti in mbtiList) {
        println("**${mbti.type}**")
        mbti.describeCharacteristics()
        println()
    }
}
