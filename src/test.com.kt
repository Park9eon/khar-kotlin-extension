
fun main(vararg args: String) {
    ('가'..'힣').forEach {
        println("$it : ${it.splitKorean()}")
    }
//    lorenIpsum.forEach {
//        if (it.toInt() in KOREAN_FIRST_CODE..KOREAN_LAST_CODE) {
//            val consonant = KOREAN_CONSONANT_TABLE[getKoreanIndexConsonant(it)]
//            val vowel = KOREAN_VOWEL_TABLE[getKoreanIndexVowel(it)]
//            val batchim = KOREAN_CONSONANT_TABLE.getOrElse(getKoreanIndexBatchim(it)) { ' ' }
//            println("$it : $consonant, $vowel, $batchim")
//        }
//    }
}

val lorenIpsum = """
이성은 구하지 위하여, 하는 투명하되 쓸쓸하랴? 속에서 인생을 청춘을 청춘의 할지니, 작고 구하기 사랑의 사막이다. 고동을 가치를 이성은 때에, 피어나기 청춘 않는 보배를 그들의 봄바람이다. 우리 있는 없으면, 끓는 청춘의 봄바람이다. 꾸며 날카로우나 없으면, 것이 이상 할지니, 스며들어 것이다. 든 설레는 지혜는 앞이 아니한 보라. 있는 아니한 그들은 품고 주며, 작고 청춘을 것이다. 구하지 너의 내는 것이다. 뭇 새가 못할 풍부하게 우리 뿐이다.

돋고, 인도하겠다는 사랑의 더운지라 같지 있다. 위하여 가치를 것은 천자만홍이 있을 것이다. 대한 피에 반짝이는 그들의 무엇을 사막이다. 반짝이는 역사를 아름답고 이는 청춘 위하여서 그들에게 황금시대를 우리의 말이다. 천지는 꽃 살 할지라도 놀이 할지니, 별과 가치를 사막이다. 봄날의 속잎나고, 피부가 대중을 일월과 산야에 간에 있는 사랑의 때문이다. 가는 피고, 얼마나 되려니와, 그들에게 봄바람이다. 그들은 곳으로 그들은 목숨을 같지 무엇을 싸인 교향악이다. 불어 거친 같지 곳이 힘있다. 천고에 이 이것이야말로 전인 몸이 일월과 그들에게 이상이 가지에 것이다.

길을 구할 과실이 그림자는 심장의 가지에 풍부하게 고행을 쓸쓸하랴? 청춘에서만 그들은 하였으며, 하는 방지하는 얼마나 인생을 청춘의 힘있다. 쓸쓸한 갑 시들어 이것이다. 바로 관현악이며, 과실이 않는 그들에게 꾸며 실현에 넣는 아름다우냐? 봄바람을 고행을 있는 전인 광야에서 길을 심장은 그와 착목한는 교향악이다. 안고, 품으며, 끓는 구하지 이성은 쓸쓸한 투명하되 위하여서 피는 것이다. 무엇을 풀이 아니한 생생하며, 꾸며 사람은 같은 우리 청춘은 사막이다. 되는 목숨을 인간의 어디 방황하여도, 어디 동산에는 가는 위하여서. 뼈 이것이야말로 없으면 그들에게 그러므로 때에, 새 사막이다. 피어나는 동력은 용기가 보는 인간의 인도하겠다는 천지는 청춘이 꽃 있다. 있음으로써 바로 실로 바이며, 있는가?

기관과 피가 청춘 위하여, 피어나기 그리하였는가? 그것을 커다란 가장 있으랴? 인생을 꽃 보내는 그들의 거친 위하여, 풀밭에 황금시대의 위하여서. 그들을 우리 생명을 눈이 꽃 내려온 용감하고 바이며, 부패뿐이다. 눈에 사랑의 불어 위하여, 쓸쓸하랴? 두손을 이것은 곳이 것은 끓는 목숨을 보배를 일월과 목숨이 있으랴? 때까지 넣는 뛰노는 긴지라 그들의 열락의 예가 그러므로 것이다. 쓸쓸한 이상의 가치를 같은 못할 운다. 얼음 장식하는 놀이 것이다. 그들은 온갖 사는가 아니다.

현저하게 품으며, 품에 이것을 눈에 청춘에서만 얼음에 실현에 위하여서. 열매를 있을 무엇을 심장의 간에 얼마나 새 방황하여도, 철환하였는가? 인생을 거선의 기쁘며, 별과 그들의 청춘에서만 위하여, 위하여서. 천고에 대중을 끓는 용기가 그들은 피어나기 두기 때문이다. 그들에게 과실이 눈에 풀밭에 위하여, 있으랴? 우리 풀이 가진 용감하고 끝에 교향악이다. 인간의 거선의 심장의 것이다. 가슴이 소리다.이것은 뜨거운지라, 위하여서, 청춘이 뜨고, 살 풀밭에 그리하였는가? 발휘하기 기관과 고행을 무한한 웅대한 힘있다.

찾아다녀도, 하여도 사랑의 불어 가치를 거친 옷을 아니다. 오아이스도 있는 기관과 것은 자신과 현저하게 따뜻한 것은 있으랴? 봄날의 천지는 청춘은 부패뿐이다. 평화스러운 따뜻한 몸이 사는가 그것을 하여도 소금이라 거선의 이것이다. 기쁘며, 생의 피어나기 천하를 보라. 무한한 가진 속잎나고, 아니더면, 되려니와, 기관과 영원히 되는 끓는 황금시대다. 가슴에 열락의 인간의 있는 길을 작고 끝에 황금시대의 이것이다. 커다란 영락과 설레는 인간의 튼튼하며, 쓸쓸한 거친 위하여서. 인생에 청춘 인생에 무엇을 아니다. 얼마나 싶이 꽃 소리다.이것은 피가 그들의 되려니와, 것이다. 얼음과 되려니와, 힘차게 운다.

가치를 위하여 놀이 무엇을 거선의 위하여서, 작고 가진 우리 황금시대다. 보내는 현저하게 영원히 바이며, 있으랴? 인생을 온갖 대한 별과 위하여, 우리 이것이다. 생의 거친 무엇을 동산에는 이상 피에 이것이다. 과실이 노래하며 그것은 것이다. 설레는 열매를 그들은 하여도 아니한 자신과 품으며, 심장의 만천하의 듣는다. 행복스럽고 사는가 품었기 풍부하게 보이는 이것이다. 작고 이상은 열락의 것이다. 돋고, 것이다.보라, 더운지라 작고 트고, 뭇 꽃이 이것이다. 있는 바이며, 사라지지 얼마나 구하기 얼음과 사람은 가슴이 뿐이다. 튼튼하며, 타오르고 있는 커다란 이상은 반짝이는 이상은 보라.
"""

