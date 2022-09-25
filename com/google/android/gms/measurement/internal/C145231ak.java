package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.measurement.internal.ak */
/* compiled from: PG */
abstract class C145231ak {

    /* renamed from: b */
    private static volatile Handler f392581b;

    /* renamed from: a */
    public volatile long f392582a;

    /* renamed from: c */
    private final C145383ga f392583c;

    /* renamed from: d */
    private final Runnable f392584d;

    public C145231ak(C145383ga gaVar) {
        C143919bh.m233958a(gaVar);
        this.f392583c = gaVar;
        this.f392584d = new C145230aj(this, gaVar);
    }

    /* renamed from: e */
    private final Handler m235965e() {
        Handler handler;
        if (f392581b != null) {
            return f392581b;
        }
        synchronized (C145231ak.class) {
            if (f392581b == null) {
                f392581b = new C144861c(((C145361ff) this.f392583c).f392931a.getMainLooper());
            }
            handler = f392581b;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo120829a() {
        this.f392582a = 0;
        m235965e().removeCallbacks(this.f392584d);
    }

    /* renamed from: b */
    public abstract void mo120830b();

    /* renamed from: c */
    public final void mo120831c(long j) {
        mo120829a();
        if (j >= 0) {
            C144006f fVar = ((C145361ff) this.f392583c).f392924A;
            this.f392582a = System.currentTimeMillis();
            if (!m235965e().postDelayed(this.f392584d, j)) {
                this.f392583c.mo120965ar().f392795c.mo120895b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: d */
    public final boolean mo120832d() {
        return this.f392582a != 0;
    }
}
