package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106712a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106723c;
import com.google.assistant.p3860as.C49742ae;
import com.google.assistant.p3860as.C49752ao;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.b */
/* compiled from: PG */
public final /* synthetic */ class C106666b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106666b f297333a = new C106666b();

    private /* synthetic */ C106666b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Object obj2;
        C106723c cVar = (C106723c) obj;
        C49742ae aeVar = (C49742ae) cVar.mo95620b();
        C62940bt r1 = C62942bv.checkIsLite(C49752ao.f128476d);
        aeVar.mo58887l(r1);
        Object l = aeVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj2 = r1.f169969b;
        } else {
            obj2 = r1.mo58889c(l);
        }
        return new C106712a((C49752ao) obj2, cVar.mo95619a());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
