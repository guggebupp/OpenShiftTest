package OpenShiftTest.OpenShiftTest.model;

import java.util.ArrayList;
import java.util.List;

public class TempGraphData {
	private String name;
	private List<Float> data = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Float> getData() {
		return data;
	}
	public void setData(List<Float> data) {
		this.data = data;
	}

}
