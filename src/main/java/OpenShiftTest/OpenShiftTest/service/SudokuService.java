package OpenShiftTest.OpenShiftTest.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import OpenShiftTest.OpenShiftTest.data.SudokuRepository;
import OpenShiftTest.OpenShiftTest.model.SudokuData;
import OpenShiftTest.OpenShiftTest.model.SudokuStatus;

@Stateless
public class SudokuService {
	
	@Inject
	SudokuRepository sudokuRepository;

	public Long saveSudoku(SudokuData sudokuData) {
		sudokuData.setStatus("IDLE");
		return sudokuRepository.saveSudoku(sudokuData);
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

}
