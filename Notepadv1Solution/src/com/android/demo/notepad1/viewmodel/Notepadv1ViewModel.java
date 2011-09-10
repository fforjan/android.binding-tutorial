package com.android.demo.notepad1.viewmodel;

import gueei.binding.collections.ArrayListObservable;

public class Notepadv1ViewModel {

	public ArrayListObservable Notes;
	
	public Notepadv1ViewModel()
	{
		Notes = new ArrayListObservable(String.class);
		Notes.setArray(new String[0]); //by default we have an empty list	
	}
}
