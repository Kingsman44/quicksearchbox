package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80374d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80375e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80376f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.f */
/* compiled from: PG */
public final /* synthetic */ class C77393f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77393f f213410a = new C77393f();

    private /* synthetic */ C77393f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80513b bVar = (C80513b) obj;
        int i = C77402o.f213420c;
        C80376f fVar = (C80376f) C80377g.f220548e.createBuilder();
        C80515d a = C80515d.m128185a(bVar.f221019d);
        if (a == null) {
            a = C80515d.UNRECOGNIZED;
        }
        fVar.copyOnWrite();
        ((C80377g) fVar.instance).f220551b = a.getNumber();
        float f = bVar.f221018c;
        fVar.copyOnWrite();
        ((C80377g) fVar.instance).f220552c = (double) f;
        fVar.copyOnWrite();
        ((C80377g) fVar.instance).f220550a = true;
        if (bVar.f221016a != null) {
            C80374d dVar = (C80374d) C80375e.f220543c.createBuilder();
            C61752n nVar = bVar.f221016a;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            String str = nVar.f166811b;
            dVar.copyOnWrite();
            str.getClass();
            ((C80375e) dVar.instance).f220545a = str;
            C61752n nVar2 = bVar.f221016a;
            if (nVar2 == null) {
                nVar2 = C61752n.f166808f;
            }
            C62971cq cqVar = nVar2.f166812c;
            dVar.copyOnWrite();
            C80375e eVar = (C80375e) dVar.instance;
            C62971cq cqVar2 = eVar.f220546b;
            if (!cqVar2.mo58948c()) {
                eVar.f220546b = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) eVar.f220546b);
            fVar.copyOnWrite();
            C80375e eVar2 = (C80375e) dVar.build();
            eVar2.getClass();
            ((C80377g) fVar.instance).f220553d = eVar2;
        }
        return (C80377g) fVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
