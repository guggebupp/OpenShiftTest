package OpenShiftTest.OpenShiftTest.model;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class SudokuStatus {
	private Long id;
	private String status;
	private String time;
	
	public SudokuStatus(Long id, String status, String time) {
		this.id = id;
		this.status = status;
		this.time = time;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
