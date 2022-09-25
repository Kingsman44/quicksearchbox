package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import android.os.Bundle;
import androidx.lifecycle.C2333ah;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.search.core.p6519al.p6701dg.C85360a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88342yc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88345yf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88346yg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88348yi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88350yk;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p6983ah.C89145b;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8327b.C107886f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112969d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.C112966g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113448a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.assistant.p3858ar.p3859a.C49735y;
import com.google.assistant.p3858ar.p3859a.C49736z;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.bk */
/* compiled from: PG */
public final class C107898bk implements C107874az, C113448a {

    /* renamed from: a */
    public static final C59071e f300224a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.bk");

    /* renamed from: b */
    public final C86124t f300225b;

    /* renamed from: c */
    public final C89145b f300226c;

    /* renamed from: d */
    public final C2333ah f300227d = new C107897bj(this);

    /* renamed from: e */
    private final C85360a f300228e;

    /* renamed from: f */
    private final C22871g f300229f;

    /* renamed from: g */
    private final C22871g f300230g;

    /* renamed from: h */
    private final C68214a f300231h;

    /* renamed from: i */
    private final C85355a f300232i;

    /* renamed from: j */
    private final C68214a f300233j;

    /* renamed from: k */
    private final C112969d f300234k;

    /* renamed from: l */
    private final Optional f300235l;

    public C107898bk(C85360a aVar, C22871g gVar, C22871g gVar2, C68214a aVar2, C85355a aVar3, C86124t tVar, C68214a aVar4, C112969d dVar, C89145b bVar, Optional optional) {
        this.f300228e = aVar;
        this.f300229f = gVar;
        this.f300230g = gVar2;
        this.f300231h = aVar2;
        this.f300232i = aVar3;
        this.f300225b = tVar;
        this.f300233j = aVar4;
        this.f300234k = dVar;
        this.f300226c = bVar;
        this.f300235l = optional;
        gVar2.mo28212l("Observe Opa activity lifecycle", new C107895bh(this, bVar));
    }

    /* renamed from: f */
    private final void m179147f(C88347yh yhVar) {
        C87684al alVar = new C87684al(C88244um.TAPAS_SERVICE_RESPONSE);
        alVar.mo81965b(C88345yf.f238922a, yhVar);
        ((C107932g) this.f300231h.mo27525b()).mo96337a(alVar.mo81964a());
    }

    /* renamed from: a */
    public final void mo96296a() {
        this.f300230g.mo28212l("Stop observing Opa activity lifecycle", new C107896bi(this));
        if (this.f300225b.mo79746e(C90063do.f249583gK)) {
            ((C107886f) this.f300233j.mo27525b()).mo96325a().f314143b.mo100234a();
        }
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        Object obj;
        Object obj2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        switch (a.ordinal()) {
            case 140:
                C58976aa aaVar = C58975e.f156826a;
                C62940bt btVar = C88342yc.f238912a;
                C87741bw bwVar = clientEventData.f236955a;
                C62940bt r0 = C62942bv.checkIsLite(btVar);
                bwVar.mo58887l(r0);
                Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                C88344ye yeVar = (C88344ye) obj;
                if (this.f300235l.isPresent()) {
                    ((C113388b) ((C68214a) this.f300235l.get()).mo27525b()).mo99675j(yeVar.f238917c, C89849ae.TAPAS_SEARCH_START);
                }
                if (this.f300225b.mo79746e(C90063do.f249583gK)) {
                    this.f300234k.mo99795a(yeVar.f238917c, "startStreamingTapasSearchRequest");
                    ((C107886f) this.f300233j.mo27525b()).mo96325a().mo100236b(yeVar);
                    return true;
                }
                this.f300234k.mo99795a(yeVar.f238917c, "startTapasSearchRequest");
                new C90873ag(this.f300228e.mo78894g(yeVar), this.f300229f, "handle GenericClientEvent TAPAS_SEARCH_START", new C107893bf(this, yeVar)).mo85223a(new C107894bg(this, yeVar));
                return true;
            case 141:
                C58976aa aaVar2 = C58975e.f156826a;
                mo96328c();
                return true;
            case 142:
                C62940bt btVar2 = C88348yi.f238929a;
                C87741bw bwVar2 = clientEventData.f236955a;
                C62940bt r02 = C62942bv.checkIsLite(btVar2);
                bwVar2.mo58887l(r02);
                Object l2 = bwVar2.f169962ag.mo58854l(r02.f169971d);
                if (l2 == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l2);
                }
                C88350yk ykVar = (C88350yk) obj2;
                String str = ykVar.f238933b;
                this.f300232i.mo78887b(str, BuildConfig.FLAVOR, new Suggestion(str, ykVar.f238934c, C58485gu.m89846n(Integer.valueOf(ykVar.f238935d)), (Bundle) null), "com.google.android.googlequicksearchbox.NEXUS_OPA_TAPAS_FEEDBACK");
                return true;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public final void mo96328c() {
        if (this.f300225b.mo79746e(C90063do.f249583gK)) {
            ((C107886f) this.f300233j.mo27525b()).mo96325a().mo100235a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo96329d(long j) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C112966g) this.f300234k.f313049b.remove(Long.valueOf(j))) == null) {
            C59104x d = C112969d.f313047a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasServerReqMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(27553)).mo56388r("No monitor span found for requestId: %d", j);
        }
        C49735y yVar = (C49735y) C49736z.f128420e.createBuilder();
        yVar.copyOnWrite();
        C49736z zVar = (C49736z) yVar.instance;
        zVar.f128422a |= 8;
        zVar.f128425d = true;
        yVar.copyOnWrite();
        C49736z zVar2 = (C49736z) yVar.instance;
        zVar2.f128422a |= 1;
        zVar2.f128423b = j;
        C49736z zVar3 = (C49736z) yVar.build();
        C88346yg ygVar = (C88346yg) C88347yh.f238923d.createBuilder();
        ygVar.copyOnWrite();
        C88347yh yhVar = (C88347yh) ygVar.instance;
        zVar3.getClass();
        yhVar.f238926b = zVar3;
        yhVar.f238925a |= 1;
        m179147f((C88347yh) ygVar.build());
    }

    /* renamed from: e */
    public final void mo96330e(C88347yh yhVar) {
        C49736z zVar = yhVar.f238926b;
        if (zVar == null) {
            zVar = C49736z.f128420e;
        }
        long j = zVar.f128423b;
        if (this.f300235l.isPresent()) {
            ((C113388b) ((C68214a) this.f300235l.get()).mo27525b()).mo99675j(j, C89849ae.TAPAS_SEARCH_SUB_CONTROLLER_NEW_RESPONSE);
        }
        C58976aa aaVar = C58975e.f156826a;
        C112969d dVar = this.f300234k;
        if (((C112966g) dVar.f313049b.remove(Long.valueOf(j))) == null) {
            C59104x d = C112969d.f313047a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasServerReqMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(27554)).mo56388r("No monitor span found for requestId: %d", j);
        } else {
            dVar.f313050c.mo99803d(j, C112976k.TAPAS_SEARCH);
        }
        m179147f(yhVar);
    }
}
