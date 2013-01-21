/*
 * Copyright (C) 2013 The MaGDAA Project
 *
 * This file is part of the MaGDAA DaRMa Software
 *
 * MaGDAA DaRMa Software is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This source code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this source code; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.magdaaproject.darma.fragments;

import java.util.List;

import org.magdaaproject.darma.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * user interface for the changing of preferences using Fragments
 * will need a separate implementation for gingerbread
 *
 */
public class PreferencesActivity extends PreferenceActivity {
	
	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// manually set the activity title, no idea why this is necessary but it is
		this.setTitle(getString(R.string.system_application_default_label));
	}

	/*
	 * (non-Javadoc)
	 * @see android.preference.PreferenceActivity#onBuildHeaders(java.util.List)
	 */
	@Override
	public void onBuildHeaders(List<Header> target) {
		loadHeadersFromResource(R.xml.preferences_headers, target);
	}
}
