package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;

/* compiled from: PG */
public class RadioUtils {

    /* renamed from: a */
    private static Boolean f192506a;

    /* renamed from: b */
    private static Boolean f192507b;

    private RadioUtils() {
    }

    private static int getCellDataActivity() {
        TraceEvent c = TraceEvent.m107032c("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) C72382h.f192527a.getSystemService("phone")).getDataActivity();
                if (c != null) {
                    TraceEvent.m107031b(c.f192513d, 0);
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (c == null) {
                    return -1;
                }
                TraceEvent.m107031b(c.f192513d, 0);
                return -1;
            }
        } catch (Throwable th) {
            C72394t.m107052a(th, th);
        }
        throw th;
    }

    private static int getCellSignalLevel() {
        TraceEvent c = TraceEvent.m107032c("RadioUtils::getCellSignalLevel");
        try {
            int i = -1;
            try {
                SignalStrength signalStrength = ((TelephonyManager) C72382h.f192527a.getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    i = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (c != null) {
                TraceEvent.m107031b(c.f192513d, 0);
            }
            return i;
        } catch (Throwable th) {
            C72394t.m107052a(th, th);
        }
        throw th;
    }

    private static boolean isSupported() {
        boolean z;
        boolean z2;
        if (f192506a == null) {
            try {
                if (C72382h.f192527a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                    z2 = true;
                    f192506a = Boolean.valueOf(z2);
                }
            } catch (RuntimeException unused) {
            }
            z2 = false;
            f192506a = Boolean.valueOf(z2);
        }
        if (f192506a.booleanValue()) {
            if (f192507b == null) {
                try {
                    if (C72382h.f192527a.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                        z = true;
                        f192507b = Boolean.valueOf(z);
                    }
                } catch (RuntimeException unused2) {
                }
                z = false;
                f192507b = Boolean.valueOf(z);
            }
            if (f192507b.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isWifiConnected() {
        TraceEvent c = TraceEvent.m107032c("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C72382h.f192527a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (c != null) {
                    TraceEvent.m107031b(c.f192513d, 0);
                }
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                if (c != null) {
                    TraceEvent.m107031b(c.f192513d, 0);
                }
                return false;
            }
            boolean hasTransport = networkCapabilities.hasTransport(1);
            if (c != null) {
                TraceEvent.m107031b(c.f192513d, 0);
            }
            return hasTransport;
        } catch (Throwable th) {
            C72394t.m107052a(th, th);
        }
        throw th;
    }
}
