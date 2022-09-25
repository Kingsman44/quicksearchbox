package com.google.ads.interactivemedia.p367v3.internal;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yn */
/* compiled from: PG */
final class C7447yn extends aak {

    /* renamed from: d */
    private int f24392d;

    public C7447yn(C7360vh vhVar, int[] iArr) {
        super(vhVar, iArr);
        this.f24392d = mo14335o(vhVar.mo16648a(iArr[0]));
    }

    /* renamed from: a */
    public final int mo14319a() {
        return this.f24392d;
    }

    /* renamed from: b */
    public final int mo14320b() {
        return 0;
    }

    /* renamed from: c */
    public final Object mo14321c() {
        return null;
    }

    /* renamed from: d */
    public final void mo14322d(long j, long j2, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo14340t(this.f24392d, elapsedRealtime)) {
            int i = this.f20072b;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (mo14340t(i, elapsedRealtime));
            this.f24392d = i;
        }
    }
}
