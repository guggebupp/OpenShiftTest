package OpenShiftTest.OpenShiftTest.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import OpenShiftTest.OpenShiftTest.model.SudokuData;

@ApplicationScoped
public class SudokuRepository {
	
	Map<Long, SudokuData> sudokuMap = new HashMap<>();

	public Long saveSudoku(SudokuData sudokuData) {
		Long sudokuId = System.currentTimeMillis();
		sudokuMap.put(sudokuId,sudokuData);
		
		return sudokuId;
	}

	public String getStatus(long id) {
	    SudokuData d = sudokuMap.get(id);
		return d.getStatus();
	}

	public SudokuData getSudoku(long id) {
		SudokuData d = sudokuMap.get(id);
		return d;
	}

}
