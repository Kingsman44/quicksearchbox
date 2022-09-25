package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.e */
/* compiled from: PG */
public final class C13874e {

    /* renamed from: a */
    public static final C59071e f42278a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.l.e");

    /* renamed from: b */
    public final C58833ax f42279b;

    /* renamed from: c */
    private final C37215b f42280c;

    /* renamed from: d */
    private final C13816co f42281d;

    /* renamed from: e */
    private final C13883n f42282e;

    public C13874e(C37215b bVar, C58833ax axVar, C13883n nVar, C13816co coVar) {
        this.f42282e = nVar;
        this.f42280c = bVar;
        this.f42279b = axVar;
        this.f42281d = coVar;
    }

    /* renamed from: a */
    public final void mo21328a() {
        this.f42280c.mo19974a(C37179a.f97640e);
        C13816co coVar = this.f42281d;
        coVar.f42091a.f155056f.mo54591h(C16730ar.ASSUMING_GOOD_NETWORK);
        C13883n nVar = this.f42282e;
        C13878i iVar = new C13878i(nVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(iVar), nVar.f42296b), "conversationContext#markTurnHandledOnline", new Object[0]);
    }

    /* renamed from: b */
    public final void mo21329b(C60870cx cxVar, int i, boolean z) {
        C13883n nVar = this.f42282e;
        C13881l lVar = new C13881l(nVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(lVar), nVar.f42296b), "conversationContext#markTurnHandledOffline", new Object[0]);
        C13816co coVar = this.f42281d;
        coVar.f42091a.f155056f.mo54591h(C16730ar.OFFLINE);
        this.f42280c.mo19974a(C37179a.f97685f);
        C13774c cVar = new C13774c(this, i, z);
        C60856cj.m92911t(cxVar, C47810es.m84974n(cVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo21330c(C60870cx cxVar, boolean z) {
        C13828d dVar = new C13828d(this, z);
        C60856cj.m92911t(cxVar, C47810es.m84974n(dVar), C60826bg.f164896a);
    }
}
