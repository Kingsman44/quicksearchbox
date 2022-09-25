package org.p5610a.p5611a.p5612a;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: org.a.a.a.e */
/* compiled from: PG */
public final class C71981e extends IOException implements Iterable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private final List f191691a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C71981e(java.lang.String r3, java.util.List r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x001d
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r4 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000e
        L_0x000a:
            int r1 = r4.size()
        L_0x000e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r0] = r1
            r1 = 1
            r3[r1] = r4
            java.lang.String r1 = "%,d exception(s): %s"
            java.lang.String r3 = java.lang.String.format(r1, r3)
        L_0x001d:
            boolean r1 = m105280a(r4)
            if (r1 == 0) goto L_0x0025
            r0 = 0
            goto L_0x002b
        L_0x0025:
            java.lang.Object r0 = r4.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L_0x002b:
            r2.<init>(r3, r0)
            if (r4 != 0) goto L_0x0034
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0034:
            r2.f191691a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5610a.p5611a.p5612a.C71981e.<init>(java.lang.String, java.util.List):void");
    }

    /* renamed from: a */
    public static boolean m105280a(List list) {
        return list == null || list.isEmpty();
    }

    public final Iterator iterator() {
        return this.f191691a.iterator();
    }
}
