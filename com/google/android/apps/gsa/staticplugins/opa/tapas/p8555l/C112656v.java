package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.p4140ba.p4141a.p4145b.p4146a.C54873cl;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54874cm;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56335f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.v */
/* compiled from: PG */
class C112656v implements Function {
    /* renamed from: a */
    public final C54874cm apply(C56335f fVar) {
        C54873cl clVar = (C54873cl) C54874cm.f144160c.createBuilder();
        if ((fVar.f150161a & 1) != 0) {
            float f = fVar.f150162b;
            clVar.copyOnWrite();
            C54874cm cmVar = (C54874cm) clVar.instance;
            cmVar.f144162a |= 1;
            cmVar.f144163b = f;
        }
        return (C54874cm) clVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
