package els.cinemaapp

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class SectionPageAdapter (fm :FragmentManager) : FragmentPagerAdapter(fm)
{

    private val tabs:ArrayList<Fragment> = ArrayList()
    private val tabNames:ArrayList<String> = ArrayList()


    fun addTab( tab:Fragment,  tabName:String){

    tabs.add(tab)
    tabNames.add(tabName)

    }
    fun getTabName( position:Int):String{
        return tabNames.get(position)
    }

    override fun getItem( position: Int):Fragment{

        return tabs.get(position)
    }

    override fun getCount():Int{
        return tabs.size
    }



}