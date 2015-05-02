package org.jguil.events;

public interface EventHandler {
	public void handleEvent(Event<?> event);
}
