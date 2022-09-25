package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88084oo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88086oq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.b */
/* compiled from: PG */
public final class C107742b implements C86686h {

    /* renamed from: a */
    static final ServiceEventData f299806a = new C87684al(C88244um.UNBIND_BACKGROUND_CLIENT).mo81964a();

    /* renamed from: d */
    public static final /* synthetic */ int f299807d = 0;

    /* renamed from: c */
    public final C86610af f299808c;

    /* renamed from: e */
    private final C68214a f299809e;

    /* renamed from: f */
    private final Query f299810f;

    /* renamed from: g */
    private final C68214a f299811g;

    public C107742b(C68214a aVar, Query query, C86610af afVar, C68214a aVar2) {
        this.f299809e = aVar;
        this.f299810f = query;
        this.f299808c = afVar;
        this.f299811g = aVar2;
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
        Object obj;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (a == C87739bu.OPA_APP_INTEGRATION_PLAY_TTS) {
            C62940bt btVar = C88084oo.f238157a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r14 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r14);
            if (bwVar.f169962ag.mo58857o(r14.f169971d)) {
                C62940bt btVar2 = C88084oo.f238157a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r142 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r142);
                Object l = bwVar2.f169962ag.mo58854l(r142.f169971d);
                if (l == null) {
                    obj = r142.f169969b;
                } else {
                    obj = r142.mo58889c(l);
                }
                ((C85392b) this.f299809e.mo27525b()).mo78915d(4, ((bm) this.f299811g.mo27525b()).b(), this.f299810f.mo84259V().mo84493u(), (C90606n) null, new TtsRequest(((C88086oq) obj).f238160a, false), false, false, (String) null, new C107721a(this, j));
            }
        } else if (a == C87739bu.OPA_APP_INTEGRATION_STOP_TTS) {
            ((C85392b) this.f299809e.mo27525b()).mo78914c();
            this.f299808c.mo80229j(j, f299806a);
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
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
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
