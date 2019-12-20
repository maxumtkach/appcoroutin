import com.example.ncraftmediapost.dto.Coordinates
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dto.Post
import dto.PostType
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
  //  val list = listOf(
    //    Post(1, "Netology", "First post in our network!", 1566408240),
      //  Post(2, "Netology", created = 1566408240)

    val meetup = Post(
        1, "Netology", "First post in our network!", Coordinates(0.00, 0.00),
        0, 0, 0,
        "", "", "", true
    )

    val list = listOf(

        Post(    //post
            2, "Netology", "Kotlin", Coordinates(55.66, 00.00),
            1, 555, 599,
            "", "", "",
            true, PostType.POST
        ),
        Post(
            3, "Netology", "First REPOST in our network!", Coordinates(1.11, 9.99),
            10, 7, 5, "",
            "", "", true, PostType.REPOST
        ),
        Post(
            4, "Google",
            "Кто-то ждет дождя а кто-то - солнца. Узнай вероятность дождя на завтра спомощю Google Поиска",
            Coordinates(0.00, 0.00),
            2222, 111, 444,
            "Завтра опять будет дождь ?", "", "", true, PostType.ADVERTISING
        ),
        Post(
            5, "YouTube", "", Coordinates(0.00, 0.00),
            100, 133, 222,
            "", "", "", true, PostType.VIDEO
        )

       )
    println(Gson().toJson(list))

 val gson=  GsonBuilder().apply {
        setPrettyPrinting()
     serializeNulls()
    }.create()

    Files.write(Paths.get("./output.json"),gson.toJson(list).toByteArray(),StandardOpenOption.CREATE)
}






