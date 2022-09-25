package com.google.android.libraries.componentview.components.agsa;

import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.agsa.k */
/* compiled from: PG */
final class C19872k extends C19841a {

    /* renamed from: a */
    private final int f55598a;

    /* renamed from: b */
    private final C56429h f55599b;

    public C19872k(int i, C56429h hVar) {
        this.f55598a = i;
        this.f55599b = hVar;
    }

    /* renamed from: a */
    public final int mo25148a() {
        return this.f55598a;
    }

    /* renamed from: b */
    public final C56429h mo25149b() {
        return this.f55599b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f55599b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.componentview.components.agsa.C19841a
            r2 = 0
            if (r1 == 0) goto L_0x002a
            com.google.android.libraries.componentview.components.agsa.a r5 = (com.google.android.libraries.componentview.components.agsa.C19841a) r5
            int r1 = r4.f55598a
            int r3 = r5.mo25148a()
            if (r1 != r3) goto L_0x002a
            com.google.bq.h r1 = r4.f55599b
            if (r1 != 0) goto L_0x001e
            com.google.bq.h r5 = r5.mo25149b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            com.google.bq.h r5 = r5.mo25149b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.agsa.C19872k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f55598a ^ 1000003) * 1000003;
        C56429h hVar = this.f55599b;
        return i ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        int i = this.f55598a;
        String valueOf = String.valueOf(this.f55599b);
        return "AmpClickEventData{selectedIndex=" + i + ", logInfo=" + valueOf + "}";
    }
}
