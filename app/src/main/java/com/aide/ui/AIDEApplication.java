package com.aide.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.aide.ui.marketing.b;
import androidx.multidex.MultiDexApplication;

public class AIDEApplication extends MultiDexApplication {
    public static Context context;

    private boolean DW() {
        int myPid = Process.myPid();
		for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
			if (next.pid == myPid) {
				return !next.processName.contains(":");
			}
		}
		return true;
    }

    public void onCreate() {
		super.onCreate();
		context = getApplicationContext();
		f.lp(getPackageName());
		if (DW()) {
			b.j6(this, 43453, 0x7f070078, "New version of AIDE installed", "Check out what's new!", MainActivity.Mz(this));
		}
    }

	public static Context getContext() {
        if (context == null) {
            context = new AIDEApplication();
        }
        return context;
    }
}

