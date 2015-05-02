package org.jguil.events;

import java.util.ArrayList;
import java.util.HashMap;

import org.jguil.logging.JGUILLogger;
import org.jguil.logging.LogType;

public class EventDispatcher {
	private final HashMap<EventType, ArrayList<EventHandler>> listeners = new HashMap<EventType, ArrayList<EventHandler>>();

	public void dispatchEvent(Event<?> event) {
		if (!eventTypeExists(event.eventType)) {
			JGUILLogger.log(LogType.WARNING, "WARNING: dispatch attempted of event with event type '" + event.eventType + "', which has no listeners");
			return;
		} else {
			JGUILLogger.log(LogType.INFO, "dispatched event: " + event.eventType);
		}

		ArrayList<EventHandler> eventHandlersList = this.listeners.get(event.eventType);
		for (EventHandler handler : eventHandlersList) {
			handler.handleEvent(event);
		}
	}

	public void addEventListener(EventHandler listenerModule, EventType eventType) {
		this.addEventTypeIfNotExistent(eventType);
		ArrayList<EventHandler> listenerList = this.listeners.get(eventType);
		listenerList.add(listenerModule);

	}

	private void addEventTypeIfNotExistent(EventType eventType) {
		if (!eventTypeExists(eventType)) {
			this.listeners.put(eventType, new ArrayList<EventHandler>());
		}
	}

	private boolean eventTypeExists(EventType eventType) {
		return this.listeners.containsKey(eventType);
	}
}