package androidx.camera.core.p069a;

/* renamed from: androidx.camera.core.a.d */
/* compiled from: PG */
public final class C1367d extends C1306at {

    /* renamed from: a */
    public final String f3856a;

    /* renamed from: b */
    private final Class f3857b;

    /* renamed from: c */
    private final Object f3858c;

    public C1367d(String str, Class cls, Object obj) {
        this.f3856a = str;
        if (cls != null) {
            this.f3857b = cls;
            this.f3858c = obj;
            return;
        }
        throw new NullPointerException("Null valueClass");
    }

    /* renamed from: a */
    public final Class mo4168a() {
        return this.f3857b;
    }

    /* renamed from: b */
    public final Object mo4169b() {
        return this.f3858c;
    }

    /* renamed from: c */
    public final String mo4170c() {
        return this.f3856a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f3858c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.camera.core.p069a.C1306at
            r2 = 0
            if (r1 == 0) goto L_0x003a
            androidx.camera.core.a.at r5 = (androidx.camera.core.p069a.C1306at) r5
            java.lang.String r1 = r4.f3856a
            java.lang.String r3 = r5.mo4170c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.Class r1 = r4.f3857b
            java.lang.Class r3 = r5.mo4168a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r4.f3858c
            if (r1 != 0) goto L_0x002e
            java.lang.Object r5 = r5.mo4169b()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            java.lang.Object r5 = r5.mo4169b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.C1367d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f3856a.hashCode() ^ 1000003) * 1000003) ^ this.f3857b.hashCode()) * 1000003;
        Object obj = this.f3858c;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Option{id=" + this.f3856a + ", valueClass=" + this.f3857b + ", token=" + this.f3858c + "}";
    }
}
