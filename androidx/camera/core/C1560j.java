package androidx.camera.core;

import android.view.Surface;

/* renamed from: androidx.camera.core.j */
/* compiled from: PG */
final class C1560j extends C1545dv {

    /* renamed from: a */
    private final int f4285a;

    /* renamed from: b */
    private final Surface f4286b;

    public C1560j(int i, Surface surface) {
        this.f4285a = i;
        this.f4286b = surface;
    }

    /* renamed from: a */
    public final int mo4404a() {
        return this.f4285a;
    }

    /* renamed from: b */
    public final Surface mo4405b() {
        return this.f4286b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1545dv) {
            C1545dv dvVar = (C1545dv) obj;
            return this.f4285a == dvVar.mo4404a() && this.f4286b.equals(dvVar.mo4405b());
        }
    }

    public final int hashCode() {
        return ((this.f4285a ^ 1000003) * 1000003) ^ this.f4286b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f4285a + ", surface=" + this.f4286b + "}";
    }
}
