package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.assistant.p3886c.C50749bn;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.aq */
/* compiled from: PG */
public final /* synthetic */ class C110745aq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C110745aq f308563a = new C110745aq();

    private /* synthetic */ C110745aq() {
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
            j = ((C89776h) bnVar.f132067b).f242992l;
        } else {
            if (i == 2) {
                pVar = (C123787p) bnVar.f132067b;
            } else {
                pVar = C123787p.f341948n;
            }
            j = pVar.f341959j;
        }
        return Long.valueOf(j);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
