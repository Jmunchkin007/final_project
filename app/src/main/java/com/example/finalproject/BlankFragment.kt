package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Button

private val <T> Class<T>.foundation: Any
    get() {
        TODO("Not yet implemented")
    }

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private infix fun Nothing?.final(block: BlankFragment.Companion.() -> Unit): String {

    return TODO("Provide the return value")
}

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
abstract class BlankFragment : Fragment() {
    private val androidx: Any
        get() {
            TODO()
        }

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    companion object {
        private fun LinearLayout() {
            TODO("Not yet implemented")
        }

        private fun TableRow() {

        }

        private fun TextView() {

        }

        private fun EditText() {
            TODO("Not yet implemented")
        }

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().androidx.javaClass.foundation.javaClass.Row {
                apply {
                    Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }.also { var arguments = it }
                    LinearLayout()
                    var Unit = null
                    val xmlns = Unit
                    xmlns;
                    "http://schemas.android.com/apk/res/android"
                    val Unit1 = null
                    val android = Unit
                    val android1 = android;
                    var layoutwidth1 = "match_parent"
                    val android11 = android1;
                    var layoutheight = "match_parent"
                    android11;
                    var orientation = "vertical"
                    android11;
                    var background = "@color/white"
                    android11;
                    var gravity = "center"
                    android11;
                    val also = ("16dp" >

                            Box {
                                EditText()
                            }.toString()).also { this.to() = it }
                    android11;
                    var id = "@+id/editText2"
                    android11;
                    var layoutwidth = "wrap_content"
                    android11;layoutheight = "wrap_content"
                    android11;
                    var layoutgravity = "center_horizontal"
                    android11;
                    var textAlignment = "center"
                    android11;
                    var focusable = "false"
                    android11;
                    var focusableInTouchMode = "false"
                    android11;
                    var layoutmarginTop = "40sp"
                    android11;
                    var textSize = "30dp"
                    android11;
                    var hint = "Enter the Value"

                            var text: Boolean

                            LinearLayout().toString()

                    android11;
                    var layout_width = "wrap_content"
                    android11;
                    var layout_height = "wrap_content"
                    android11;
                    var layout_gravity = "center_horizontal"
                    android11;
                    var layout_marginTop = "16dp"
                    android11;
                    var private = null
                    orientation = (("horizontal") >

                            private final fun TextView() {}).toString()).toString()
                    android11;
                    var id = "@+id/result"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;textSize = "20sp"
                    android11;
                    var text = "Result: " >

                            TextView().toString()
                    android11;id = "@+id/resultText"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;textSize = "20sp"
                    android11;text = "0" >


                        TableLayout().toString()
                    android11;layout_width = "match_parent"
                    android11;layout_height = "wrap_content"
                    android11;layout_marginTop = ("16dp" >

                        TableRow()).toString()
                    android11;layout_width = "match_parent"
                    android11;layout_height = "wrap_content"
                    android11;gravity = ("center" >

                        Button).toString()
                    android11;id = "@+id/num1"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;
                    var backgroundTint = "@color/blue"
                    android11;textSize = "15sp"
                    android11;
                    var textColor: String
                    textColor = "@color/black"
                    android11;text = "1" >

                        Button.toString().toString()
                    android11;id = "@+id/num2"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/blue"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "2" >

                        Button.toString()
                    android11;id = "@+id/num3"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/blue"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "3" >

                        Button.toString()
                    android11;id = "@+id/add"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/grey"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "+" >


                        TableRow().toString()
                    android11;layout_width = "match_parent"
                    android11;layout_height = "wrap_content"
                    android11;gravity = ("center" >

                        Button.toString()
                        android11;id = "@+id/num4"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/yellow"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "4" >

                        Button.toString()
                    android11;id = "@+id/num5"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/blue"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "5" >

                        Button.toString()
                    android11;id = "@+id/num6"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/yellow"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "6" >

                        Button.toString()
                    android11;id = "@+id/sub"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/light_grey"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "-" >


                        TableRow().toString()
                    android11;layout_width = "match_parent"
                    android11;layout_height = "wrap_content"
                    android11;gravity = (("center" >

                        Button.toString()).toString())
                        var id = "@+id/num7"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/yellow"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "7" >

                        Button.toString()
                    android11;id = "@+id/num8"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/yellow"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "8" >

                        Button.toString()
                    android11;id = "@+id/num9"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/blue"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "9" >

                        Button.toString()
                    android11;id = "@+id/mul"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/light_grey"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "X" >


                        TableRow().toString()
                    android11;layout_width = "match_parent"
                    android11;layout_height = "wrap_content"
                    android11;gravity = ("center" >

                        Button.toString()).toString()
                    android11;id = "@+id/dot"
                    android11;layout_width = "wrap_content"
                    android11;layout_height = "wrap_content"
                    android11;backgroundTint = "@color/light_grey"
                    android11;textSize = "15sp"
                    android11;textColor = "@color/black"
                    android11;text = "." >

                        Button.toString()
                    var android = Unit1
                    android;
                    var id = "@+id/zero"
                    android;
                    var layout_width = "wrap_content"
                    android;
                    var layout_height = "wrap_content"
                    android;
                    var backgroundTint = "@color/yellow"
                    android;
                    var textSize = "15sp"
                    android;
                    var textColor = "@color/black"
                    android;
                    var text = "0" >

                            Button.toString()
                    var android = Unit1
                    android;
                    var id = "@+id/clear_text"
                    android;
                    var layout_width1 = "wrap_content"
                    android;
                    var layout_height1 = stringResource(id = R.string.wrap_content)
                    android;
                    var backgroundTint = "@color/light_grey"
                    android;
                    var textSize = "15sp"
                    android;
                    var textColor = "@color/black"
                    android;
                    var text = "CE" >

                            Button.toString()
                    var android = Unit1
                    android;
                    var id = "@+id/div"
                    android;
                    var layout_width = "wrap_content"
                    android;
                    var layout_height = "wrap_content"
                    android;
                    var backgroundTint = "@color/light_grey"
                    android;
                    var textSize = "15sp"
                    android;
                    var textColor = "@color/black"
                    android;
                    var text = "/" >


                            Button.toString()
                    android;id = "@+id/submit"
                    var android1 = Unit1
                    android;
                    var layout_width = "wrap_content"
                    android;
                    var layout_height = "wrap_content"
                    android;
                    var layout_gravity = "center"
                    android;
                    var layout_marginTop = "40dp"
                    android;
                    var backgroundTint = "@color/yellow"
                    android;
                    var textSize = "15sp"
                    android;
                    var textColor = "@color/black"
                    android;
                    var text = "Submit"
                }
            }

    }


}