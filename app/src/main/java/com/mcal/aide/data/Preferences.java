package com.mcal.aide.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.aide.common.d;
import com.aide.ui.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import iy;
import a6;
import c7;
import ag;
import com.aide.ui.AIDEApplication;

public class Preferences {
    private static Context j6;
	private static SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(AIDEApplication.getContext());
	
	
	public String gitLogin() {
		return preferences.getString("git_login", "");
	}
	
	public String gitPassword() {
		return preferences.getString("git_password", "");
	}
	
    public static boolean BT() {
		return XL().getBoolean("light_theme", true);
    }

    public static boolean DW() {
        return XL().getBoolean("complete_after_letter", true);
    }

	public static int EQ() {
        return Integer.parseInt(XL().getString("editor_font_size", ""));
    }

    public static boolean FH() {
        return XL().getBoolean("complete_all_types", true);
    }

    public static int Hw() {
		if (f.Mz()) {
			return 5;
		}
		return Integer.parseInt(XL().getString("autosafe_time", "-1"));
    }

    public static void I(String str) {
        SharedPreferences.Editor edit = XL().edit();
		edit.putString("user_keystore", str);
		edit.commit();
    }

    public static boolean J0() {
        return XL().getBoolean("optimze_dex", false);
    }

    public static boolean J8() {
		return XL().getBoolean("trainer_sound", true);
    }

    public static String KD() {
        return XL().getString("local_doc_dir_path", (String) null);
    }

    public static boolean Mr() {
        return XL().getBoolean("git_keep_ssh_session_info", false);
    }

    public static void Mz(String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(j6);
		SharedPreferences.Editor edit = defaultSharedPreferences.edit();
		Set<String> stringSet = defaultSharedPreferences.getStringSet("intel_libs_warned_projects", new HashSet());
		stringSet.add(str);
		edit.putStringSet("intel_libs_warned_projects", stringSet);
		edit.commit();
    }

    public static String OW() {
        if (XL().getBoolean("use_user_keystore", false)) {
			return XL().getString("user_keystore", "").trim();
		}
		return "";
    }

    public static int P8() {
        return Integer.parseInt(XL().getString("java_indentation_size", "4"));
    }

    public static boolean QX() {
        return XL().getBoolean("force_soft_keyboard", false);
    }

    public static boolean Qq() {
        return XL().getBoolean("editor_tabs", false);
    }

    public static String SI() {
        return XL().getString("app_language", "default");
    }

