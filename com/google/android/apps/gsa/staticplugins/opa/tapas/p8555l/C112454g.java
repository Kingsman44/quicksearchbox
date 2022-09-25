package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.p4140ba.p4141a.p4145b.p4146a.C54856bv;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54857bw;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56331b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g */
/* compiled from: PG */
class C112454g implements Function {
    /* renamed from: a */
    public final C54857bw apply(C56331b bVar) {
        C54856bv bvVar = (C54856bv) C54857bw.f144092e.createBuilder();
        if ((bVar.f150150a & 1) != 0) {
            float f = bVar.f150151b;
            bvVar.copyOnWrite();
            C54857bw bwVar = (C54857bw) bvVar.instance;
            bwVar.f144094a |= 1;
            bwVar.f144095b = f;
        }
        if ((bVar.f150150a & 2) != 0) {
            float f2 = bVar.f150152c;
            bvVar.copyOnWrite();
            C54857bw bwVar2 = (C54857bw) bvVar.instance;
            bwVar2.f144094a |= 2;
            bwVar2.f144096c = f2;
        }
        if ((bVar.f150150a & 4) != 0) {
            float f3 = bVar.f150153d;
            bvVar.copyOnWrite();
            C54857bw bwVar3 = (C54857bw) bvVar.instance;
            bwVar3.f144094a |= 4;
            bwVar3.f144097d = f3;
        }
        return (C54857bw) bvVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
