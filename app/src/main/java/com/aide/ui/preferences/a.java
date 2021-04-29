package com.aide.ui.preferences;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import com.aide.ui.f;
import a6;
import c7;

public class a {
    public static void DW(Context context, PreferenceScreen preferenceScreen) {
        PreferenceCategory preferenceCategory = null;
            for (a6 a6Var : a6.values()) {
                if (preferenceCategory == null || !preferenceCategory.getTitle().equals(a6Var.DW())) {
                    preferenceCategory = new PreferenceCategory(context);
                    preferenceCategory.setTitle(a6Var.DW());
                    preferenceScreen.addPreference(preferenceCategory);
                }
                PremiumCheckBoxPreference premiumCheckBoxPreference = new PremiumCheckBoxPreference(context);
                premiumCheckBoxPreference.setKey(a6Var.FH());
                premiumCheckBoxPreference.setTitle(a6Var.getName());
                if (a6Var.v5(false).length() > 0) {
                    premiumCheckBoxPreference.setSummary(("\"" + a6Var.v5(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + a6Var.v5(true).replace("\n", "\\n") + "\""));
                }
                preferenceCategory.addPreference(premiumCheckBoxPreference);
            }
    }

    public static void FH(Context context, PreferenceScreen preferenceScreen) {
        PreferenceCategory preferenceCategory = null;
            for (c7 c7Var : c7.values()) {
                if (preferenceCategory == null || !preferenceCategory.getTitle().equals(c7Var.DW())) {
                    preferenceCategory = new PreferenceCategory(context);
                    preferenceCategory.setTitle(c7Var.DW());
                    preferenceScreen.addPreference(preferenceCategory);
                }
                PremiumCheckBoxPreference premiumCheckBoxPreference = new PremiumCheckBoxPreference(context);
                premiumCheckBoxPreference.setKey(c7Var.FH());
                premiumCheckBoxPreference.setTitle(c7Var.getName());
                if (c7Var.v5(false).length() > 0) {
                    premiumCheckBoxPreference.setSummary(("\"" + c7Var.v5(false).replace("\n", "\\n") + "\"") + " versus " + ("\"" + c7Var.v5(true).replace("\n", "\\n") + "\""));
                }
                preferenceCategory.addPreference(premiumCheckBoxPreference);
            }
    }

    public static void j6(Context context, PreferenceScreen preferenceScreen) {
        DW(context, preferenceScreen);
    }
}

