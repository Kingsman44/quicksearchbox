package com.google.android.apps.gsa.shared.logger.p7055e.p7058b;

import com.google.android.apps.gsa.k.d;
import com.google.android.apps.gsa.k.e;
import com.google.android.apps.gsa.k.f;
import com.google.android.apps.gsa.shared.logger.p7055e.C89905b;
import com.google.android.apps.gsa.shared.logger.p7055e.C89910d;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.logger.e.b.b */
/* compiled from: PG */
public final class C89908b implements C90964a {

    /* renamed from: a */
    public final C89910d f246335a;

    /* renamed from: b */
    public final C22871g f246336b;

    /* renamed from: c */
    public final d f246337c;

    public C89908b(e eVar, f fVar, C89910d dVar, C22871g gVar) {
        this.f246335a = dVar;
        this.f246336b = gVar;
        this.f246337c = new d(C89905b.f246328e, "persisted_platform_task_statistics", eVar, fVar, false);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (this.f246335a != null) {
            C59795fw fwVar = fVar.f254236a;
            fwVar.copyOnWrite();
            C59796fx fxVar = C59796fx.f161580r;
            ((C59796fx) fwVar.instance).f161597p = C59796fx.emptyProtobufList();
            List c = C89906a.m146418c(((C89905b) this.f246337c.a()).f246331b, this.f246335a.mo83750c());
            fwVar.copyOnWrite();
            C59796fx fxVar2 = (C59796fx) fwVar.instance;
            C62971cq cqVar = fxVar2.f161597p;
            if (!cqVar.mo58948c()) {
                fxVar2.f161597p = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) c, (List) fxVar2.f161597p);
        }
    }
}
