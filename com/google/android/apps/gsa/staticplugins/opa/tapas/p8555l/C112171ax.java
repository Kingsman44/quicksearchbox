package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79990ck;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54910dv;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54911dw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ax */
/* compiled from: PG */
class C112171ax implements Function {
    /* renamed from: a */
    public final C54911dw apply(C79990ck ckVar) {
        C54910dv dvVar = (C54910dv) C54911dw.f144322l.createBuilder();
        if ((ckVar.f219434a & 1) != 0) {
            float f = ckVar.f219435b;
            dvVar.copyOnWrite();
            C54911dw dwVar = (C54911dw) dvVar.instance;
            dwVar.f144324a |= 1;
            dwVar.f144325b = f;
        }
        if ((ckVar.f219434a & 2) != 0) {
            float f2 = ckVar.f219436c;
            dvVar.copyOnWrite();
            C54911dw dwVar2 = (C54911dw) dvVar.instance;
            dwVar2.f144324a |= 2;
            dwVar2.f144326c = f2;
        }
        if ((ckVar.f219434a & 4) != 0) {
            float f3 = ckVar.f219437d;
            dvVar.copyOnWrite();
            C54911dw dwVar3 = (C54911dw) dvVar.instance;
            dwVar3.f144324a |= 4;
            dwVar3.f144327d = f3;
        }
        if ((ckVar.f219434a & 8) != 0) {
            float f4 = ckVar.f219438e;
            dvVar.copyOnWrite();
            C54911dw dwVar4 = (C54911dw) dvVar.instance;
            dwVar4.f144324a |= 8;
            dwVar4.f144328e = f4;
        }
        if ((ckVar.f219434a & 16) != 0) {
            float f5 = ckVar.f219439f;
            dvVar.copyOnWrite();
            C54911dw dwVar5 = (C54911dw) dvVar.instance;
            dwVar5.f144324a |= 16;
            dwVar5.f144329f = f5;
        }
        if ((ckVar.f219434a & 32) != 0) {
            float f6 = ckVar.f219440g;
            dvVar.copyOnWrite();
            C54911dw dwVar6 = (C54911dw) dvVar.instance;
            dwVar6.f144324a |= 32;
            dwVar6.f144330g = f6;
        }
        if ((ckVar.f219434a & 64) != 0) {
            float f7 = ckVar.f219441h;
            dvVar.copyOnWrite();
            C54911dw dwVar7 = (C54911dw) dvVar.instance;
            dwVar7.f144324a |= 64;
            dwVar7.f144331h = f7;
        }
        if ((ckVar.f219434a & 128) != 0) {
            float f8 = ckVar.f219442i;
            dvVar.copyOnWrite();
            C54911dw dwVar8 = (C54911dw) dvVar.instance;
            dwVar8.f144324a |= 128;
            dwVar8.f144332i = f8;
        }
        if ((ckVar.f219434a & 256) != 0) {
            float f9 = ckVar.f219443j;
            dvVar.copyOnWrite();
            C54911dw dwVar9 = (C54911dw) dvVar.instance;
            dwVar9.f144324a |= 256;
            dwVar9.f144333j = f9;
        }
        if ((ckVar.f219434a & 512) != 0) {
            float f10 = ckVar.f219444k;
            dvVar.copyOnWrite();
            C54911dw dwVar10 = (C54911dw) dvVar.instance;
            dwVar10.f144324a |= 512;
            dwVar10.f144334k = f10;
        }
        return (C54911dw) dvVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
