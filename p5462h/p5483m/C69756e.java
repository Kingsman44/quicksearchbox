package p5462h.p5483m;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.C69685i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;
import p5462h.p5480j.C69695c;
import p5462h.p5480j.C69699g;

/* renamed from: h.m.e */
/* compiled from: PG */
public final class C69756e implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C69757f f186126a;

    /* renamed from: b */
    private int f186127b = -1;

    /* renamed from: c */
    private int f186128c;

    /* renamed from: d */
    private int f186129d;

    /* renamed from: e */
    private C69695c f186130e;

    public C69756e(C69757f fVar) {
        this.f186126a = fVar;
        int e = C69699g.m101123e(0, fVar.f186131a.length());
        this.f186128c = e;
        this.f186129d = e;
    }

    /* renamed from: a */
    private final void m101210a() {
        int i = this.f186129d;
        int i2 = 0;
        if (i < 0) {
            this.f186127b = 0;
            this.f186130e = null;
            return;
        }
        if (i > this.f186126a.f186131a.length()) {
            this.f186130e = new C69695c(this.f186128c, C69764m.m101195o(this.f186126a.f186131a));
            this.f186129d = -1;
        } else {
            C69757f fVar = this.f186126a;
            C69685i iVar = (C69685i) fVar.f186132b.mo5192a(fVar.f186131a, Integer.valueOf(this.f186129d));
            if (iVar == null) {
                this.f186130e = new C69695c(this.f186128c, C69764m.m101195o(this.f186126a.f186131a));
                this.f186129d = -1;
            } else {
                int intValue = ((Number) iVar.f186052a).intValue();
                int intValue2 = ((Number) iVar.f186053b).intValue();
                this.f186130e = C69699g.m101122d(this.f186128c, intValue);
                int i3 = intValue + intValue2;
                this.f186128c = i3;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                this.f186129d = i3 + i2;
            }
        }
        this.f186127b = 1;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        if (this.f186127b == -1) {
            m101210a();
        }
        return this.f186127b == 1;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f186127b == -1) {
            m101210a();
        }
        if (this.f186127b != 0) {
            C69695c cVar = this.f186130e;
            C69664n.m101059e(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f186130e = null;
            this.f186127b = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
