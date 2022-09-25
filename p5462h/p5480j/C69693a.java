package p5462h.p5480j;

import p5462h.p5463a.C69502as;
import p5462h.p5470d.C69595d;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.j.a */
/* compiled from: PG */
public class C69693a implements Iterable, C69640a {

    /* renamed from: a */
    public final int f186059a;

    /* renamed from: b */
    public final int f186060b;

    /* renamed from: c */
    public final int f186061c;

    public C69693a(int i, int i2, int i3) {
        if (i3 != 0) {
            this.f186059a = i;
            this.f186060b = C69595d.m101009a(i, i2, i3);
            this.f186061c = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: a */
    public final C69502as iterator() {
        return new C69694b(this.f186059a, this.f186060b, this.f186061c);
    }

    /* renamed from: b */
    public boolean mo61411b() {
        return this.f186061c > 0 ? this.f186059a > this.f186060b : this.f186059a < this.f186060b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C69693a)) {
            return false;
        }
        if (mo61411b() && ((C69693a) obj).mo61411b()) {
            return true;
        }
        C69693a aVar = (C69693a) obj;
        return this.f186059a == aVar.f186059a && this.f186060b == aVar.f186060b && this.f186061c == aVar.f186061c;
    }

    public int hashCode() {
        if (mo61411b()) {
            return -1;
        }
        return (((this.f186059a * 31) + this.f186060b) * 31) + this.f186061c;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f186061c > 0) {
            sb = new StringBuilder();
            sb.append(this.f186059a);
            sb.append("..");
            sb.append(this.f186060b);
            sb.append(" step ");
            i = this.f186061c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f186059a);
            sb.append(" downTo ");
            sb.append(this.f186060b);
            sb.append(" step ");
            i = -this.f186061c;
        }
        sb.append(i);
        return sb.toString();
    }
}
