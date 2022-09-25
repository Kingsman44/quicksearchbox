package org.p5633c.p5634a.p5637c;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5636b.C72156ab;

/* renamed from: org.c.a.c.n */
/* compiled from: PG */
final class C72205n extends C72192a implements C72199h, C72202k {

    /* renamed from: a */
    static final C72205n f192172a = new C72205n();

    protected C72205n() {
    }

    /* renamed from: a */
    public final long mo63529a(Object obj, C72132a aVar) {
        return ((C72149ag) obj).mo63409mr();
    }

    /* renamed from: b */
    public final C72132a mo63530b(Object obj, C72288l lVar) {
        C72132a ms = ((C72149ag) obj).mo63410ms();
        if (ms == null) {
            return C72156ab.m105789X(lVar);
        }
        if (ms.mo63325C() == lVar) {
            return ms;
        }
        C72132a e = ms.mo63348e(lVar);
        return e == null ? C72156ab.m105789X(lVar) : e;
    }

    /* renamed from: f */
    public final C72132a mo63534f(Object obj) {
        return C72285i.m106775c(((C72149ag) obj).mo63410ms());
    }

    /* renamed from: g */
    public final Class mo63536g() {
        return C72149ag.class;
    }
}
