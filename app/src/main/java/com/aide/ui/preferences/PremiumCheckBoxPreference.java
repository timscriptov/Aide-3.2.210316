package com.aide.ui.preferences;

import android.app.Activity;
import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import com.aide.ui.f;

public class PremiumCheckBoxPreference extends CheckBoxPreference {
    public PremiumCheckBoxPreference(Context context) {
        super(context);
    }

    protected void onClick() {
        if (f.a8().gn((Activity) getContext(), getKey())) {
                super.onClick();
            }
    }
	
    public PremiumCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PremiumCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

