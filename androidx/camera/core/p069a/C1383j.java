package androidx.camera.core.p069a;

import android.util.Size;

/* renamed from: androidx.camera.core.a.j */
/* compiled from: PG */
public final class C1383j extends C1363cw {

    /* renamed from: a */
    public final Size f3894a;

    /* renamed from: b */
    public final Size f3895b;

    /* renamed from: c */
    public final Size f3896c;

    public C1383j(Size size, Size size2, Size size3) {
        this.f3894a = size;
        if (size2 != null) {
            this.f3895b = size2;
            if (size3 != null) {
                this.f3896c = size3;
                return;
            }
            throw new NullPointerException("Null recordSize");
        }
        throw new NullPointerException("Null previewSize");
    }

    /* renamed from: a */
    public final Size mo4254a() {
        return this.f3894a;
    }

    /* renamed from: b */
    public final Size mo4255b() {
        return this.f3895b;
    }

    /* renamed from: c */
    public final Size mo4256c() {
        return this.f3896c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1363cw) {
            C1363cw cwVar = (C1363cw) obj;
            return this.f3894a.equals(cwVar.mo4254a()) && this.f3895b.equals(cwVar.mo4255b()) && this.f3896c.equals(cwVar.mo4256c());
        }
    }

    public final int hashCode() {
        return ((((this.f3894a.hashCode() ^ 1000003) * 1000003) ^ this.f3895b.hashCode()) * 1000003) ^ this.f3896c.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f3894a + ", previewSize=" + this.f3895b + ", recordSize=" + this.f3896c + "}";
    }
}
