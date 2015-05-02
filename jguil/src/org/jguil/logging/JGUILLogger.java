package org.jguil.logging;

public class JGUILLogger {
	private static LogType logLevel = LogType.WARNING;

	public static void setLogLevel(LogType level) {
		logLevel  = level;
	}
	
	public static void log(LogType type, String message) {
		if(logLevel.level >= type.level) {
			System.out.println(type + "\t" + message);			
		}
	}
}
