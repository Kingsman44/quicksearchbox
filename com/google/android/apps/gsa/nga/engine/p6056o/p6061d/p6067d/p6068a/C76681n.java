package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.C76667a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i.C76746f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122453h;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122547c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17592b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.n */
/* compiled from: PG */
public final /* synthetic */ class C76681n implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76687t f211963a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f211964b;

    /* renamed from: c */
    public final /* synthetic */ C122461p f211965c;

    /* renamed from: d */
    public final /* synthetic */ C52091ex f211966d;

    /* renamed from: e */
    public final /* synthetic */ C58485gu f211967e;

    /* renamed from: f */
    public final /* synthetic */ int f211968f;

    public /* synthetic */ C76681n(C76687t tVar, C74965n nVar, C122461p pVar, C52091ex exVar, C58485gu guVar, int i) {
        this.f211963a = tVar;
        this.f211964b = nVar;
        this.f211965c = pVar;
        this.f211966d = exVar;
        this.f211967e = guVar;
        this.f211968f = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76687t tVar = this.f211963a;
        C74965n nVar = this.f211964b;
        C122461p pVar = this.f211965c;
        C52091ex exVar = this.f211966d;
        C58485gu guVar = this.f211967e;
        int i = this.f211968f;
        C122549e eVar = (C122549e) obj;
        if (eVar == null) {
            return C60856cj.m92899h(new C76667a());
        }
        C122108a a = tVar.f211983k.mo72285a(nVar);
        C122453h hVar = (C122453h) C122454i.f339472b.createBuilder();
        hVar.copyOnWrite();
        C122454i iVar = (C122454i) hVar.instance;
        C62971cq cqVar = iVar.f339474a;
        if (!cqVar.mo58948c()) {
            iVar.f339474a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) iVar.f339474a);
        C76746f fVar = tVar.f211976d;
        C47770dh dhVar = tVar.f211977e;
        C83320io k = nVar.mo71336k();
        C76684q qVar = new C76684q();
        C60870cx d = C17592b.m34885d(new C76674g(dhVar, qVar, eVar, pVar, exVar, i, (C122454i) hVar.build(), a));
        C60856cj.m92911t(d, new C76683p(d, new C76675h(dhVar, qVar, eVar)), C60826bg.f164896a);
        C60870cx g = C60922j.m93044g(C60846c.m92879h(C60838bs.m92859i(d), C122547c.class, new C76676i(fVar, k), C60826bg.f164896a), new C76677j(fVar, k), C60826bg.f164896a);
        tVar.f211981i.add(g);
        return g;
    }
}
