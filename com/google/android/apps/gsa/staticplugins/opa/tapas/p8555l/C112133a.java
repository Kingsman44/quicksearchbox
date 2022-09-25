package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79992cm;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54915f;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54916g;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a */
/* compiled from: PG */
class C112133a implements Function {
    /* renamed from: a */
    public final C54916g apply(C79992cm cmVar) {
        C54915f fVar = (C54915f) C54916g.f144353d.createBuilder();
        if ((cmVar.f219447a & 1) != 0) {
            float f = cmVar.f219448b;
            fVar.copyOnWrite();
            C54916g gVar = (C54916g) fVar.instance;
            gVar.f144355a |= 1;
            gVar.f144356b = f;
        }
        if ((cmVar.f219447a & 2) != 0) {
            float f2 = cmVar.f219449c;
            fVar.copyOnWrite();
            C54916g gVar2 = (C54916g) fVar.instance;
            gVar2.f144355a |= 2;
            gVar2.f144357c = f2;
        }
        return (C54916g) fVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
