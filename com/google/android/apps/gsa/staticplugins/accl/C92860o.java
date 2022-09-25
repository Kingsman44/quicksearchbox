package com.google.android.apps.gsa.staticplugins.accl;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.o */
/* compiled from: PG */
public final /* synthetic */ class C92860o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C93238r f259080a;

    public /* synthetic */ C92860o(C93238r rVar) {
        this.f259080a = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((C86124t) this.f259080a.f259998b.mo27525b()).mo79746e((C90048d) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
