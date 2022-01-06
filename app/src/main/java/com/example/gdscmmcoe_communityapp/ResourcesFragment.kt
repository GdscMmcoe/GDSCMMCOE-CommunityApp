package com.example.gdscmmcoe_communityapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gdscmmcoe_communityapp.adapter.ResourcesAdapter
import com.example.gdscmmcoe_communityapp.models.ResourcesModel
import com.example.gdscmmcoe_communityapp.utils.resources_constants

/**
 * A fragment representing a list of Items.
 */
class ResourcesFragment : Fragment() {

    //private var columnCount = 1
    private lateinit var recyclerView: RecyclerView
    private var resourcesList: MutableList<ResourcesModel>? = null
    private var resourcesAdapter: ResourcesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_resources, container, false)

        resourcesList = resources_constants.defaultResourcesList()

        // Set the adapter
        recyclerView = view.findViewById(R.id.rv_resources)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        resourcesAdapter = ResourcesAdapter(resourcesList!!)
        recyclerView.adapter = resourcesAdapter

        return view
    }

}