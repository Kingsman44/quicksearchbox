package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79957be;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79959bg;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54876co;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54877cp;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54878cq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.y */
/* compiled from: PG */
class C112659y implements Function {
    /* renamed from: a */
    public final C54878cq apply(C79959bg bgVar) {
        C54877cp cpVar = (C54877cp) C54878cq.f144169c.createBuilder();
        if ((bgVar.f219293a & 1) != 0) {
            Function function = C112241cs.f311533a;
            C79957be beVar = bgVar.f219294b;
            if (beVar == null) {
                beVar = C79957be.f219286d;
            }
            C54876co a = ((C112658x) function).apply(beVar);
            cpVar.copyOnWrite();
            C54878cq cqVar = (C54878cq) cpVar.instance;
            a.getClass();
            cqVar.f144172b = a;
            cqVar.f144171a |= 1;
        }
        return (C54878cq) cpVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
