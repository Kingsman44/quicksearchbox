package p5488io.grpc;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: io.grpc.c */
/* compiled from: PG */
public final class C70256c {

    /* renamed from: a */
    public static final C70256c f187254a;

    /* renamed from: c */
    private static final IdentityHashMap f187255c;

    /* renamed from: b */
    public final IdentityHashMap f187256b;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f187255c = identityHashMap;
        f187254a = new C70256c(identityHashMap);
    }

    public C70256c(IdentityHashMap identityHashMap) {
        this.f187256b = identityHashMap;
    }

    /* renamed from: a */
    public static C70132a m102407a() {
        return new C70132a(f187254a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r7 == 0) goto L_0x005c
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L_0x0012
            goto L_0x005c
        L_0x0012:
            io.grpc.c r7 = (p5488io.grpc.C70256c) r7
            java.util.IdentityHashMap r2 = r6.f187256b
            int r2 = r2.size()
            java.util.IdentityHashMap r3 = r7.f187256b
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0023
            return r1
        L_0x0023:
            java.util.IdentityHashMap r2 = r6.f187256b
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap r4 = r7.f187256b
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap r5 = r7.f187256b
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = com.google.common.base.C58832aw.m90831a(r4, r3)
            if (r3 != 0) goto L_0x002d
            return r1
        L_0x005b:
            return r0
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.C70256c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.f187256b.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.f187256b.toString();
    }
}
