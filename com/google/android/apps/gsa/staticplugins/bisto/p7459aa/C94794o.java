package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.binaries.satin.app.C74030fp;
import com.google.android.apps.gsa.binaries.satin.app.C74032fu;
import com.google.android.apps.gsa.binaries.satin.app.alk;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.fr;
import com.google.android.apps.gsa.c.b;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119056l;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119063s;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6498ab.p6499a.C84395a;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.p6519al.p6697de.C85351a;
import com.google.android.apps.gsa.search.core.p6519al.p6755r.C85558a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.p6836h.C86480t;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.C86610af;
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
import com.google.android.apps.gsa.search.shared.service.p6935b.C87873gt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88121py;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88124qa;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.p6939a.C88401c;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.p6939a.C88402d;
import com.google.android.apps.gsa.shared.bisto.C89652g;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.speech.p7294j.C92433c;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b.C94671ab;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b.C94711bo;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b.C94746cw;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b.C94747cx;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b.C94756l;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d.C94779c;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d.C94780d;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d.C94781e;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d.C94782f;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d.C94783g;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96448af;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99486j;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99488l;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99490n;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37710d;
import com.google.android.libraries.search.p2998g.p2999a.C38342ab;
import com.google.android.libraries.search.p2998g.p2999a.C38343ac;
import com.google.android.libraries.search.p2998g.p2999a.C38377r;
import com.google.android.libraries.search.p2998g.p2999a.C38378s;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38346a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.ssb.C45350g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@C84395a
/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.o */
/* compiled from: PG */
public final class C94794o implements C86686h {

    /* renamed from: a */
    public static final C59071e f265055a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.o");

    /* renamed from: c */
    public final C94771c f265056c;

    /* renamed from: d */
    public final C89656k f265057d;

    /* renamed from: e */
    private final C86610af f265058e;

    /* renamed from: f */
    private final C85558a f265059f;

    /* renamed from: g */
    private final C68214a f265060g;

    /* renamed from: h */
    private final C68214a f265061h;

    /* renamed from: i */
    private final C94747cx f265062i;

    /* renamed from: j */
    private C86697a f265063j;

    /* renamed from: k */
    private final C84370p f265064k;

    /* renamed from: l */
    private final C94785f f265065l;

    /* renamed from: m */
    private final C68214a f265066m;

    /* renamed from: n */
    private final C68214a f265067n;

    /* renamed from: o */
    private final C22871g f265068o;

    /* renamed from: p */
    private final C22871g f265069p;

    /* renamed from: q */
    private final C22871g f265070q;

    /* renamed from: r */
    private final C58833ax f265071r;

    /* renamed from: s */
    private final C68214a f265072s;

    /* renamed from: t */
    private final C68214a f265073t;

    /* renamed from: u */
    private final C58881cr f265074u;

    /* renamed from: v */
    private final C58881cr f265075v;

    /* renamed from: w */
    private final C68214a f265076w;

    /* renamed from: x */
    private final C21370a f265077x;

    /* renamed from: y */
    private final SharedPreferences f265078y;

    public C94794o(C94771c cVar, C86610af afVar, C85558a aVar, C68214a aVar2, C68214a aVar3, C94747cx cxVar, C84370p pVar, C58833ax axVar, C94785f fVar, C68214a aVar4, C68214a aVar5, C68214a aVar6, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar7, C90021c cVar2, C68214a aVar8, C21370a aVar9, C89656k kVar, SharedPreferences sharedPreferences) {
        C90021c cVar3 = cVar2;
        this.f265056c = cVar;
        this.f265058e = afVar;
        this.f265059f = aVar;
        this.f265060g = aVar2;
        this.f265061h = aVar3;
        this.f265062i = cxVar;
        this.f265064k = pVar;
        this.f265071r = axVar;
        this.f265065l = fVar;
        this.f265066m = aVar4;
        this.f265067n = aVar5;
        this.f265072s = aVar6;
        this.f265068o = gVar;
        this.f265069p = gVar2;
        this.f265070q = gVar3;
        this.f265073t = aVar7;
        this.f265074u = C58886cw.m90973a(new C94788i(cVar3));
        this.f265075v = C58886cw.m90973a(new C94789j(cVar3));
        this.f265076w = aVar8;
        this.f265077x = aVar9;
        this.f265057d = kVar;
        this.f265078y = sharedPreferences;
    }

