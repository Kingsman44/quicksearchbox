package com.google.common.p4520a;

import java.util.Iterator;

/* renamed from: com.google.common.a.ad */
/* compiled from: PG */
final class C58197ad extends C58262q {

    /* renamed from: b */
    final /* synthetic */ C58234bn f155631b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58197ad(C58234bn bnVar) {
        super(bnVar);
        this.f155631b = bnVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (java.util.Map.Entry) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L_0x000f
            return r1
        L_0x000f:
            com.google.common.a.bn r2 = r3.f155631b
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0027
            com.google.common.a.bn r2 = r3.f155631b
            com.google.common.base.af r2 = r2.f155740i
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r2.mo56077d(r4, r0)
            if (r4 == 0) goto L_0x0027
            r4 = 1
            return r4
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58197ad.contains(java.lang.Object):boolean");
    }

    public final Iterator iterator() {
        return new C58196ac(this.f155631b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (java.util.Map.Entry) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            if (r0 == 0) goto L_0x001c
            com.google.common.a.bn r2 = r3.f155631b
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r2.remove(r0, r4)
            if (r4 == 0) goto L_0x001c
            r4 = 1
            return r4
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58197ad.remove(java.lang.Object):boolean");
    }
}
