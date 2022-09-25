package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79971bs;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54890db;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54891dc;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ai */
/* compiled from: PG */
class C112156ai implements Function {
    /* renamed from: a */
    public final C54891dc apply(C79971bs bsVar) {
        C54890db dbVar = (C54890db) C54891dc.f144227e.createBuilder();
        if ((bsVar.f219345a & 1) != 0) {
            float f = bsVar.f219346b;
            dbVar.copyOnWrite();
            C54891dc dcVar = (C54891dc) dbVar.instance;
            dcVar.f144229a |= 1;
            dcVar.f144230b = f;
        }
        if ((bsVar.f219345a & 2) != 0) {
            float f2 = bsVar.f219347c;
            dbVar.copyOnWrite();
            C54891dc dcVar2 = (C54891dc) dbVar.instance;
            dcVar2.f144229a |= 2;
            dcVar2.f144231c = f2;
        }
        if ((bsVar.f219345a & 4) != 0) {
            float f3 = bsVar.f219348d;
            dbVar.copyOnWrite();
            C54891dc dcVar3 = (C54891dc) dbVar.instance;
            dcVar3.f144229a |= 4;
            dcVar3.f144232d = f3;
        }
        return (C54891dc) dbVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
