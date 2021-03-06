/*
 * Copyright 2009-2011 Prime Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.examples.mobile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.examples.domain.Note;

public class NotesView implements Serializable {

    private Note note = new Note();

	private List<Note> notes = new ArrayList<Note>();

	public List<Note> getNotes() {
		return notes;
	}

	public Note getNote() {
		return note;
	}
	public void setNote(Note note) {
		this.note = note;
	}
    
    public String initNew() {
        note = new Note();
        
        return "pm:new";
    }

    public void save() {
        if (!notes.contains(note)) {
            notes.add(note);
        }

        note = new Note();
    }
}
