package p5462h.p5463a.p5464a;

/* renamed from: h.a.a.h */
/* compiled from: PG */
public class C69474h {

    /* renamed from: a */
    public final C69477k f185892a;

    /* renamed from: b */
    public int f185893b;

    /* renamed from: c */
    public int f185894c = -1;

    public C69474h(C69477k kVar) {
        this.f185892a = kVar;
        mo61097a();
    }

    /* renamed from: a */
    public final void mo61097a() {
        while (true) {
            int i = this.f185893b;
            C69477k kVar = this.f185892a;
            if (i < kVar.f185898d && kVar.f185897c[i] < 0) {
                this.f185893b = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        return this.f185893b < this.f185892a.f185898d;
    }

    public final void remove() {
        if (this.f185894c != -1) {
            this.f185892a.mo61107e();
            this.f185892a.mo61110f(this.f185894c);
            this.f185894c = -1;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
