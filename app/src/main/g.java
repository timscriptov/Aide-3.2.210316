//
// Decompiled by Jadx - 1540ms
//
package com.aide.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.widget.EditText;
import com.aide.ui.R;

class m$2 extends m {
    final /* synthetic */ String DW;
    final /* synthetic */ String FH;
    final /* synthetic */ Runnable Hw;
    final /* synthetic */ String VH;
    final /* synthetic */ Runnable Zo;
    final /* synthetic */ boolean gn;
    final /* synthetic */ x j6;
    final /* synthetic */ String v5;

    m$2(x xVar, String str, String str2, Runnable runnable, String str3, Runnable runnable2, String str4, boolean z) {
        this.j6 = xVar;
        this.DW = str;
        this.FH = str2;
        this.Hw = runnable;
        this.v5 = str3;
        this.Zo = runnable2;
        this.VH = str4;
        this.gn = z;
    }

    public Dialog j6(Activity activity) {
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        1 r2 = new 1(this, activity, activity, alertDialogArr);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(r2).setMessage(this.DW).setCancelable(true).setPositiveButton(activity.getResources().getString(R.f.dialog_ok), new 3(this, activity, r2)).setNegativeButton(activity.getResources().getString(R.f.dialog_cancel), new 2(this, activity, r2));
        String str = this.FH;
        if (str != null) {
            builder.setNeutralButton(str, new 4(this, activity, r2));
        }
        String str2 = this.v5;
        if (str2 != null) {
            builder.setTitle(str2);
        }
        builder.setOnCancelListener(new 5(this));
        alertDialogArr[0] = builder.create();
        alertDialogArr[0].setOnShowListener(new 6(this, activity, r2));
        r2.setText(this.VH);
        r2.setImeOptions(0x10000000);
        if (this.gn) {
            r2.setInputType(129);
            res(activity, r2);
        } else {
            r2.setInputType(145);
        }
        r2.setTypeface(Typeface.DEFAULT);
        r2.setOnEditorActionListener(new 7(this, activity, r2, alertDialogArr));
        alertDialogArr[0].setCanceledOnTouchOutside(true);
        return alertDialogArr[0];
    }

    public void res(Activity activity, EditText editText) {
        if (this.DW.startsWith("Enter password for keystore alias")) {
            editText.setText(PreferenceManager.getDefaultSharedPreferences(activity).getString("user_keystore_pswd_default", ""));
        } else if (!this.v5.equals("Git")) {
        } else {
            if (this.DW.equals("Username")) {
                editText.setText(PreferenceManager.getDefaultSharedPreferences(activity).getString("user_gitname", ""));
            } else if (this.DW.equals("Password")) {
                editText.setText(PreferenceManager.getDefaultSharedPreferences(activity).getString("user_gitpass", ""));
            }
        }
    }
}

