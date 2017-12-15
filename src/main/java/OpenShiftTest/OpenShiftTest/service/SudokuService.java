package OpenShiftTest.OpenShiftTest.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import OpenShiftTest.OpenShiftTest.data.SudokuRepository;
import OpenShiftTest.OpenShiftTest.model.SudokuData;

@Stateless
public class SudokuService {
	
	@Inject
	SudokuRepository sudokuRepository;

	public Long saveSudoku(SudokuData sudokuData) {

		return sudokuRepository.saveSudoku(sudokuData);
	}

	public String sudokuStatus(long id) {

		return sudokuRepository.getStatus(id);
	}

	public SudokuData getSudoku(long id) {
		return sudokuRepository.getSudoku(id);
	}

}
