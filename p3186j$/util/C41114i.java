package p3186j$.util;

import java.util.Set;
import p3186j$.util.Set;

/* renamed from: j$.util.i */
abstract class C41114i extends C41088f implements Set, Set {
    C41114i() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Collection r5 = (java.util.Collection) r5
            int r1 = r5.size()
            int r3 = r4.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r5.next()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x001b
        L_0x002d:
            return r2
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.C41114i.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }
}
