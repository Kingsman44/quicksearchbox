package androidx.p060c;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: androidx.c.p */
/* compiled from: PG */
public final class C0986p implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C0985o f3128a;

    /* renamed from: b */
    private int f3129b;

    public C0986p(C0985o oVar) {
        this.f3128a = oVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f3129b < this.f3128a.mo3725d();
    }

    public final Object next() {
        C0985o oVar = this.f3128a;
        int i = this.f3129b;
        this.f3129b = i + 1;
        return oVar.mo3727f(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
