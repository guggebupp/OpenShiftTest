package OpenShiftTest.OpenShiftTest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class SudokuData {
	
	private List<Row> col = new ArrayList<>();	
	private String status;
		

	public List<Row> getCol() {
		return col;
	}


	public void setCol(List<Row> col) {
		this.col = col;
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	public class Row {
		private List<Integer> data  = new ArrayList<>();

		public List<Integer> getData() {
			return data;
		}

		public void setData(List<Integer> data) {
			this.data = data;
		}
	}
}
