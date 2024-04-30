package n1exercici1.singletons;

import java.util.ArrayList;
import java.util.List;


public class HistorySingleton {
	
	private static HistorySingleton historySingleton;
	
	private List<String> history;
	
	private HistorySingleton() {
		super();
		history = new ArrayList<>();
	}
	
	public static HistorySingleton getHistorySingleton() {
		if(historySingleton == null) {
			historySingleton = new HistorySingleton();
		}
		return historySingleton;
	}

	public List<String> getHistory() {
		return history;
	}

	public void setHistory(List<String> history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "HistorySingleton [history=" + history + "]";
	}
}
