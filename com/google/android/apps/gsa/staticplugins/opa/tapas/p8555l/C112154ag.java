package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79967bo;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54885cx;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54886cy;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ag */
/* compiled from: PG */
class C112154ag implements Function {
    /* renamed from: a */
    public final C54886cy apply(C79967bo boVar) {
        C54885cx cxVar = (C54885cx) C54886cy.f144206f.createBuilder();
        if ((boVar.f219330a & 1) != 0) {
            float f = boVar.f219331b;
            cxVar.copyOnWrite();
            C54886cy cyVar = (C54886cy) cxVar.instance;
            cyVar.f144208a |= 1;
            cyVar.f144209b = f;
        }
        if ((boVar.f219330a & 2) != 0) {
            float f2 = boVar.f219332c;
            cxVar.copyOnWrite();
            C54886cy cyVar2 = (C54886cy) cxVar.instance;
            cyVar2.f144208a |= 2;
            cyVar2.f144210c = f2;
        }
        if ((boVar.f219330a & 4) != 0) {
            float f3 = boVar.f219333d;
            cxVar.copyOnWrite();
            C54886cy cyVar3 = (C54886cy) cxVar.instance;
            cyVar3.f144208a |= 4;
            cyVar3.f144211d = f3;
        }
        if ((boVar.f219330a & 8) != 0) {
            float f4 = boVar.f219334e;
            cxVar.copyOnWrite();
            C54886cy cyVar4 = (C54886cy) cxVar.instance;
            cyVar4.f144208a |= 8;
            cyVar4.f144212e = f4;
        }
        return (C54886cy) cxVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
