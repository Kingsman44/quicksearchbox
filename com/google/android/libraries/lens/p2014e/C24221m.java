package com.google.android.libraries.lens.p2014e;

import com.google.lens.p4707j.C62496ds;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.e.m */
/* compiled from: PG */
final class C24221m extends C24204ag {

    /* renamed from: a */
    public C63088z f66254a;

    /* renamed from: b */
    private C62496ds f66255b;

    /* renamed from: a */
    public final C24205ah mo29689a() {
        C62496ds dsVar;
        C63088z zVar = this.f66254a;
        if (zVar != null && (dsVar = this.f66255b) != null) {
            return new C24222n(zVar, dsVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f66254a == null) {
            sb.append(" analyticsId");
        }
        if (this.f66255b == null) {
            sb.append(" prefetchMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29690b(C62496ds dsVar) {
        if (dsVar != null) {
            this.f66255b = dsVar;
            return;
        }
        throw new NullPointerException("Null prefetchMetadata");
    }
}
