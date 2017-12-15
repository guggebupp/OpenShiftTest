package OpenShiftTest.OpenShiftTest.model;

import java.util.List;

public class SudokuData {
	
	private List<Row> col;	
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


	private class Row {
		private List<Integer> data;

		public List<Integer> getData() {
			return data;
		}

		public void setData(List<Integer> data) {
			this.data = data;
		}
	}
}
