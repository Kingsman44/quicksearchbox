package com.google.android.apps.gsa.p8885y.p8887b;

import com.google.android.apps.gsa.k.d;
import com.google.android.apps.gsa.k.e;
import com.google.android.apps.gsa.k.f;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6494aa.C84392c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59794fv;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.y.b.b */
/* compiled from: PG */
public final class C118835b implements C90964a {

    /* renamed from: a */
    public final C22871g f331447a;

    /* renamed from: b */
    public final d f331448b;

    /* renamed from: c */
    private final C118827a f331449c;

    public C118835b(e eVar, f fVar, C118827a aVar, C22871g gVar) {
        this.f331449c = aVar;
        this.f331447a = gVar;
        this.f331448b = new d(C84392c.f229649e, "persisted_profiling_statistics", eVar, fVar, false);
    }

    /* renamed from: a */
    public final List mo104027a() {
        if (this.f331449c == null) {
            return C58485gu.m89845m();
        }
        return C118833a.m197238c(((C84392c) this.f331448b.a()).f229652b, this.f331449c.mo77939b());
    }

    /* renamed from: b */
    public final void mo104028b() {
        C90748e.m148224b();
        C118827a aVar = this.f331449c;
        if (aVar != null) {
            C84392c a = aVar.mo77938a();
            for (C59794fv fvVar : (C59794fv[]) a.f229652b.toArray(new C59794fv[0])) {
                if (fvVar.f161579h != 0) {
                    this.f331448b.d(new C118833a(a));
                    return;
                }
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        List a = mo104027a();
        if (!a.isEmpty()) {
            C59795fw fwVar = fVar.f254236a;
            fwVar.copyOnWrite();
            C59796fx fxVar = C59796fx.f161580r;
            ((C59796fx) fwVar.instance).f161591j = C59796fx.emptyProtobufList();
            fwVar.copyOnWrite();
            C59796fx fxVar2 = (C59796fx) fwVar.instance;
            C62971cq cqVar = fxVar2.f161591j;
            if (!cqVar.mo58948c()) {
                fxVar2.f161591j = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) a, (List) fxVar2.f161591j);
        }
    }
}
