package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79931af;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54837bc;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54838bd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.bd */
/* compiled from: PG */
class C112198bd implements Function {
    /* renamed from: a */
    public final C54838bd apply(C79931af afVar) {
        C54837bc bcVar = (C54837bc) C54838bd.f143905f.createBuilder();
        if ((afVar.f219096a & 1) != 0) {
            boolean z = afVar.f219097b;
            bcVar.copyOnWrite();
            C54838bd bdVar = (C54838bd) bcVar.instance;
            bdVar.f143907a |= 1;
            bdVar.f143908b = z;
        }
        if ((afVar.f219096a & 2) != 0) {
            float f = afVar.f219098c;
            bcVar.copyOnWrite();
            C54838bd bdVar2 = (C54838bd) bcVar.instance;
            bdVar2.f143907a |= 2;
            bdVar2.f143909c = f;
        }
        if ((afVar.f219096a & 4) != 0) {
            float f2 = afVar.f219099d;
            bcVar.copyOnWrite();
            C54838bd bdVar3 = (C54838bd) bcVar.instance;
            bdVar3.f143907a |= 4;
            bdVar3.f143910d = f2;
        }
        if ((afVar.f219096a & 8) != 0) {
            boolean z2 = afVar.f219100e;
            bcVar.copyOnWrite();
            C54838bd bdVar4 = (C54838bd) bcVar.instance;
            bdVar4.f143907a |= 8;
            bdVar4.f143911e = z2;
        }
        return (C54838bd) bcVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
