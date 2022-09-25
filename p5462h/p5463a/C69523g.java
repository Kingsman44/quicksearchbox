package p5462h.p5463a;

import java.util.RandomAccess;

/* renamed from: h.a.g */
/* compiled from: PG */
final class C69523g extends C69524h implements RandomAccess {

    /* renamed from: a */
    private final C69524h f185940a;

    /* renamed from: b */
    private final int f185941b;

    /* renamed from: c */
    private final int f185942c;

    public C69523g(C69524h hVar, int i, int i2) {
        this.f185940a = hVar;
        this.f185941b = i;
        C69520d.m100900c(i, i2, hVar.mo61249a());
        this.f185942c = i2 - i;
    }

    /* renamed from: a */
    public final int mo61249a() {
        return this.f185942c;
    }

    public final Object get(int i) {
        C69520d.m100898a(i, this.f185942c);
        return this.f185940a.get(this.f185941b + i);
    }
}
