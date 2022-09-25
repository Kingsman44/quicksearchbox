package p5462h.p5480j;

/* renamed from: h.j.f */
/* compiled from: PG */
public final class C69698f extends C69696d {
    public C69698f(long j, long j2) {
        super(j, j2);
    }

    /* renamed from: a */
    public final boolean mo61417a() {
        return this.f186067a > this.f186068b;
    }

    /* renamed from: b */
    public final boolean mo61422b(long j) {
        return this.f186067a <= j && j <= this.f186068b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C69698f)) {
            return false;
        }
        if (mo61417a() && ((C69698f) obj).mo61417a()) {
            return true;
        }
        C69698f fVar = (C69698f) obj;
        return this.f186067a == fVar.f186067a && this.f186068b == fVar.f186068b;
    }

    public final int hashCode() {
        if (mo61417a()) {
            return -1;
        }
        long j = this.f186067a;
        long j2 = this.f186068b;
        return (int) (((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return this.f186067a + ".." + this.f186068b;
    }
}
