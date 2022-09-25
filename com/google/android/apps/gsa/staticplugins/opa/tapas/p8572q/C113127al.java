package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90075e;
import com.google.android.apps.gsa.shared.p7066m.C90102f;
import com.google.android.apps.gsa.shared.p7066m.C90128g;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.al */
/* compiled from: PG */
public final /* synthetic */ class C113127al implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113127al f313430a = new C113127al();

    private /* synthetic */ C113127al() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113129an anVar;
        if (obj instanceof C90129h) {
            C90129h hVar = (C90129h) obj;
            hVar.getClass();
            anVar = new C113121af(hVar);
        } else if (obj instanceof C90128g) {
            C90128g gVar = (C90128g) obj;
            gVar.getClass();
            anVar = new C113120ae(gVar);
        } else if (obj instanceof C90048d) {
            C90048d dVar = (C90048d) obj;
            dVar.getClass();
            anVar = new C113117ab(dVar);
        } else if (obj instanceof C90102f) {
            C90102f fVar = (C90102f) obj;
            fVar.getClass();
            anVar = new C113119ad(fVar);
        } else if (obj instanceof C90075e) {
            C90075e eVar = (C90075e) obj;
            eVar.getClass();
            anVar = new C113118ac(eVar);
        } else {
            throw new IllegalArgumentException("Illogical param object: ".concat(String.valueOf(String.valueOf(obj))));
        }
        return new C113130ao(anVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
