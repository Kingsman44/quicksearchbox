package androidx.media3.exoplayer.p140d;

/* renamed from: androidx.media3.exoplayer.d.c */
/* compiled from: PG */
public final class C2901c {

    /* renamed from: a */
    public final int f8210a;

    /* renamed from: b */
    public final int f8211b;

    public C2901c(int i, int i2) {
        this.f8210a = i;
        this.f8211b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2901c cVar = (C2901c) obj;
            if (this.f8210a == cVar.f8210a && this.f8211b == cVar.f8211b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8210a * 31) + this.f8211b;
    }

    public final String toString() {
        int i = this.f8210a;
        int i2 = this.f8211b;
        return "(" + i + ", " + i2 + ")";
    }
}
