package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c;

import com.google.assistant.p3803ag.p3804a.C48796ad;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48862e;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.c.e */
/* compiled from: PG */
public final /* synthetic */ class C107425e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C107425e f298960a = new C107425e();

    private /* synthetic */ C107425e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48862e eVar;
        Object obj2;
        C48865h hVar = (C48865h) obj;
        if (hVar.f126458b == 4) {
            eVar = (C48862e) hVar.f126459c;
        } else {
            eVar = C48862e.f126439a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C48796ad.f126260c);
        eVar.mo58887l(r0);
        Object l = eVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj2 = r0.f169969b;
        } else {
            obj2 = r0.mo58889c(l);
        }
        C48871n nVar = ((C48796ad) obj2).f126262a;
        if (nVar == null) {
            nVar = C48871n.f126470e;
        }
        C48851br brVar = nVar.f126473b;
        return brVar == null ? C48851br.f126412f : brVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
