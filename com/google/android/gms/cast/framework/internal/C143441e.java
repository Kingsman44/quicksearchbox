package com.google.android.gms.cast.framework.internal;

import com.google.android.gms.cast.framework.C143409aq;
import com.google.android.gms.cast.framework.C143414av;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.internal.C143521n;

/* renamed from: com.google.android.gms.cast.framework.internal.e */
/* compiled from: PG */
public final class C143441e extends C143414av {

    /* renamed from: d */
    private final CastOptions f388977d;

    /* renamed from: e */
    private final C143461y f388978e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143441e(android.content.Context r4, com.google.android.gms.cast.framework.CastOptions r5, com.google.android.gms.cast.framework.internal.C143461y r6) {
        /*
            r3 = this;
            java.util.List r0 = r5.f388830b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r5.f388829a
            java.lang.String r0 = com.google.android.gms.cast.C143606o.m233298a(r0)
            goto L_0x0025
        L_0x0013:
            java.lang.String r0 = r5.f388829a
            java.util.List r1 = r5.f388830b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            if (r0 == 0) goto L_0x0035
            if (r1 == 0) goto L_0x002d
            java.lang.String r2 = "com.google.android.gms.cast.CATEGORY_CAST"
            java.lang.String r0 = com.google.android.gms.cast.C143605n.m233297a(r2, r0, r1)
        L_0x0025:
            r3.<init>(r4, r0)
            r3.f388977d = r5
            r3.f388978e = r6
            return
        L_0x002d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "namespaces cannot be null"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "applicationId cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.internal.C143441e.<init>(android.content.Context, com.google.android.gms.cast.framework.CastOptions, com.google.android.gms.cast.framework.internal.y):void");
    }

    /* renamed from: a */
    public final C143409aq mo118626a(String str) {
        return new C143466m(this.f388912a, this.f388913b, str, this.f388977d, new C143521n(this.f388912a, this.f388977d, this.f388978e));
    }

    /* renamed from: b */
    public final boolean mo118627b() {
        return this.f388977d.f388833e;
    }
}
