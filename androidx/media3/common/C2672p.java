package androidx.media3.common;

/* renamed from: androidx.media3.common.p */
/* compiled from: PG */
public final class C2672p implements C2668l {

    /* renamed from: a */
    public final int f7438a = 0;

    /* renamed from: b */
    public final int f7439b;

    /* renamed from: c */
    public final int f7440c;

    public C2672p(int i, int i2) {
        this.f7439b = i;
        this.f7440c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2672p)) {
            return false;
        }
        C2672p pVar = (C2672p) obj;
        int i = pVar.f7438a;
        return this.f7439b == pVar.f7439b && this.f7440c == pVar.f7440c;
    }

    public final int hashCode() {
        return ((this.f7439b + 16337) * 31) + this.f7440c;
    }
}
