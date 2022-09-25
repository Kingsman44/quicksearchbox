package com.google.android.libraries.places.api.p2426a.p2427a.p2428a;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;

/* renamed from: com.google.android.libraries.places.api.a.a.a.d */
/* compiled from: PG */
public final class C31783d {

    /* renamed from: a */
    public final String f85400a;

    /* renamed from: b */
    public final int f85401b;

    /* renamed from: c */
    public final C31782c f85402c;

    /* renamed from: d */
    public final boolean f85403d;

    /* renamed from: e */
    public final int f85404e;

    public C31783d(WifiInfo wifiInfo, ScanResult scanResult) {
        C31782c cVar;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i = scanResult.level;
        int i2 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            cVar = C31782c.OTHER;
        } else {
            String upperCase = str2.toUpperCase();
            if (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) {
                cVar = C31782c.NONE;
            } else if (upperCase.matches(".*WPA[0-9]*-PSK.*")) {
                cVar = C31782c.PSK;
            } else if (upperCase.matches(".*WPA[0-9]*-EAP.*")) {
                cVar = C31782c.EAP;
            } else {
                cVar = C31782c.OTHER;
            }
        }
        boolean z = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z = true;
        }
        this.f85400a = str;
        this.f85401b = i;
        this.f85402c = cVar;
        this.f85403d = z;
        this.f85404e = i2;
    }
}
