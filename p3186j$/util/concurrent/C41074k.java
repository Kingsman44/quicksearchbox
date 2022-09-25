package p3186j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.k */
class C41074k implements Map.Entry {

    /* renamed from: a */
    final int f107605a;

    /* renamed from: b */
    final Object f107606b;

    /* renamed from: c */
    volatile Object f107607c;

    /* renamed from: d */
    volatile C41074k f107608d;

    C41074k(int i, Object obj, Object obj2) {
        this.f107605a = i;
        this.f107606b = obj;
        this.f107607c = obj2;
    }

    C41074k(int i, Object obj, Object obj2, C41074k kVar) {
        this(i, obj, obj2);
        this.f107608d = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C41074k mo43558a(int i, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        C41074k kVar = this;
        do {
            if (kVar.f107605a == i && ((obj2 = kVar.f107606b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return kVar;
            }
            kVar = kVar.f107608d;
        } while (kVar != null);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.f107607c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r1 = r2.f107606b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0028
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0028
            java.lang.Object r1 = r2.f107606b
            if (r0 == r1) goto L_0x001c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
        L_0x001c:
            java.lang.Object r0 = r2.f107607c
            if (r3 == r0) goto L_0x0026
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.concurrent.C41074k.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.f107606b;
    }

    public final Object getValue() {
        return this.f107607c;
    }

    public final int hashCode() {
        return this.f107606b.hashCode() ^ this.f107607c.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return C41076m.m71701b(this.f107606b, this.f107607c);
    }
}
