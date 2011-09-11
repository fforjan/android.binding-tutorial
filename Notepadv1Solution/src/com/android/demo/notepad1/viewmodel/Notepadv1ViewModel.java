/*
 * Copyright (C) 2008 Google Inc.
 * Copyright (C) 2011 Frederic Forjan 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.demo.notepad1.viewmodel;

import gueei.binding.Command;
import gueei.binding.cursor.CursorObservable;

import android.view.View;

import com.android.demo.notepad1.model.NotesModel;

public class Notepadv1ViewModel {
	
	private int mNoteNumber = 0;

	public CursorObservable<NoteViewModel> Notes;
	
	public Command addItem = new Command() {
		
		@Override
		public void Invoke(View arg0, Object... arg1) {
			createNote();
		}
	};
	
	private NotesModel mModel;
	public Notepadv1ViewModel(NotesModel model)
	{
		if(model == null)
		{
			throw new IllegalArgumentException("model can't be null");
		}
		mModel = model;
		Notes = new CursorObservable<NoteViewModel>(NoteViewModel.class);
	
	}
	
	private void createNote() {
	    String noteName = "Note " + mNoteNumber++;
	    mModel.createNote(noteName, "");
	    fillData();
	}
	
	public void fillData()
	{
		Notes.setCursor(mModel.fetchAllNotes());
	}
}
