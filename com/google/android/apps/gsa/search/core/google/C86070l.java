package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.shared.search.C90504l;

/* renamed from: com.google.android.apps.gsa.search.core.google.l */
/* compiled from: PG */
final class C86070l extends C85932cz {

    /* renamed from: a */
    private final int f232656a;

    /* renamed from: b */
    private final C90504l f232657b;

    public C86070l(int i, C90504l lVar) {
        this.f232656a = i;
        this.f232657b = lVar;
    }

    /* renamed from: a */
    public final int mo79584a() {
        return this.f232656a;
    }

    /* renamed from: b */
    public final C90504l mo79585b() {
        return this.f232657b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f232657b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.search.core.google.C85932cz
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.apps.gsa.search.core.google.cz r5 = (com.google.android.apps.gsa.search.core.google.C85932cz) r5
            int r1 = r4.f232656a
            int r3 = r5.mo79584a()
            if (r1 != r3) goto L_0x002a
            com.google.android.apps.gsa.shared.search.l r1 = r4.f232657b
            if (r1 != 0) goto L_0x001e
            com.google.android.apps.gsa.shared.search.l r5 = r5.mo79585b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            com.google.android.apps.gsa.shared.search.l r5 = r5.mo79585b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.C86070l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f232656a ^ 1000003) * 1000003;
        C90504l lVar = this.f232657b;
        return i ^ (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        int i = this.f232656a;
        String valueOf = String.valueOf(this.f232657b);
        return "SearchUrlMetadata{urlType=" + i + ", queryParametersFromUrl=" + valueOf + "}";
    }
}
