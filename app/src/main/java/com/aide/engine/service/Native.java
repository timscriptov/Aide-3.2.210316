//
// Decompiled by Jadx - 4083ms
//
package com.aide.engine.service;

import android.content.Context;
import android.os.Build;

public class Native {
    public static Native j6 = new Native();

    public Native() {
    }

    public int a(int i, int i2) {
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 7:
            case 12:
                if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 12) {
                    return 7;
                }
                if (i2 == 9 || i2 == 13 || i2 == 14) {
                    return i2;
                }
                break;
            case 9:
                if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 12) {
                    return 9;
                }
                if (i2 == 9 || i2 == 13 || i2 == 14) {
                    return i2;
                }
                break;
            case 13:
                if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 12 || i2 == 13) {
                    return 13;
                }
                if (i2 == 14) {
                    return 14;
                }
                break;
            case 14:
                if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 13) {
                    return 14;
                }
        }
        return 10;
    }

    public boolean b(int i, int i2) {
        switch (i) {
            case 3:
                if (i2 == 5 || i2 == 7 || i2 == 9 || i2 == 13 || i2 == 14) {
                    return true;
                }
                break;
            case 4:
                if (i2 == 5 || i2 == 7 || i2 == 9 || i2 == 13 || i2 == 14) {
                    return true;
                }
                break;
            case 5:
                if (i2 == 7 || i2 == 9 || i2 == 13 || i2 == 14) {
                    return true;
                }
                break;
            case 7:
                if (i2 == 9 || i2 == 13 || i2 == 14) {
                    return true;
                }
                break;
            case 9:
                if (i2 == 13 || i2 == 14) {
                    return true;
                }
                break;
            case 12:
                if (i2 == 7 || i2 == 9 || i2 == 13 || i2 == 14) {
                    return true;
                }
                break;
            case 13:
                if (i2 == 14) {
                    return true;
                }
                break;
        }
        return false;
    }

    public int c(int i) {
        switch (i) {
            case 0:
                return 11;
            case 1:
                return 3;
            case 2:
                return 5;
            case 3:
                return 12;
            case 4:
                return 7;
            case 5:
                return 9;
            case 6:
                return 13;
            case 7:
                return 14;
            case 8:
                return 1;
            case 9:
                return 2;
            default:
                return 0;
        }
    }

    public int d(int i) {
        return i;
    }

    public void init(Context context) {
    }

    public boolean isX86() {
        return Build.CPU_ABI.contains("x86");
    }
}

