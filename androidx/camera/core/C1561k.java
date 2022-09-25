package androidx.camera.core;

import android.graphics.Rect;

/* renamed from: androidx.camera.core.k */
/* compiled from: PG */
public final class C1561k extends C1546dw {

    /* renamed from: a */
    public final int f4287a;

    /* renamed from: b */
    private final Rect f4288b;

    /* renamed from: c */
    private final int f4289c;

    public C1561k(Rect rect, int i, int i2) {
        if (rect != null) {
            this.f4288b = rect;
            this.f4287a = i;
            this.f4289c = i2;
            return;
        }
        throw new NullPointerException("Null cropRect");
    }

    /* renamed from: a */
    public final int mo4406a() {
        return this.f4287a;
    }

    /* renamed from: b */
    public final int mo4407b() {
        return this.f4289c;
    }

    /* renamed from: c */
    public final Rect mo4408c() {
        return this.f4288b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1546dw) {
            C1546dw dwVar = (C1546dw) obj;
            return this.f4288b.equals(dwVar.mo4408c()) && this.f4287a == dwVar.mo4406a() && this.f4289c == dwVar.mo4407b();
        }
    }

    public final int hashCode() {
        return ((((this.f4288b.hashCode() ^ 1000003) * 1000003) ^ this.f4287a) * 1000003) ^ this.f4289c;
    }

    public final String toString() {
        return "TransformationInfo{cropRect=" + this.f4288b + ", rotationDegrees=" + this.f4287a + ", targetRotation=" + this.f4289c + "}";
    }
}
