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

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * basic implementation of a preference fragment
 */
public class BasicPreferenceFragment extends PreferenceFragment {
	
	/*
	 * (non-Javadoc)
	 * @see android.preference.PreferenceFragment#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    Activity mActivity = getActivity();
	    Resources mResources = mActivity.getResources();
	    int mResourceIdentifier = mResources.getIdentifier(
	    		getArguments().getString("resource"),
                "xml",
                mActivity.getPackageName());
	    
	    addPreferencesFromResource(mResourceIdentifier);

	  }
}