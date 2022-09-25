package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i;

import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.i.a */
/* compiled from: PG */
final class C105370a extends C105379j {

    /* renamed from: a */
    private final C8178yk f293977a;

    /* renamed from: b */
    private final C57057b f293978b;

    public C105370a(C8178yk ykVar, C57057b bVar) {
        this.f293977a = ykVar;
        this.f293978b = bVar;
    }

    /* renamed from: a */
    public final C8178yk mo94767a() {
        return this.f293977a;
    }

    /* renamed from: b */
    public final C57057b mo94768b() {
        return this.f293978b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f293978b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105379j
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.staticplugins.nowstream.c.i.j r5 = (com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105379j) r5
            com.google.ai.b.yk r1 = r4.f293977a
            com.google.ai.b.yk r3 = r5.mo94767a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.bv.e.b.b r1 = r4.f293978b
            if (r1 != 0) goto L_0x0022
            com.google.bv.e.b.b r5 = r5.mo94768b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.bv.e.b.b r5 = r5.mo94768b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105370a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f293977a.hashCode() ^ 1000003) * 1000003;
        C57057b bVar = this.f293978b;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f293977a.toString();
        String valueOf = String.valueOf(this.f293978b);
        return "VisualElementLoggingInfo{visualElementInfo=" + obj + ", clearcutAppData=" + valueOf + "}";
    }
}
