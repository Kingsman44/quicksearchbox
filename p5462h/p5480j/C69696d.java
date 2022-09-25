package p5462h.p5480j;

import java.util.Iterator;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.j.d */
/* compiled from: PG */
public class C69696d implements Iterable, C69640a {

    /* renamed from: a */
    public final long f186067a;

    /* renamed from: b */
    public final long f186068b;

    /* renamed from: c */
    private final long f186069c = 1;

    public C69696d(long j, long j2) {
        this.f186067a = j;
        this.f186068b = j2;
    }

    /* renamed from: a */
    public boolean mo61417a() {
        return this.f186067a > this.f186068b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C69696d)) {
            return false;
        }
        if (mo61417a() && ((C69696d) obj).mo61417a()) {
            return true;
        }
        C69696d dVar = (C69696d) obj;
        if (this.f186067a != dVar.f186067a || this.f186068b != dVar.f186068b) {
            return false;
        }
        long j = dVar.f186069c;
        return true;
    }

    public int hashCode() {
        if (mo61417a()) {
            return -1;
        }
        long j = this.f186067a;
        long j2 = this.f186068b;
        return (int) (((((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31) + 1);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C69697e(this.f186067a, this.f186068b);
    }

    public String toString() {
        return this.f186067a + ".." + this.f186068b + " step 1";
    }
}
