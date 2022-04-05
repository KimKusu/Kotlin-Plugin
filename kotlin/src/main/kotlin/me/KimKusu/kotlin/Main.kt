package me.KimKusu.kotlin

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        logger.info("[Kotlin Plugin!]")
        Bukkit.getPluginManager().registerEvents(Server(),this)
    }

    override fun onDisable() {
        logger.info("[Kotlin Plugin..]")
    }


}