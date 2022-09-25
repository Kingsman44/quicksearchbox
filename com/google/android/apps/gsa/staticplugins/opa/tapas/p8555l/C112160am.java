package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79934ai;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54840bf;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54841bg;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.am */
/* compiled from: PG */
class C112160am implements Function {
    /* renamed from: a */
    public final C54841bg apply(C79934ai aiVar) {
        C54840bf bfVar = (C54840bf) C54841bg.f143970k.createBuilder();
        if ((aiVar.f219161a & 1) != 0) {
            String str = aiVar.f219162b;
            bfVar.copyOnWrite();
            C54841bg bgVar = (C54841bg) bfVar.instance;
            str.getClass();
            bgVar.f143972a |= 1;
            bgVar.f143973b = str;
        }
        if ((aiVar.f219161a & 2) != 0) {
            mo99441b(aiVar, bfVar);
        }
        if ((aiVar.f219161a & 4) != 0) {
            String str2 = aiVar.f219164d;
            bfVar.copyOnWrite();
            C54841bg bgVar2 = (C54841bg) bfVar.instance;
            str2.getClass();
            bgVar2.f143972a |= 4;
            bgVar2.f143975d = str2;
        }
        if ((aiVar.f219161a & 8) != 0) {
            float f = aiVar.f219165e;
            bfVar.copyOnWrite();
            C54841bg bgVar3 = (C54841bg) bfVar.instance;
            bgVar3.f143972a |= 8;
            bgVar3.f143976e = f;
        }
        C62971cq cqVar = aiVar.f219166f;
        bfVar.copyOnWrite();
        C54841bg bgVar4 = (C54841bg) bfVar.instance;
        C62971cq cqVar2 = bgVar4.f143977f;
        if (!cqVar2.mo58948c()) {
            bgVar4.f143977f = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) bgVar4.f143977f);
        if ((aiVar.f219161a & 16) != 0) {
            boolean z = aiVar.f219167g;
            bfVar.copyOnWrite();
            C54841bg bgVar5 = (C54841bg) bfVar.instance;
            bgVar5.f143972a |= 16;
            bgVar5.f143978g = z;
        }
        if ((aiVar.f219161a & 32) != 0) {
            boolean z2 = aiVar.f219168h;
            bfVar.copyOnWrite();
            C54841bg bgVar6 = (C54841bg) bfVar.instance;
            bgVar6.f143972a |= 32;
            bgVar6.f143979h = z2;
        }
        if ((aiVar.f219161a & 64) != 0) {
            float f2 = aiVar.f219169i;
            bfVar.copyOnWrite();
            C54841bg bgVar7 = (C54841bg) bfVar.instance;
            bgVar7.f143972a |= 64;
            bgVar7.f143980i = f2;
        }
        if ((aiVar.f219161a & 128) != 0) {
            mo99442c(aiVar, bfVar);
        }
        return (C54841bg) bfVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public void mo99441b(C79934ai aiVar, C54840bf bfVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo99442c(C79934ai aiVar, C54840bf bfVar) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