    /* renamed from: c */
    private static String m156340c(C38377r rVar, String str) {
        C38343ac acVar = rVar.f101616b;
        if (acVar == null) {
            acVar = C38343ac.f101528b;
        }
        for (C38342ab abVar : acVar.f101530a) {
            if (str.equals(abVar.f101526b)) {
                return abVar.f101527c;
            }
        }
        return null;
    }

    /* renamed from: m */
    private static String m156341m(String str) {
        if (C58837ba.m90859h(str)) {
            return null;
        }
        String d = C58890d.m90989d(str);
        if (BluetoothAdapter.checkBluetoothAddress(d)) {
            return d;
        }
        return null;
    }

    /* renamed from: n */
    private static void m156342n(C88401c cVar, Bundle bundle, C38377r rVar) {
        if ((cVar.f239020a & 2) != 0) {
            bundle.putString("source_return_url", cVar.f239022c);
        }
        if ((cVar.f239020a & 4) != 0) {
            bundle.putString("source_return_package", cVar.f239023d);
        }
        if (cVar.f239027h && rVar.f101618d.equals("com.google.android.apps.wear.companion")) {
            bundle.putBoolean("short_setup", true);
        }
        if (cVar.f239028i) {
            bundle.putBoolean("FORCE_OOBE", true);
        }
        if ((cVar.f239020a & 16) != 0) {
            bundle.putBoolean("dark_theme", cVar.f239025f);
        }
    }

    /* renamed from: o */
    private final void m156343o(String str, String str2, Bundle bundle) {
        bundle.putString("assistant_device_id", str);
        if (!bundle.getBoolean("enable_wear_data_layer_api") || (!((Boolean) this.f265074u.mo6453a()).booleanValue() && (!((Boolean) this.f265075v.mo6453a()).booleanValue() || !bundle.getBoolean("dark_theme")))) {
            this.f265059f.mo79075l(str, str2, bundle);
            return;
        }
        C89681t.m146050p(C89652g.m145951a().mo83542c(str), this.f265078y);
        new C90873ag(((C86034c) this.f265076w.mo27525b()).mo79696a(), this.f265068o, "get-accountid", new C94790k(this, str, str2, bundle)).mo85223a(C94791l.f265047a);
    }

