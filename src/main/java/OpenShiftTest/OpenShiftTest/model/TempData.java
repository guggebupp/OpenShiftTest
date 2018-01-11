package OpenShiftTest.OpenShiftTest.model;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class TempData {	
	private Long timeStamp;
	private float temperature;
	
	public TempData(Long timeStamp, float temperature) {
		super();		
		this.timeStamp = timeStamp;
		this.temperature = temperature;
	}


	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	
}
