package org.p5633c.p5634a.p5637c;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72146ad;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5639e.C72245b;

/* renamed from: org.c.a.c.a */
/* compiled from: PG */
public abstract class C72192a implements C72194c {
    protected C72192a() {
    }

    /* renamed from: a */
    public long mo63529a(Object obj, C72132a aVar) {
        C72284h hVar = C72285i.f192412b;
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public C72132a mo63530b(Object obj, C72288l lVar) {
        return C72156ab.m105789X(lVar);
    }

    /* renamed from: c */
    public C72146ad mo63531c(Object obj) {
        return C72146ad.m105763e();
    }

    /* renamed from: d */
    public int[] mo63532d(C72151ai aiVar, Object obj, C72132a aVar) {
        return aVar.mo63339Q(aiVar, mo63529a(obj, aVar));
    }

    /* renamed from: e */
    public int[] mo63533e(C72151ai aiVar, Object obj, C72132a aVar, C72245b bVar) {
        return mo63532d(aiVar, obj, aVar);
    }

    /* renamed from: f */
    public C72132a mo63534f(Object obj) {
        return C72285i.m106775c((C72132a) null);
    }

    public final String toString() {
        String name = mo63536g() == null ? "null" : mo63536g().getName();
        return "Converter[" + name + "]";
    }
}
