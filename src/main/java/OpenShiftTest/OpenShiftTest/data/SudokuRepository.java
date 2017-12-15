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
		if(d==null){
			d = new SudokuData();			
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
			d.getData().add(1);
			d.getData().add(2);
			d.getData().add(3);
			d.getData().add(4);
			d.getData().add(5);
			d.getData().add(6);
			d.getData().add(7);
			d.getData().add(8);
			d.getData().add(9);
						
			
		}
		return d;
	}

	public Long solveSudoku(long id, SudokuData sudokuData) {
		sudokuMap.put(id,sudokuData);
		
		return id;
	}

}
