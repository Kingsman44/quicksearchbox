package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122456k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122554d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123002aw;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123030bx;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123054cu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123064l;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.z */
/* compiled from: PG */
public final class C123562z implements C17597g {

    /* renamed from: a */
    public final C123033c f341425a;

    /* renamed from: b */
    public final C122828c f341426b;

    /* renamed from: c */
    public final C123030bx f341427c;

    /* renamed from: d */
    public final Executor f341428d;

    /* renamed from: e */
    public final C122594e f341429e;

    /* renamed from: f */
    public final C17597g f341430f;

    /* renamed from: g */
    public final C122859d f341431g;

    /* renamed from: h */
    public final C123054cu f341432h;

    /* renamed from: i */
    public C60870cx f341433i = null;

    /* renamed from: j */
    public volatile boolean f341434j = false;

    /* renamed from: k */
    public final C122561k f341435k;

    public C123562z(C122554d dVar, C17597g gVar, C122859d dVar2, C123033c cVar, C122594e eVar, C122828c cVar2, C123030bx bxVar, C123002aw awVar, C123054cu cuVar, C60887da daVar) {
        this.f341425a = cVar;
        this.f341426b = cVar2;
        this.f341427c = bxVar;
        this.f341428d = new C60904dr(daVar);
        this.f341429e = eVar;
        this.f341430f = gVar;
        this.f341431g = dVar2;
        this.f341432h = cuVar;
        this.f341435k = dVar.mo105669a(0, awVar.mo105822a(), dVar2);
    }

    /* renamed from: d */
    private final void m202864d() {
        C123553q qVar = new C123553q(this);
        C123064l.m202406a(C60856cj.m92903l(C47810es.m84977q(qVar), this.f341428d), this.f341430f, "cancelCurrentRequest");
    }

    /* renamed from: a */
    public final void mo20121a() {
        ((C59052c) this.f341431g.mo105764c().mo56372aa(34806)).mo56386p("IGDP stream finished with onCompleted.");
        this.f341434j = true;
        m202864d();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) this.f341431g.mo105766e().mo56382g(th)).mo56372aa(34807)).mo56386p("IGDP stream finished with onError.");
        this.f341434j = true;
        m202864d();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C123556t tVar = new C123556t(this, (C122456k) obj);
        C123064l.m202406a(C60856cj.m92903l(C47810es.m84977q(tVar), this.f341428d), this.f341430f, "onNext");
    }
}
