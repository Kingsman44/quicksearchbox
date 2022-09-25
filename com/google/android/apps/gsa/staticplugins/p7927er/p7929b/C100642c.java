package com.google.android.apps.gsa.staticplugins.p7927er.p7929b;

import android.content.Intent;
import android.databinding.C0118a;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85287a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87859gf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87861gh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.er.b.c */
/* compiled from: PG */
public final class C100642c implements C86686h {

    /* renamed from: a */
    public static final C59071e f281436a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.er.b.c");

    /* renamed from: c */
    static final ServiceEventData f281437c = new C87684al(C88244um.UNBIND_BACKGROUND_CLIENT).mo81964a();

    /* renamed from: d */
    private final C22871g f281438d;

    /* renamed from: e */
    private final C86610af f281439e;

    /* renamed from: f */
    private final C85225a f281440f;

    /* renamed from: g */
    private final C85287a f281441g;

    public C100642c(C22871g gVar, C86610af afVar, C85225a aVar, C85287a aVar2) {
        this.f281438d = gVar;
        this.f281439e = afVar;
        this.f281440f = aVar;
        this.f281441g = aVar2;
    }

    /* renamed from: a */
    public final void mo91992a(long j) {
        if (!this.f281439e.mo80229j(j, f281437c)) {
            C59104x c = f281436a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WidgetSessionC");
            ((C59052c) ((C59052c) c).mo56372aa(33904)).mo56386p("Failed to send UNBIND_BACKGROUND_CLIENT event. Waiting for timeout.");
        }
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
        C60870cx cxVar;
        C59071e eVar = f281436a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "WidgetSessionC");
        C0118a.m109q(b, "GsaWidgetSessionController:handleGenericClientEvent", 33898, "SearchWidgetFlow", C58975e.f156826a);
        C87739bu buVar = C87739bu.WIDGET_INTENT_RECEIVED;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (buVar != a) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WidgetSessionC");
            C59052c cVar2 = (C59052c) ((C59052c) c).mo56372aa(33902);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            cVar2.mo56389s("Invalid ClientEventId received: %s", a2);
            mo91992a(j);
            return;
        }
        C62940bt btVar = C87859gf.f237703a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r0);
        if (!bwVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x c2 = eVar.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "WidgetSessionC");
            ((C59052c) ((C59052c) c2).mo56372aa(33901)).mo56386p("No GsaWidgetEventData found in ClientEventData");
            mo91992a(j);
            return;
        }
        C62940bt btVar2 = C87859gf.f237703a;
        C87741bw bwVar2 = clientEventData.f236955a;
        C62940bt r02 = C62942bv.checkIsLite(btVar2);
        bwVar2.mo58887l(r02);
        Object l = bwVar2.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C118575h a3 = C118575h.m196865a(((C87861gh) obj).f237707b);
        if (a3 == null) {
            a3 = C118575h.ACTIVITY_ACCOUNT_DRAWER;
        }
        if (a3 == null) {
            a3 = C118575h.UNKNOWN_WORKLOAD;
        }
        if (!clientEventData.mo81913d(Intent.class)) {
            C59104x c3 = eVar.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "WidgetSessionC");
            ((C59052c) ((C59052c) c3).mo56372aa(33900)).mo56386p("No intent found in ClientEventData");
            mo91992a(j);
            return;
        }
        Intent intent = (Intent) clientEventData.mo81912b(Intent.class);
        int ordinal = a3.ordinal();
        if (ordinal == 736) {
            cxVar = this.f281440f.mo78804b(intent);
        } else if (ordinal != 742) {
            cxVar = C60856cj.m92900i(C118826c.f331422a);
            C59104x c4 = eVar.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "WidgetSessionC");
            ((C59052c) ((C59052c) c4).mo56372aa(33899)).mo56389s("Cannot recognize the workload ID: %s", a3);
        } else {
            cxVar = this.f281441g.mo78847a(intent);
        }
        if (cxVar != null) {
            C90875ai.m148465b(new C100640a(this, j), cxVar, this.f281438d, "UnbindWidgetClientRunable").mo85223a(C100641b.f281435a);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
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
