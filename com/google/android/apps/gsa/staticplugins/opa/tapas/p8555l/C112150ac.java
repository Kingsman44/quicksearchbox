package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79929ad;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54835ba;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54836bb;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ac */
/* compiled from: PG */
class C112150ac implements Function {
    /* renamed from: a */
    public final C54836bb apply(C79929ad adVar) {
        C54835ba baVar = (C54835ba) C54836bb.f143896h.createBuilder();
        if ((adVar.f219087a & 1) != 0) {
            float f = adVar.f219088b;
            baVar.copyOnWrite();
            C54836bb bbVar = (C54836bb) baVar.instance;
            bbVar.f143898a |= 1;
            bbVar.f143899b = f;
        }
        if ((adVar.f219087a & 2) != 0) {
            float f2 = adVar.f219089c;
            baVar.copyOnWrite();
            C54836bb bbVar2 = (C54836bb) baVar.instance;
            bbVar2.f143898a |= 2;
            bbVar2.f143900c = f2;
        }
        if ((adVar.f219087a & 4) != 0) {
            int i = adVar.f219090d;
            baVar.copyOnWrite();
            C54836bb bbVar3 = (C54836bb) baVar.instance;
            bbVar3.f143898a |= 4;
            bbVar3.f143901d = i;
        }
        if ((adVar.f219087a & 8) != 0) {
            boolean z = adVar.f219091e;
            baVar.copyOnWrite();
            C54836bb bbVar4 = (C54836bb) baVar.instance;
            bbVar4.f143898a |= 8;
            bbVar4.f143902e = z;
        }
        if ((adVar.f219087a & 16) != 0) {
            boolean z2 = adVar.f219092f;
            baVar.copyOnWrite();
            C54836bb bbVar5 = (C54836bb) baVar.instance;
            bbVar5.f143898a |= 16;
            bbVar5.f143903f = z2;
        }
        if ((adVar.f219087a & 32) != 0) {
            boolean z3 = adVar.f219093g;
            baVar.copyOnWrite();
            C54836bb bbVar6 = (C54836bb) baVar.instance;
            bbVar6.f143898a |= 32;
            bbVar6.f143904g = z3;
        }
        return (C54836bb) baVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
