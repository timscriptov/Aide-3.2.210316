package com.aide.ui;

import android.content.SharedPreferences;
import ue;
import b;
import com.aide.ui.f;
import com.mcal.aide.data.Preferences;
import com.aide.ui.views.SplitView;
import com.aide.ui.browsers.LogCatBrowser;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Random;
import iy;

public class MainActivity extends ThemedActionbarActivity implements ue.f, AIDEEditorPager.e, SharedPreferences.OnSharedPreferenceChangeListener/*, b.b*/ {

	private boolean Z1;
	private int eU;

	@Override
	public void FH(boolean p1) {
		// Заглушка
	}

	@Override
	public void j6(boolean p1) {
		// Заглушка
	}

	@Override
	public void DW() {
		// Заглушка
	}

	@Override
	public void Hw(String p1) {
		// Заглушка
	}

	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.eU = Preferences.Hw();
		if ("user_androidjar".equals(str) || "user_m2repositories".equals(str)) {
			f.P8().wc();
		}
		f.we().EQ();
		br().setSwipeEnabled(!f.Mz() && Preferences.we());
		if ("light_theme".equals(str) || "app_language".equals(str) || "editor_tabs".equals(str)) {
			this.Z1 = true;
		}
		sh().OW();
		if ("editor_font_size".equals(str)) {
			sh().br();
		}
    }

	public static PendingIntent Mz(Context context) {
        // Заглушка
		return null;
	}

	private static PendingIntent v5(Context context, int i, Intent intent, int i2) {
        // Заглушка
		return null;
	}

	public float P8() {
		// Заглушка
		return 0;
	}

	public AIDEEditorPager sh() {
		// Заглушка
		return null;
	}

	public SplitView br() {
		// Заглушка
		return null;
	}

	public LogCatBrowser g3() {
		// Заглушка
		return null;
	}
}
