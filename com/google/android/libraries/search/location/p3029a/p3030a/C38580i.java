package com.google.android.libraries.search.location.p3029a.p3030a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.location.a.a.i */
/* compiled from: PG */
public final class C38580i {

    /* renamed from: c */
    private static final Duration f101980c = Duration.ofDays(3);

    /* renamed from: a */
    public final C42876ab f101981a;

    /* renamed from: b */
    public final C21370a f101982b;

    public C38580i(C42876ab abVar, C21370a aVar) {
        this.f101981a = abVar;
        this.f101982b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo41503a() {
        return C47633f.m84733g(this.f101981a.mo46042d()).mo51515h(new C38578g(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final boolean mo41504b(long j) {
        if (j != 0 && Duration.between(Instant.ofEpochMilli(j), Instant.ofEpochMilli(this.f101982b.mo26870b())).compareTo(f101980c) <= 0) {
            return false;
        }
        return true;
    }
}
