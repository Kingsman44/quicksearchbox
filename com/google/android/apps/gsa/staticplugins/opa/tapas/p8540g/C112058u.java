package com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g;

import com.google.protos.p4850an.p4854c.C63402ac;
import com.google.protos.p4850an.p4854c.C63404ae;
import com.google.protos.p4850an.p4854c.C63408ai;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.g.u */
/* compiled from: PG */
public final /* synthetic */ class C112058u implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C112058u f311232a = new C112058u();

    private /* synthetic */ C112058u() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63408ai aiVar = (C63408ai) obj;
        int i = aiVar.f171353a;
        if ((i & 1) != 0) {
            C63402ac acVar = aiVar.f171354b;
            if (acVar == null) {
                return C63402ac.f171336b;
            }
            return acVar;
        }
        if ((i & 2) != 0) {
            C63404ae aeVar = aiVar.f171355c;
            if (aeVar == null) {
                aeVar = C63404ae.f171340c;
            }
            if ((aeVar.f171342a & 1) != 0) {
                C63408ai aiVar2 = aeVar.f171343b;
                if (aiVar2 == null) {
                    aiVar2 = C63408ai.f171351e;
                }
                if ((aiVar2.f171353a & 1) != 0) {
                    C63402ac acVar2 = aiVar2.f171354b;
                    if (acVar2 == null) {
                        return C63402ac.f171336b;
                    }
                    return acVar2;
                }
            }
        }
        return C63402ac.f171336b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
