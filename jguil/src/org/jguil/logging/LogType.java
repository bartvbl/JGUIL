package org.jguil.logging;

public enum LogType {
	INFO(0), 
	WARNING(1), 
	ERROR(2);
	
	public final int level;

	private LogType(int level) {
		this.level = level;
	}
}
