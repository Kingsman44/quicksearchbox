package p3186j$.util;

import java.util.Iterator;

/* renamed from: j$.util.q */
final class C41122q implements Iterator {

    /* renamed from: a */
    private int f107703a;

    /* renamed from: b */
    final /* synthetic */ C41123r f107704b;

    C41122q(C41123r rVar) {
        this.f107704b = rVar;
        this.f107703a = rVar.size();
    }

    public final boolean hasNext() {
        return this.f107703a > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r1.f107706b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object next() {
        /*
            r4 = this;
            int r0 = r4.f107703a
            j$.util.r r1 = r4.f107704b
            r2 = 1
            if (r0 != r2) goto L_0x0015
            r0 = 0
            r4.f107703a = r0
            int r0 = p3186j$.util.C41329u.f108056a
            if (r0 >= 0) goto L_0x0012
            java.lang.Object r0 = r1.f107706b
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            java.lang.Object r0 = r1.f107705a
        L_0x0014:
            return r0
        L_0x0015:
            r3 = 2
            if (r0 != r3) goto L_0x0024
            r4.f107703a = r2
            int r0 = p3186j$.util.C41329u.f108056a
            if (r0 < 0) goto L_0x0021
            java.lang.Object r0 = r1.f107706b
            goto L_0x0023
        L_0x0021:
            java.lang.Object r0 = r1.f107705a
        L_0x0023:
            return r0
        L_0x0024:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.C41122q.next():java.lang.Object");
    }
}
