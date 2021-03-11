package com.example.ussd.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.ussd.R

class ExpandableListAdapter(private val group:ArrayList<ArrayList<String>>) : BaseExpandableListAdapter() {

    override fun getGroupCount(): Int = group.size

    override fun getChildrenCount(groupPosition: Int): Int = group[groupPosition].size

    override fun getGroup(groupPosition: Int): Any = group[groupPosition]

    override fun getChild(groupPosition: Int, childPosition: Int): Any = group[groupPosition][childPosition]

    override fun getGroupId(groupPosition: Int): Long = groupPosition.toLong()

    override fun getChildId(groupPosition: Int, childPosition: Int): Long = childPosition.toLong()

    override fun hasStableIds(): Boolean = true

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var view = convertView
        if (view == null) {
         //   view = LayoutInflater.from(parent?.context).inflate(R.layout.group_item, parent, false)
        }
        return view!!
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var view = convertView
        if (view == null) {
          //  view = LayoutInflater.from(parent?.context).inflate(R.layout.child_item, parent, false)
        }

        return view!!
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean = true
}