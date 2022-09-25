package androidx.media3.common;

/* renamed from: androidx.media3.common.bt */
/* compiled from: PG */
public final class C2658bt implements C2668l {

    /* renamed from: a */
    public final int f7408a;

    /* renamed from: b */
    public final int f7409b;

    /* renamed from: c */
    public final int f7410c = 0;

    /* renamed from: d */
    public final float f7411d;

    public C2658bt(int i, int i2, float f) {
        this.f7408a = i;
        this.f7409b = i2;
        this.f7411d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2658bt) {
            C2658bt btVar = (C2658bt) obj;
            if (this.f7408a == btVar.f7408a && this.f7409b == btVar.f7409b) {
                int i = btVar.f7410c;
                if (this.f7411d == btVar.f7411d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7408a + 217) * 31) + this.f7409b) * 961) + Float.floatToRawIntBits(this.f7411d);
    }
}
