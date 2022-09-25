package com.google.apps.p3589d.p3596g;

import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45749h;

/* renamed from: com.google.apps.d.g.a */
/* compiled from: PG */
public final class C45824a extends C45845m {

    /* renamed from: a */
    public final C45749h f120493a;

    /* renamed from: b */
    public final C45729e f120494b;

    public C45824a(C45749h hVar, C45729e eVar) {
        this.f120493a = hVar;
        this.f120494b = eVar;
    }

    /* renamed from: a */
    public final C45729e mo49972a() {
        return this.f120494b;
    }

    /* renamed from: b */
    public final C45749h mo49973b() {
        return this.f120493a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f120494b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.p3589d.p3596g.C45845m
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.apps.d.g.m r5 = (com.google.apps.p3589d.p3596g.C45845m) r5
            com.google.apps.d.d.h r1 = r4.f120493a
            com.google.apps.d.d.h r3 = r5.mo49973b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.apps.d.c.e r1 = r4.f120494b
            if (r1 != 0) goto L_0x0022
            com.google.apps.d.c.e r5 = r5.mo49972a()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.apps.d.c.e r5 = r5.mo49972a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3596g.C45824a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f120493a.hashCode() ^ 1000003) * 1000003;
        C45729e eVar = this.f120494b;
        if (eVar == null) {
            i = 0;
        } else {
            i = eVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f120493a.toString();
        String valueOf = String.valueOf(this.f120494b);
        return "DomAndCursor{dom=" + obj + ", cursor=" + valueOf + "}";
    }
}
