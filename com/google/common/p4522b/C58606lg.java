package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.lg */
/* compiled from: PG */
final class C58606lg extends C58612lm {

    /* renamed from: a */
    final /* synthetic */ C58635mi f156313a;

    public C58606lg(C58635mi miVar) {
        this.f156313a = miVar;
    }

    public final void clear() {
        this.f156313a.clear();
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
            com.google.common.b.mi r2 = r3.f156313a
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0029
            com.google.common.b.mi r2 = r3.f156313a
            com.google.common.base.af r2 = r2.mo55688b()
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r2.mo56077d(r4, r0)
            if (r4 == 0) goto L_0x0029
            r4 = 1
            return r4
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58606lg.contains(java.lang.Object):boolean");
    }

    public final boolean isEmpty() {
        return this.f156313a.isEmpty();
    }

    public final Iterator iterator() {
        return new C58605lf(this.f156313a);
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
            com.google.common.b.mi r2 = r3.f156313a
            java.lang.Object r4 = r4.getValue()
            boolean r4 = r2.remove(r0, r4)
            if (r4 == 0) goto L_0x001c
            r4 = 1
            return r4
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58606lg.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.f156313a.size();
    }
}
