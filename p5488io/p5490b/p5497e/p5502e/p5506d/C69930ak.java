package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.Iterator;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5501d.C69850c;

/* renamed from: io.b.e.e.d.ak */
/* compiled from: PG */
final class C69930ak extends C69850c {

    /* renamed from: a */
    final C70123o f186391a;

    /* renamed from: b */
    final Iterator f186392b;

    /* renamed from: c */
    volatile boolean f186393c;

    /* renamed from: d */
    boolean f186394d;

    /* renamed from: e */
    boolean f186395e;

    /* renamed from: f */
    boolean f186396f;

    public C69930ak(C70123o oVar, Iterator it) {
        this.f186391a = oVar;
        this.f186392b = it;
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186395e = true;
    }

    public final void dispose() {
        this.f186393c = true;
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186395e;
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        this.f186394d = true;
        return 1;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        if (this.f186395e) {
            return null;
        }
        if (!this.f186396f) {
            this.f186396f = true;
        } else if (!this.f186392b.hasNext()) {
            this.f186395e = true;
            return null;
        }
        Object next = this.f186392b.next();
        C69841j.m101337b(next, "The iterator returned a null value");
        return next;
    }
}
