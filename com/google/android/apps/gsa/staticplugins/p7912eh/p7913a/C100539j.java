package com.google.android.apps.gsa.staticplugins.p7912eh.p7913a;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.eh.a.j */
/* compiled from: PG */
public final class C100539j {

    /* renamed from: a */
    public final SharedPreferences f281098a;

    /* renamed from: b */
    private final WifiManager f281099b;

    /* renamed from: c */
    private final ConnectivityManager f281100c;

    public C100539j(Context context, SharedPreferences sharedPreferences) {
        Context a = C39239a.m68666a(context.getApplicationContext(), C39226b.TAG_CLASSIC_SERVICES_CAST);
        this.f281099b = (WifiManager) a.getSystemService("wifi");
        this.f281100c = (ConnectivityManager) a.getSystemService("connectivity");
        this.f281098a = sharedPreferences;
    }

    /* renamed from: a */
    public final String mo91959a() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        WifiManager wifiManager = this.f281099b;
        if (wifiManager == null || wifiManager.getWifiState() != 3 || (activeNetwork = this.f281100c.getActiveNetwork()) == null || (networkCapabilities = this.f281100c.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) {
            return "cast_presence_no_wifi";
        }
        return "cast_presence_with_wifi";
    }

    /* renamed from: b */
    public final void mo91960b(boolean z) {
        this.f281098a.edit().putString(mo91959a(), C58827ar.m90818c('|').mo56097d(new C58825ap(new Object[0], Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(z)))).apply();
    }
}
