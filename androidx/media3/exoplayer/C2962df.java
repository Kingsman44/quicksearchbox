package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: androidx.media3.exoplayer.df */
/* compiled from: PG */
final class C2962df {

    /* renamed from: a */
    public final WifiManager f8514a;

    /* renamed from: b */
    public WifiManager.WifiLock f8515b;

    /* renamed from: c */
    public boolean f8516c;

    /* renamed from: d */
    public boolean f8517d;

    public C2962df(Context context) {
        this.f8514a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    public final void mo6862a() {
        WifiManager.WifiLock wifiLock = this.f8515b;
        if (wifiLock != null) {
            if (!this.f8516c || !this.f8517d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }
}
