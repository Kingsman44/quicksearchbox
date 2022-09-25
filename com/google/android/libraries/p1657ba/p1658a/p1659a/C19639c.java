package com.google.android.libraries.p1657ba.p1658a.p1659a;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1657ba.p1658a.p1659a.p1660a.C19637a;
import com.google.android.libraries.p1657ba.p1661b.p1662a.p1663a.C19642a;
import com.google.android.libraries.p1657ba.p1661b.p1662a.p1663a.C19643b;
import com.google.android.libraries.p1657ba.p1664c.p1665a.C19646c;

/* renamed from: com.google.android.libraries.ba.a.a.c */
/* compiled from: PG */
public final class C19639c implements C19638b {

    /* renamed from: a */
    final WifiConfiguration f54636a;

    /* renamed from: b */
    private final WifiManager f54637b;

    /* renamed from: c */
    private boolean f54638c = false;

    /* renamed from: d */
    private final C19642a f54639d;

    /* renamed from: e */
    private final C19637a f54640e;

    public C19639c(WifiManager wifiManager, C19642a aVar, WifiConfiguration wifiConfiguration, C19637a aVar2) {
        this.f54637b = wifiManager;
        this.f54639d = aVar;
        this.f54636a = wifiConfiguration;
        this.f54640e = aVar2;
    }

    /* renamed from: a */
    public final void mo24964a() {
        if (this.f54638c) {
            C19646c.f54650a.mo24967a(C19639c.class, "act() was called more than once.", new Object[0]);
            return;
        }
        this.f54638c = true;
        this.f54637b.setWifiEnabled(true);
        int addNetwork = this.f54637b.addNetwork(this.f54636a);
        if (addNetwork == -1) {
            System.out.println("netid == -1");
            C19642a aVar = this.f54639d;
            aVar.f54646a.mo24966a(R.string.qr_wifi_error_could_not_connect, this.f54636a.SSID);
        } else {
            this.f54637b.enableNetwork(addNetwork, true);
            System.out.println("enabledNetwork");
            C19642a aVar2 = this.f54639d;
            aVar2.f54646a.mo24966a(R.string.qr_wifi_successfully_connecting, this.f54636a.SSID);
            System.out.println("notified SSID");
        }
        C19637a aVar3 = this.f54640e;
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        if (!(aVar3.f54634a instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (intent.resolveActivity(aVar3.f54634a.getPackageManager()) != null) {
            aVar3.f54634a.startActivity(intent);
        } else {
            C19646c.f54650a.mo24970d(aVar3, "Could not find application for intent fulfillment.", new Object[0]);
            C19643b.m37472b(Toast.makeText(aVar3.f54635b.f54646a.f54648a, R.string.error_app_not_found, 0));
        }
        System.out.println("started activity");
    }
}
