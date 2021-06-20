package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val first = a.toUpperCase()
        var res=""
        var i=0
        var j=0
        while (i < a.length){
            if (first[i] == b[j]){
                res +=first[i]
                if (j != b.length-1)  j++ else break
            }
            i++
        }
        return if (res == b)  "YES" else "NO"
    }
}
