package com.google.lens.sdk;

import com.google.android.libraries.lens.p1995c.p1996a.C24069a;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24072c;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24073d;
import com.google.lens.sdk.LensApi;

/* renamed from: com.google.lens.sdk.k */
/* compiled from: PG */
final class C62645k implements C24069a {

    /* renamed from: a */
    private final LensApi.LensAvailabilityCallback f169151a;

    /* renamed from: b */
    private final int f169152b;

    public C62645k(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.f169151a = lensAvailabilityCallback;
        this.f169152b = i;
    }

    /* renamed from: a */
    public final void mo29464a(C24073d dVar) {
        int i;
        int i2 = 1;
        if (this.f169152b == 0 ? (i = C24072c.m44703b(dVar.f65758d)) != 0 : (i = C24072c.m44703b(dVar.f65759e)) != 0) {
            i2 = i;
        }
        this.f169151a.onAvailabilityStatusFetched(i2 - 2);
    }
}
