package com.google.android.apps.gsa.staticplugins.customtabs.p7712e;

import android.content.Intent;
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
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.e.a */
/* compiled from: PG */
public final class C98662a implements C86686h {

    /* renamed from: a */
    private final C91097g f275610a;

    public C98662a(C91097g gVar) {
        this.f275610a = gVar;
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
        if (a == C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT) {
            C58838bb.m90884s(clientEventData.mo81913d(Intent.class), "BROWSABLE_INTENT_LAUNCHED_IN_CLIENT should have an intent parcelable.");
            Intent intent = (Intent) clientEventData.mo81912b(Intent.class);
            C58976aa aaVar = C58975e.f156826a;
            C91097g gVar = this.f275610a;
            intent.getClass();
            gVar.mo65089a(intent);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("intentStarter").mo85276a(C90752i.m148231e(this.f275610a));
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
