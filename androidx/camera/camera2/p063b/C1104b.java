package androidx.camera.camera2.p063b;

import android.util.Size;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1373df;

/* renamed from: androidx.camera.camera2.b.b */
/* compiled from: PG */
final class C1104b extends C1090am {

    /* renamed from: a */
    private final String f3288a;

    /* renamed from: b */
    private final Class f3289b;

    /* renamed from: c */
    private final C1357cq f3290c;

    /* renamed from: d */
    private final C1373df f3291d;

    /* renamed from: e */
    private final Size f3292e;

    public C1104b(String str, Class cls, C1357cq cqVar, C1373df dfVar, Size size) {
        this.f3288a = str;
        if (cls != null) {
            this.f3289b = cls;
            if (cqVar != null) {
                this.f3290c = cqVar;
                if (dfVar != null) {
                    this.f3291d = dfVar;
                    this.f3292e = size;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseType");
    }

    /* renamed from: a */
    public final Size mo3811a() {
        return this.f3292e;
    }

    /* renamed from: b */
    public final C1357cq mo3812b() {
        return this.f3290c;
    }

    /* renamed from: c */
    public final C1373df mo3813c() {
        return this.f3291d;
    }

    /* renamed from: d */
    public final Class mo3814d() {
        return this.f3289b;
    }

    /* renamed from: e */
    public final String mo3815e() {
        return this.f3288a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r1 = r4.f3292e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.camera.camera2.p063b.C1090am
            r2 = 0
            if (r1 == 0) goto L_0x0052
            androidx.camera.camera2.b.am r5 = (androidx.camera.camera2.p063b.C1090am) r5
            java.lang.String r1 = r4.f3288a
            java.lang.String r3 = r5.mo3815e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            java.lang.Class r1 = r4.f3289b
            java.lang.Class r3 = r5.mo3814d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            androidx.camera.core.a.cq r1 = r4.f3290c
            androidx.camera.core.a.cq r3 = r5.mo3812b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            androidx.camera.core.a.df r1 = r4.f3291d
            androidx.camera.core.a.df r3 = r5.mo3813c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            android.util.Size r1 = r4.f3292e
            if (r1 != 0) goto L_0x0046
            android.util.Size r5 = r5.mo3811a()
            if (r5 != 0) goto L_0x0052
            goto L_0x0051
        L_0x0046:
            android.util.Size r5 = r5.mo3811a()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            return r0
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1104b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((this.f3288a.hashCode() ^ 1000003) * 1000003) ^ this.f3289b.hashCode()) * 1000003) ^ this.f3290c.hashCode()) * 1000003) ^ this.f3291d.hashCode()) * 1000003;
        Size size = this.f3292e;
        if (size == null) {
            i = 0;
        } else {
            i = size.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f3288a + ", useCaseType=" + this.f3289b + ", sessionConfig=" + this.f3290c + ", useCaseConfig=" + this.f3291d + ", surfaceResolution=" + this.f3292e + "}";
    }
}
