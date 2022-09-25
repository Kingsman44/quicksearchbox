package com.google.android.apps.gsa.staticplugins.p7699cq.p7700a;

import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88181sd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88183sf;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b.C98506a;
import com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b.C98507b;
import com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b.C98508c;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cq.a.a */
/* compiled from: PG */
public final class C98503a implements C86686h {

    /* renamed from: a */
    private static final C59071e f275064a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cq.a.a");

    /* renamed from: c */
    private final C68214a f275065c;

    /* renamed from: d */
    private final C90021c f275066d;

    public C98503a(C68214a aVar, C90021c cVar) {
        this.f275065c = aVar;
        this.f275066d = cVar;
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
        if (!this.f275066d.mo79746e(C90014bt.f247561jV)) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 84) {
            C62940bt btVar = C88181sd.f238381a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r2 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r2);
            if (bwVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt btVar2 = C88181sd.f238381a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r22 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r22);
                Object l = bwVar2.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                C88183sf sfVar = (C88183sf) obj;
                if (!sfVar.f238386b.isEmpty()) {
                    C98508c cVar2 = (C98508c) this.f275065c.mo27525b();
                    cVar2.f275071b.mo78690c(sfVar, new C98506a(cVar2), new C98507b(cVar2));
                    return;
                }
                C59104x d = f275064a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PronLearningSessionC");
                ((C59052c) ((C59052c) d).mo56372aa(30709)).mo56386p("The name in PronunciationLearningEventData is empty!");
                int i = C90755l.f253831a;
                return;
            }
            C59104x c = f275064a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PronLearningSessionC");
            ((C59052c) ((C59052c) c).mo56372aa(30708)).mo56386p("ClientEventData didn't have the expected extension.");
        } else if (ordinal != 85) {
            C59104x d2 = f275064a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PronLearningSessionC");
            C59052c cVar3 = (C59052c) ((C59052c) d2).mo56372aa(30707);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            cVar3.mo56389s("Unhandled client event: %s", a2);
            int i2 = C90755l.f253831a;
        } else {
            C98508c cVar4 = (C98508c) this.f275065c.mo27525b();
            cVar4.f275073d = true;
            cVar4.f275071b.mo78689a();
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
        ((C98508c) this.f275065c.mo27525b()).f275072c = ((C86775r) aVar).f234383e;
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
