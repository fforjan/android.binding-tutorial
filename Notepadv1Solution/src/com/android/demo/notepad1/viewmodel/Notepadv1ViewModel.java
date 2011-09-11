package com.android.demo.notepad1.viewmodel;

import gueei.binding.cursor.CursorObservable;

import com.android.demo.notepad1.model.NotesModel;

public class Notepadv1ViewModel {

	public CursorObservable<NoteViewModel> Notes;
	
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
	
	public void fillData()
	{
		Notes.setCursor(mModel.fetchAllNotes());
	}
}
