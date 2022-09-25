package com.google.android.apps.gsa.staticplugins.p7453bi.p7455b;

import com.google.android.apps.gsa.search.core.p6519al.p6562au.C84741a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.p7453bi.C94611c;
import com.google.android.apps.gsa.staticplugins.p7453bi.C94614f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.b.j */
/* compiled from: PG */
public final class C94610j implements C86686h {

    /* renamed from: c */
    private static final C59071e f264615c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bi.b.j");

    /* renamed from: a */
    public final C84741a f264616a;

    /* renamed from: d */
    private final C86610af f264617d;

    /* renamed from: e */
    private final C22871g f264618e;

    public C94610j(C84741a aVar, C86610af afVar, C22871g gVar) {
        this.f264616a = aVar;
        this.f264617d = afVar;
        this.f264618e = gVar;
    }

    /* renamed from: c */
    private final void m155999c(long j, ClientEventData clientEventData, C60931s sVar) {
        C94614f fVar = (C94614f) ((DummyParcelable) clientEventData.mo81912b(DummyParcelable.class)).f253766a;
        int a = fVar.mo88542a();
        int i = clientEventData.f236955a.f237480b;
        C87739bu buVar = C87739bu.UNKNOWN;
        try {
            C60870cx apply = sVar.apply(fVar.mo88544c());
            C58833ax b = fVar.mo88543b();
            if (!b.mo56113h()) {
                ((C59052c) ((C59052c) f264615c.mo56225c()).mo56372aa(20735)).mo56386p("Expected clientResponseFuture to be present, without it client Future cancel events won't be propagated correctly and this could lead to some resources not being closed correctly.");
            } else {
                ((C60870cx) b.mo56107c()).mo4106b(new C94608h(b, apply), C60826bg.f164896a);
            }
            this.f264618e.mo28211k(apply, "sendHttpEngineResponse", new C94609i(this, j, a));
        } catch (Exception e) {
            mo88541a(j, a, e);
        }
    }

    /* renamed from: a */
    public final void mo88541a(long j, int i, Object obj) {
        C86610af afVar = this.f264617d;
        C87684al alVar = new C87684al(C88244um.HTTP_SESSION_SERVICE_EVENT);
        alVar.mo81966c(new DummyParcelable(new C94611c(i, obj, C58836b.f156633a)));
        afVar.mo80229j(j, alVar.mo81964a());
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        switch (a.ordinal()) {
            case 132:
                m155999c(j, clientEventData, new C94600a(this));
                return;
            case 133:
                m155999c(j, clientEventData, new C94602b(this));
                return;
            case 134:
                m155999c(j, clientEventData, new C94603c(this));
                return;
            case 135:
                m155999c(j, clientEventData, new C94604d(this));
                return;
            case 136:
                m155999c(j, clientEventData, new C94605e(this));
                return;
            case 137:
                m155999c(j, clientEventData, new C94606f(this));
                return;
            case 138:
                m155999c(j, clientEventData, new C94607g(this));
                return;
            default:
                C59052c cVar2 = (C59052c) ((C59052c) f264615c.mo56226d()).mo56372aa(20736);
                C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a2 == null) {
                    a2 = C87739bu.UNKNOWN;
                }
                cVar2.mo56389s("Unknown client event id: %s", a2);
                return;
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
