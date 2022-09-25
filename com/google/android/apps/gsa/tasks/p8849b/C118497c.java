package com.google.android.apps.gsa.tasks.p8849b;

import com.google.android.apps.gsa.search.core.p6519al.p6751p.C85549a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87702ak;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87704am;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118550i;
import com.google.android.apps.gsa.tasks.C118560s;
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
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.tasks.b.c */
/* compiled from: PG */
public final class C118497c implements C86686h {

    /* renamed from: c */
    private static final C59071e f328896c = C59071e.m91332i("com.google.android.apps.gsa.tasks.b.c");

    /* renamed from: a */
    public final C86610af f328897a;

    /* renamed from: d */
    private final Map f328898d;

    /* renamed from: e */
    private final Map f328899e;

    /* renamed from: f */
    private final C85549a f328900f;

    /* renamed from: g */
    private final C22871g f328901g;

    /* renamed from: h */
    private final C22871g f328902h;

    public C118497c(Map map, Map map2, C85549a aVar, C86610af afVar, C22871g gVar, C22871g gVar2) {
        this.f328898d = map;
        this.f328899e = map2;
        this.f328900f = aVar;
        this.f328897a = afVar;
        this.f328901g = gVar;
        this.f328902h = gVar2;
    }

    /* renamed from: a */
    static /* synthetic */ C60870cx m196707a(C69464a aVar, C118476ak akVar) {
        try {
            return ((C118549h) aVar.mo17428b()).mo65234a(akVar);
        } catch (Error | RuntimeException e) {
            throw new C118550i(e);
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
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a != C87739bu.BACKGROUND_TASK_STARTED) {
            C59104x d = f328896c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "sb.r.BackgroundTaskSC");
            C59052c cVar2 = (C59052c) ((C59052c) d).mo56372aa(34019);
            C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
            if (a2 == null) {
                a2 = C87739bu.UNKNOWN;
            }
            cVar2.mo56389s("Unexpected client id: %s", a2);
            int i = C90755l.f253831a;
            return;
        }
        C62940bt btVar = C87702ak.f237160a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r9 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r9);
        Object l = bwVar.f169962ag.mo58854l(r9.f169971d);
        if (l == null) {
            obj = r9.f169969b;
        } else {
            obj = r9.mo58889c(l);
        }
        C87704am amVar = (C87704am) obj;
        C118522by b = C118522by.m196758b(amVar.f237164b);
        if (b == null) {
            b = C118522by.UNKNOWN;
        }
        C22871g gVar = this.f328902h;
        C118476ak akVar = amVar.f237165c;
        if (akVar == null) {
            akVar = C118476ak.f328838a;
        }
        C69464a aVar = (C69464a) this.f328898d.get(b);
        if (aVar != null) {
            cxVar = this.f328900f.mo79060a((C118549h) aVar.mo17428b(), akVar);
        } else {
            C69464a aVar2 = (C69464a) this.f328899e.get(b);
            if (aVar2 == null) {
                cxVar = C60856cj.m92899h(new C118560s(b));
            } else {
                C22871g gVar2 = this.f328901g;
                String valueOf = String.valueOf(b);
                cxVar = gVar2.mo28202b(String.valueOf(valueOf).concat(" [execution]"), new C118493a(aVar2, akVar));
            }
        }
        String valueOf2 = String.valueOf(b);
        gVar.mo28211k(cxVar, String.valueOf(valueOf2).concat(" [send service event]"), new C118496b(this, j));
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
