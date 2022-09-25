package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.p4140ba.p4141a.p4145b.p4146a.C54857bw;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54858bx;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54859by;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56331b;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56333d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.h */
/* compiled from: PG */
class C112598h implements Function {
    /* renamed from: a */
    public final C54859by apply(C56333d dVar) {
        C54858bx bxVar = (C54858bx) C54859by.f144098d.createBuilder();
        if ((dVar.f150156a & 1) != 0) {
            Function function = C112224cb.f311519a;
            C56331b bVar = dVar.f150157b;
            if (bVar == null) {
                bVar = C56331b.f150148e;
            }
            C54857bw a = ((C112454g) function).apply(bVar);
            bxVar.copyOnWrite();
            C54859by byVar = (C54859by) bxVar.instance;
            a.getClass();
            byVar.f144101b = a;
            byVar.f144100a |= 1;
        }
        if ((dVar.f150156a & 2) != 0) {
            Function function2 = C112224cb.f311519a;
            C56331b bVar2 = dVar.f150158c;
            if (bVar2 == null) {
                bVar2 = C56331b.f150148e;
            }
            C54857bw a2 = ((C112454g) function2).apply(bVar2);
            bxVar.copyOnWrite();
            C54859by byVar2 = (C54859by) bxVar.instance;
            a2.getClass();
            byVar2.f144102c = a2;
            byVar2.f144100a |= 2;
        }
        return (C54859by) bxVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
