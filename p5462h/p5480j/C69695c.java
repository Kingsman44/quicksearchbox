package p5462h.p5480j;

/* renamed from: h.j.c */
/* compiled from: PG */
public final class C69695c extends C69693a {

    /* renamed from: d */
    public static final C69695c f186066d = new C69695c(1, 0);

    public C69695c(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: b */
    public final boolean mo61411b() {
        return this.f186059a > this.f186060b;
    }

    /* renamed from: c */
    public final boolean mo61416c(int i) {
        return this.f186059a <= i && i <= this.f186060b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C69695c)) {
            return false;
        }
        if (mo61411b() && ((C69695c) obj).mo61411b()) {
            return true;
        }
        C69695c cVar = (C69695c) obj;
        return this.f186059a == cVar.f186059a && this.f186060b == cVar.f186060b;
    }

    public final int hashCode() {
        if (mo61411b()) {
            return -1;
        }
        return (this.f186059a * 31) + this.f186060b;
    }

    public final String toString() {
        return this.f186059a + ".." + this.f186060b;
    }
}
