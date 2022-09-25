package com.google.android.apps.gsa.staticplugins.backup.p7438b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88216tl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88218tn;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7040g.C89768b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.staticplugins.backup.p7438b.p7439a.C94467d;
import com.google.android.apps.gsa.staticplugins.backup.p7438b.p7439a.C94468e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.backup.b.b */
/* compiled from: PG */
public final class C94473b implements C86686h {

    /* renamed from: a */
    private static final C59071e f264160a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.backup.b.b");

    /* renamed from: c */
    private final C94463a f264161c;

    /* renamed from: d */
    private final C86610af f264162d;

    /* renamed from: e */
    private final C90931ca f264163e;

    public C94473b(C94463a aVar, C86610af afVar, C90931ca caVar) {
        this.f264161c = aVar;
        this.f264162d = afVar;
        this.f264163e = caVar;
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
        int ordinal = a.ordinal();
        if (ordinal == 95) {
            C58976aa aaVar = C58975e.f156826a;
            C94463a aVar = this.f264161c;
            C89356b a2 = aVar.f264070f.mo78025a("backup", 387, 389);
            C86338r rVar = aVar.f264066b;
            rVar.getClass();
            C86338r rVar2 = aVar.f264067c;
            rVar2.getClass();
            Context context = aVar.f264065a;
            context.getClass();
            Integer valueOf = Integer.valueOf(aVar.f264068d);
            C68225k.m98529a(a2, C89356b.class);
            C68225k.m98529a(rVar, C86338r.class);
            C68225k.m98529a(rVar2, C86338r.class);
            C68225k.m98529a(context, Context.class);
            C68225k.m98529a(valueOf, Integer.class);
            C60870cx gq = new C94467d(a2, rVar, rVar2, context, valueOf).f264088a.mo60297gq();
            this.f264163e.mo85142g(gq, new C90952r("BackupSessionController", "Generating/saving backup data", "Error while creating and saving backup data."));
            this.f264162d.mo80225f(gq, j, 0);
        } else if (ordinal != 96) {
            C59104x d = f264160a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BackupSessionController");
            C59052c cVar2 = (C59052c) ((C59052c) d).mo56372aa(14477);
            C87739bu a3 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a3 == null) {
                a3 = C87739bu.UNKNOWN;
            }
            cVar2.mo56389s("Received an unsupported event (%s).", a3);
            int i = C90755l.f253831a;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            C94463a aVar2 = this.f264161c;
            C62940bt btVar = C88216tl.f238449a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r0);
            Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            C89768b bVar = ((C88218tn) obj).f238453b;
            if (bVar == null) {
                bVar = C89768b.f242960f;
            }
            C89768b bVar2 = bVar;
            C89356b a4 = aVar2.f264070f.mo78025a("restore", 388, 389);
            C86338r rVar3 = aVar2.f264066b;
            rVar3.getClass();
            C86338r rVar4 = aVar2.f264067c;
            rVar4.getClass();
            Integer valueOf2 = Integer.valueOf(aVar2.f264068d);
            bVar2.getClass();
            C86054o oVar = aVar2.f264069e;
            oVar.getClass();
            C68225k.m98529a(a4, C89356b.class);
            C68225k.m98529a(rVar3, C86338r.class);
            C68225k.m98529a(rVar4, C86338r.class);
            C68225k.m98529a(valueOf2, Integer.class);
            C68225k.m98529a(bVar2, C89768b.class);
            C68225k.m98529a(oVar, C86054o.class);
            C60870cx gq2 = new C94468e(a4, rVar3, rVar4, valueOf2, bVar2, oVar).f264122a.mo60297gq();
            this.f264163e.mo85142g(gq2, new C90952r("BackupSessionController", "Restoring backup data", "Error while restoring backup data."));
            this.f264162d.mo80225f(gq2, j, 0);
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
