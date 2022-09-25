package com.google.android.apps.gsa.staticplugins.p7666ci.p7671e;

import com.google.android.apps.gsa.search.core.p6519al.p6520a.C84605a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7666ci.p7667a.C97751f;
import com.google.android.apps.gsa.staticplugins.p7666ci.p7667a.C97752g;
import com.google.android.apps.gsa.staticplugins.p7666ci.p7667a.C97754i;
import com.google.android.apps.gsa.staticplugins.p7666ci.p7667a.C97759n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.e.c */
/* compiled from: PG */
public final class C97829c implements C86686h {

    /* renamed from: a */
    public static final C59071e f273188a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.e.c");

    /* renamed from: c */
    private final C97759n f273189c;

    /* renamed from: d */
    private final C84605a f273190d;

    /* renamed from: e */
    private final C22871g f273191e;

    public C97829c(C97759n nVar, C84605a aVar, C22871g gVar) {
        this.f273189c = nVar;
        this.f273190d = aVar;
        this.f273191e = gVar;
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
        C51805du duVar;
        Object obj2;
        C58833ax axVar;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 92) {
            C58976aa aaVar = C58975e.f156826a;
            C62940bt btVar = C88092ow.f238173a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r4 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r4);
            if (!bwVar.f169962ag.mo58857o(r4.f169971d)) {
                C59104x d = f273188a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PCP.SessionCtrl");
                ((C59052c) ((C59052c) d).mo56372aa(30353)).mo56386p("OpaClientInputEvent extension is missing. Client input is not sent.");
                return;
            }
            C62940bt btVar2 = C88092ow.f238173a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r42 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r42);
            Object l = bwVar2.f169962ag.mo58854l(r42.f169971d);
            if (l == null) {
                obj = r42.f169969b;
            } else {
                obj = r42.mo58889c(l);
            }
            C88094oy oyVar = (C88094oy) obj;
            if (oyVar == null) {
                C59104x d2 = f273188a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PCP.SessionCtrl");
                ((C59052c) ((C59052c) d2).mo56372aa(30352)).mo56386p("OpaClientInputEvent extension is null. Client input is not sent.");
            } else if ((oyVar.f238176a & 1) == 0 || oyVar.f238177b.mo59031d() == 0) {
                C59104x d3 = f273188a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "PCP.SessionCtrl");
                ((C59052c) ((C59052c) d3).mo56372aa(30350)).mo56386p("Client input is empty. Client input is not sent.");
            } else {
                try {
                    duVar = (C51805du) C62942bv.parseFrom((C62942bv) C51805du.f135924e, oyVar.f238177b, C62921ba.m95368a());
                } catch (C62974ct e) {
                    C59104x c = f273188a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "PCP.SessionCtrl");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30351)).mo56386p("Trying to parse invalid ClientInput.");
                    duVar = null;
                }
                if (duVar != null) {
                    new C90873ag(this.f273190d.mo78370b(0, C60856cj.m92900i(C58836b.f156633a)), this.f273191e, "sendClientInput", new C97825a(duVar)).mo85223a(C97828b.f273187a);
                }
            }
        } else if (ordinal == 139) {
            C58976aa aaVar2 = C58975e.f156826a;
            C97759n nVar = this.f273189c;
            C62940bt btVar3 = C87694ac.f237131a;
            C87741bw bwVar3 = clientEventData.f236955a;
            C62940bt r5 = C62942bv.checkIsLite(btVar3);
            bwVar3.mo58887l(r5);
            Object l2 = bwVar3.f169962ag.mo58854l(r5.f169971d);
            if (l2 == null) {
                obj2 = r5.f169969b;
            } else {
                obj2 = r5.mo58889c(l2);
            }
            C87696ae aeVar = (C87696ae) obj2;
            C53271hs hsVar = aeVar.f237136c;
            if (hsVar == null) {
                hsVar = C53271hs.f139650u;
            }
            if ((hsVar.f139652a & 512) != 0) {
                C53271hs hsVar2 = aeVar.f237136c;
                if (hsVar2 == null) {
                    hsVar2 = C53271hs.f139650u;
                }
                C53306j a2 = C53306j.m86809a(hsVar2.f139663l);
                if (a2 == null) {
                    a2 = C53306j.UNKNOWNN;
                }
                axVar = C58833ax.m90834k(a2);
            } else {
                axVar = C58836b.f156633a;
            }
            if (!axVar.mo56113h()) {
                C59104x d4 = C97759n.f272950a.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
                ((C59052c) ((C59052c) d4).mo56372aa(30308)).mo56386p("#startClientSyncAsyncByClientType() No client type. Client sync does not start.");
                return;
            }
            try {
                nVar.f272951b.mo28211k(nVar.f272959j.mo57305b(new C97751f(nVar, axVar), new C97752g(nVar)), "Start client sync", new C97754i(nVar, aeVar, axVar));
            } catch (Exception e2) {
                C59104x c2 = C97759n.f272950a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(30307)).mo56386p("Unable to start client sync.");
            }
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
