package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79950ay;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54867cf;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54868cg;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.p */
/* compiled from: PG */
class C112650p implements Function {
    /* renamed from: a */
    public final C54868cg apply(C79950ay ayVar) {
        C54867cf cfVar = (C54867cf) C54868cg.f144139c.createBuilder();
        if ((ayVar.f219261a & 1) != 0) {
            float f = ayVar.f219262b;
            cfVar.copyOnWrite();
            C54868cg cgVar = (C54868cg) cfVar.instance;
            cgVar.f144141a |= 1;
            cgVar.f144142b = f;
        }
        return (C54868cg) cfVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
