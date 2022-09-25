package androidx.camera.core;

/* renamed from: androidx.camera.core.h */
/* compiled from: PG */
public final class C1558h extends C1571u {

    /* renamed from: a */
    private final int f4279a;

    /* renamed from: b */
    private final Throwable f4280b;

    public C1558h(int i, Throwable th) {
        this.f4279a = i;
        this.f4280b = th;
    }

    /* renamed from: a */
    public final int mo4431a() {
        return this.f4279a;
    }

    /* renamed from: b */
    public final Throwable mo4432b() {
        return this.f4280b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f4280b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.camera.core.C1571u
            r2 = 0
            if (r1 == 0) goto L_0x002a
            androidx.camera.core.u r5 = (androidx.camera.core.C1571u) r5
            int r1 = r4.f4279a
            int r3 = r5.mo4431a()
            if (r1 != r3) goto L_0x002a
            java.lang.Throwable r1 = r4.f4280b
            if (r1 != 0) goto L_0x001e
            java.lang.Throwable r5 = r5.mo4432b()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            java.lang.Throwable r5 = r5.mo4432b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1558h.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f4279a ^ 1000003) * 1000003;
        Throwable th = this.f4280b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f4279a + ", cause=" + this.f4280b + "}";
    }
}
