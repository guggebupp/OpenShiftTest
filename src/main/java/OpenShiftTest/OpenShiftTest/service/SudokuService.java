package OpenShiftTest.OpenShiftTest.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import OpenShiftTest.OpenShiftTest.data.SudokuRepository;
import OpenShiftTest.OpenShiftTest.model.SudokuData;
import OpenShiftTest.OpenShiftTest.model.SudokuStatus;

@Stateless
public class SudokuService {

	@Inject
	SudokuRepository sudokuRepository;

	@Inject
	private Event<SudokuStatus> sudokuEventSrc;

	public Long saveSudoku(SudokuData sudokuData) {
		sudokuData.setStatus("IDLE");
		Long id = sudokuRepository.saveSudoku(sudokuData);
		SudokuStatus status = new SudokuStatus(id, sudokuData.getStatus());
		sudokuEventSrc.fire(status);
		return id;
	}

	public String sudokuStatus(long id) {

		return sudokuRepository.getStatus(id);
	}

	public SudokuData getSudoku(long id) {
		return sudokuRepository.getSudoku(id);
	}

	public Long solveSudoku(long id, SudokuData sudokuData) {
		return sudokuRepository.solveSudoku(id, sudokuData);
	}

	public List<SudokuStatus> list() {
		return sudokuRepository.getAll();
	}

	public List<SudokuStatus> listActive() {
		return sudokuRepository.getAllActive();
	}

	public List<SudokuStatus> listActiveSleep(long sleepTime) {
		List<SudokuStatus> activeSudokus = sudokuRepository.getAllActive();
		long endTime = System.currentTimeMillis() + sleepTime;
		while (activeSudokus.isEmpty() && System.currentTimeMillis() < endTime) {
			try {
				Thread.sleep(500);
				activeSudokus = sudokuRepository.getAllActive();
			} catch (Exception e) {

			}
		}
		return activeSudokus;
	}

}
