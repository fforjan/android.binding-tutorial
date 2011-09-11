package com.android.demo.notepad1.viewmodel;

import gueei.binding.cursor.CursorRowModel;
import gueei.binding.cursor.IdField;
import gueei.binding.cursor.StringField;

import com.android.demo.notepad1.model.NotesModel;

public class NoteViewModel extends CursorRowModel {

	 public final IdField Id = new IdField(NotesModel.KEY_ROWID);
     public final StringField Title = new StringField(NotesModel.KEY_TITLE);
     public final StringField Body = new StringField(NotesModel.KEY_BODY);
}
