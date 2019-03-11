package els.cinemaapp

import android.graphics.BitmapFactory
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLConnection

class threadMovieClass (val connection:URLConnection, val mainThread:MainActivity) : Thread()
{

    override fun run() {
        super.run()
        var json = JSONObject(connection.getInputStream().bufferedReader().readText())
        var urlPicture = json.get("Poster").toString()
        var imageConnection = URL(urlPicture).openConnection()
        var imageStram = imageConnection.getInputStream()
        var finalImage = BitmapFactory.decodeStream(imageStram)




       // mainThread.printOnScreen(json, finalImage)





    }

}