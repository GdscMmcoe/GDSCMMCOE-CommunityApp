package com.example.gdscmmcoe_communityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.coroutineScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gdscmmcoe_communityapp.adapter.TeamAdapter
import com.example.gdscmmcoe_communityapp.databinding.TeamFragmentBinding
import com.example.gdscmmcoe_communityapp.viewmodel.TeamPageViewModelFactory
import com.example.gdscmmcoe_communityapp.viewmodel.TeamViewModel
import kotlinx.coroutines.launch

class TeamFragment : Fragment() {

    private var _binding: TeamFragmentBinding? = null

    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    private val teamAdapter: TeamAdapter by lazy { TeamAdapter() }


    //private lateinit var viewModel: TeamViewModel
    private val viewModel: TeamViewModel by activityViewModels {
        TeamPageViewModelFactory(
            (activity?.application as TeamApplication).database.teamDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TeamFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = binding.rvTeam
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = teamAdapter

        lifecycle.coroutineScope.launch {
            viewModel.teamPage().observe(viewLifecycleOwner) {
                teamAdapter.setData(it)
            }
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}