package OpenShiftTest.OpenShiftTest.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import OpenShiftTest.OpenShiftTest.model.TempData;

public class TemperatureRepository {
	
	Map<Long, List<TempData>> temperatureMap = new HashMap<>();

	public void saveTemp(long id, TempData tempData) {
		if(temperatureMap.get(id) == null){
			List<TempData> tempDataList = new ArrayList<>();
			temperatureMap.put(id, tempDataList);
			
		}
		temperatureMap.get(id).add(tempData);

	}

	public List<TempData> getTempData(long id) {
		if(temperatureMap.get(id) == null){
			List<TempData> tempDataList = new ArrayList<>();
			TempData d = new TempData();
			d.setTimeStamp(System.currentTimeMillis());
			d.setTemperature(new Float(12.5));
			
			tempDataList.add(d);
			
			temperatureMap.put(id, tempDataList);
			
		}
		return temperatureMap.get(id);
	}

	public Set<Long> listSensor() {
		
		return temperatureMap.keySet();
	}

}
