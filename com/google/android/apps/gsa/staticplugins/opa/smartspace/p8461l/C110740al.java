package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.assistant.p3886c.C50749bn;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.al */
/* compiled from: PG */
public final /* synthetic */ class C110740al implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C110740al f308551a = new C110740al();

    private /* synthetic */ C110740al() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        long j;
        C123787p pVar;
        C50749bn bnVar = (C50749bn) obj;
        int i = bnVar.f132066a;
        if (i == 1) {
            j = ((C89776h) bnVar.f132067b).f242982b;
        } else {
            if (i == 2) {
                pVar = (C123787p) bnVar.f132067b;
            } else {
                pVar = C123787p.f341948n;
            }
            j = pVar.f341951b;
        }
        return Long.valueOf(j);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
