package com.google.android.apps.search.googleapp.p10318i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.i.i */
/* compiled from: PG */
public final class C136220i {

    /* renamed from: a */
    private final Context f370987a;

    /* renamed from: b */
    private final ConnectivityManager f370988b;

    /* renamed from: c */
    private final TelephonyManager f370989c;

    /* renamed from: d */
    private final PackageManager f370990d;

    public C136220i(Context context, ConnectivityManager connectivityManager, TelephonyManager telephonyManager, PackageManager packageManager) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(telephonyManager, "telephonyManager");
        C69664n.m101061g(packageManager, "packageManager");
        this.f370987a = context;
        this.f370988b = connectivityManager;
        this.f370989c = telephonyManager;
        this.f370990d = packageManager;
    }

    /* renamed from: b */
    private final int m221352b(String str) {
        return Settings.Global.getInt(this.f370987a.getContentResolver(), str, 0);
    }

    /* renamed from: c */
    private final int m221353c() {
        if (m221352b("airplane_mode_on") != 0) {
            return 3;
        }
        if (this.f370988b.getNetworkInfo(0) == null) {
            return 6;
        }
        int simState = this.f370989c.getSimState();
        if (simState == 1) {
            return 9;
        }
        if (simState != 5) {
            return 10;
        }
        if (this.f370990d.hasSystemFeature("android.hardware.telephony") && this.f370989c.getSimState() == 5 && !this.f370989c.isDataEnabled()) {
            return 2;
        }
        if (!this.f370989c.isNetworkRoaming() || m221352b("data_roaming") != 0) {
            return 0;
        }
        return 4;
    }

    /* renamed from: a */
    public final int mo112849a(C43363h hVar) {
        NetworkCapabilities networkCapabilities;
        if (hVar == null) {
            int c = m221353c();
            if (c == 0) {
                return 1;
            }
            return c;
        }
        C43362g a = C43362g.m76515a(hVar.f113278b);
        if (a == null) {
            a = C43362g.UNSPECIFIED;
        }
        C69664n.m101060f(a, "loadError.type");
        switch (a.ordinal()) {
            case 0:
                Network activeNetwork = this.f370988b.getActiveNetwork();
                if (activeNetwork == null || (networkCapabilities = this.f370988b.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12)) {
                    return 7;
                }
                return 1;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                return 1;
            case 4:
                int c2 = m221353c();
                if (c2 == 0) {
                    return 7;
                }
                return c2;
            default:
                throw new C69677g();
        }
    }
}
