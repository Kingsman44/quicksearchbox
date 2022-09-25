package com.google.android.gms.analytics.internal;

import android.os.Handler;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.analytics.internal.ah */
/* compiled from: PG */
abstract class C142711ah {

    /* renamed from: a */
    private static volatile Handler f387239a;

    /* renamed from: b */
    public final C142740j f387240b;

    /* renamed from: c */
    public final Runnable f387241c = new C142710ag(this);

    /* renamed from: d */
    public volatile long f387242d;

    public C142711ah(C142740j jVar) {
        this.f387240b = jVar;
    }

    /* renamed from: a */
    public abstract void mo117498a();

    /* renamed from: b */
    public final Handler mo117499b() {
        Handler handler;
        if (f387239a != null) {
            return f387239a;
        }
        synchronized (C142711ah.class) {
            if (f387239a == null) {
                f387239a = new C144861c(this.f387240b.f387334b.getMainLooper());
            }
            handler = f387239a;
        }
        return handler;
    }

    /* renamed from: c */
    public final void mo117500c() {
        this.f387242d = 0;
        mo117499b().removeCallbacks(this.f387241c);
    }

    /* renamed from: d */
    public final void mo117501d(long j) {
        mo117500c();
        if (j >= 0) {
            this.f387242d = System.currentTimeMillis();
            if (!mo117499b().postDelayed(this.f387241c, j)) {
                this.f387240b.mo117548h().mo117536i(6, "Failed to schedule delayed post. time", Long.valueOf(j), (Object) null, (Object) null);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo117502e() {
        return this.f387242d != 0;
    }
}
