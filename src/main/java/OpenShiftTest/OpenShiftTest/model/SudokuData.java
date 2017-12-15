package OpenShiftTest.OpenShiftTest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class SudokuData {
	
	private List<Integer> data = new ArrayList<>();	
	private String status;
		

	public List<Integer> getData() {
		return data;
	}


	public void setDat(List<Integer> col) {
		this.data = data;
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
