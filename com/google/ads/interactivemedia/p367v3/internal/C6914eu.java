package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eu */
/* compiled from: PG */
final class C6914eu {

    /* renamed from: a */
    private final WifiManager f22064a;

    /* renamed from: b */
    private WifiManager.WifiLock f22065b;

    /* renamed from: c */
    private boolean f22066c;

    /* renamed from: d */
    private boolean f22067d;

    public C6914eu(Context context) {
        this.f22064a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: c */
    private final void m20350c() {
        WifiManager.WifiLock wifiLock = this.f22065b;
        if (wifiLock != null) {
            wifiLock.release();
        }
    }

    /* renamed from: a */
    public final void mo15859a(boolean z) {
        this.f22066c = false;
        m20350c();
    }

    /* renamed from: b */
    public final void mo15860b(boolean z) {
        this.f22067d = z;
        m20350c();
    }
}
