package androidx.camera.core;

/* renamed from: androidx.camera.core.g */
/* compiled from: PG */
public final class C1557g extends C1572v {

    /* renamed from: a */
    private final C1571u f4277a;

    /* renamed from: b */
    private final int f4278b;

    public C1557g(int i, C1571u uVar) {
        this.f4278b = i;
        this.f4277a = uVar;
    }

    /* renamed from: a */
    public final C1571u mo4426a() {
        return this.f4277a;
    }

    /* renamed from: b */
    public final int mo4427b() {
        return this.f4278b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f4277a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.camera.core.C1572v
            r2 = 0
            if (r1 == 0) goto L_0x002a
            androidx.camera.core.v r5 = (androidx.camera.core.C1572v) r5
            int r1 = r4.f4278b
            int r3 = r5.mo4427b()
            if (r1 != r3) goto L_0x002a
            androidx.camera.core.u r1 = r4.f4277a
            if (r1 != 0) goto L_0x001e
            androidx.camera.core.u r5 = r5.mo4426a()
            if (r5 != 0) goto L_0x002a
            goto L_0x0029
        L_0x001e:
            androidx.camera.core.u r5 = r5.mo4426a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1557g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f4278b ^ 1000003) * 1000003;
        C1571u uVar = this.f4277a;
        return i ^ (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.f4278b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "CLOSED" : "CLOSING" : "OPEN" : "OPENING" : "PENDING_OPEN");
        sb.append(", error=");
        sb.append(this.f4277a);
        sb.append("}");
        return sb.toString();
    }
}
