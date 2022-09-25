package p5488io.p5490b.p5497e.p5502e.p5504b;

import java.util.Iterator;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5512i.C70077a;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70082c;

/* renamed from: io.b.e.e.b.e */
/* compiled from: PG */
abstract class C69896e extends C70077a {
    private static final long serialVersionUID = -2252972430506210021L;

    /* renamed from: a */
    Iterator f186327a;

    /* renamed from: b */
    volatile boolean f186328b;

    /* renamed from: c */
    boolean f186329c;

    public C69896e(Iterator it) {
        this.f186327a = it;
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186327a = null;
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
        if (C70079c.m101976g(j) && C70082c.m101981a(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                mo61514f();
            } else {
                mo61515g(j);
            }
        }
    }

    /* renamed from: f */
    public abstract void mo61514f();

    /* renamed from: g */
    public abstract void mo61515g(long j);

    /* renamed from: i */
    public final boolean mo61476i() {
        Iterator it = this.f186327a;
        return it == null || !it.hasNext();
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        return i & 1;
    }

    /* renamed from: lP */
    public final void mo61490lP() {
        this.f186328b = true;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        Iterator it = this.f186327a;
        if (it == null) {
            return null;
        }
        if (!this.f186329c) {
            this.f186329c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.f186327a.next();
        C69841j.m101337b(next, "Iterator.next() returned a null value");
        return next;
    }
}
