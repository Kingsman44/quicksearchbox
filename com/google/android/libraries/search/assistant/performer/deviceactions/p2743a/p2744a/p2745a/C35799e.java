package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.core.content.C1882h;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.e */
/* compiled from: PG */
final class C35799e {

    /* renamed from: a */
    public static final C59071e f93784a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.e");

    /* renamed from: a */
    public static boolean m64188a(Context context) {
        if (Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        if (!m64195h(context.getApplicationContext(), "android.permission.BLUETOOTH_SCAN") || !m64195h(context.getApplicationContext(), "android.permission.BLUETOOTH_CONNECT")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m64189b(Context context) {
        if (!(context == null || context.getApplicationContext() == null)) {
            if (!m64188a(context)) {
                ((C59052c) ((C59052c) f93784a.mo56226d()).mo56372aa(51992)).mo56386p("App does not have bluetooth permission.");
                return false;
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m64190c(Context context) {
        if (context == null || context.getApplicationContext() == null || Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m64191d(Context context) {
        if (context == null || context.getApplicationContext() == null || Settings.Global.getInt(context.getApplicationContext().getContentResolver(), "zen_mode", 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m64192e(Context context) {
        PowerManager powerManager;
        if (context == null || context.getApplicationContext() == null || (powerManager = (PowerManager) context.getApplicationContext().getSystemService("power")) == null || !powerManager.isPowerSaveMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m64193f(Context context) {
        WifiManager wifiManager;
        if (context == null || context.getApplicationContext() == null || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) == null || !wifiManager.isWifiEnabled()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m64195h(Context context, String str) {
        return C1882h.m5137c(context, str) == 0;
    }

    /* renamed from: g */
    public static int m64194g(boolean z, int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return 3;
                }
                return z ? 2 : 1;
            } else if (z) {
                return 2;
            } else {
                ((C59052c) ((C59052c) f93784a.mo56224b()).mo56372aa(51991)).mo56389s("No change for the setting, skip updating, and current Change: %s.", C52112fr.m86507a(i));
                return 4;
            }
        } else if (!z) {
            return 1;
        } else {
            ((C59052c) ((C59052c) f93784a.mo56224b()).mo56372aa(51990)).mo56389s("No change for the setting, skip updating, and current Change: %s.", C52112fr.m86507a(i));
            return 4;
        }
    }
}
