package androidx.media3.exoplayer.p145h;

/* renamed from: androidx.media3.exoplayer.h.bs */
/* compiled from: PG */
final class C3081bs {

    /* renamed from: a */
    public final int f8954a;

    /* renamed from: b */
    public final boolean f8955b;

    public C3081bs(int i, boolean z) {
        this.f8954a = i;
        this.f8955b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3081bs bsVar = (C3081bs) obj;
            return this.f8954a == bsVar.f8954a && this.f8955b == bsVar.f8955b;
        }
    }

    public final int hashCode() {
        return (this.f8954a * 31) + (this.f8955b ? 1 : 0);
    }
}
