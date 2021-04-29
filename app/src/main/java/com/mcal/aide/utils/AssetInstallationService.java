package com.mcal.aide.utils;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import com.aide.common.e;
import com.aide.common.v;
import com.aide.ui.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import iy;
import ag;
import ey;
import gy;
import fy;
import dy;
import com.aide.ui.f;

public class AssetInstallationService {
    private String DW;
    private String FH;
    private String Hw;
    private String j6;
    private String v5;

    public static String DW(String str, boolean z) {
        return FH(str, z, false);
	}

    public static String FH(String str, boolean z, boolean z2) {
        j6(str, z, z2);
        return VH(str, z);
	}

    private static InputStream J0(String str) {
        if (f.Sf()) {
			if (Build.VERSION.SDK_INT >= 20) {
				return J8(str, str, "x86-pie" + File.separator + str, "x86" + File.separator + str);
			}
		}
		if (f.Sf()) {
			return J8(str, str, "x86" + File.separator + str, "x86" + File.separator + str);
		} else if (Build.VERSION.SDK_INT >= 20) {
			return J8(str, str, "armeabi-pie" + File.separator + str, "armeabi" + File.separator + str);
		} else {
			return J8(str, str, "armeabi" + File.separator + str, "armeabi" + File.separator + str);
		}

	}

    private static InputStream J8(String... strArr) {
        try {
            AssetManager assets = f.VH().getAssets();
            for (String QX : strArr) {
                InputStream QX2 = QX(assets, QX);
                if (QX2 != null) {
                    return QX2;
                }
            }
			throw new FileNotFoundException("Asset " + strArr[0] + " not found.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

    private static InputStream QX(AssetManager assetManager, String str) {
        try {
			return assetManager.open(str);
		} catch (IOException | FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

    private static String VH(String str, boolean z) {
        String str2 = ag.yS() + "/.aide";
		if (!new File(str2).exists()) {
			new File(str2).mkdirs();
		}
		return str2 + File.separator + str;
	}

    private static boolean Ws(String str, boolean z) {
        try {
            String VH2 = VH(str, z);
            SharedPreferences sharedPreferences = f.VH().getSharedPreferences("AssetInstallationService", 0);
            long j = sharedPreferences.getLong("ApkVersion", 0);
            long Zo2 = Zo();
            long j2 = sharedPreferences.getInt("AndroidVersion", 0);
            if (!ag.DW(j, Zo2) || j2 != ((long) Build.VERSION.SDK_INT)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.putLong("ApkVersion", Zo2);
                edit.putInt("AndroidVersion", Build.VERSION.SDK_INT);
                edit.commit();
            }
            if (sharedPreferences.getBoolean(str, false) && new File(VH2).exists()) {
                return false;
            }
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putBoolean(str, true);
            edit2.commit();
            try {
                if (!new File(VH2).exists() || !v.j6(J0(str), new FileInputStream(VH2))) {
                    return true;
                }
                return false;
            } catch (IOException e) {
				e.printStackTrace();
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
			return false;
        }
	}

    private static long Zo() {
        try {
			return new File(f.VH().getPackageManager().getPackageInfo(f.VH().getPackageName(), 0).applicationInfo.sourceDir).lastModified();
		} catch (PackageManager.NameNotFoundException e) {
			e.printStackTrace();
			return -1;
		}
	}

    private static boolean j6(String str, boolean z, boolean z2) {
        try {
			if (Ws(str, z)) {
				String VH2 = VH(str, z);
				InputStream J0 = J0(str);
				if (z2) {
					ag.u7(J0, VH2, false);
				} else {
					new File(VH2).getParentFile().mkdirs();
					v.Zo(J0, new FileOutputStream(VH2));
				}
				e.DW("Extracted asset " + str);
			}
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
    }

    public String EQ() {
        String VH2 = VH("weardebug.keystore", true);
		if (!new File(VH2).exists()) {
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			gregorianCalendar.add(1, 100);
			f.j3().Hw(VH2, "xxxxxx", "weardebug", "xxxxxx", new GregorianCalendar().getTime(), gregorianCalendar.getTime(), BigInteger.ONE, "Wear Debug", "", "", "", "", "");
		}
		return VH2;
	}

    public String Hw() {
        return this.DW;
	}

    public String gn() {
        return this.Hw;
	}

	public String tp() {
        if (this.v5 == null) {
			this.v5 = DW("merger.zip", true);
		}
		return this.v5;
	}

    public String u7() {
        return this.j6;
	}

    public String v5() {
        return this.FH;
	}

    public void we() {
        this.j6 = DW("JavaScriptAPI.js", true);
		this.DW = DW("android.jar", true);
		this.FH = DW("annotations.jar", true);
		this.Hw = DW("framework.aidl", true);
    }
}


