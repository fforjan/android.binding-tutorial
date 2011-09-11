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
