package org.p5633c.p5634a.p5637c;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72144ab;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5639e.C72245b;
import org.p5633c.p5634a.p5639e.C72267x;
import org.p5633c.p5634a.p5639e.C72268y;
import org.p5633c.p5634a.p5639e.C72269z;

/* renamed from: org.c.a.c.r */
/* compiled from: PG */
final class C72209r extends C72192a implements C72199h, C72202k, C72194c, C72203l {

    /* renamed from: a */
    static final C72209r f192176a = new C72209r();

    protected C72209r() {
    }

    /* renamed from: a */
    public final long mo63529a(Object obj, C72132a aVar) {
        return C72267x.f192327h.mo63600f(aVar).mo63595a((String) obj);
    }

    /* renamed from: e */
    public final int[] mo63533e(C72151ai aiVar, Object obj, C72132a aVar, C72245b bVar) {
        C72288l lVar = bVar.f192235e;
        if (lVar != null) {
            aVar = aVar.mo63348e(lVar);
        }
        return aVar.mo63339Q(aiVar, bVar.mo63600f(aVar).mo63595a((String) obj));
    }

    /* renamed from: g */
    public final Class mo63536g() {
        return String.class;
    }

    /* renamed from: h */
    public final void mo63541h(C72144ab abVar, Object obj, C72132a aVar) {
        String str = (String) obj;
        C72269z a = C72268y.m106711a();
        abVar.mo63423a();
        a.mo63645c();
        int c = a.f192348b.mo63584c(abVar, str, 0);
        if (c < str.length()) {
            if (c < 0) {
                a.mo63644b(abVar.f191965a).mo63643a(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + "\"");
        }
    }
}
