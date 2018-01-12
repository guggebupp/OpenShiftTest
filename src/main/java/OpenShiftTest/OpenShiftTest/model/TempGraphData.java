package OpenShiftTest.OpenShiftTest.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TempGraphData {
	private String name;
	private List<TempData> data = new LinkedList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TempData> getData() {
		return data;
	}
	public void setData(List<TempData> data) {
		this.data = data;
	}

}
