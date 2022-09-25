package androidx.media3.exoplayer;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: androidx.media3.exoplayer.de */
/* compiled from: PG */
final class C2961de {

    /* renamed from: a */
    public final PowerManager f8510a;

    /* renamed from: b */
    public PowerManager.WakeLock f8511b;

    /* renamed from: c */
    public boolean f8512c;

    /* renamed from: d */
    public boolean f8513d;

    public C2961de(Context context) {
        this.f8510a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    public final void mo6861a() {
        PowerManager.WakeLock wakeLock = this.f8511b;
        if (wakeLock != null) {
            if (!this.f8512c || !this.f8513d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }
}
