package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113393ed;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54931v;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54932w;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.t */
/* compiled from: PG */
class C112654t implements Function {
    /* renamed from: a */
    public final C54932w apply(C113393ed edVar) {
        C54931v vVar = (C54931v) C54932w.f144413i.createBuilder();
        if ((edVar.f313987a & 1) != 0) {
            boolean z = edVar.f313988b;
            vVar.copyOnWrite();
            C54932w wVar = (C54932w) vVar.instance;
            wVar.f144415a |= 1;
            wVar.f144416b = z;
        }
        if ((edVar.f313987a & 2) != 0) {
            boolean z2 = edVar.f313989c;
            vVar.copyOnWrite();
            C54932w wVar2 = (C54932w) vVar.instance;
            wVar2.f144415a |= 2;
            wVar2.f144417c = z2;
        }
        if ((edVar.f313987a & 4) != 0) {
            float f = edVar.f313990d;
            vVar.copyOnWrite();
            C54932w wVar3 = (C54932w) vVar.instance;
            wVar3.f144415a |= 4;
            wVar3.f144418d = f;
        }
        if ((edVar.f313987a & 8) != 0) {
            float f2 = edVar.f313991e;
            vVar.copyOnWrite();
            C54932w wVar4 = (C54932w) vVar.instance;
            wVar4.f144415a |= 8;
            wVar4.f144419e = f2;
        }
        if ((edVar.f313987a & 16) != 0) {
            float f3 = edVar.f313992f;
            vVar.copyOnWrite();
            C54932w wVar5 = (C54932w) vVar.instance;
            wVar5.f144415a |= 16;
            wVar5.f144420f = f3;
        }
        if ((edVar.f313987a & 32) != 0) {
            float f4 = edVar.f313993g;
            vVar.copyOnWrite();
            C54932w wVar6 = (C54932w) vVar.instance;
            wVar6.f144415a |= 32;
            wVar6.f144421g = f4;
        }
        if ((edVar.f313987a & 64) != 0) {
            float f5 = edVar.f313994h;
            vVar.copyOnWrite();
            C54932w wVar7 = (C54932w) vVar.instance;
            wVar7.f144415a |= 64;
            wVar7.f144422h = f5;
        }
        return (C54932w) vVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
