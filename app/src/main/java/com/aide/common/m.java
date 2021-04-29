package com.aide.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.aide.ui.u;
import com.aide.uidesigner.ProxyTextView;
import com.mcal.aide.data.Preferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class m {
    private static int WB = 123456;
    private static  boolean fY;
    private static Dialog jw;
    private static m mb;
    private static  boolean qp;

    static class a extends m {
        final Runnable AL;
        final String k2;
        final String w9;
        final String zh;

        class a implements DialogInterface.OnClickListener {
            a(m.a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                m.a.this.AL.run();
			}
        }

        a(String str, String str2, Runnable runnable, String str3) {
            this.k2 = str;
            this.zh = str2;
            this.AL = runnable;
            this.w9 = str3;
        }

        public Dialog Hw(Activity activity) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(this.k2).setCancelable(true).setPositiveButton(activity.getResources().getString(u.dialog_ok), new m.a.a(this));
                if (this.zh != null) {
                    builder = builder.setNegativeButton(this.zh, new b());
                }
                if (this.w9 != null) {
                    builder = builder.setTitle(this.w9);
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(true);
                return create;
		}
    }

    static class b extends m {
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

        class a extends EditText {
            final Activity WB;
            final AlertDialog[] mb;

            a(Context context, Activity activity, AlertDialog[] alertDialogArr) {
                super(context);
                this.WB = activity;
                this.mb = alertDialogArr;
            }

            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 66) {
                        return true;
                    }
                    return super.onKeyDown(i, keyEvent);
			}

            public boolean onKeyUp(int i, KeyEvent keyEvent) {
                if (i != 66) {
                        return super.onKeyUp(i, keyEvent);
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
                    this.mb[0].dismiss();
                    b.this.k2.j6(getText().toString().trim());
                    return true;
			}
        }

        class C0039b implements DialogInterface.OnClickListener {
            final Activity WB;
            final EditText mb;

            C0039b(b bVar, Activity activity, EditText editText) {
                this.WB = activity;
                this.mb = editText;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {
            final Activity WB;
            final EditText mb;

            c(Activity activity, EditText editText) {
                this.WB = activity;
                this.mb = editText;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.dismiss();
                    b.this.k2.j6(this.mb.getText().toString().trim());
            }
        }

        class d implements DialogInterface.OnClickListener {
            final Activity WB;
            final EditText mb;

            d(Activity activity, EditText editText) {
                this.WB = activity;
                this.mb = editText;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    b.this.w9.run();
            }
        }

        class e implements DialogInterface.OnCancelListener {
            e() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                if (b.this.cT != null) {
                        b.this.cT.run();
                    }
            }
        }

        class f implements DialogInterface.OnShowListener {
            final  EditText DW;
            final  Activity j6;

            f(b bVar, Activity activity, EditText editText) {
                this.j6 = activity;
                this.DW = editText;
            }

            public void onShow(DialogInterface dialogInterface) {
                ((InputMethodManager) this.j6.getSystemService("input_method")).showSoftInput(this.DW, 1);
                    this.DW.selectAll();
            }
        }

        class g implements TextView.OnEditorActionListener {
            private boolean k2;
            private boolean qp;
            final Activity WB;
            final AlertDialog[] jw;
            final EditText mb;

            g(Activity activity, EditText editText, AlertDialog[] alertDialogArr) {
                this.WB = activity;
                this.mb = editText;
                this.jw = alertDialogArr;
            }

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 6) {
                        ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                        this.jw[0].dismiss();
                        b.this.k2.j6(this.mb.getText().toString().trim());
                    }
                    return false;
			}
        }

        b(x xVar, String str, String str2, Runnable runnable, String str3, Runnable runnable2, String str4, boolean z) {
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
            AlertDialog[] alertDialogArr = new AlertDialog[1];
                a aVar = new a(activity, activity, alertDialogArr);
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(aVar).setMessage(this.zh).setCancelable(true).setPositiveButton(activity.getResources().getString(u.dialog_ok), new c(activity, aVar)).setNegativeButton(activity.getResources().getString(u.dialog_cancel), new C0039b(this, activity, aVar));
                if (this.AL != null) {
                    builder.setNeutralButton(this.AL, new d(activity, aVar));
                }
                if (this.hK != null) {
                    builder.setTitle(this.hK);
                }
                builder.setOnCancelListener(new e());
                alertDialogArr[0] = builder.create();
                alertDialogArr[0].setOnShowListener(new f(this, activity, aVar));
                aVar.setText(this.q7);
                aVar.setImeOptions(268435456);
                if (this.Z1) {
                    aVar.setInputType(ProxyTextView.INPUTTYPE_textPassword);
					res(activity, aVar);
                } else {
                    aVar.setInputType(ProxyTextView.INPUTTYPE_textVisiblePassword);
                }
                aVar.setTypeface(Typeface.DEFAULT);
                aVar.setOnEditorActionListener(new g(activity, aVar, alertDialogArr));
                alertDialogArr[0].setCanceledOnTouchOutside(true);
                return alertDialogArr[0];
		}
		
		public void res(Activity activity, EditText editText) {
			if (this.zh.startsWith("Enter password for keystore alias")) {
				editText.setText(PreferenceManager.getDefaultSharedPreferences(activity).getString("user_keystore_pswd_default", ""));
			} else if (!this.hK.equals("Git")) {
			} else {
				if (this.zh.equals("Username")) {
					editText.setText(Preferences.getGitLogin());
				} else if (this.zh.equals("Password")) {
					editText.setText(Preferences.getGitPassword());
				}
			}
		}
    }
	
    static class c implements x<List<Integer>> {
		final List DW;
        final x j6;
		
		c(x xVar, List list) {
            this.j6 = xVar;
            this.DW = list;
        }

        public void j6(List<Integer> list) {
            if (list.size() == 0) {
                    this.j6.j6(null);
                    return;
                }
                String str = "";
                for (Integer intValue : list) {
                    int intValue2 = intValue.intValue();
                    if (str.length() > 0) {
                        str = str + "|";
                    }
                    str = str + ((String) this.DW.get(intValue2));
                }
                this.j6.j6(str);
        }
    }

    //@cy(clazz = -3957994031737887603L, container = 5024868934807443193L, user = true)
    static class d extends m {
        //@fy
        private static  boolean Z1;
        //@gy
        private static  boolean n5;
        //@dy(field = -2705822232959017965L)
        final  String AL;
        //@dy(field = -4545935049185990127L)
        final  Runnable cT;
        //@dy(field = -147180733844110903L)
        final  String hK;
        //@dy(field = -3109437835704829527L)
        final  String k2;
        //@dy(field = -340651454849103696L)
        final  String q7;
        //@dy(field = -2843760192929113920L)
        final  Runnable w9;
        //@dy(field = -115180899482608704L)
        final  boolean zh;

        //@cy(clazz = 4518541730618480552L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = -306618884722427456L)
            a() {
            }

            //@ey(method = 728314647036685920L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(2006225127431985984L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (d.this.w9 != null) {
                        d.this.w9.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 2006225127431985984L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4518637929903224889L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = 351004146022665936L)
            b() {
            }

            //@ey(method = -1057966421903440552L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(1447334007669899869L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (d.this.cT != null) {
                        d.this.cT.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 1447334007669899869L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4518734129192032520L, container = 5024868934807443193L, user = true)
        class c implements DialogInterface.OnCancelListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = -471095076135206789L)
            c() {
            }

            //@ey(method = -406075861921701252L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (mb) {
                        iy.tp(-6982874719391048976L, this, dialogInterface);
                    }
                    dialogInterface.dismiss();
                    if (d.this.cT != null) {
                        d.this.cT.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -6982874719391048976L, this, dialogInterface);
                    }
                    
                }
            }
        }

        static {
            iy.Zo(d.class);
        }

        //@ey(method = -3119807819301761625L)
        d(String str, boolean z, String str2, Runnable runnable, String str3, Runnable runnable2, String str4) {
            this.k2 = str;
            this.zh = z;
            this.AL = str2;
            this.w9 = runnable;
            this.hK = str3;
            this.cT = runnable2;
            this.q7 = str4;
        }

        //@ey(method = -2376518919812464035L)
        public Dialog Hw(Activity activity) {
            try {
                if (Z1) {
                    iy.tp(386175114217446220L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(this.k2).setCancelable(this.zh);
                builder.setPositiveButton(this.AL, new a());
                if (this.hK != null) {
                    builder.setNegativeButton(this.hK, new b());
                }
                builder.setOnCancelListener(new c());
                if (this.q7 != null) {
                    builder.setTitle(this.q7);
                }
                AlertDialog create = builder.create();
                if (this.zh) {
                    create.setCanceledOnTouchOutside(true);
                }
                return create;
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, 386175114217446220L, this, activity);
                }
                
            }
			return null;
		}
    }

    //@cy(clazz = -3958089333636895296L, container = 5024868934807443193L, user = true)
    static class e extends m {
        //@fy
        private static  boolean Z1;
        //@gy
        private static  boolean n5;
        //@dy(field = 2339258695295420451L)
        final  Runnable AL;
        //@dy(field = 1162868027129320395L)
        final  Runnable cT;
        //@dy(field = 3010210189510445055L)
        final  Runnable hK;
        //@dy(field = 4081158189828950151L)
        final  String k2;
        //@dy(field = 290842424945807424L)
        final  String q7;
        //@dy(field = -936664084147187456L)
        final  String w9;
        //@dy(field = 2786398514532941888L)
        final  String zh;

        //@cy(clazz = 4518921842048929017L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = 204299777985713056L)
            a() {
            }

            //@ey(method = 414443234559120615L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(-1105875496172147304L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (e.this.hK != null) {
                        e.this.hK.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -1105875496172147304L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4519018043292181000L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = 93417178776658696L)
            b() {
            }

            //@ey(method = -79892099794367061L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(-92113997589922737L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    if (e.this.AL != null) {
                        e.this.AL.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -92113997589922737L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4519114244539496277L, container = 5024868934807443193L, user = true)
        class c implements DialogInterface.OnCancelListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = 139185997732003573L)
            c() {
            }

            //@ey(method = 1438782853341150817L)
            public void onCancel(DialogInterface dialogInterface) {
                try {
                    if (mb) {
                        iy.tp(-1088324711349508599L, this, dialogInterface);
                    }
                    if (e.this.cT != null) {
                        e.this.cT.run();
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.j3(th, -1088324711349508599L, this, dialogInterface);
                    }
                    
                }
            }
        }

        static {
            iy.Zo(e.class);
        }

        //@ey(method = 4055390224508474439L)
        e(String str, String str2, Runnable runnable, String str3, Runnable runnable2, Runnable runnable3, String str4) {
            this.k2 = str;
            this.zh = str2;
            this.AL = runnable;
            this.w9 = str3;
            this.hK = runnable2;
            this.cT = runnable3;
            this.q7 = str4;
        }

        //@ey(method = 2456860913533244495L)
        public Dialog Hw(Activity activity) {
            try {
                if (Z1) {
                    iy.tp(-2248646446936728765L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setMessage(this.k2).setCancelable(true).setPositiveButton(this.zh, new b()).setNegativeButton(this.w9, new a());
                builder.setOnCancelListener(new c());
                if (this.q7 != null) {
                    builder.setTitle(this.q7);
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(true);
                return create;
            } catch (Throwable th) {
                if (n5) {
                    iy.j3(th, -2248646446936728765L, this, activity);
                }
                
            }
			return null;
		}
    }

    //@cy(clazz = -3958184635531839695L, container = 5024868934807443193L, user = true)
    static class f extends m {
        //@gy
        private static  boolean cT;
        //@fy
        private static  boolean hK;
        //@dy(field = -1828464581841981261L)
        final  String AL;
        //@dy(field = -217139500585278423L)
        final  com.aide.common.k k2;
        //@dy(field = 902990038533264972L)
        final  String w9;
        //@dy(field = 1139217421207812208L)
        final  x zh;

        //@cy(clazz = 4519301965193734920L, container = 5024868934807443193L, user = true)
        class a implements TextView.OnEditorActionListener {
            //@fy
            private   boolean fY;
            //@gy
            private   boolean qp;
            //@dy(field = 727063074996654256L)
            final  Activity WB;
            //@dy(field = 872872156232043513L)
            final  KeyStrokeEditText mb;

            
            //@ey(method = 1193138050209763021L)
            a(Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            //@ey(method = -993813909150269361L)
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                try {
                    if (fY) {
                        iy.we(-2495709819222243729L, this, textView, new Integer(i), keyEvent);
                    }
                    if (i == 6) {
                        ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                        f.this.zh.j6(this.mb.getKeyStroke());
                    }
                    return false;
                } catch (Throwable th) {
                    if (qp) {
                        iy.U2(th, -2495709819222243729L, this, textView, new Integer(i), keyEvent);
                    }
                    
                }
				return false;
			}
        }

        //@cy(clazz = 4519398168395494549L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {
            //@fy
            private   boolean fY;
            //@gy
            private   boolean qp;
            //@dy(field = -2626545707327994240L)
            final  Activity WB;
            //@dy(field = 3273673371679468131L)
            final  KeyStrokeEditText mb;

            
            //@ey(method = 1487726621617546971L)
            b(Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            //@ey(method = 146905943471991925L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (fY) {
                        iy.EQ(25748084436690495L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.cancel();
                    f.this.zh.j6(null);
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, 25748084436690495L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4519494371601317472L, container = 5024868934807443193L, user = true)
        class c implements DialogInterface.OnClickListener {
            //@gy
            private   boolean fY;
            //@fy
            private   boolean jw;
            //@dy(field = -3954988831029866996L)
            final  Activity WB;
            //@dy(field = -947534754604164881L)
            final  KeyStrokeEditText mb;

            

            //@ey(method = -1332337576138910697L)
            c(f fVar, Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            //@ey(method = -29282468281994355L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (jw) {
                        iy.EQ(51985571984134480L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    dialogInterface.cancel();
                } catch (Throwable th) {
                    if (fY) {
                        iy.Mr(th, 51985571984134480L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4519590574811203689L, container = 5024868934807443193L, user = true)
        class d implements DialogInterface.OnClickListener {
            //@fy
            private   boolean fY;
            //@gy
            private   boolean qp;
            //@dy(field = -50886746555055888L)
            final  Activity WB;
            //@dy(field = -1598960801367828707L)
            final  KeyStrokeEditText mb;

            //@ey(method = -697440138824731239L)
            d(Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.WB = activity;
                this.mb = keyStrokeEditText;
            }

            //@ey(method = -474917893937840045L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (fY) {
                        iy.EQ(75752972867770851L, this, dialogInterface, new Integer(i));
                    }
                    ((InputMethodManager) this.WB.getSystemService("input_method")).hideSoftInputFromWindow(this.mb.getWindowToken(), 0);
                    f.this.zh.j6(this.mb.getKeyStroke());
                } catch (Throwable th) {
                    if (qp) {
                        iy.Mr(th, 75752972867770851L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4519686778025153200L, container = 5024868934807443193L, user = true)
        class e implements DialogInterface.OnShowListener {
            //@fy
            private   boolean FH;
            //@gy
            private   boolean Hw;
            //@dy(field = 2048355850133078500L)
            final  KeyStrokeEditText DW;
            //@dy(field = 3996684130194374825L)
            final  Activity j6;

            

            //@ey(method = 2011298644174371072L)
            e(f fVar, Activity activity, KeyStrokeEditText keyStrokeEditText) {
                this.j6 = activity;
                this.DW = keyStrokeEditText;
            }

            //@ey(method = 31190422741758280L)
            public void onShow(DialogInterface dialogInterface) {
                try {
                    if (FH) {
                        iy.tp(23183029202919651L, this, dialogInterface);
                    }
                    ((InputMethodManager) this.j6.getSystemService("input_method")).showSoftInput(this.DW, 1);
                    this.DW.selectAll();
                } catch (Throwable th) {
                    if (Hw) {
                        iy.j3(th, 23183029202919651L, this, dialogInterface);
                    }
                    
                }
            }
        }

        static {
            iy.Zo(f.class);
        }

        ////@ey(method = -464795789004076383L)
        f(com.aide.common.k kVar, x xVar, String str, String str2) {
            this.k2 = kVar;
            this.zh = xVar;
            this.AL = str;
            this.w9 = str2;
        }

        ////@ey(method = 2538487364002070459L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(-4965164946137233320L, this, activity);
                }
                KeyStrokeEditText keyStrokeEditText = new KeyStrokeEditText(activity);
                keyStrokeEditText.setKeyStroke(this.k2);
                keyStrokeEditText.setOnEditorActionListener(new a(activity, keyStrokeEditText));
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setView(keyStrokeEditText).setMessage(this.AL).setCancelable(true).setPositiveButton(activity.getResources().getString(u.dialog_ok), new d(activity, keyStrokeEditText)).setNegativeButton(activity.getResources().getString(u.dialog_cancel), new c(this, activity, keyStrokeEditText)).setNeutralButton("Default", new b(activity, keyStrokeEditText));
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog create = builder.create();
                create.setOnShowListener(new e(this, activity, keyStrokeEditText));
                return create;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, -4965164946137233320L, this, activity);
                }
                
            }
			return null;
		}
    }

    //@cy(clazz = -3958279937422720800L, container = 5024868934807443193L, user = true)
    static class g extends m {
        //@gy
        private static  boolean cT;
        //@fy
        private static  boolean hK;
        //@dy(field = -1432433651572329035L)
        final  x AL;
        //@dy(field = 3028732705941448765L)
        final  boolean k2;
        //@dy(field = 3315739999927215465L)
        final  String w9;
        //@dy(field = -1190970957400295671L)
        final  List zh;

        //@cy(clazz = 4519682100052898261L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = -7632027175732812L)
            a() {
            }

            //@ey(method = -811153367966802776L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(3437669693011932960L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    g.this.AL.j6(g.this.zh.get(i));
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 3437669693011932960L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        static {
            iy.Zo(g.class);
        }

        //@ey(method = -5093730844501790645L)
        g(boolean z, List list, x xVar, String str) {
            this.k2 = z;
            this.zh = list;
            this.AL = xVar;
            this.w9 = str;
        }

        //@ey(method = 1010893011337355800L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(-1758519470366775573L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(this.k2).setItems((CharSequence[]) this.zh.toArray(new CharSequence[0]), new a());
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(this.k2);
                return create;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, -1758519470366775573L, this, activity);
                }
                
            }
			return null;
		}
    }

    //@cy(clazz = -3958375239309538611L, container = 5024868934807443193L, user = true)
    static class h extends m {
        //@gy
        private static  boolean cT;
        //@fy
        private static  boolean hK;
        //@dy(field = -1865370654922971735L)
        final  x AL;
        //@dy(field = 3843708164918210629L)
        final  List k2;
        //@dy(field = 3984073971576475393L)
        final  String w9;
        //@dy(field = -6682533287325437613L)
        final  String zh;

        //@cy(clazz = 4520062246626419040L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = -15233529595183475L)
            a() {
            }

            //@ey(method = -1268371417224799985L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(-1532858033377679073L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
                    if (checkedItemPositions != null) {
                        for (int i2 = 0; i2 < h.this.k2.size(); i2++) {
                            if (checkedItemPositions.get(i2)) {
                                h.this.AL.j6(h.this.k2.get(i2));
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, -1532858033377679073L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4520158453745193961L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {
            //@fy
            private   boolean WB;
            //@gy
            private   boolean mb;

            
            //@ey(method = 262389115707171941L)
            b(h hVar) {
            }

            //@ey(method = -1265374264278481929L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (WB) {
                        iy.EQ(-784179588785311992L, this, dialogInterface, new Integer(i));
                    }
                } catch (Throwable th) {
                    if (mb) {
                        iy.Mr(th, -784179588785311992L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        static {
            iy.Zo(h.class);
        }

        //@ey(method = 8116035040652292936L)
        h(List list, String str, x xVar, String str2) {
            this.k2 = list;
            this.zh = str;
            this.AL = xVar;
            this.w9 = str2;
        }

        //@ey(method = 2304848254897192840L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(456209340131499376L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(true).setSingleChoiceItems((CharSequence[]) this.k2.toArray(new CharSequence[0]), this.k2.indexOf(this.zh), new b(this)).setPositiveButton(activity.getResources().getString(u.dialog_ok), new a());
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(true);
                return create;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, 456209340131499376L, this, activity);
                }
                
            }
			return null;
		}
    }

    //@cy(clazz = -3958470541192293128L, container = 5024868934807443193L, user = true)
    static class i extends m {
        //@gy
        private static  boolean cT;
        //@fy
        private static  boolean hK;
        //@dy(field = -2434806305319443328L)
        final  x AL;
        //@dy(field = -1152107920128976835L)
        final  List k2;
        //@dy(field = -2743689745000684184L)
        final  String w9;
        //@dy(field = -110085374519919708L)
        final  List zh;

        //@cy(clazz = 4520442404914297257L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = -288550913290333240L)
            a() {
            }

            //@ey(method = 939821529682376064L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(1704067078611090717L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    ArrayList arrayList = new ArrayList();
                    SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
                    if (checkedItemPositions != null) {
                        for (int i2 = 0; i2 < i.this.zh.size(); i2++) {
                            if (checkedItemPositions.get(i2)) {
                                arrayList.add(Integer.valueOf(i2));
                            }
                        }
                    }
                    i.this.AL.j6(arrayList);
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 1704067078611090717L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4520538613991579824L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnMultiChoiceClickListener {
            //@gy
            private   boolean DW;
            //@fy
            private   boolean j6;

            

            //@ey(method = -193140971452371352L)
            b(i iVar) {
            }

            //@ey(method = -1662625124804659683L)
            public void onClick(DialogInterface dialogInterface, int i, boolean z) {
                try {
                    if (j6) {
                        iy.we(1233984580418882220L, this, dialogInterface, new Integer(i), new Boolean(z));
                    }
                } catch (Throwable th) {
                    if (DW) {
                        iy.U2(th, 1233984580418882220L, this, dialogInterface, new Integer(i), new Boolean(z));
                    }
                    
                }
            }
        }

        static {
            iy.Zo(i.class);
        }

        //@ey(method = -803487139721104275L)
        i(List list, List list2, x xVar, String str) {
            this.k2 = list;
            this.zh = list2;
            this.AL = xVar;
            this.w9 = str;
        }

        //@ey(method = -3537804853451679195L)
        public Dialog Hw(Activity activity) {
            try {
                if (hK) {
                    iy.tp(-76967748890346780L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                int size = this.k2.size();
                boolean[] zArr = new boolean[size];
                for (int i = 0; i < size; i++) {
                    zArr[i] = ((Boolean) this.k2.get(i)).booleanValue();
                }
                builder.setCancelable(true).setMultiChoiceItems((CharSequence[]) this.zh.toArray(new CharSequence[0]), zArr, new b(this)).setPositiveButton(activity.getResources().getString(u.dialog_ok), new a());
                if (this.w9 != null) {
                    builder.setTitle(this.w9);
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(true);
                return create;
            } catch (Throwable th) {
                if (cT) {
                    iy.j3(th, -76967748890346780L, this, activity);
                }
                
            }
			return null;
		}
    }

    //@cy(clazz = -3958565843070984351L, container = 5024868934807443193L, user = true)
    static class j extends m {
        //@gy
        private static  boolean hK;
        //@fy
        private static  boolean w9;
        //@dy(field = -445866953976548720L)
        final  String AL;
        //@dy(field = -2825075644980759552L)
        final  List k2;
        //@dy(field = 2889050891286794940L)
        final  x zh;

        //@cy(clazz = 4520822574916532912L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = -8754046200451695L)
            a() {
            }

            //@ey(method = -797167275361479497L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(3066319009640289360L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    j.this.zh.j6(Integer.valueOf(i));
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 3066319009640289360L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        static {
            iy.Zo(j.class);
        }

        //@ey(method = -311045958953599601L)
        j(List list, x xVar, String str) {
            this.k2 = list;
            this.zh = xVar;
            this.AL = str;
        }

        //@ey(method = -3021180994019088999L)
        public Dialog Hw(Activity activity) {
            try {
                if (w9) {
                    iy.tp(-2548067668697914160L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(true).setItems((CharSequence[]) this.k2.toArray(new CharSequence[0]), new a());
                if (this.AL != null) {
                    builder.setTitle(this.AL);
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(true);
                return create;
            } catch (Throwable th) {
                if (hK) {
                    iy.j3(th, -2548067668697914160L, this, activity);
                }
                
            }
			return null;
		}
    }

    ////@cy(clazz = -3958661144945612280L, container = 5024868934807443193L, user = true)
    static class kk extends m {
        //@fy
        private static  boolean cT;
        //@gy
        private static  boolean q7;
        //@dy(field = 4142274710792878771L)
        final  String AL;
        //@dy(field = 1976087364605075148L)
        final  String hK;
        //@dy(field = -2449926334565788320L)
        final  List k2;
        //@dy(field = 1159516423046351696L)
        final  Runnable w9;
        //@dy(field = 1034440211150176132L)
        final  x zh;

        //@cy(clazz = 4521202756633126005L, container = 5024868934807443193L, user = true)
        class a implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = 295814399519952288L)
            a() {
            }

            //@ey(method = 145603909606991280L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(1186625401691336704L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    m.kk.this.w9.run();
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 1186625401691336704L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        //@cy(clazz = 4521298969627423864L, container = 5024868934807443193L, user = true)
        class b implements DialogInterface.OnClickListener {
            //@gy
            private   boolean jw;
            //@fy
            private   boolean mb;

            
            //@ey(method = 46465017703169871L)
            b() {
            }

            //@ey(method = 21529186890582355L)
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    if (mb) {
                        iy.EQ(2127707248997716839L, this, dialogInterface, new Integer(i));
                    }
                    dialogInterface.dismiss();
                    m.kk.this.zh.j6(Integer.valueOf(i));
                } catch (Throwable th) {
                    if (jw) {
                        iy.Mr(th, 2127707248997716839L, this, dialogInterface, new Integer(i));
                    }
                    
                }
            }
        }

        static {
            iy.Zo(k.class);
        }

        ////@ey(method = 8442672855902603616L)
        kk(List list, x xVar, String str, Runnable runnable, String str2) {
            this.k2 = list;
            this.zh = xVar;
            this.AL = str;
            this.w9 = runnable;
            this.hK = str2;
        }

        //@ey(method = -2296044638408974725L)
        public Dialog Hw(Activity activity) {
            try {
                if (cT) {
                    iy.tp(595647118095645911L, this, activity);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setCancelable(true).setItems((CharSequence[]) this.k2.toArray(new CharSequence[0]), new b()).setPositiveButton(this.AL, new a());
                if (this.hK != null) {
                    builder.setTitle(this.hK);
                }
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(true);
                return create;
            } catch (Throwable th) {
                if (q7) {
                    iy.j3(th, 595647118095645911L, this, activity);
                }
                
            }
			return null;
		}
    }

    static {
        try {
            iy.Zo(m.class);
            if (fY) {
                iy.gn(2645945776233719512L, (Object) null);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 2645945776233719512L, (Object) null);
            }
            
        }
    }

    //@ey(method = -68984221935676329L)
    public m() {
        try {
            if (fY) {
                iy.gn(3092900090037729216L, (Object) null);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, 3092900090037729216L, (Object) null);
            }
            
        }
    }

    //@ey(method = 3343915879014951045L)
    public static void BT(Activity activity, String str, String str2) {
        try {
            if (fY) {
                iy.we(-698948115640071760L, (Object) null, activity, str, str2);
            }
            vy(activity, str, str2, (String) null, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.U2(th, -698948115640071760L, (Object) null, activity, str, str2);
            }
            
        }
    }

    //@ey(method = 561543518076574032L)
    public static void EQ(Activity activity, String str, String str2, k kVar, x<k> xVar) {
        gW(activity, new m.f(kVar, xVar, str2, str));
    }

    //@ey(method = -1837416764125363883L)
    public static void J0(Activity activity, String str, List<String> list, List<String> list2, String str2, x<String> xVar) {
        Activity activity2 = activity;
        String str3 = str;
        List<String> list3 = list;
        List<String> list4 = list2;
        String str4 = str2;
        x<String> xVar2 = xVar;
        try {
            if (fY) {
                iy.QX(180520758049932960L, (Object) null, new Object[]{activity2, str3, list3, list4, str4, xVar2});
            }
            ArrayList arrayList = new ArrayList();
            List arrayList2 = str4 == null ? new ArrayList() : Arrays.asList(str4.split("\\|"));
            for (String contains : list) {
                arrayList.add(Boolean.valueOf(arrayList2.contains(contains)));
            }
            we(activity2, str3, list4, arrayList, new c(xVar2, list3));
        } catch (Throwable th) {
            if (qp) {
                iy.rN(th, 180520758049932960L, (Object) null, new Object[]{activity2, str3, list3, list4, str4, xVar2});
            }
            
        }
    }

    //@ey(method = -1638140963074913828L)
    public static void J8(Activity activity, String str, String str2, x<String> xVar) {
        try {
            if (fY) {
                iy.J0(-69390917322171561L, (Object) null, activity, str, str2, xVar);
            }
            U2(activity, str, str2, (String) null, "", true, xVar, (Runnable) null, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, -69390917322171561L, (Object) null, activity, str, str2, xVar);
            }
            
        }
    }

    // JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    //@ey(method = 1189294901341037736L)
    public static void KD(Activity activity, String str, String str2, boolean z, String str3, Runnable runnable, String str4, Runnable runnable2) {
        int i2;
        Activity activity2 = activity;
        boolean z2 = z;
        try {
            if (fY) {
                iy.QX(1055828477187536269L, (Object) null, new Object[]{activity2, str, str2, new Boolean(z2), str3, runnable, str4, runnable2});
            }
            i2 = 8;
            try {
                d dVar = new d(str2, z, str3, runnable, str4, runnable2, str);
                gW(activity2, dVar);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                }
                
            }
        } catch (Throwable th2) {
           
            i2 = 8;
            if (qp) {
                Object[] objArr = new Object[i2];
                objArr[0] = activity2;
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = new Boolean(z2);
                objArr[4] = str3;
                objArr[5] = runnable;
                objArr[6] = str4;
                objArr[7] = runnable2;
                
            }
            
        }
    }

    // JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    //@ey(method = 5911326403260571941L)
    public static void Mr(Activity activity, String str, String str2, String str3, String str4, x<String> xVar, Runnable runnable) {
        int i2;
        try {
            if (fY) {
                iy.QX(168187044948249936L, (Object) null, new Object[]{activity, str, str2, str3, str4, xVar, runnable});
            }
            i2 = 7;
            try {
                U2(activity, str, str2, str3, str4, false, xVar, (Runnable) null, runnable);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                }
                
            }
        } catch (Throwable th2) {
            
            
        }
    }

    //@ey(method = 7811129277306122139L)
    public static void P8(Activity activity, String str, Throwable th) {
        try {
            if (fY) {
                iy.we(3130417175904377728L, (Object) null, activity, str, th);
            }
            BT(activity, str, th.getMessage());
        } catch (Throwable th2) {
            if (qp) {
                iy.U2(th2, 3130417175904377728L, (Object) null, activity, str, th);
            }
            
        }
    }

    //@ey(method = -2645716499461502976L)
    public static void QX(Activity activity, String str, List<String> list, String str2, x<String> xVar) {
        try {
            if (fY) {
                iy.J8(-3760047611910473927L, (Object) null, activity, str, list, str2, xVar);
            }
            gW(activity, new h(list, str2, xVar, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -3760047611910473927L, (Object) null, activity, str, list, str2, xVar);
            }
            
        }
    }

    // JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    //@ey(method = -2506856648704293672L)
    public static void SI(Activity activity, String str, String str2, boolean z, Runnable runnable, Runnable runnable2) {
        int i2;
        boolean z2 = z;
        try {
            if (fY) {
                iy.QX(5105403798688451025L, (Object) null, new Object[]{activity, str, str2, new Boolean(z2), runnable, runnable2});
            }
            i2 = 6;
            try {
                KD(activity, str, str2, z, activity.getResources().getString(u.dialog_ok), runnable, (String) null, runnable2);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = new Boolean(z2);
                    objArr[4] = runnable;
                    objArr[5] = runnable2;
                    iy.rN(th, 5105403798688451025L, (Object) null, objArr);
                }
                
            }
        } catch (Throwable th2) {
            
            i2 = 6;
            if (qp) {
            }
            
        }
    }

    // JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    //@ey(method = -1566426823076169451L)
    private static void U2(Activity activity, String str, String str2, String str3, String str4, boolean z, x<String> xVar, Runnable runnable, Runnable runnable2) {
        int i2;
        Activity activity2 = activity;
        boolean z2 = z;
        try {
            if (fY) {
                iy.QX(3054568361754767520L, (Object) null, new Object[]{activity2, str, str2, str3, str4, new Boolean(z2), xVar, runnable, runnable2});
            }
            i2 = 9;
            try {
                b bVar = new b(xVar, str2, str3, runnable2, str, runnable, str4, z);
                gW(activity2, bVar);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity2;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = str4;
                    objArr[5] = new Boolean(z2);
                    objArr[6] = xVar;
                    objArr[7] = runnable;
                    objArr[8] = runnable2;
                    iy.rN(th, 3054568361754767520L, (Object) null, objArr);
                }
                
            }
        } catch (Throwable th2) {
            
            i2 = 9;
            if (qp) {
            }
            
        }
    }

    //@ey(method = 644383161833065479L)
    public static void VH(Activity activity, String str, List<String> list, x<String> xVar) {
        try {
            if (fY) {
                iy.J0(-148070399176192040L, (Object) null, activity, str, list, xVar);
            }
            gn(activity, str, list, true, xVar);
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, -148070399176192040L, (Object) null, activity, str, list, xVar);
            }
            
        }
    }

    //@ey(method = -2491714159410861875L)
    public static void Ws(Activity activity, String str, String str2, x<String> xVar, Runnable runnable) {
        try {
            if (fY) {
                iy.J8(906927055807916440L, (Object) null, activity, str, str2, xVar, runnable);
            }
            U2(activity, str, str2, (String) null, "", true, xVar, runnable, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 906927055807916440L, (Object) null, activity, str, str2, xVar, runnable);
            }
            
        }
    }

    //@ey(method = 47542479352606348L)
    public static void XL(Activity activity, int i2, int i3, String str, x<String> xVar) {
        try {
            if (fY) {
                iy.J8(151762829408225239L, (Object) null, activity, new Integer(i2), new Integer(i3), str, xVar);
            }
            U2(activity, activity.getResources().getString(i2), activity.getResources().getString(i3), (String) null, str, false, xVar, (Runnable) null, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 151762829408225239L, (Object) null, activity, new Integer(i2), new Integer(i3), str, xVar);
            }
            
        }
    }

    //@ey(method = 3749389328480235776L)
    public static Dialog Zo(Activity activity, int i2) {
        try {
            if (fY) {
                iy.EQ(2506262724897775411L, (Object) null, activity, new Integer(i2));
            }
            if (mb == null || i2 != WB) {
                return null;
            }
            Dialog Hw = mb.Hw(activity);
            jw = Hw;
            mb = null;
            return Hw;
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, 2506262724897775411L, (Object) null, activity, new Integer(i2));
            }
            
        }
		return null;
	}

    //@ey(method = 5838149377740180180L)
    public static void a8(Activity activity, int i2, int i3, Runnable runnable, Runnable runnable2) {
        try {
            if (fY) {
                iy.J8(-1503547478896582951L, (Object) null, activity, new Integer(i2), new Integer(i3), runnable, runnable2);
            }
            yS(activity, activity.getResources().getString(i2), activity.getResources().getString(i3), activity.getResources().getString(u.dialog_yes), runnable, activity.getResources().getString(u.dialog_no), runnable2, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -1503547478896582951L, (Object) null, activity, new Integer(i2), new Integer(i3), runnable, runnable2);
            }
            
        }
    }

    //@ey(method = -5100645768597054232L)
    public static void aM(Activity activity, String str, String str2, String str3, x<String> xVar) {
        try {
            if (fY) {
                iy.J8(-4588375171618658035L, (Object) null, activity, str, str2, str3, xVar);
            }
            U2(activity, str, str2, (String) null, str3, false, xVar, (Runnable) null, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -4588375171618658035L, (Object) null, activity, str, str2, str3, xVar);
            }
            
        }
    }

    //@ey(method = 595998817527044448L)
    public static void ei(Activity activity, String str, String str2, Runnable runnable) {
        try {
            if (fY) {
                iy.J0(-904460221399655865L, (Object) null, activity, str, str2, runnable);
            }
            nw(activity, str, str2, runnable, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, -904460221399655865L, (Object) null, activity, str, str2, runnable);
            }
            
        }
    }

    //@ey(method = 408104555774484455L)
    public static void er(Activity activity, String str, String str2, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        try {
            if (fY) {
                iy.QX(-462102440538914400L, (Object) null, new Object[]{activity, str, str2, runnable, runnable2, runnable3});
            }
            yS(activity, str, str2, activity.getResources().getString(u.dialog_yes), runnable, activity.getResources().getString(u.dialog_no), runnable2, runnable3);
        } catch (Throwable th) {
            if (qp) {
                iy.rN(th, -462102440538914400L, (Object) null, new Object[]{activity, str, str2, runnable, runnable2, runnable3});
            }
            
        }
    }

    //@ey(method = -3883324325689152896L)
    public static void gW(Activity activity, m mVar) {
        try {
            if (fY) {
                iy.EQ(1351077689876059017L, (Object) null, activity, mVar);
            }
            mb = mVar;
            if (jw == null || !jw.isShowing()) {
                activity.removeDialog(WB);
                activity.showDialog(WB);
            }
        } catch (Throwable th) {
            if (qp) {
                iy.Mr(th, 1351077689876059017L, (Object) null, activity, mVar);
            }
            
        }
    }

    //@ey(method = 1784540900011794756L)
    private static void gn(Activity activity, String str, List<String> list, boolean z, x<String> xVar) {
        try {
            if (fY) {
                iy.J8(402897956292350155L, (Object) null, activity, str, list, new Boolean(z), xVar);
            }
            gW(activity, new g(z, list, xVar, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 402897956292350155L, (Object) null, activity, str, list, new Boolean(z), xVar);
            }
            
        }
    }

    // JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    //@ey(method = -1362516939658505397L)
    public static void j3(Activity activity, String str, String str2, String str3, x<String> xVar, Runnable runnable) {
        int i2;
        try {
            if (fY) {
                iy.QX(-2288868229835334720L, (Object) null, new Object[]{activity, str, str2, str3, xVar, runnable});
            }
            i2 = 6;
            try {
                U2(activity, str, str2, (String) null, str3, false, xVar, runnable, (Runnable) null);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = xVar;
                    objArr[5] = runnable;
                    iy.rN(th, -2288868229835334720L, (Object) null, objArr);
                }
                
            }
        } catch (Throwable th2) {
            
            i2 = 6;
            if (qp) {
            }
            
        }
    }

    // JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
    //@ey(method = -438266126925518752L)
    public static void lg(Activity activity, int i2, int i3, List<String> list, Runnable runnable, Runnable runnable2) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        try {
            if (fY) {
                iy.QX(4308149308601165769L, (Object) null, new Object[]{activity, new Integer(i5), new Integer(i6), list, runnable, runnable2});
            }
            String str = "\n";
            for (String str2 : list) {
                str = (str + "\n") + str2;
            }
            i4 = 6;
            try {
                yS(activity, activity.getResources().getString(i5), activity.getResources().getString(i6) + str, activity.getResources().getString(u.dialog_no), runnable2, activity.getResources().getString(u.dialog_yes), runnable, (Runnable) null);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i4];
                    objArr[0] = activity;
                    objArr[1] = new Integer(i5);
                    objArr[2] = new Integer(i6);
                    objArr[3] = list;
                    objArr[4] = runnable;
                    objArr[5] = runnable2;
                    iy.rN(th, 4308149308601165769L, (Object) null, objArr);
                }
                
            }
        } catch (Throwable th2) {
            i4 = 6;
            if (qp) {
            }
            
        }
    }

    //@ey(method = -747105767102146245L)
    public static void nw(Activity activity, String str, String str2, Runnable runnable, Runnable runnable2) {
        try {
            if (fY) {
                iy.J8(2472989728482213624L, (Object) null, activity, str, str2, runnable, runnable2);
            }
            SI(activity, str, str2, true, runnable, runnable2);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 2472989728482213624L, (Object) null, activity, str, str2, runnable, runnable2);
            }
            
        }
    }

    //@ey(method = -4029405619039475272L)
    public static void rN(Activity activity, String str, String str2, Runnable runnable, Runnable runnable2) {
        try {
            if (fY) {
                iy.J8(-2371412091065305893L, (Object) null, activity, str, str2, runnable, runnable2);
            }
            er(activity, str, str2, runnable, runnable2, (Runnable) null);
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -2371412091065305893L, (Object) null, activity, str, str2, runnable, runnable2);
            }
            
        }
    }

    //@ey(method = 236120766311045056L)
    public static void tp(Activity activity, String str, List<String> list, String str2, x<Integer> xVar, Runnable runnable) {
        Activity activity2 = activity;
        try {
            if (fY) {
                iy.QX(-2909215533603728327L, (Object) null, new Object[]{activity2, str, list, str2, xVar, runnable});
            }
            gW(activity2, new m.kk(list, xVar, str2, runnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.rN(th, -2909215533603728327L, (Object) null, new Object[]{activity2, str, list, str2, xVar, runnable});
            }
            
        }
    }

    //@ey(method = 275230826407298301L)
    public static void u7(Activity activity, String str, List<String> list, x<Integer> xVar) {
        try {
            if (fY) {
                iy.J0(3990082611457703920L, (Object) null, activity, str, list, xVar);
            }
            gW(activity, new j(list, xVar, str));
        } catch (Throwable th) {
            if (qp) {
                iy.a8(th, 3990082611457703920L, (Object) null, activity, str, list, xVar);
            }
            
        }
    }

    //@ey(method = 1676513858757769515L)
    public static void v5() {
        try {
            if (fY) {
                iy.gn(-1930894419615225120L, (Object) null);
            }
            if (jw != null) {
                jw.dismiss();
            }
        } catch (Throwable th) {
            if (qp) {
                iy.aM(th, -1930894419615225120L, (Object) null);
            }
            
        }
    }

    //@ey(method = 532183942647000072L)
    public static void vy(Activity activity, String str, String str2, String str3, Runnable runnable) {
        try {
            if (fY) {
                iy.J8(-272934343473094215L, (Object) null, activity, str, str2, str3, runnable);
            }
            gW(activity, new a(str2, str3, runnable, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, -272934343473094215L, (Object) null, activity, str, str2, str3, runnable);
            }
            
        }
    }

    //@ey(method = 197454798652248660L)
    public static void we(Activity activity, String str, List<String> list, List<Boolean> list2, x<List<Integer>> xVar) {
        try {
            if (fY) {
                iy.J8(2946678106909654611L, (Object) null, activity, str, list, list2, xVar);
            }
            gW(activity, new i(list2, list, xVar, str));
        } catch (Throwable th) {
            if (qp) {
                iy.lg(th, 2946678106909654611L, (Object) null, activity, str, list, list2, xVar);
            }
            
        }
    }

    // JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    //@ey(method = 1674966191273497083L)
    public static void yS(Activity activity, String str, String str2, String str3, Runnable runnable, String str4, Runnable runnable2, Runnable runnable3) {
        int i2;
        Activity activity2 = activity;
        try {
            if (fY) {
                iy.QX(-7872005745516604032L, (Object) null, new Object[]{activity2, str, str2, str3, runnable, str4, runnable2, runnable3});
            }
            i2 = 8;
            try {
                e eVar = new e(str2, str3, runnable, str4, runnable2, runnable3, str);
                gW(activity2, eVar);
            } catch (Throwable th) {
                th = th;
                if (qp) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = activity2;
                    objArr[1] = str;
                    objArr[2] = str2;
                    objArr[3] = str3;
                    objArr[4] = runnable;
                    objArr[5] = str4;
                    objArr[6] = runnable2;
                    objArr[7] = runnable3;
                    iy.rN(th, -7872005745516604032L, (Object) null, objArr);
                }
                
            }
        } catch (Throwable th2) {
           
            i2 = 8;
            if (qp) {
            }
            
        }
    }

    // access modifiers changed from: protected */
    //@ey(method = -2282499318135624764L)
    public abstract Dialog Hw(Activity activity);
}
