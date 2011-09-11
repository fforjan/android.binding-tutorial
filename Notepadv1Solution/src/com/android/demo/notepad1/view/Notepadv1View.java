/*
 * Copyright (C) 2008 Google Inc.
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

package com.android.demo.notepad1.view;

import gueei.binding.Binder;
import gueei.binding.app.BindingActivity;
import android.os.Bundle;

import com.android.demo.notepad1.R;
import com.android.demo.notepad1.model.NotesModel;
import com.android.demo.notepad1.viewmodel.Notepadv1ViewModel;



public class Notepadv1View extends BindingActivity {

	Notepadv1ViewModel vm;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm = new Notepadv1ViewModel(new NotesModel(this).open());
        vm.fillData();
        Binder.setAndBindContentView(this, R.layout.notepadview , vm);
        
    }
}
