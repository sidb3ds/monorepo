package com.example.pdp.repository

import com.example.builder.Component

class Repository {
    fun getPdpList(domainName: String): List<Component> {
        return when (domainName) {
            "nykaa" -> {
                val list = ArrayList<Component>()
                list.add(Component(1, "nykaa component 1"))
                list.add(Component(2, "nykaa component 2"))
                list.add(Component(3, "nykaa component 3"))
                list.add(Component(1, "nykaa component 1"))
                list.add(Component(1, "nykaa component 1"))
                list.add(Component(1, "nykaa component 1"))
                list
            }

            "nykaad" -> {
                val list = ArrayList<Component>()
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(1, "nykaad component 1"))
                list.add(Component(2, "nykaad component 2"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(1, "nykaad component 1"))
                list.add(Component(2, "nykaad component 2"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(1, "nykaad component 1"))
                list.add(Component(2, "nykaad component 2"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(1, "nykaad component 1"))
                list.add(Component(2, "nykaad component 2"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(1, "nykaad component 1"))
                list.add(Component(2, "nykaad component 2"))
                list.add(Component(3, "nykaad component 3"))
                list.add(Component(3, "nykaad component 3"))
                list
            }

            "nykaafashion" -> {
                val list = ArrayList<Component>()
                list.add(Component(2, "nykaafashion component 1"))
                list.add(Component(3, "nykaafashion component 3"))
                list.add(Component(1, "nykaafashion component 2"))
                list.add(Component(2, "nykaafashion component 2"))
                list.add(Component(2, "nykaafashion component 2"))
                list
            }
            else -> {
                ArrayList()
            }
        }
    }
}