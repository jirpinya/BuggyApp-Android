package scb.academy.jinglebell.fragment


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_regis.view.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.WelcomeActivity

class RegisFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val _view = inflater.inflate(R.layout.fragment_regis, container, false)

        _view.register.setOnClickListener {
            val name = _view.name.text.toString()
            val intent = Intent(activity, WelcomeActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
        return _view
    }


}