    public static void Sf(String str, List<String> list) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(j6).edit();
		if ("Java".equals(str)) {
			for (a6 a6Var : a6.values()) {
				edit.putBoolean(a6Var.FH(), list.contains(a6Var.getName()));
			}
		}
		if ("JavaScript".equals(str)) {
			for (c7 c7Var : c7.values()) {
				edit.putBoolean(c7Var.FH(), list.contains(c7Var.getName()));
			}
		}
		edit.commit();
    }

    public static String U2() {
        return XL().getString("git_user_email", "");
    }

    public static int VH() {
        return Integer.parseInt(XL().getString("cpp_indentation_size", "4"));
    }

    public static boolean Ws() {
        return XL().getBoolean("trainer_voice", false);
    }

    private static SharedPreferences XL() {
        return aM(j6);
    }

    public static int XX() {
        return Integer.parseInt(XL().getString("xml_indentation_size", "4"));
    }

    public static Map<String, List<String>> Zo() {
        HashMap hashMap = new HashMap();
		hashMap.put("Java", vy());
		hashMap.put("JavaScript", ei());
		return hashMap;
	}

    public static String a8() {
        return XL().getString("git_user_name", "");
    }

    private static SharedPreferences aM(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void aj(Context context, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        aM(j6).unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static String br() {
        return XL().getString("user_m2repositories", "");
    }
	
    public static void ca(String str) {
        SharedPreferences.Editor edit = XL().edit();
		edit.putString("local_doc_dir_path", str);
		edit.commit();
    }

    public static void cb(Context context, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        aM(j6).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static int cn() {
        return Integer.parseInt(XL().getString("max_single_imports", "0"));
    }

    public static boolean dx() {
        return XL().getBoolean("run_as_root", true);
    }

    public static List<String> ei() {
        ArrayList arrayList = new ArrayList();
		for (c7 c7Var : c7.values()) {
			if (XL().getBoolean(c7Var.FH(), false)) {
				arrayList.add(c7Var.name());
			}
		}
		return arrayList;
    }

    public static Map<String, Integer> er() {
        HashMap hashMap = new HashMap();
		hashMap.put("Java", Integer.valueOf(P8()));
		hashMap.put("JavaScript", Integer.valueOf(nw()));
		hashMap.put("XML", Integer.valueOf(XX()));
		hashMap.put("HTML", Integer.valueOf(rN()));
		return hashMap;
    }

    public static void g3(boolean z) {
        SharedPreferences.Editor edit = XL().edit();
		edit.putBoolean("trainer_voice", z);
		edit.commit();
    }

    public static boolean gW() {
        return XL().getBoolean("use_spaces_for_tabs", false);
    }

    public static boolean gn() {
        return XL().getBoolean("git_create_for_projects", false);
    }

    public static String j3() {
        return XL().getString("git_dot_ssh_dir", "");
    }

    public static boolean j6() {
        return XL().getBoolean("complete_after_dot", true);
    }

    public static boolean lg(String str) {
        return XL().getStringSet("intel_libs_warned_projects", (Set<String>) Collections.emptySet()).contains(str);
    }

    public static String lp() {
        return XL().getString("user_androidjar", "");
    }

    public static int nw() {
        return Integer.parseInt(XL().getString("js_indentation_size", "4"));
    }

    public static int rN() {
        return Integer.parseInt(XL().getString("html_indentation_size", "2"));
    }

    public static int ro() {
		return 1000;
    }

    public static boolean sh() {
        return XL().getBoolean("native_build_parallel", false);
    }

    public static int sy() {
        return Integer.parseInt(XL().getString("tabsize", "4"));
    }

    private static int tp(Context context) {
        return d.DW(context, 14);
    }

    public static int u7() {
        return Integer.parseInt(XL().getString("css_indentation_size", "2"));
    }

    public static boolean v5() {
        return XL().getBoolean("auto_sync_dropbox", true);
    }

    public static void vJ(boolean z) {
		SharedPreferences.Editor edit = XL().edit();
		edit.putBoolean("trainer_sound", z);
		edit.commit();
    }

    public static List<String> vy() {
        ArrayList arrayList = new ArrayList();
		for (a6 a6Var : a6.values()) {
			if (XL().getBoolean(a6Var.FH(), false)) {
				arrayList.add(a6Var.name());
			}
		}
		return arrayList;
    }

    public static boolean we() {
        return XL().getBoolean("browser_swipe", true);
    }

    public static void x9(String str) {
        SharedPreferences.Editor edit = XL().edit();
		edit.putString("user_androidjar", str);
		edit.commit();
    }

    public static boolean yS(Context context) {
        j6 = context;
		boolean z = false;
		PreferenceManager.setDefaultValues(context, 0x7f100004, false);
		PreferenceManager.setDefaultValues(context, 0x7f100006, false);
		PreferenceManager.setDefaultValues(context, 0x7f100009, false);
		PreferenceManager.setDefaultValues(context, 0x7f100007, false);
		PreferenceManager.setDefaultValues(context, 0x7f100003, false);
		PreferenceManager.setDefaultValues(context, 0x7f100005, false);
		SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor edit = defaultSharedPreferences.edit();
		for (a6 a6Var : a6.values()) {
			if (!defaultSharedPreferences.contains(a6Var.FH())) {
				edit.putBoolean(a6Var.FH(), a6.j6().contains(a6Var));
			}
		}
		for (c7 c7Var : c7.values()) {
			if (!defaultSharedPreferences.contains(c7Var.FH())) {
				edit.putBoolean(c7Var.FH(), c7.j6().contains(c7Var));
			}
		}
		if (!defaultSharedPreferences.contains("git_dot_ssh_dir")) {
			edit.putString("git_dot_ssh_dir", new File(ag.vy(), ".ssh").getPath());
		}
		if (!defaultSharedPreferences.contains("editor_font_size")) {
			edit.putString("editor_font_size", tp(context) + "");
			z = true;
		}
		if (!defaultSharedPreferences.contains("editor_tabs")) {
			edit.putBoolean("editor_tabs", true);
		}
		edit.commit();
		return z;
    }
}

