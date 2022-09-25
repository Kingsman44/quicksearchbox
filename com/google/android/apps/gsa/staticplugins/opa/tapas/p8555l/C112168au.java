package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79984ce;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54904dp;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54905dq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.au */
/* compiled from: PG */
class C112168au implements Function {
    /* renamed from: a */
    public final C54905dq apply(C79984ce ceVar) {
        C54904dp dpVar = (C54904dp) C54905dq.f144296e.createBuilder();
        if ((ceVar.f219408a & 1) != 0) {
            float f = ceVar.f219409b;
            dpVar.copyOnWrite();
            C54905dq dqVar = (C54905dq) dpVar.instance;
            dqVar.f144298a |= 1;
            dqVar.f144299b = f;
        }
        if ((ceVar.f219408a & 2) != 0) {
            float f2 = ceVar.f219410c;
            dpVar.copyOnWrite();
            C54905dq dqVar2 = (C54905dq) dpVar.instance;
            dqVar2.f144298a |= 2;
            dqVar2.f144300c = f2;
        }
        if ((ceVar.f219408a & 4) != 0) {
            float f3 = ceVar.f219411d;
            dpVar.copyOnWrite();
            C54905dq dqVar3 = (C54905dq) dpVar.instance;
            dqVar3.f144298a |= 4;
            dqVar3.f144301d = f3;
        }
        return (C54905dq) dpVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
