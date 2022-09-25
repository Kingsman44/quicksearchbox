package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122401at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122554d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
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

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.au */
/* compiled from: PG */
public final class C122720au implements C17597g {

    /* renamed from: a */
    public final C123033c f340013a;

    /* renamed from: b */
    public final C122828c f340014b;

    /* renamed from: c */
    public final C123030bx f340015c;

    /* renamed from: d */
    public final Executor f340016d;

    /* renamed from: e */
    public final C122594e f340017e;

    /* renamed from: f */
    public final C17597g f340018f;

    /* renamed from: g */
    public final C122859d f340019g;

    /* renamed from: h */
    public final C123001av f340020h;

    /* renamed from: i */
    public final C123054cu f340021i;

    /* renamed from: j */
    public C60870cx f340022j = null;

    /* renamed from: k */
    public volatile boolean f340023k = false;

    /* renamed from: l */
    public final boolean f340024l;

    /* renamed from: m */
    public final C122561k f340025m;

    public C122720au(C122554d dVar, C17597g gVar, C122859d dVar2, boolean z, C123033c cVar, C122594e eVar, C122828c cVar2, C123030bx bxVar, C123002aw awVar, C123054cu cuVar, C60887da daVar) {
        this.f340013a = cVar;
        this.f340014b = cVar2;
        this.f340015c = bxVar;
        this.f340016d = new C60904dr(daVar);
        this.f340018f = gVar;
        this.f340019g = dVar2;
        this.f340017e = eVar;
        this.f340024l = z;
        C123001av a = awVar.mo105822a();
        this.f340020h = a;
        this.f340021i = cuVar;
        this.f340025m = dVar.mo105669a(0, a, dVar2);
    }

    /* renamed from: d */
    private final void m202093d() {
        C122566ab abVar = new C122566ab(this);
        C123064l.m202406a(C60856cj.m92903l(C47810es.m84977q(abVar), this.f340016d), this.f340018f, "cancelCurrentRequest");
    }

    /* renamed from: a */
    public final void mo20121a() {
        ((C59052c) this.f340019g.mo105766e().mo56372aa(34819)).mo56386p("Intent stream finished with onCompleted");
        this.f340023k = true;
        m202093d();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) this.f340019g.mo105766e().mo56382g(th)).mo56372aa(34820)).mo56386p("Intent stream finished with onError");
        this.f340023k = true;
        m202093d();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C122571ag agVar = new C122571ag(this, (C122401at) obj);
        C123064l.m202406a(C60856cj.m92903l(C47810es.m84977q(agVar), this.f340016d), this.f340018f, "onNext");
    }
}