    /* renamed from: a */
    public final void mo88618a(ClientEventData clientEventData) {
        Query query;
        C60870cx cxVar;
        ClientEventData clientEventData2 = clientEventData;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 31) {
            C58976aa aaVar = C58975e.f156826a;
            C94785f fVar = this.f265065l;
            fVar.f265030b.mo78913b();
            fVar.f265034f.mo57356n(C118826c.f331422a);
        } else if (ordinal == 45) {
            C86697a aVar = this.f265063j;
            if (aVar != null) {
                ClientConfig clientConfig = ((C86775r) aVar).f234384f;
                Query query2 = (Query) clientEventData2.mo81912b(Query.class);
                if (((C86124t) this.f265061h.mo27525b()).mo79746e(C90014bt.f247332fE) && this.f265071r.mo56113h() && ((bd) this.f265071r.mo56107c()).s()) {
                    query2 = query2.mo84278aO("android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME", ((bd) this.f265071r.mo56107c()).l());
                }
                C94747cx cxVar2 = this.f265062i;
                C59104x b = C94747cx.f264952a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoSearchGraphCtrl");
                ((C59052c) ((C59052c) b).mo56372aa(16894)).mo56386p("startSearch");
                C89356b b2 = cxVar2.f264962k.mo78026b("BistoVoiceSearch", C118575h.BISTO_SEARCH_STARTER, C118575h.SESSION_BISTO);
                if (query2.mo84362bu()) {
                    query = query2.mo84493u();
                    cxVar2.f264956e.mo81656r(query);
                } else {
                    C59104x c = C94747cx.f264952a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "BistoSearchGraphCtrl");
                    ((C59052c) ((C59052c) c).mo56372aa(16895)).mo56386p("Unable to commit query");
                    query = query2;
                }
                C58833ax axVar = C58836b.f156633a;
                if (!query.mo84392cY()) {
                    C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
                    C37705a aVar2 = (C37705a) C37773c.f100243c.createBuilder();
                    C37710d dVar = C37710d.f100138a;
                    aVar2.copyOnWrite();
                    C37773c cVar = (C37773c) aVar2.instance;
                    dVar.getClass();
                    cVar.f100246b = dVar;
                    cVar.f100245a = 3;
                    bkVar.copyOnWrite();
                    C37407bl blVar = (C37407bl) bkVar.instance;
                    C37773c cVar2 = (C37773c) aVar2.build();
                    cVar2.getClass();
                    blVar.f99328b = cVar2;
                    blVar.f99327a = 1 | blVar.f99327a;
                    axVar = C58833ax.m90834k(((u) cxVar2.f264957f.mo27525b()).a((C37407bl) bkVar.build(), query, cxVar2.f264958g.mo104088a(query, cxVar2.f264959h.mo87252z(query)), b.h, new C92433c(), false, C39226b.TAG_CLASSIC_ASSISTANT_BISTO));
                }
                C74030fp fpVar = (C74030fp) cxVar2.f264953b.mo17428b();
                query.getClass();
                fpVar.f206138d = query;
                fpVar.f206139e = b2;
                clientConfig.getClass();
                fpVar.f206140f = clientConfig;
                fpVar.f206141g = axVar;
                C68225k.m98529a(fpVar.f206138d, Query.class);
                C68225k.m98529a(fpVar.f206139e, C89356b.class);
                C68225k.m98529a(fpVar.f206140f, ClientConfig.class);
                C68225k.m98529a(fpVar.f206141g, C58833ax.class);
                aqy aqy = fpVar.f206135a;
                alk alk = fpVar.f206136b;
                C74032fu fuVar = fpVar.f206137c;
                Query query3 = fpVar.f206138d;
                C89356b bVar = fpVar.f206139e;
                C89356b bVar2 = bVar;
                fr frVar = new fr(aqy, alk, fuVar, query3, bVar2, fpVar.f206140f, fpVar.f206141g);
                C94785f fVar2 = cxVar2.f264954c;
                fVar2.f265031c.mo78381d();
                fVar2.f265032d.mo78885c(C45350g.LISTENING);
                if (!fVar2.f265033e.isDone()) {
                    fVar2.f265033e.mo57356n(C58836b.f156633a);
                }
                if (!fVar2.f265034f.isDone()) {
                    fVar2.f265034f.mo57357o(new Exception("new prepareForQuery"));
                    fVar2.f265030b.mo78913b();
                }
                fVar2.f265033e = new SettableFuture();
                fVar2.f265034f = new SettableFuture();
                C59104x b3 = C94747cx.f264952a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "BistoSearchGraphCtrl");
                ((C59052c) ((C59052c) b3).mo56372aa(16896)).mo56389s("is text search: %b", Boolean.valueOf(query.mo84392cY()));
                if (query.mo84392cY()) {
                    cxVar = frVar.h.mo60297gq();
                } else {
                    cxVar = C119063s.m197648a(frVar.d.mo60297gq(), C119056l.f332144a);
                }
                C86498a aVar3 = cxVar2.f264955d;
                C89356b bVar3 = frVar.a;
                ClientConfig clientConfig2 = frVar.b;
                C74032fu fuVar2 = frVar.c;
                cxVar2.f264961j = aVar3.mo80185i(query, cxVar, C60856cj.m92900i(new C86480t(C58485gu.m89848p(new C94711bo(bVar3, clientConfig2, fuVar2.f206172t), new C94756l(fuVar2.f206173u, bVar3), new C94671ab(fuVar2.f206174v, bVar3)))), b2);
                C60870cx a2 = cxVar2.f264961j.mo80180a();
                if (axVar.mo56113h()) {
                    cxVar2.f264960i.mo28211k(a2, "SearchGraphRunner.search() done future", new C94746cw(cxVar2, axVar));
                }
                long j = query2.f252749G;
                String bf = query2.mo84347bf("user-agent-suffix");
                long b4 = this.f265077x.mo26870b();
                if (bf == null) {
                    C59104x d = f265055a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoSessionController");
                    ((C59052c) ((C59052c) d).mo56372aa(16793)).mo56386p("unknown device");
                    return;
                }
                this.f265068o.mo28212l("bisto-commit-latencylog-in-search", new C94793n(this, bf, j, b4));
                return;
            }
            C59104x c2 = f265055a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BistoSessionController");
            ((C59052c) ((C59052c) c2).mo56372aa(16787)).mo56386p("activeClient is null");
        } else if (ordinal != 47) {
            C59104x c3 = f265055a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "BistoSessionController");
            C59052c cVar3 = (C59052c) ((C59052c) c3).mo56372aa(16786);
            C87739bu a3 = C87739bu.m142761a(clientEventData2.f236955a.f237480b);
            if (a3 == null) {
                a3 = C87739bu.UNKNOWN;
            }
            cVar3.mo56387q("Received event: %s, cannot handle", a3.f237476dL);
        } else {
            C86577w wVar = this.f265062i.f264961j;
            if (wVar != null) {
                C59104x b5 = C94747cx.f264952a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "BistoSearchGraphCtrl");
                ((C59052c) ((C59052c) b5).mo56372aa(16893)).mo56386p("Cancel active search graph");
                C60537to toVar = C60537to.UNKNOWN_STATE;
                wVar.mo80181b();
            } else {
                C59104x b6 = C94747cx.f264952a.mo56224b();
                b6.mo56378ag(C58975e.f156826a, "BistoSearchGraphCtrl");
                ((C59052c) ((C59052c) b6).mo56372aa(16892)).mo56386p("No search graph to cancel");
            }
            ((C84617a) this.f265066m.mo27525b()).mo78379b();
            ((C85351a) this.f265067n.mo27525b()).mo78885c(C45350g.IDLE);
            this.f265064k.mo77926h();
            this.f265064k.mo77928j(1);
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
        Bundle bundle;
        Intent intent;
        C88124qa qaVar;
        Object obj;
        Bundle bundle2;
        String string;
        Object obj2;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C59071e eVar = f265055a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSessionController");
        ((C59052c) ((C59052c) b).mo56372aa(16762)).mo56389s("handleGenericClientEvent ID = %s", a);
        switch (a.ordinal()) {
            case 31:
            case 37:
            case 45:
            case 47:
                mo88618a(clientEventData);
                break;
            case 114:
                if (!(!clientEventData.mo81913d(Bundle.class) || (bundle = (Bundle) clientEventData.mo81912b(Bundle.class)) == null || (intent = (Intent) bundle.getParcelable("start_activity_intent")) == null)) {
                    this.f265068o.mo28212l("startActivity", new C94792m(this, bundle.getBoolean("extra_start_activity_for_result", false), intent));
                    break;
                }
            case 120:
                C62940bt btVar = C88121py.f238227a;
                C87741bw bwVar = clientEventData.f236955a;
                C62940bt r9 = C62942bv.checkIsLite(btVar);
                bwVar.mo58887l(r9);
                if (bwVar.f169962ag.mo58857o(r9.f169971d)) {
                    C62940bt btVar2 = C88121py.f238227a;
                    C87741bw bwVar2 = clientEventData.f236955a;
                    C62940bt r92 = C62942bv.checkIsLite(btVar2);
                    bwVar2.mo58887l(r92);
                    Object l = bwVar2.f169962ag.mo58854l(r92.f169971d);
                    if (l == null) {
                        obj = r92.f169969b;
                    } else {
                        obj = r92.mo58889c(l);
                    }
                    qaVar = (C88124qa) obj;
                } else {
                    qaVar = null;
                }
                C94783g gVar = (C94783g) this.f265072s.mo27525b();
                C58833ax j2 = C58833ax.m90833j(qaVar);
                if (j2.mo56113h() && (((C88124qa) j2.mo56107c()).f238230a & 1) != 0) {
                    try {
                        C52176ia iaVar = (C52176ia) C62942bv.parseFrom((C62942bv) C52176ia.f136911k, ((C88124qa) j2.mo56107c()).f238231b, C62921ba.m95368a());
                        boolean z = ((C88124qa) j2.mo56107c()).f238232c;
                        long j3 = iaVar.f136917e;
                        new C90873ag(C60922j.m93045h(C60846c.m92878g(C60838bs.m92859i(((C84274n) gVar.f265025f.mo27525b()).mo77785a()), RuntimeException.class, C94779c.f265013a, C60826bg.f164896a), new C94780d(gVar, iaVar, z), C60826bg.f164896a), gVar.f265021b, "media-session-initiated", new C94781e(gVar, iaVar)).mo85223a(C94782f.f265019a);
                        return;
                    } catch (C62974ct e) {
                        C59104x c = C94783g.f265020a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "BistoAudioPlayerSubCtrl");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(16911)).mo56386p("Trying to parse invalid Media data.");
                    }
                }
                gVar.mo88606a();
                return;
            case 129:
                if (!(!clientEventData.mo81913d(Bundle.class) || (bundle2 = (Bundle) clientEventData.mo81912b(Bundle.class)) == null || (string = bundle2.getString("extra_device_id")) == null)) {
                    this.f265059f.mo79065a(string);
                    break;
                }
            case 156:
                this.f265059f.mo79069f();
                break;
            case 180:
                C62940bt btVar3 = C87873gt.f237726a;
                C87741bw bwVar3 = clientEventData.f236955a;
                C62940bt r12 = C62942bv.checkIsLite(btVar3);
                bwVar3.mo58887l(r12);
                if (bwVar3.f169962ag.mo58857o(r12.f169971d)) {
                    C62940bt btVar4 = C87873gt.f237726a;
                    C87741bw bwVar4 = clientEventData.f236955a;
                    C62940bt r122 = C62942bv.checkIsLite(btVar4);
                    bwVar4.mo58887l(r122);
                    Object l2 = bwVar4.f169962ag.mo58854l(r122.f169971d);
                    if (l2 == null) {
                        obj2 = r122.f169969b;
                    } else {
                        obj2 = r122.mo58889c(l2);
                    }
                    C88406ad adVar = (C88406ad) obj2;
                    Query query = (Query) C90772bp.m148301i(adVar.f239036b, Query.CREATOR);
                    HotwordResult hotwordResult = (HotwordResult) C90772bp.m148301i(adVar.f239037c, HotwordResult.CREATOR);
                    if (hotwordResult != null && query != null) {
                        if (!hotwordResult.mo84698p().mo56113h()) {
                            C59104x c2 = eVar.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "BistoSessionController");
                            ((C59052c) ((C59052c) c2).mo56372aa(16765)).mo56386p("HotwordResult audio is not set");
                        }
                        C90875ai.m148465b(new C94786g(this, query), C90877ak.m148471e(((C84855a) this.f265060g.mo27525b()).mo78541i(hotwordResult, query.f252749G), 1, TimeUnit.SECONDS, this.f265070q), this.f265069p, "populate-preamble").mo85223a(new C94787h(this, query));
                        break;
                    } else {
                        C59104x c3 = eVar.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "BistoSessionController");
                        ((C59052c) ((C59052c) c3).mo56372aa(16764)).mo56386p("can't construct query or hotwordResult");
                        return;
                    }
                } else {
                    return;
                }
            case 195:
                Bundle bundle3 = (Bundle) clientEventData.mo81912b(Bundle.class);
                String string2 = bundle3.getString("extra_device_id");
                ArrayList<Integer> integerArrayList = bundle3.getIntegerArrayList("extra_profiles_for_audio_testing");
                if (!C58837ba.m90859h(string2)) {
                    if (integerArrayList != null && !integerArrayList.isEmpty()) {
                        this.f265059f.mo79074k(string2, integerArrayList);
                        break;
                    } else {
                        C59104x c4 = eVar.mo56225c();
                        c4.mo56378ag(C58975e.f156826a, "BistoSessionController");
                        ((C59052c) ((C59052c) c4).mo56372aa(16771)).mo56386p("Invalid profiles to test");
                        break;
                    }
                } else {
                    C59104x c5 = eVar.mo56225c();
                    c5.mo56378ag(C58975e.f156826a, "BistoSessionController");
                    ((C59052c) ((C59052c) c5).mo56372aa(16772)).mo56386p("Invalid deviceId");
                    break;
                }
                break;
            case 196:
                String string3 = ((Bundle) clientEventData.mo81912b(Bundle.class)).getString("extra_device_id");
                if (!C58837ba.m90859h(string3)) {
                    this.f265059f.mo79077n(string3);
                    break;
                } else {
                    C59104x c6 = eVar.mo56225c();
                    c6.mo56378ag(C58975e.f156826a, "BistoSessionController");
                    ((C59052c) ((C59052c) c6).mo56372aa(16776)).mo56386p("Invalid deviceId");
                    break;
                }
            case 208:
                Bundle bundle4 = (Bundle) clientEventData.mo81912b(Bundle.class);
                String string4 = bundle4.getString("key_device_id");
                boolean z2 = bundle4.getBoolean("extra_hotword_setting_state");
                if (!C58837ba.m90859h(string4)) {
                    this.f265059f.mo79078p(string4, z2);
                    break;
                } else {
                    C59104x c7 = eVar.mo56225c();
                    c7.mo56378ag(C58975e.f156826a, "BistoSessionController");
                    ((C59052c) ((C59052c) c7).mo56372aa(16768)).mo56386p("Invalid deviceId");
                    break;
                }
            case 220:
                this.f265059f.mo79073j();
                break;
            case 226:
                this.f265059f.mo79080r();
                this.f265059f.mo79079q();
                this.f265059f.mo79069f();
                break;
            case 227:
                EventForDump.m147676e(5, "Bisto notification Headphones PR.");
                ((C89994f) this.f265073t.mo27525b()).mo83836B(true);
                break;
            case 228:
                this.f265059f.mo79072i((Intent) clientEventData.mo81912b(Intent.class));
                break;
            case 238:
                if (clientEventData.mo81913d(Bundle.class)) {
                    String string5 = ((Bundle) clientEventData.mo81912b(Bundle.class)).getString("extra_device_id");
                    if (string5 != null) {
                        this.f265058e.mo80225f(this.f265059f.mo79066b(string5), j, 0);
                        break;
                    } else {
                        C59104x c8 = eVar.mo56225c();
                        c8.mo56378ag(C58975e.f156826a, "BistoSessionController");
                        ((C59052c) ((C59052c) c8).mo56372aa(16766)).mo56386p("Missing deviceId for cleanup");
                        return;
                    }
                }
                break;
            case 243:
                if (clientEventData.mo81913d(Bundle.class)) {
                    String string6 = ((Bundle) clientEventData.mo81912b(Bundle.class)).getString("extra_client_op_id");
                    if (string6 != null) {
                        if (C94800u.f265091b.get(string6) != null) {
                            Pair pair = (Pair) C94800u.f265091b.remove(string6);
                            if (pair != null) {
                                C51809dy dyVar = (C51809dy) pair.first;
                                SettableFuture settableFuture = (SettableFuture) pair.second;
                                settableFuture.getClass();
                                settableFuture.mo57356n(C22402a.f61893a);
                                break;
                            }
                        } else {
                            C59104x c9 = C94800u.f265090a.mo56225c();
                            c9.mo56378ag(C58975e.f156826a, "GacsClientOpDispatcher");
                            ((C59052c) ((C59052c) c9).mo56372aa(16817)).mo56389s("Unknown or expired ClientOp ID: %s", string6);
                            break;
                        }
                    } else {
                        C59104x c10 = eVar.mo56225c();
                        c10.mo56378ag(C58975e.f156826a, "BistoSessionController");
                        ((C59052c) ((C59052c) c10).mo56372aa(16767)).mo56386p("Missing clientOpId");
                        return;
                    }
                }
                break;
        }
        this.f265058e.mo80225f(C118826c.f331423b, j, 0);
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
        this.f265063j = aVar;
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        Object obj2;
        C61024c cVar;
        String str;
        Object obj3;
        Object obj4;
        Object obj5;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r8 = C62942bv.checkIsLite(C38346a.f101532a);
        bbVar.mo58887l(r8);
        if (bbVar.f169962ag.mo58857o(r8.f169971d)) {
            C62940bt r82 = C62942bv.checkIsLite(C38346a.f101532a);
            bbVar.mo58887l(r82);
            Object l = bbVar.f169962ag.mo58854l(r82.f169971d);
            if (l == null) {
                obj3 = r82.f169969b;
            } else {
                obj3 = r82.mo58889c(l);
            }
            C38348c cVar2 = (C38348c) obj3;
            C62940bt r10 = C62942bv.checkIsLite(C99490n.f278409e);
            cVar2.mo58887l(r10);
            if (cVar2.f169962ag.mo58857o(r10.f169971d)) {
                C62940bt r102 = C62942bv.checkIsLite(C99490n.f278409e);
                cVar2.mo58887l(r102);
                Object l2 = cVar2.f169962ag.mo58854l(r102.f169971d);
                if (l2 == null) {
                    obj5 = r102.f169969b;
                } else {
                    obj5 = r102.mo58889c(l2);
                }
                C99490n nVar = (C99490n) obj5;
                C59071e eVar = f265055a;
                C59104x b = eVar.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoSessionController");
                C59052c cVar3 = (C59052c) ((C59052c) b).mo56372aa(16780);
                C99488l a = C99488l.m165015a(nVar.f278412b);
                if (a == null) {
                    a = C99488l.UNKNOWN;
                }
                cVar3.mo56389s("UntrustedDeepLink: Action type %s", a);
                String str2 = nVar.f278413c;
                if (!C58837ba.m90859h(str2)) {
                    C99488l a2 = C99488l.m165015a(nVar.f278412b);
                    if (a2 == null) {
                        a2 = C99488l.UNKNOWN;
                    }
                    if (C99488l.START_OOBE.equals(a2)) {
                        this.f265059f.mo79076m(str2);
                        return;
                    }
                    C59104x d = eVar.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "BistoSessionController");
                    ((C59052c) ((C59052c) d).mo56372aa(16781)).mo56387q("UntrustedDeepLink: Invalid action %s", a2.f278407c);
                    return;
                }
                C59104x d2 = eVar.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "BistoSessionController");
                ((C59052c) ((C59052c) d2).mo56372aa(16782)).mo56386p("UntrustedDeepLink: Missing device id");
                return;
            }
            C62940bt r103 = C62942bv.checkIsLite(C99486j.f278399c);
            cVar2.mo58887l(r103);
            if (cVar2.f169962ag.mo58857o(r103.f169971d)) {
                C62940bt r104 = C62942bv.checkIsLite(C99486j.f278399c);
                cVar2.mo58887l(r104);
                Object l3 = cVar2.f169962ag.mo58854l(r104.f169971d);
                if (l3 == null) {
                    obj4 = r104.f169969b;
                } else {
                    obj4 = r104.mo58889c(l3);
                }
                String e = C58837ba.m90856e(((C99486j) obj4).f278401a);
                C59104x b2 = f265055a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "BistoSessionController");
                ((C59052c) ((C59052c) b2).mo56372aa(16779)).mo56389s("UntrustedDeepLink: Received dynamic device action for device: %s", e);
                this.f265059f.mo79081s(e);
                return;
            }
            C59104x c = f265055a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoSessionController");
            ((C59052c) ((C59052c) c).mo56372aa(16778)).mo56386p("Unknown extension for deep link.");
            return;
        }
        C62940bt r83 = C62942bv.checkIsLite(C88402d.f239029a);
        bbVar.mo58887l(r83);
        if (bbVar.f169962ag.mo58857o(r83.f169971d)) {
            C62940bt r84 = C62942bv.checkIsLite(C38378s.f101619a);
            bbVar.mo58887l(r84);
            if (bbVar.f169962ag.mo58857o(r84.f169971d)) {
                C62940bt r85 = C62942bv.checkIsLite(C88402d.f239029a);
                bbVar.mo58887l(r85);
                Object l4 = bbVar.f169962ag.mo58854l(r85.f169971d);
                if (l4 == null) {
                    obj = r85.f169969b;
                } else {
                    obj = r85.mo58889c(l4);
                }
                C88401c cVar4 = (C88401c) obj;
                C62940bt r11 = C62942bv.checkIsLite(C38378s.f101619a);
                bbVar.mo58887l(r11);
                Object l5 = bbVar.f169962ag.mo58854l(r11.f169971d);
                if (l5 == null) {
                    obj2 = r11.f169969b;
                } else {
                    obj2 = r11.mo58889c(l5);
                }
                C38377r rVar = (C38377r) obj2;
                C59071e eVar2 = f265055a;
                C59104x b3 = eVar2.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "BistoSessionController");
                int i = cVar4.f239021b;
                ((C59052c) ((C59052c) b3).mo56372aa(16777)).mo56387q("Trusted deeplink action=%d", 1);
                if (cVar4.f239026g) {
                    Bundle bundle = new Bundle();
                    String m = m156341m(m156340c(rVar, "assistant_device_id"));
                    if (C58837ba.m90859h(m)) {
                        C59104x c2 = eVar2.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "BistoSessionController");
                        ((C59052c) ((C59052c) c2).mo56372aa(16761)).mo56386p("device_id parameter missing");
                        return;
                    }
                    String c3 = m156340c(rVar, "node_id");
                    if (!C58837ba.m90859h(c3)) {
                        bundle.putString("node_id", c3);
                        bundle.putBoolean("enable_wear_data_layer_api", true);
                        bundle.putBoolean("acct_sync_on", true);
                        m156342n(cVar4, bundle, rVar);
                        String c4 = m156340c(rVar, "device_model_id");
                        bundle.putBoolean("acct_sync_on", cVar4.f239024e);
                        m156343o(m, c4, bundle);
                        return;
                    }
                    C59104x c5 = eVar2.mo56225c();
                    c5.mo56378ag(C58975e.f156826a, "BistoSessionController");
                    ((C59052c) ((C59052c) c5).mo56372aa(16760)).mo56386p("node_id parameter missing");
                    return;
                }
                Bundle bundle2 = new Bundle();
                String c6 = m156340c(rVar, "assistant_device_jwt");
                String str3 = null;
                if (c6 == null) {
                    cVar = null;
                } else {
                    cVar = C96448af.m159802a(c6);
                }
                if (cVar != null) {
                    bundle2.putString("assistant_device_jwt", c6);
                    Map b4 = C96448af.m159803b(cVar.f165244b, "fdci");
                    if (b4 != null) {
                        String m2 = m156341m((String) b4.get("device_id"));
                        String str4 = (String) b4.get("device_model_id");
                        if (true != C58837ba.m90859h(str4)) {
                            str3 = str4;
                        }
                        Object obj6 = cVar.f165244b.get("jti");
                        if (obj6 != null && !C58837ba.m90859h(obj6.toString())) {
                            bundle2.putString("gacs_nonce", obj6.toString());
                        }
                        str = str3;
                        str3 = m2;
                    } else {
                        str = null;
                    }
                    m156342n(cVar4, bundle2, rVar);
                    if (str3 == null || str == null) {
                        C59104x c7 = eVar2.mo56225c();
                        c7.mo56378ag(C58975e.f156826a, "BistoSessionController");
                        ((C59052c) ((C59052c) c7).mo56372aa(16770)).mo56386p("Deeplink params incomplete.");
                        return;
                    }
                    m156343o(str3, str, bundle2);
                    return;
                }
                C59104x b5 = eVar2.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "BistoSessionController");
                ((C59052c) ((C59052c) b5).mo56372aa(16769)).mo56386p("Missing/Invalid JWT");
                return;
            }
        }
        C59104x b6 = f265055a.mo56224b();
        b6.mo56378ag(C58975e.f156826a, "BistoSessionController");
        ((C59052c) ((C59052c) b6).mo56372aa(16797)).mo56386p("onStart no extra context");
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
