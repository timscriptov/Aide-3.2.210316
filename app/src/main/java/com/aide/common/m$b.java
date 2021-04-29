//
// Decompiled by Jadx - 1219ms
//
package com.aide.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Typeface;
import com.aide.ui.u;

class m$b extends m {
    private static boolean Q6;
    private static boolean n5;
    final String AL;
    final boolean Z1;
    final Runnable cT;
    final String hK;
    final x k2;
    final String q7;
    final Runnable w9;
    final String zh;

    m$b(x xVar, String str, String str2, Runnable runnable, String str3, Runnable runnable2, String str4, boolean z) {
        this.k2 = xVar;
        this.zh = str;
        this.AL = str2;
        this.w9 = runnable;
        this.hK = str3;
        this.cT = runnable2;
        this.q7 = str4;
        this.Z1 = z;
    }

    public Dialog Hw(Activity activity) {
        try {
            AlertDialog[] alertDialogArr = new AlertDialog[1];
            a aVar = new a(this, activity, activity, alertDialogArr);
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setView(aVar).setMessage(this.zh).setCancelable(true).setPositiveButton(activity.getResources().getString(u.dialog_ok), new c(this, activity, aVar)).setNegativeButton(activity.getResources().getString(u.dialog_cancel), new b(this, activity, aVar));
            if (this.AL != null) {
                builder.setNeutralButton(this.AL, new d(this, activity, aVar));
            }
            if (this.hK != null) {
                builder.setTitle(this.hK);
            }
            builder.setOnCancelListener(new e(this));
            alertDialogArr[0] = builder.create();
            alertDialogArr[0].setOnShowListener(new f(this, activity, aVar));
            aVar.setText(this.q7);
            aVar.setImeOptions(0x10000000);
            if (this.Z1) {
                aVar.setInputType(129);
            } else {
                aVar.setInputType(145);
            }
            aVar.setTypeface(Typeface.DEFAULT);
            aVar.setOnEditorActionListener(new g(this, activity, aVar, alertDialogArr));
            alertDialogArr[0].setCanceledOnTouchOutside(true);
            return alertDialogArr[0];
        } catch (Throwable th) {
        }
    }
}

