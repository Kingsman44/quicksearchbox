package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113391eb;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54921l;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54922m;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.k */
/* compiled from: PG */
class C112645k implements Function {
    /* renamed from: a */
    public final C54922m apply(C113391eb ebVar) {
        C54921l lVar = (C54921l) C54922m.f144374e.createBuilder();
        if ((ebVar.f313981a & 2) != 0) {
            boolean z = ebVar.f313982b;
            lVar.copyOnWrite();
            C54922m mVar = (C54922m) lVar.instance;
            mVar.f144376a |= 1;
            mVar.f144377b = z;
        }
        if ((ebVar.f313981a & 4) != 0) {
            float f = ebVar.f313983c;
            lVar.copyOnWrite();
            C54922m mVar2 = (C54922m) lVar.instance;
            mVar2.f144376a |= 2;
            mVar2.f144378c = f;
        }
        if ((ebVar.f313981a & 8) != 0) {
            float f2 = ebVar.f313984d;
            lVar.copyOnWrite();
            C54922m mVar3 = (C54922m) lVar.instance;
            mVar3.f144376a |= 4;
            mVar3.f144379d = f2;
        }
        return (C54922m) lVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
