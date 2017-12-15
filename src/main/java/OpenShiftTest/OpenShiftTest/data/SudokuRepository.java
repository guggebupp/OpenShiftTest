package OpenShiftTest.OpenShiftTest.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import OpenShiftTest.OpenShiftTest.model.SudokuData;
import OpenShiftTest.OpenShiftTest.model.SudokuData.Row;

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
			Row row = d.new Row();
			row.getData().add(1);
			row.getData().add(2);
			row.getData().add(3);
			row.getData().add(4);
			row.getData().add(5);
			row.getData().add(6);
			row.getData().add(7);
			row.getData().add(8);
			row.getData().add(9);
			d.getCol().add(row);
			d.getCol().add(row);
			d.getCol().add(row);
			d.getCol().add(row);
			d.getCol().add(row);
			d.getCol().add(row);
			d.getCol().add(row);
			d.getCol().add(row);
			d.getCol().add(row);
			
			
		}
		return d;
	}

}
