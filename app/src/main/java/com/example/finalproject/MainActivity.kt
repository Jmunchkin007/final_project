package com.example.finalproject

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.EditText
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import kotlin.Unit as Unit1

private fun Any.onCreate(savedInstanceState: Bundle?) {

}

open class ComponentActivity {

}

@Suppress("UNUSED_EXPRESSION", "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE", "NAME_SHADOWING")
class MainActivity() : ComponentActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    private fun enableEdgeToEdge() {
        TODO("Not yet implemented")
    }

    private fun setContentView(activityMain: Any) {
        TODO("Not yet implemented")
    }

    private fun LinearLayout() {
        TODO("Not yet implemented")
    }

    private fun padding(): Any {

        return TODO("Provide the return value")
    }

    private fun Button(): String {
        TODO("Not yet implemented")
    }

    private fun TextView(): String {

        return TODO("Provide the return value")
    }

    private fun TableRow(): String {
        TODO("Not yet implemented")
    }

    private fun TableLayout() {
        TODO("Not yet implemented")
    }

    private fun EditText() {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    @Composable
    fun onCreate(savedInstanceState: Bundle?) {
        open class super; onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main); }
}

