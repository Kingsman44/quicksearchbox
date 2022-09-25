package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ael */
/* compiled from: PG */
final class ael implements act {

    /* renamed from: a */
    private final aek f20446a;

    public ael(aek aek) {
        this.f20446a = aek;
    }

    /* renamed from: v */
    public final acu mo14455v(acw acw, long j, long j2, IOException iOException, int i) {
        this.f20446a.mo14588b(iOException);
        return ada.f20338a;
    }

    /* renamed from: w */
    public final void mo14456w(acw acw, long j, long j2, boolean z) {
    }

    /* renamed from: x */
    public final void mo14457x(acw acw, long j, long j2) {
        if (!aen.m18440a()) {
            this.f20446a.mo14588b(new IOException(new ConcurrentModificationException()));
        } else {
            this.f20446a.mo14587a();
        }
    }
}
