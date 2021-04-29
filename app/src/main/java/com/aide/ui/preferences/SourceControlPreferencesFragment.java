package com.aide.ui.preferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SourceControlPreferencesFragment extends PreferenceFragment {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
		addPreferencesFromResource(0x7f100009);
	}
}

