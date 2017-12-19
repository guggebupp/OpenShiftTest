package OpenShiftTest.OpenShiftTest.model;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class SudokuStatus {
	private Long id;
	private String status;
	public SudokuStatus(Long id, String status) {
		this.id = id;
		this.status = status;
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
	
	

}
