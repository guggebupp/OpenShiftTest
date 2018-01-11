package OpenShiftTest.OpenShiftTest.service;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import OpenShiftTest.OpenShiftTest.data.TemperatureRepository;
import OpenShiftTest.OpenShiftTest.model.TempData;

public class TemperatureService {
	
	@Inject
	TemperatureRepository temperatureRepository;

	public void saveTemp(long id, TempData tempData) {
		temperatureRepository.saveTemp(id, tempData);
	}

	public List<TempData> getTempData(long id) {
		return temperatureRepository.getTempData(id);
	}

	public Set<Long> listSensor() {
		return temperatureRepository.listSensor();
	}

}
