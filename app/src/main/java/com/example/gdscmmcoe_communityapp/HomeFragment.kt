package com.example.gdscmmcoe_communityapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gdscmmcoe_communityapp.adapter.DashboardAdapter
import com.example.gdscmmcoe_communityapp.databinding.FragmentHomeBinding
import com.example.gdscmmcoe_communityapp.models.DashboardModel
import com.example.gdscmmcoe_communityapp.utils.dashboard_constants


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private var dashboardList: MutableList<DashboardModel>? = null
    private var dashboardAdapter: DashboardAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivLiveEvent.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSegjk5b2irDm00K_0FpBMZJakg1G-cHFKyYSZ9d_R0YfyKucw/alreadyresponded"))
            startActivity(browserIntent)
        }

        binding.tvViewPastEvents.setOnClickListener{
            val viewEventsIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://gdsc.community.dev/marathwada-mitra-mandals-college-of-engineering-pune/"))
            startActivity(viewEventsIntent)
        }

        dashboardList = dashboard_constants.defaultDashboardList()

        // Set the adapter
        recyclerView = binding.rvPastEvents
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        dashboardAdapter = DashboardAdapter(dashboardList!!)
        recyclerView.adapter = dashboardAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}