package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80016m;
import com.google.android.apps.gsa.opa.p6448i.p6449a.p6450a.C83711b;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54919j;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54920k;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e */
/* compiled from: PG */
class C112295e implements Function {
    /* renamed from: a */
    public final C54920k apply(C80016m mVar) {
        C54919j jVar = (C54919j) C54920k.f144367f.createBuilder();
        int i = 1;
        if ((mVar.f219578a & 1) != 0) {
            boolean z = mVar.f219579b;
            jVar.copyOnWrite();
            C54920k kVar = (C54920k) jVar.instance;
            kVar.f144369a |= 1;
            kVar.f144370b = z;
        }
        if ((mVar.f219578a & 2) != 0) {
            float f = mVar.f219580c;
            jVar.copyOnWrite();
            C54920k kVar2 = (C54920k) jVar.instance;
            kVar2.f144369a |= 2;
            kVar2.f144371c = f;
        }
        if ((mVar.f219578a & 4) != 0) {
            float f2 = mVar.f219581d;
            jVar.copyOnWrite();
            C54920k kVar3 = (C54920k) jVar.instance;
            kVar3.f144369a |= 4;
            kVar3.f144372d = f2;
        }
        if ((mVar.f219578a & 8) != 0) {
            int a = C83711b.m133282a(mVar.f219582e);
            if (a != 0) {
                i = a;
            }
            jVar.copyOnWrite();
            C54920k kVar4 = (C54920k) jVar.instance;
            kVar4.f144373e = i;
            kVar4.f144369a |= 8;
        }
        return (C54920k) jVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
