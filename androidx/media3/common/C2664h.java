package androidx.media3.common;

/* renamed from: androidx.media3.common.h */
/* compiled from: PG */
public final class C2664h implements C2668l {

    /* renamed from: a */
    public static final C2664h f7421a = C2663g.m7201a(0, 1);

    /* renamed from: b */
    public final int f7422b;

    /* renamed from: c */
    public final int f7423c;

    /* renamed from: d */
    private C2662f f7424d;

    public C2664h(int i, int i2) {
        this.f7422b = i;
        this.f7423c = i2;
    }

    /* renamed from: a */
    public final C2662f mo6330a() {
        if (this.f7424d == null) {
            this.f7424d = new C2662f(this);
        }
        return this.f7424d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2664h hVar = (C2664h) obj;
            return this.f7422b == hVar.f7422b && this.f7423c == hVar.f7423c;
        }
    }

    public final int hashCode() {
        return (((((this.f7422b + 527) * 961) + this.f7423c) * 31) + 1) * 31;
    }
}
