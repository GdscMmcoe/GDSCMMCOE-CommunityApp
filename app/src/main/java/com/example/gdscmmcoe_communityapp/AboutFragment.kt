package com.example.gdscmmcoe_communityapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gdscmmcoe_communityapp.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_about, container, false)
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fun openLink(url : String) {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
        binding.instaLink.setOnClickListener{
            openLink("https://instagram.com/gdsc_mmcoe?utm_medium=copy_link")
        }

        binding.LinkedinLink.setOnClickListener{
            openLink("https://www.linkedin.com/in/gdsc-mmcoe-b1065b21b")
        }
        binding.youtubeLink.setOnClickListener{
            openLink("https://youtube.com/channel/UCLwzfI-P_ommZ_QMDGECmYQ")
        }
        binding.webBtn.setOnClickListener{
            openLink("https://gdscmmcoe.netlify.app")
        }
        binding.memberbtn.setOnClickListener{
            openLink("https://gdsc.community.dev/marathwada-mitra-mandals-college-of-engineering-pune/")
        }
    }

}