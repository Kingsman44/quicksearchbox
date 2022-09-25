package androidx.camera.core.p069a;

import android.util.Range;
import android.util.Size;

/* renamed from: androidx.camera.core.a.b */
/* compiled from: PG */
public final class C1313b extends C1236a {

    /* renamed from: a */
    private final C1362cv f3765a;

    /* renamed from: b */
    private final int f3766b;

    /* renamed from: c */
    private final Size f3767c;

    /* renamed from: d */
    private final Range f3768d;

    public C1313b(C1362cv cvVar, int i, Size size, Range range) {
        if (cvVar != null) {
            this.f3765a = cvVar;
            this.f3766b = i;
            if (size != null) {
                this.f3767c = size;
                this.f3768d = range;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    /* renamed from: a */
    public final int mo4064a() {
        return this.f3766b;
    }

    /* renamed from: b */
    public final Range mo4065b() {
        return this.f3768d;
    }

    /* renamed from: c */
    public final Size mo4066c() {
        return this.f3767c;
    }

    /* renamed from: d */
    public final C1362cv mo4067d() {
        return this.f3765a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r1 = r4.f3768d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof androidx.camera.core.p069a.C1236a
            r2 = 0
            if (r1 == 0) goto L_0x0042
            androidx.camera.core.a.a r5 = (androidx.camera.core.p069a.C1236a) r5
            androidx.camera.core.a.cv r1 = r4.f3765a
            androidx.camera.core.a.cv r3 = r5.mo4067d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            int r1 = r4.f3766b
            int r3 = r5.mo4064a()
            if (r1 != r3) goto L_0x0042
            android.util.Size r1 = r4.f3767c
            android.util.Size r3 = r5.mo4066c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0042
            android.util.Range r1 = r4.f3768d
            if (r1 != 0) goto L_0x0036
            android.util.Range r5 = r5.mo4065b()
            if (r5 != 0) goto L_0x0042
            goto L_0x0041
        L_0x0036:
            android.util.Range r5 = r5.mo4065b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            return r0
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.C1313b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f3765a.hashCode() ^ 1000003) * 1000003) ^ this.f3766b) * 1000003) ^ this.f3767c.hashCode()) * 1000003;
        Range range = this.f3768d;
        if (range == null) {
            i = 0;
        } else {
            i = range.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f3765a + ", imageFormat=" + this.f3766b + ", size=" + this.f3767c + ", targetFrameRate=" + this.f3768d + "}";
    }
}
