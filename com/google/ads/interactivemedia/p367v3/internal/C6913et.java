package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.et */
/* compiled from: PG */
final class C6913et {

    /* renamed from: a */
    private final PowerManager f22060a;

    /* renamed from: b */
    private PowerManager.WakeLock f22061b;

    /* renamed from: c */
    private boolean f22062c;

    /* renamed from: d */
    private boolean f22063d;

    public C6913et(Context context) {
        this.f22060a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: c */
    private final void m20347c() {
        PowerManager.WakeLock wakeLock = this.f22061b;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    /* renamed from: a */
    public final void mo15857a(boolean z) {
        this.f22062c = false;
        m20347c();
    }

    /* renamed from: b */
    public final void mo15858b(boolean z) {
        this.f22063d = z;
        m20347c();
    }
}
