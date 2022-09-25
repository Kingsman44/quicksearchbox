package p5462h.p5482l;

import java.util.HashSet;
import java.util.Iterator;
import p5462h.p5463a.C69519c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.l.b */
/* compiled from: PG */
final class C69722b extends C69519c {

    /* renamed from: b */
    private final Iterator f186087b;

    /* renamed from: c */
    private final HashSet f186088c = new HashSet();

    public C69722b(Iterator it) {
        C69664n.m101061g(it, "source");
        this.f186087b = it;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61268a() {
        while (this.f186087b.hasNext()) {
            Object next = this.f186087b.next();
            if (this.f186088c.add(next)) {
                mo61269b(next);
                return;
            }
        }
        this.f185935a = 3;
    }
}
