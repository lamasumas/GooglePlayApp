package els.cinemaapp

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import android.widget.*
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.util.logging.Logger
import kotlin.math.log
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.widget.DrawerLayout
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.AdapterView




class MainActivity : AppCompatActivity() {

    var mDrawerLayout:DrawerLayout ?= null;
    var mDrawerList:ListView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stringList = arrayOf<String>("Test1","Test2")
        mDrawerLayout = findViewById(R.id.drawer_layout)
        mDrawerList != findViewById(R.id.list_drawer)
        mDrawerList.adapter = ArrayAdapter<String>(this, R.id.list_drawer, stringList)

        mDrawerList.onItemClickListener(object: AdapterView.OnItemClickListener{

            override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            }


        })
        // (findViewById(R.id.btnSearch) as Button).setOnClickListener{ view -> onSearchClick()}
        val policy:StrictMode.ThreadPolicy =StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy);



    }


/*
    fun onSearchClick( ) {

        val etSearch: EditText = findViewById(R.id.etSearch)
        var movieToSearch = etSearch.text;

        var url = "http://www.omdbapi.com/?apikey=74ca08b7&type=movie&t=" + movieToSearch;
        var connection = URL(url).openConnection()
        var newThread = threadMovieClass(connection, this )
        newThread.run()







    }

    fun printOnScreen( json:JSONObject, image:Bitmap)
    {
        val tvInfo: TextView = findViewById(R.id.tvInfo)
        var title = json["Title"]
        var director = json["Director"]
        tvInfo.setText("Title: " + title +"\nDirector: "+director)
        val imageView: ImageView = ImageView(this)
        imageView.setImageBitmap(image)
        val layout : LinearLayout = findViewById(R.id.rowMenu)
        layout.addView(imageView)

    }*/


    private class DrawerItemClickListener (fragmentManager: FragmentManager): AdapterView.OnItemClickListener
    {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            selectItem(position)
        }


        fun selectItem(position: Int)
        {
            var fragment = TestFragment()


        }


    }




}
