package OpenShiftTest.OpenShiftTest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class SudokuData {
	
	private List<Integer> data = new ArrayList<>();	
	private String status;
	private String time;
		

	public List<Integer> getData() {
		return data;
	}


	public void setDat(List<Integer> data) {
		this.data = data;
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}

	
	
}
