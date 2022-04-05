package me.KimKusu.kotlin

import com.destroystokyo.paper.event.server.PaperServerListPingEvent
import net.kyori.adventure.text.Component.text
import org.bukkit.ChatColor
import org.bukkit.Color
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerLoginEvent
import org.bukkit.event.player.PlayerQuitEvent
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class Server:Listener {
    @EventHandler
    fun onPlayerLogin(e: PlayerLoginEvent) {
        if (e.result == PlayerLoginEvent.Result.KICK_FULL) {
            e.allow()
        }
    }

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        var player = e.player
        e.joinMessage = null
    }

    @EventHandler
    fun onPlayerQuit(e: PlayerQuitEvent) {
        e.quitMessage = null
    }


    @EventHandler
    fun PlayerDeath(e: PlayerDeathEvent) {
        e.deathMessage(text("${ChatColor.DARK_RED}사람이 죽었따"))
    }

    @EventHandler
    fun onListPing(e: PaperServerListPingEvent) {
        val random = Random
        e.maxPlayers = random.nextInt(1000,99999)
        e.numPlayers = random.nextInt(1000,1432)
        e.playerSample.clear()
    }
}
