package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.dataservice.w */
/* compiled from: PG */
final class C46883w extends C46771co {

    /* renamed from: a */
    public final C60870cx f122323a;

    /* renamed from: b */
    public final Object f122324b;

    /* renamed from: c */
    public final C58817ah f122325c;

    public C46883w(C60870cx cxVar, Object obj, C58817ah ahVar) {
        this.f122323a = cxVar;
        this.f122324b = obj;
        this.f122325c = ahVar;
    }

    /* renamed from: a */
    public final C58817ah mo50782a() {
        return this.f122325c;
    }

    /* renamed from: b */
    public final C60870cx mo50783b() {
        return this.f122323a;
    }

    /* renamed from: c */
    public final Object mo50784c() {
        return this.f122324b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f122325c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.dataservice.C46771co
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.apps.tiktok.dataservice.co r5 = (com.google.apps.tiktok.dataservice.C46771co) r5
            com.google.common.util.concurrent.cx r1 = r4.f122323a
            com.google.common.util.concurrent.cx r3 = r5.mo50783b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r4.f122324b
            java.lang.Object r3 = r5.mo50784c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.common.base.ah r1 = r4.f122325c
            if (r1 != 0) goto L_0x002e
            com.google.common.base.ah r5 = r5.mo50782a()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            com.google.common.base.ah r5 = r5.mo50782a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.dataservice.C46883w.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f122323a.hashCode() ^ 1000003) * 1000003) ^ this.f122324b.hashCode()) * 1000003;
        C58817ah ahVar = this.f122325c;
        if (ahVar == null) {
            i = 0;
        } else {
            i = ahVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f122323a.toString();
        String obj2 = this.f122324b.toString();
        String valueOf = String.valueOf(this.f122325c);
        return "Mutation{future=" + obj + ", key=" + obj2 + ", localOptimisticTransform=" + valueOf + "}";
    }
}
