package com.oryzac.klinikapp.screen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.oryzac.klinikapp.R
import com.oryzac.klinikapp.adapter.ListDoctorsAdapter
import com.oryzac.klinikapp.model.ModelListDoctors
import java.util.ArrayList

class HomeDoctorsActivity : AppCompatActivity() {

    private var rv_list_doctors: RecyclerView? = null
    private var homeDoctorsAdapter : ListDoctorsAdapter? =null

    private var doctorsList = mutableListOf<ModelListDoctors>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctors)

        rv_list_doctors = findViewById(R.id.rv_list_doctors)
        doctorsList = ArrayList()
        homeDoctorsAdapter = ListDoctorsAdapter(this,doctorsList);
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this,1)
        rv_list_doctors!!.layoutManager = layoutManager
        rv_list_doctors!!.adapter = homeDoctorsAdapter

        prepareDataDoctors()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun prepareDataDoctors(){
        var itemDoctors = ModelListDoctors(
            R.drawable.dokter1,
            NamaDoctor = "Oryza Conseva",
            SpecsDoctor = "Dokter Bedah",
            JumlahReview = "120",
            JumlahRating = "5.0"
        )
        doctorsList.add(itemDoctors)
        itemDoctors = ModelListDoctors(
            R.drawable.dokter6,
            NamaDoctor = "Felisha Hardina",
            SpecsDoctor = "Dokter Kandungan",
            JumlahReview = "100",
            JumlahRating = "5.0"
        )
        doctorsList.add(itemDoctors)
        itemDoctors = ModelListDoctors(
            R.drawable.dokter3,
            NamaDoctor = "Humaira Elfi Putri",
            SpecsDoctor = "Dokter Umum",
            JumlahReview = "100",
            JumlahRating = "5.0"
        )
        doctorsList.add(itemDoctors)
        itemDoctors = ModelListDoctors(
            R.drawable.dokter4,
            NamaDoctor = "Calista Monica Alfi",
            SpecsDoctor = "Dokter Gigi",
            JumlahReview = "120",
            JumlahRating = "5.0"
        )
        doctorsList.add(itemDoctors)
        itemDoctors = ModelListDoctors(
            R.drawable.dokter5,
            NamaDoctor = "Salti Dilfani",
            SpecsDoctor = "Dokter Kulit",
            JumlahReview = "120",
            JumlahRating = "5.0"
        )
        doctorsList.add(itemDoctors)

        homeDoctorsAdapter!!.notifyDataSetChanged()
    }
}