val KOREAN_CONSONANT_LIST: List<Char> = listOf('ㄱ','ㄲ','ㄴ','ㄷ','ㄸ','ㄹ','ㅁ','ㅂ','ㅃ','ㅅ','ㅆ','ㅇ','ㅈ','ㅉ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ')
val KOREAN_VOWEL_LIST: List<Char> = listOf('ㅏ','ㅐ','ㅑ','ㅒ','ㅓ','ㅔ','ㅕ','ㅖ','ㅗ','ㅘ','ㅙ','ㅚ','ㅛ','ㅜ','ㅝ','ㅞ','ㅟ','ㅠ','ㅡ','ㅢ','ㅣ')
val KOREAN_BATCHIM_LIST: List<Char?> = listOf(null, 'ㄱ','ㄲ','ㄳ','ㄴ','ㄵ','ㄶ','ㄷ','ㄹ','ㄺ','ㄻ','ㄼ','ㄽ','ㄾ','ㄿ','ㅀ','ㅁ','ㅂ','ㅄ','ㅅ','ㅆ','ㅇ','ㅈ', 'ㅊ','ㅋ','ㅌ','ㅍ','ㅎ')

val KOREAN_FIRST: Char = '가'
val KOREAN_LAST: Char = '힣'

// 자음 Index를 가져옴.
fun getKoreanIndexConsonant(korean: Char): Int = korean.toInt().let { koreanCode ->
    return koreanCode.minus(KOREAN_FIRST.toInt())
            .div(KOREAN_BATCHIM_LIST.size)
            .div(KOREAN_VOWEL_LIST.size)
}
// 모음 Index를 가져옴.
fun getKoreanIndexVowel(korean: Char): Int = korean.toInt().let { koreanCode ->
    return koreanCode.minus(KOREAN_FIRST.toInt())
            .div(KOREAN_BATCHIM_LIST.size)
            .rem(KOREAN_VOWEL_LIST.size)
}
// 받침 Index를 가져옴
fun getKoreanIndexBatchim(korean: Char): Int = korean.toInt().let { koreanCode ->
    return koreanCode.minus(KOREAN_FIRST.toInt())
            .rem(KOREAN_BATCHIM_LIST.size)
}

fun Char.splitKorean(): Triple<Char?, Char?, Char?>? {
    return if (this in KOREAN_FIRST..KOREAN_LAST) {
        val consonant = KOREAN_CONSONANT_LIST[getKoreanIndexConsonant(this)]
        val vowel = KOREAN_VOWEL_LIST[getKoreanIndexVowel(this)]
        val batchim = KOREAN_BATCHIM_LIST[getKoreanIndexBatchim(this)]
        return Triple(consonant, vowel, batchim)
    } else if (this in KOREAN_CONSONANT_LIST) {
        Triple(this, null, null)
    } else if (this in KOREAN_VOWEL_LIST) {
        Triple(null, this, null)
    } else if (this in KOREAN_BATCHIM_LIST) {
        Triple(null, null, this)
    } else {
        null
    }
}