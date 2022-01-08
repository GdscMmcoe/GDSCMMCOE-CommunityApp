package com.example.gdscmmcoe_communityapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.io.BufferedReader


class FaqsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_faqs, container, false)

/*        val mWebView = view.findViewById(R.id.webView) as WebView
        mWebView.loadUrl("https://github.com/tuskyapp/faq/blob/master/README.md")

        val webSettings = mWebView.settings
        webSettings.javaScriptCanOpenWindowsAutomatically = true

        mWebView.webViewClient = WebViewClient()

        return view*/

        val data = readFromAsset()

        view.findViewById<TextView>(R.id.tv_reader).text = data

        return view
    }

    private fun readFromAsset(): String {
        val file_name = "FAQ-GDSC.txt"
        val bufferReader = context?.assets!!.open(file_name).bufferedReader()
        val data = bufferReader.use {
            it.readText()
        }

        return data;
    }
}