package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113395ef;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54933x;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54934y;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.aj */
/* compiled from: PG */
class C112157aj implements Function {
    /* renamed from: a */
    public final C54934y apply(C113395ef efVar) {
        C54933x xVar = (C54933x) C54934y.f144423d.createBuilder();
        if ((efVar.f313997a & 1) != 0) {
            float f = efVar.f313998b;
            xVar.copyOnWrite();
            C54934y yVar = (C54934y) xVar.instance;
            yVar.f144425a |= 1;
            yVar.f144426b = f;
        }
        if ((efVar.f313997a & 2) != 0) {
            float f2 = efVar.f313999c;
            xVar.copyOnWrite();
            C54934y yVar2 = (C54934y) xVar.instance;
            yVar2.f144425a |= 2;
            yVar2.f144427c = f2;
        }
        return (C54934y) xVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
