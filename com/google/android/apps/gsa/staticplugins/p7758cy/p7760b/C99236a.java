package com.google.android.apps.gsa.staticplugins.p7758cy.p7760b;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.C74445c;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
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
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87849fw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87851fy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87852fz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87854ga;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87855gb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87856gc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87858ge;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cy.b.a */
/* compiled from: PG */
public final class C99236a implements C86686h {

    /* renamed from: a */
    private static final C59071e f277615a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cy.b.a");

    /* renamed from: c */
    private final C86610af f277616c;

    /* renamed from: d */
    private final C92122r f277617d;

    /* renamed from: e */
    private final C85299b f277618e;

    /* renamed from: f */
    private final C68214a f277619f;

    /* renamed from: g */
    private final C83794j f277620g;

    /* renamed from: h */
    private final C83793i f277621h;

    public C99236a(C86610af afVar, C68214a aVar, C92122r rVar, C85299b bVar, C83794j jVar, C83793i iVar) {
        this.f277616c = afVar;
        this.f277619f = aVar;
        this.f277617d = rVar;
        this.f277618e = bVar;
        this.f277620g = jVar;
        this.f277621h = iVar;
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
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (a == C87739bu.RSS_GMM_COMMUTE_QUERY) {
            C62940bt btVar = C87849fw.f237687a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r7 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r7);
            if (!bwVar.f169962ag.mo58857o(r7.f169971d)) {
                C59104x d = f277615a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "RssCommuteSessionCntrl");
                ((C59052c) ((C59052c) d).mo56372aa(31692)).mo56386p("GmmCommuteQueryEvent extension is missing. Ignoring event.");
                return;
            }
            C62940bt btVar2 = C87849fw.f237687a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r72 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r72);
            Object l = bwVar2.f169962ag.mo58854l(r72.f169971d);
            if (l == null) {
                obj2 = r72.f169969b;
            } else {
                obj2 = r72.mo58889c(l);
            }
            C87851fy fyVar = (C87851fy) obj2;
            if (fyVar == null) {
                C59104x d2 = f277615a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "RssCommuteSessionCntrl");
                ((C59052c) ((C59052c) d2).mo56372aa(31691)).mo56386p("GmmCommuteQueryEvent contains no data.");
                return;
            }
            String str = fyVar.f237691b;
            if ((fyVar.f237690a & 1) == 0 || str.length() == 0) {
                C59104x d3 = f277615a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "RssCommuteSessionCntrl");
                ((C59052c) ((C59052c) d3).mo56372aa(31690)).mo56386p("Received empty user account data.");
                return;
            }
            Account a2 = ((C86054o) this.f277619f.mo27525b()).mo79668a();
            String str2 = a2 != null ? a2.name : null;
            if (str2 != null) {
                boolean z = false;
                if (this.f277617d.f256848d.mo86755k() && str.equals(str2)) {
                    z = true;
                }
                C87854ga gaVar = (C87854ga) C87855gb.f237694c.createBuilder();
                gaVar.copyOnWrite();
                C87855gb gbVar = (C87855gb) gaVar.instance;
                gbVar.f237696a = 1 | gbVar.f237696a;
                gbVar.f237697b = z;
                C87684al alVar = new C87684al(C88244um.RSS_GMM_COMMUTE_QUERY_RESPONSE);
                alVar.mo81965b(C87852fz.f237692a, (C87855gb) gaVar.build());
                this.f277616c.mo80229j(j, alVar.mo81964a());
            }
        } else if (a == C87739bu.RSS_GMM_COMMUTE_UPDATE) {
            C62940bt btVar3 = C87856gc.f237698a;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r4 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r4);
            if (!bwVar3.f169962ag.mo58857o(r4.f169971d)) {
                C59104x d4 = f277615a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "RssCommuteSessionCntrl");
                ((C59052c) ((C59052c) d4).mo56372aa(31689)).mo56386p("GmmCommuteUpdateEvent extension is missing. Ignoring event.");
                return;
            }
            C62940bt btVar4 = C87856gc.f237698a;
            C87741bw bwVar4 = clientEventData.f236955a;
            C62940bt r42 = C62942bv.checkIsLite(btVar4);
            bwVar4.mo58887l(r42);
            Object l2 = bwVar4.f169962ag.mo58854l(r42.f169971d);
            if (l2 == null) {
                obj = r42.f169969b;
            } else {
                obj = r42.mo58889c(l2);
            }
            C87858ge geVar = (C87858ge) obj;
            if (geVar == null) {
                C59104x d5 = f277615a.mo56226d();
                d5.mo56378ag(C58975e.f156826a, "RssCommuteSessionCntrl");
                ((C59052c) ((C59052c) d5).mo56372aa(31688)).mo56386p("GmmCommuteUpdateEvent contains no data.");
                return;
            }
            byte[] N = geVar.f237701a.mo59174N();
            if (N == null || N.length == 0) {
                C59104x d6 = f277615a.mo56226d();
                d6.mo56378ag(C58975e.f156826a, "RssCommuteSessionCntrl");
                ((C59052c) ((C59052c) d6).mo56372aa(31687)).mo56386p("Received empty data.");
            } else if (this.f277620g.f228394e.mo79746e(C90014bt.f247585jt)) {
                C83793i iVar = this.f277621h;
                Intent intent = new Intent();
                intent.setPackage("com.google.android.googlequicksearchbox");
                intent.setAction("com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_COMMUTE_DATA_UPDATE");
                intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.COMMUTE_DATA_UPDATE_EXTRA", N);
                C74445c.m120396c(iVar.f228383c, intent);
            } else {
                this.f277618e.mo78855h(N);
            }
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
