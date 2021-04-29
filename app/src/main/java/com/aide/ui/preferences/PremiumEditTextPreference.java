package com.aide.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;
import com.aide.ui.f;

public class PremiumEditTextPreference extends EditTextPreference {
	public PremiumEditTextPreference(Context context) {
        super(context);
    }

    protected void onClick() {
        if (f.a8().gn((Activity) getContext(), getKey())) {
			super.onClick();
		}
    }

    public PremiumEditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PremiumEditTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

