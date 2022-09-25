package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C120410r implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ C120416x f334919a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334920b;

    /* renamed from: c */
    public final /* synthetic */ Optional f334921c;

    public /* synthetic */ C120410r(C120416x xVar, Consumer consumer, Optional optional) {
        this.f334919a = xVar;
        this.f334920b = consumer;
        this.f334921c = optional;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        C47633f fVar;
        C37519dz dzVar;
        C120416x xVar = this.f334919a;
        Consumer consumer = this.f334920b;
        Optional optional = this.f334921c;
        C120415w wVar = (C120415w) obj;
        wVar.getClass();
        C58833ax b = wVar.f334931b.mo40930b();
        if (!b.mo56113h()) {
            C37561eb ebVar = wVar.f334931b.mo40929a().f99350b;
            if (ebVar == null) {
                ebVar = C37561eb.f99800c;
            }
            if (ebVar.f99802a == 2) {
                dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                if (dzVar == null) {
                    dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                }
            } else {
                dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
            }
            throw new C120417y(dzVar);
        }
        C37402bg a = wVar.f334930a.mo40940a();
        C37321a aVar = (C37321a) b.mo56107c();
        C58833ax d = wVar.f334931b.mo40932d();
        if (!d.mo56113h()) {
            fVar = C47633f.m84733g(C60856cj.m92900i(Optional.empty()));
        } else {
            fVar = C47633f.m84733g((C60870cx) d.mo56107c()).mo51515h(C120411s.f334922a, xVar.f334934c);
        }
        C47633f fVar2 = fVar;
        C120407o oVar = new C120407o(aVar, consumer);
        C120416x xVar2 = xVar;
        C120414v vVar = new C120414v(xVar2, fVar2, optional, C60856cj.m92905n(C47810es.m84965e(oVar), xVar.f334935d), a);
        atVar.mo57268a(vVar, xVar.f334934c);
        return vVar;
    }
}
