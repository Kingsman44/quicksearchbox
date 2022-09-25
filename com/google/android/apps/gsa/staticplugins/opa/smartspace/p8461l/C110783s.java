package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.common.base.C58833ax;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.s */
/* compiled from: PG */
public final /* synthetic */ class C110783s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308684a;

    /* renamed from: b */
    public final /* synthetic */ C83800p f308685b;

    public /* synthetic */ C110783s(C110764bi biVar, C83800p pVar) {
        this.f308684a = biVar;
        this.f308685b = pVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C110764bi biVar = this.f308684a;
        C83800p pVar = this.f308685b;
        C83741am amVar = (C83741am) obj;
        if (biVar.mo98884v()) {
            return C58833ax.m90834k(amVar);
        }
        return biVar.mo98868f(pVar.mo77065i(), C58833ax.m90834k(amVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
