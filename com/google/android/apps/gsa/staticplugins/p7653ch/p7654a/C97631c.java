package com.google.android.apps.gsa.staticplugins.p7653ch.p7654a;

import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87796dx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87798dz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88066nx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88067ny;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88068nz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88156rf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88158rh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.ch.a.c */
/* compiled from: PG */
public final class C97631c implements C86686h {

    /* renamed from: a */
    public static final C59071e f272673a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ch.a.c");

    /* renamed from: c */
    private final C85022a f272674c;

    /* renamed from: d */
    private final C22871g f272675d;

    /* renamed from: e */
    private final C86683e f272676e;

    public C97631c(C85022a aVar, C22871g gVar, C86683e eVar) {
        this.f272674c = aVar;
        this.f272675d = gVar;
        this.f272676e = eVar;
    }

    /* renamed from: a */
    public final void mo90780a(Integer num) {
        C88067ny nyVar = (C88067ny) C88068nz.f238116c.createBuilder();
        int intValue = num.intValue();
        nyVar.copyOnWrite();
        C88068nz nzVar = (C88068nz) nyVar.instance;
        nzVar.f238118a |= 1;
        nzVar.f238119b = intValue;
        C87684al alVar = new C87684al(C88244um.NOW_ELIGIBILITY_RESPONSE);
        alVar.mo81965b(C88066nx.f238115a, (C88068nz) nyVar.build());
        ServiceEventData a = alVar.mo81964a();
        C87682aj ajVar = this.f272676e.f234157a;
        if (ajVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            ((C86771n) ajVar).mo80379b(a);
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
        Object obj2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 161) {
            C62940bt btVar = C88156rf.f238317a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            Object l = bwVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj = r2.f169969b;
            } else {
                obj = r2.mo58889c(l);
            }
            C88158rh rhVar = (C88158rh) obj;
            C85022a aVar = this.f272674c;
            String str = rhVar.f238323d;
            C7891nu a2 = C7891nu.m22887a(rhVar.f238321b);
            if (a2 == null) {
                a2 = C7891nu.UNKNOWN_OPT_IN_SOURCE;
            }
            aVar.mo78656a(str, a2);
        } else if (ordinal == 205) {
            C62940bt btVar2 = C87796dx.f237586a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r22 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r22);
            Object l2 = bwVar2.f169962ag.mo58854l(r22.f169971d);
            if (l2 == null) {
                obj2 = r22.f169969b;
            } else {
                obj2 = r22.mo58889c(l2);
            }
            new C90873ag(this.f272674c.mo78657b(((C87798dz) obj2).f237590b), this.f272675d, "Fetch Now eligibility callback", new C97627a(this)).mo85223a(new C97630b(this));
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
        C58976aa aaVar = C58975e.f156826a;
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
