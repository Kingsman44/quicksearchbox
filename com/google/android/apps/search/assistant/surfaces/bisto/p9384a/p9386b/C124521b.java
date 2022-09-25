package com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b;

import android.hardware.usb.UsbDevice;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9385a.C124518a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124657bw;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.p10712d.C142320az;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142346by;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.a.b.b */
/* compiled from: PG */
public final class C124521b {
    /* renamed from: a */
    public static C124657bw m203978a(C124629av avVar) {
        C124625ar a = C124625ar.m204290a(avVar.f343821h);
        if (a == null) {
            a = C124625ar.UNKNOWN_INTERNAL_OTA_STATE;
        }
        switch (a.ordinal()) {
            case 0:
                return C124657bw.OTA_UP_TO_DATE;
            case 1:
            case 2:
            case 3:
            case 7:
                return C124657bw.PREPARING_OTA;
            case 4:
            case 6:
                return C124657bw.WAITING_TO_APPLY_OTA;
            case 5:
                return C124657bw.APPLYING_OTA;
            default:
                return C124657bw.UNKNOWN_USER_OTA_STATE;
        }
    }

    /* renamed from: b */
    public static String m203979b(int i, C124721s sVar) {
        if (C124721s.APOLLO.equals(sVar)) {
            return "00000006";
        }
        if (C124721s.BAYWOLF.equals(sVar)) {
            return "00f00000";
        }
        if (i <= 0) {
            return null;
        }
        if (i == 255) {
            return "000018d1-00005033";
        }
        return String.format(Locale.getDefault(), "%08x", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: c */
    public static String m203980c(UsbDevice usbDevice) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(usbDevice.getVendorId());
        objArr[1] = Integer.valueOf(usbDevice.getProductId());
        String serialNumber = usbDevice.getSerialNumber();
        String str = BuildConfig.FLAVOR;
        if (serialNumber != null) {
            str = serialNumber.replace("_", str);
        }
        objArr[2] = str;
        return String.format(locale, "simple-%d.%d.%s", objArr);
    }

    /* renamed from: d */
    public static boolean m203981d(String str, C142324bc bcVar) {
        if (C124518a.f343587a.contains(str)) {
            return true;
        }
        C142346by byVar = bcVar.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142320az azVar = byVar.f386226f;
        if (azVar == null) {
            azVar = C142320az.f386099j;
        }
        return azVar.f386108h;
    }

    /* renamed from: e */
    public static boolean m203982e(String str) {
        if (str == null) {
            return false;
        }
        return "legacy-wired".equals(str);
    }
}
