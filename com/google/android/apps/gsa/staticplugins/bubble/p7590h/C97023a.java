package com.google.android.apps.gsa.staticplugins.bubble.p7590h;

import com.google.android.apps.gsa.search.core.p6498ab.p6499a.C84395a;
import com.google.android.apps.gsa.search.core.p6884y.p6914h.C87382b;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88403aa;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88476z;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.bubble.C96968f;
import com.google.android.apps.gsa.staticplugins.bubble.C97017g;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

@C84395a
/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.h.a */
/* compiled from: PG */
public final class C97023a implements C86686h {

    /* renamed from: a */
    private static final C59071e f271145a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.h.a");

    /* renamed from: c */
    private static final C58528ij f271146c = new C58759qy(C87739bu.CANVAS_WORKER_BINDER_REQUEST);

    /* renamed from: d */
    private final C96968f f271147d;

    /* renamed from: e */
    private final C87382b f271148e;

    public C97023a(C96968f fVar, C87382b bVar) {
        this.f271147d = fVar;
        this.f271148e = bVar;
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
            this.f271148e.mo81043c(clientEventData);
        } else if (((C58759qy) f271146c).f156534a.equals(a)) {
            cVar.mo80279a(clientEventData);
        } else {
            ((C59052c) ((C59052c) f271145a.mo56226d()).mo56372aa(18463)).mo56389s("Received unknown event %s", a);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        this.f271148e.mo17602gS(fVar);
    }

    /* renamed from: h */
    public final void mo80295h() {
        this.f271148e.mo81041a();
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        this.f271148e.mo81042b(aVar);
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C58833ax axVar2;
        Object obj;
        Object obj2;
        Object obj3;
        C62940bt r2 = C62942bv.checkIsLite(C88403aa.f239031b);
        bbVar.mo58887l(r2);
        if (bbVar.f169962ag.mo58857o(r2.f169971d)) {
            C62940bt r22 = C62942bv.checkIsLite(C88403aa.f239031b);
            bbVar.mo58887l(r22);
            Object l = bbVar.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj3 = r22.f169969b;
            } else {
                obj3 = r22.mo58889c(l);
            }
            if (((C88476z) obj3).f239185b) {
                this.f271148e.mo81041a();
                C97017g gVar = this.f271147d.f271004b;
                synchronized (gVar.f271136b) {
                    for (C97040c a : gVar.f271136b.keySet()) {
                        gVar.mo90391a(a, false);
                    }
                }
                return;
            }
        }
        C62940bt r23 = C62942bv.checkIsLite(C38346a.f101532a);
        bbVar.mo58887l(r23);
        if (bbVar.f169962ag.mo58857o(r23.f169971d)) {
            C62940bt r24 = C62942bv.checkIsLite(C38346a.f101532a);
            bbVar.mo58887l(r24);
            Object l2 = bbVar.f169962ag.mo58854l(r24.f169971d);
            if (l2 == null) {
                obj2 = r24.f169969b;
            } else {
                obj2 = r24.mo58889c(l2);
            }
            axVar2 = C97024b.m160592a((C38348c) obj2);
        } else {
            C62940bt r25 = C62942bv.checkIsLite(C88403aa.f239030a);
            bbVar.mo58887l(r25);
            if (bbVar.f169962ag.mo58857o(r25.f169971d)) {
                C62940bt r26 = C62942bv.checkIsLite(C88403aa.f239030a);
                bbVar.mo58887l(r26);
                Object l3 = bbVar.f169962ag.mo58854l(r26.f169971d);
                if (l3 == null) {
                    obj = r26.f169969b;
                } else {
                    obj = r26.mo58889c(l3);
                }
                axVar2 = C58833ax.m90834k((C88474x) obj);
            } else {
                axVar2 = C58836b.f156633a;
            }
        }
        if (axVar2.mo56113h()) {
            this.f271147d.mo90387b((C88474x) axVar2.mo56107c());
        }
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
