package com.google.android.apps.gsa.staticplugins.deeplink.p7789b;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84645a;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84664b;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84665c;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84666d;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84667e;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84668f;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84669g;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84670h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.p6531a.C84653h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84920a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136382ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.C38371l;
import com.google.android.libraries.search.p2998g.p2999a.C38375p;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.b.c */
/* compiled from: PG */
public final class C99476c implements C86686h {

    /* renamed from: a */
    public static final C59071e f278360a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.b.c");

    /* renamed from: c */
    public C87682aj f278361c;

    /* renamed from: d */
    private final C84665c f278362d;

    /* renamed from: e */
    private final C85005h f278363e;

    /* renamed from: f */
    private final C84667e f278364f;

    /* renamed from: g */
    private final C84668f f278365g;

    /* renamed from: h */
    private final C84645a f278366h;

    /* renamed from: i */
    private final C84664b f278367i;

    /* renamed from: j */
    private final C84669g f278368j;

    /* renamed from: k */
    private final C84666d f278369k;

    /* renamed from: l */
    private final C84670h f278370l;

    /* renamed from: m */
    private final C84920a f278371m;

    /* renamed from: n */
    private final C22871g f278372n;

    /* renamed from: o */
    private final C84653h f278373o;

    public C99476c(C84665c cVar, C84653h hVar, C85005h hVar2, C84667e eVar, C84668f fVar, C84645a aVar, C84664b bVar, C84669g gVar, C84666d dVar, C84670h hVar3, C84920a aVar2, C22871g gVar2) {
        this.f278362d = cVar;
        this.f278373o = hVar;
        this.f278363e = hVar2;
        this.f278364f = eVar;
        this.f278365g = fVar;
        this.f278366h = aVar;
        this.f278367i = bVar;
        this.f278368j = gVar;
        this.f278369k = dVar;
        this.f278370l = hVar3;
        this.f278371m = aVar2;
        this.f278372n = gVar2;
    }

    /* renamed from: a */
    public final void mo91476a() {
        C87682aj ajVar = this.f278361c;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(new C87684al(C88244um.HANDLE_DEEPLINK_DONE).mo81964a());
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
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a.ordinal() != 80) {
            cVar.mo80279a(clientEventData);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C62940bt btVar = C38371l.f101601a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r3 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r3);
        C58838bb.m90869d(bwVar.f169962ag.mo58857o(r3.f169971d), "DEEPLINK client event must have DeeplinkEventData.");
        C62940bt btVar2 = C38371l.f101601a;
        C87741bw bwVar2 = clientEventData.f236955a;
        C62940bt r32 = C62942bv.checkIsLite(btVar2);
        bwVar2.mo58887l(r32);
        Object l = bwVar2.f169962ag.mo58854l(r32.f169971d);
        if (l == null) {
            obj = r32.f169969b;
        } else {
            obj = r32.mo58889c(l);
        }
        C38375p pVar = (C38375p) obj;
        Uri parse = Uri.parse(pVar.f101606b);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (C136382ae.f371303a.equals(scheme)) {
            if ("lens".equals(host)) {
                this.f278364f.mo78405a(pVar);
                mo91476a();
            } else if ("interpreter".equals(host)) {
                this.f278369k.mo78404a(parse);
                mo91476a();
            } else {
                this.f278362d.mo78403a(pVar);
            }
        } else if ("http".equals(scheme) || "https".equals(scheme)) {
            String path = parse.getPath();
            if ("assistant.google.com".equals(host)) {
                if (path.startsWith("/services/invoke")) {
                    this.f278363e.mo78633r(parse, pVar.f101608d);
                    mo91476a();
                } else if (path.startsWith("/shortcuts")) {
                    new C90873ag(this.f278371m.mo78587b(parse, pVar.f101607c), this.f278372n, "opaAppActionsWork deeplink handling", new C99474a(this)).mo85223a(new C99475b(this));
                } else if (path.startsWith("/recipes")) {
                    this.f278365g.mo78406a(parse);
                    mo91476a();
                } else if (path.startsWith("/family")) {
                    this.f278367i.mo78401a(parse);
                    mo91476a();
                } else if (path.startsWith("/communication")) {
                    this.f278366h.mo78400a(parse, pVar.f101607c);
                    mo91476a();
                } else {
                    C59104x d = f278360a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "DeeplinkSessionControl");
                    ((C59052c) ((C59052c) d).mo56372aa(19230)).mo56389s("unrecognized path: %s", path);
                    int i = C90755l.f253831a;
                }
            } else if (("www.google.com".equals(host) && path.startsWith("/podcasts")) || "podcasts.google.com".equals(host)) {
                this.f278373o.mo78402a(parse);
            } else if ("pairdevice.gle".equals(host)) {
                this.f278368j.mo78407a(parse);
            } else if (!"www.google.com".equals(host) || !path.startsWith("/readit")) {
                C59104x d2 = f278360a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "DeeplinkSessionControl");
                ((C59052c) ((C59052c) d2).mo56372aa(19229)).mo56389s("unrecognized host: %s", host);
                int i2 = C90755l.f253831a;
            } else {
                this.f278370l.mo78408a(parse);
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
        this.f278361c = ((C86775r) aVar).f234383e;
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
