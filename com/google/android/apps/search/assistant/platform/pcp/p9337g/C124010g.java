package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53140cw;
import com.google.assistant.p3994s.p3995a.C53142cy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.g */
/* compiled from: PG */
public final /* synthetic */ class C124010g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124012i f342521a;

    /* renamed from: b */
    public final /* synthetic */ C53140cw f342522b;

    public /* synthetic */ C124010g(C124012i iVar, C53140cw cwVar) {
        this.f342521a = iVar;
        this.f342522b = cwVar;
    }

    public final C60870cx apply(Object obj) {
        C124012i iVar = this.f342521a;
        C59104x b = C124012i.f342525a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.SyncManager");
        ((C59052c) ((C59052c) b).mo56372aa(35356)).mo56386p("PCP.SyncManager: sync successful.");
        C124025u uVar = iVar.f342528d;
        return C47633f.m84733g(uVar.f342567g.mo57305b(C47810es.m84965e(new C124020p(uVar, this.f342522b, (C53142cy) obj)), uVar.f342562b)).mo51516i(new C124007d(iVar), C60826bg.f164896a);
    }
}
