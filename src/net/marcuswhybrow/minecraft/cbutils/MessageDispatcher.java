package net.marcuswhybrow.minecraft.cbutils;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public abstract class MessageDispatcher {
	
	public static final String LOGGER_NAME = "Minecraft";
	
	public static void consoleInfo(String message) {
		Logger.getLogger(LOGGER_NAME).info(message);
	}
	
	public static void consoleWarning(String message) {
		Logger.getLogger(LOGGER_NAME).warning(message);
	}
	
	public static void consoleSevere(String message) {
		Logger.getLogger(LOGGER_NAME).severe(message);
	}
	
	
	public static void sendMessage(CommandSender sender, String message) {
		sender.sendMessage(message);
	}
	
	public static void sendMessageWithoutPrefix(CommandSender sender, String message) {
		sender.sendMessage(message);
	}
	
	public static void broadcast(String message, String permission) {
		Bukkit.broadcast(message, permission);
	}
	
	public static void broadcastMessage(String message) {
		Bukkit.broadcastMessage(message);
	}
}
