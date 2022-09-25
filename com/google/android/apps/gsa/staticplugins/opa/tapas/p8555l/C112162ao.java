package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80006d;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54896dh;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54897di;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ao */
/* compiled from: PG */
class C112162ao implements Function {
    /* renamed from: a */
    public final C54897di apply(C80006d dVar) {
        C54896dh dhVar = (C54896dh) C54897di.f144248e.createBuilder();
        if ((dVar.f219516a & 1) != 0) {
            boolean z = dVar.f219517b;
            dhVar.copyOnWrite();
            C54897di diVar = (C54897di) dhVar.instance;
            diVar.f144250a |= 1;
            diVar.f144251b = z;
        }
        if ((dVar.f219516a & 2) != 0) {
            int i = dVar.f219518c;
            dhVar.copyOnWrite();
            C54897di diVar2 = (C54897di) dhVar.instance;
            diVar2.f144250a |= 2;
            diVar2.f144252c = i;
        }
        if ((dVar.f219516a & 4) != 0) {
            float f = dVar.f219519d;
            dhVar.copyOnWrite();
            C54897di diVar3 = (C54897di) dhVar.instance;
            diVar3.f144250a |= 4;
            diVar3.f144253d = f;
        }
        return (C54897di) dhVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
