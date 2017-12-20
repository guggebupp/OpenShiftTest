/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package OpenShiftTest.OpenShiftTest.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;

import OpenShiftTest.OpenShiftTest.model.Member;
import OpenShiftTest.OpenShiftTest.model.SudokuData;
import OpenShiftTest.OpenShiftTest.service.MemberRegistration;
import OpenShiftTest.OpenShiftTest.service.SudokuService;

// The @Model stereotype is a convenience mechanism to make this a request-scoped bean that has an
// EL name
// Read more about the @Model stereotype in this FAQ:
// http://www.cdi-spec.org/faq/#accordion6
@Model
public class SudokuController {

    @Inject
    private FacesContext facesContext;

    @Inject
    private SudokuService sudokuService;

    @Produces
    @Named
    private String[] newSudoku;
    
    
    @Produces
    @Named
    private Long sudokudId;

    @PostConstruct
    public void initNewsudoku() {
    	System.out.println("Init controller");
    	newSudoku = new String[81];
    }
    
    public void newSudoku() {
    	initNewsudoku();
    }

    public void saveSudoku() throws Exception {
        try {
        	SudokuData sudokuData = new SudokuData();
        	for(int i=0;i<81;i++){
        		if(!StringUtils.isEmpty(newSudoku[i])){
        			sudokuData.getData().add(Integer.parseInt(newSudoku[i]));
        		}else{
        			sudokuData.getData().add(0);
        		}
        			
        	}
        	sudokudId = sudokuService.saveSudoku(sudokuData);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved!", "Registration successful");
            facesContext.addMessage(null, m);            
        } catch (Exception e) {
        	e.printStackTrace();
            String errorMessage = getRootErrorMessage(e);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Registration unsuccessful");
            facesContext.addMessage(null, m);
        }
    }
    
    public void solveSudoku(){
    	System.out.println("SudokuId: " +  sudokudId);
    	SudokuData sudokuData = sudokuService.getSudoku(sudokudId);
    	int i = 0;
    	for(Integer s:sudokuData.getData()){
    		newSudoku[i++] = s.toString();
    	}
    }

    private String getRootErrorMessage(Exception e) {
        // Default to general error message that registration failed.
        String errorMessage = "Registration failed. See server log for more information";
        if (e == null) {
            // This shouldn't happen, but return the default messages
            return errorMessage;
        }

        // Start with the exception and recurse to find the root cause
        Throwable t = e;
        while (t != null) {
            // Get the message from the Throwable class instance
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        // This is the root cause message
        return errorMessage;
    }

}
