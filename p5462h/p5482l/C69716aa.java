package p5462h.p5482l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;

/* renamed from: h.l.aa */
/* compiled from: PG */
public final class C69716aa implements C69731k {

    /* renamed from: a */
    final /* synthetic */ C69731k f186075a;

    /* renamed from: b */
    final /* synthetic */ Comparator f186076b;

    public C69716aa(C69731k kVar, Comparator comparator) {
        this.f186075a = kVar;
        this.f186076b = comparator;
    }

    /* renamed from: a */
    public final Iterator mo5191a() {
        List g = C69734n.m101139g(this.f186075a);
        C69540x.m100809p(g, this.f186076b);
        return g.iterator();
    }
}
