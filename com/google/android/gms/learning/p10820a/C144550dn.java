package com.google.android.gms.learning.p10820a;

import android.os.SystemClock;
import com.google.android.libraries.micore.learning.base.C29716h;

/* renamed from: com.google.android.gms.learning.a.dn */
/* compiled from: PG */
public final class C144550dn implements C29716h {

    /* renamed from: a */
    public static final C144550dn f391191a = new C144550dn();

    /* renamed from: b */
    private final long f391192b = (System.currentTimeMillis() - SystemClock.elapsedRealtime());

    private C144550dn() {
    }

    /* renamed from: a */
    public final long mo34859a() {
        return this.f391192b + SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public final long mo34860b() {
        return SystemClock.elapsedRealtime();
    }
}
