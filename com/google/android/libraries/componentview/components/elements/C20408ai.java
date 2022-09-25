package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.elements.p1696a.C20380e;
import com.google.android.libraries.componentview.components.elements.p1696a.C20381f;
import com.google.android.libraries.componentview.components.elements.p1696a.C20386k;
import com.google.android.libraries.componentview.components.elements.p1696a.C20387l;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Deprecated
/* renamed from: com.google.android.libraries.componentview.components.elements.ai */
/* compiled from: PG */
public class C20408ai extends C20446i {
    public C20408ai(Context context, C56425d dVar, C20537f fVar, Executor executor, ExecutorService executorService, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, executorService, caVar, atVar);
    }

    /* renamed from: E */
    public static C20381f m38314E(C20387l lVar) {
        C20380e eVar = (C20380e) C20381f.f57303f.createBuilder();
        eVar.mo25383a(lVar.f57329b);
        if ((lVar.f57328a & 1) != 0) {
            int i = lVar.f57330c;
            eVar.copyOnWrite();
            C20381f fVar = (C20381f) eVar.instance;
            fVar.f57306a |= 1;
            fVar.f57308c = i;
        }
        if ((((C20381f) eVar.instance).f57306a & 2) != 0) {
            C19995r rVar = lVar.f57331d;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            eVar.copyOnWrite();
            C20381f fVar2 = (C20381f) eVar.instance;
            rVar.getClass();
            fVar2.f57309d = rVar;
            fVar2.f57306a |= 2;
        }
        boolean z = lVar.f57332e;
        eVar.copyOnWrite();
        C20381f fVar3 = (C20381f) eVar.instance;
        fVar3.f57306a |= 4;
        fVar3.f57310e = z;
        return (C20381f) eVar.build();
    }

    /* renamed from: F */
    public static C20387l m38315F(C20381f fVar) {
        C20386k kVar = (C20386k) C20387l.f57325f.createBuilder();
        C62971cq cqVar = fVar.f57307b;
        kVar.copyOnWrite();
        C20387l lVar = (C20387l) kVar.instance;
        C62971cq cqVar2 = lVar.f57329b;
        if (!cqVar2.mo58948c()) {
            lVar.f57329b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) lVar.f57329b);
        if ((fVar.f57306a & 1) != 0) {
            int i = fVar.f57308c;
            kVar.copyOnWrite();
            C20387l lVar2 = (C20387l) kVar.instance;
            lVar2.f57328a |= 1;
            lVar2.f57330c = i;
        }
        if ((fVar.f57306a & 2) != 0) {
            C19995r rVar = fVar.f57309d;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            kVar.copyOnWrite();
            C20387l lVar3 = (C20387l) kVar.instance;
            rVar.getClass();
            lVar3.f57331d = rVar;
            lVar3.f57328a |= 2;
        }
        boolean z = fVar.f57310e;
        kVar.copyOnWrite();
        C20387l lVar4 = (C20387l) kVar.instance;
        lVar4.f57328a |= 4;
        lVar4.f57332e = z;
        return (C20387l) kVar.build();
    }

    /* renamed from: kF */
    public final C20381f mo25384kF(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20387l.f57326g);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return m38314E((C20387l) obj);
    }

    /* renamed from: kG */
    public final C56425d mo25385kG(C56425d dVar, C20381f fVar) {
        C56424c cVar = (C56424c) dVar.toBuilder();
        cVar.mo58885m(C20387l.f57326g, m38315F(fVar));
        return (C56425d) cVar.build();
    }
}
