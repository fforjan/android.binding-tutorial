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

import gueei.binding.cursor.CursorRowModel;
import gueei.binding.cursor.IdField;
import gueei.binding.cursor.StringField;

import com.android.demo.notepad1.model.NotesModel;

public class NoteViewModel extends CursorRowModel {

	 public final IdField Id = new IdField(NotesModel.KEY_ROWID);
     public final StringField Title = new StringField(NotesModel.KEY_TITLE);
     public final StringField Body = new StringField(NotesModel.KEY_BODY);
}
