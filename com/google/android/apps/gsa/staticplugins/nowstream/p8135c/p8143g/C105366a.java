package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8143g;

import com.google.android.apps.gsa.search.core.p6884y.p6914h.C87382b;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.g.a */
/* compiled from: PG */
public final class C105366a implements C86686h {

    /* renamed from: a */
    private final C87382b f293972a;

    public C105366a(C87382b bVar) {
        this.f293972a = bVar;
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
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (C87382b.f235960a.contains(a)) {
            this.f293972a.mo81043c(clientEventData);
        } else {
            cVar.mo80279a(clientEventData);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85287n(this.f293972a);
    }

    /* renamed from: h */
    public final void mo80295h() {
        C58976aa aaVar = C58975e.f156826a;
        this.f293972a.mo81041a();
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f293972a.mo81042b(aVar);
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        this.f293972a.mo81044e(bbVar);
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final boolean mo80299l() {
        return false;
    }
}
