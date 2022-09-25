package p5462h.p5482l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: h.l.e */
/* compiled from: PG */
public final class C69725e implements Iterator, p3186j$.util.Iterator, C69640a {

    /* renamed from: a */
    final /* synthetic */ C69726f f186091a;

    /* renamed from: b */
    private final Iterator f186092b;

    /* renamed from: c */
    private int f186093c = -1;

    /* renamed from: d */
    private Object f186094d;

    public C69725e(C69726f fVar) {
        this.f186091a = fVar;
        this.f186092b = fVar.f186095a.mo5191a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101154a() {
        /*
            r3 = this;
        L_0x0000:
            java.util.Iterator r0 = r3.f186092b
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0028
            java.util.Iterator r0 = r3.f186092b
            java.lang.Object r0 = r0.next()
            h.l.f r1 = r3.f186091a
            h.f.a.l r1 = r1.f186097c
            java.lang.Object r1 = r1.mo5761a(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            h.l.f r2 = r3.f186091a
            boolean r2 = r2.f186096b
            if (r1 != r2) goto L_0x0000
            r3.f186094d = r0
            r0 = 1
        L_0x0025:
            r3.f186093c = r0
            return
        L_0x0028:
            r0 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5482l.C69725e.m101154a():void");
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        if (this.f186093c == -1) {
            m101154a();
        }
        return this.f186093c == 1;
    }

    public final Object next() {
        if (this.f186093c == -1) {
            m101154a();
        }
        if (this.f186093c != 0) {
            Object obj = this.f186094d;
            this.f186094d = null;
            this.f186093c = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
