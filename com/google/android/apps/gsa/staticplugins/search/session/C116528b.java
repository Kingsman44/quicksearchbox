package com.google.android.apps.gsa.staticplugins.search.session;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.opa.C83583an;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6513aj.C84538aw;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.core.p6884y.p6914h.C87382b;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.core.state.C86899cu;
import com.google.android.apps.gsa.search.core.state.C86978dd;
import com.google.android.apps.gsa.search.core.state.p6864a.C86795j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87873gt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88238ug;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88239uh;
import com.google.android.apps.gsa.search.shared.service.p6935b.aah;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88394a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88406ad;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88407ae;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88424av;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88425aw;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88443bn;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88444bo;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88446bq;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88447br;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.hotword.C90600q;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.search.session.p8714d.C116536a;
import com.google.android.apps.gsa.staticplugins.search.session.p8714d.C116537b;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116572aj;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116802ix;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116811jf;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38360k;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38361l;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.p4552o.C60636xf;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.EnumMap;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.b */
/* compiled from: PG */
public final class C116528b implements C86686h {

    /* renamed from: a */
    private static final C59071e f323107a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.b");

    /* renamed from: c */
    private final C86124t f323108c;

    /* renamed from: d */
    private final C87382b f323109d;

    /* renamed from: e */
    private final C116766ho f323110e;

    /* renamed from: f */
    private final C116572aj f323111f;

    /* renamed from: g */
    private final C116735gk f323112g;

    /* renamed from: h */
    private final C116802ix f323113h;

    /* renamed from: i */
    private final C116811jf f323114i;

    /* renamed from: j */
    private final C68214a f323115j;

    /* renamed from: k */
    private final C68214a f323116k;

    /* renamed from: l */
    private final C68214a f323117l;

    /* renamed from: m */
    private final C68214a f323118m;

    /* renamed from: n */
    private final C68214a f323119n;

    /* renamed from: o */
    private final C90600q f323120o;

    /* renamed from: p */
    private final C86152a f323121p;

    /* renamed from: q */
    private final Optional f323122q;

    /* renamed from: r */
    private final EnumMap f323123r;

    /* renamed from: s */
    private long f323124s = -1;

    /* renamed from: t */
    private boolean f323125t;

    /* renamed from: u */
    private C88424av f323126u;

    public C116528b(C86124t tVar, C87382b bVar, C116766ho hoVar, C116572aj ajVar, C116735gk gkVar, C116802ix ixVar, C116811jf jfVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C90600q qVar, C86152a aVar6, Optional optional) {
        this.f323108c = tVar;
        this.f323109d = bVar;
        this.f323110e = hoVar;
        this.f323123r = hoVar.mo80759k();
        this.f323111f = ajVar;
        this.f323112g = gkVar;
        this.f323113h = ixVar;
        this.f323114i = jfVar;
        this.f323116k = aVar;
        this.f323115j = aVar2;
        this.f323117l = aVar3;
        this.f323118m = aVar4;
        this.f323119n = aVar5;
        this.f323120o = qVar;
        this.f323121p = aVar6;
        this.f323122q = optional;
    }

    /* renamed from: a */
    private final void m193263a(C88406ad adVar) {
        Query query = (Query) C90772bp.m148301i(adVar.f239036b, Query.CREATOR);
        HotwordResult hotwordResult = (HotwordResult) C90772bp.m148301i(adVar.f239037c, HotwordResult.CREATOR);
        if (hotwordResult == null || query == null) {
            ((C59052c) ((C59052c) f323107a.mo56226d()).mo56372aa(31837)).mo56386p("Failed to construct query or hotwordResult");
            int i = C90755l.f253831a;
            return;
        }
        this.f323112g.mo80462q(query);
        if (query.mo84456dj()) {
            int a = C60636xf.m92631a(adVar.f239039e);
            C90600q qVar = this.f323120o;
            amo a2 = amo.m92435a(adVar.f239042h);
            if (a2 == null) {
                a2 = amo.UNKNOWN;
            }
            qVar.mo84742b(a2, adVar.f239045k, adVar.f239038d, this.f323112g.f323784p, hotwordResult, a != 0 ? a : 1, adVar.f239040f, adVar.f239041g, adVar.f239044j);
        }
    }

    /* renamed from: c */
    private final void m193264c(long j, Bundle bundle) {
        ((C86978dd) this.f323116k.mo27525b()).mo80620e(new C88394a(j, "search"), bundle);
    }

    /* renamed from: b */
    public final C86726f mo80291b(C21370a aVar) {
        return this.f323113h.f324073a;
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 61 || ordinal == 64) {
            this.f323109d.mo81043c(clientEventData);
        } else if (ordinal == 154) {
            C62940bt btVar = C88239uh.f238494a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r5 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r5);
            Object l = bwVar.f169962ag.mo58854l(r5.f169971d);
            if (l == null) {
                obj = r5.f169969b;
            } else {
                obj = r5.mo58889c(l);
            }
            C88238ug ugVar = (C88238ug) obj;
            if (ugVar.f238490b) {
                if (ugVar.f238491c) {
                    ((C118827a) this.f323118m.mo27525b()).mo77944g(C118569b.SNA_BOOTSTRAPPED_FROM_FILE_COUNT, C118575h.SEARCH_NOW_ACTIVITY_BOOTSTRAP_STATUS).mo104025g(1);
                } else if (ugVar.f238492d) {
                    ((C118827a) this.f323118m.mo27525b()).mo77944g(C118569b.SNA_BOOTSTRAPPED_FROM_SEARCH_SERVICE_ON_FIRST_ATTEMPT_COUNT, C118575h.SEARCH_NOW_ACTIVITY_BOOTSTRAP_STATUS).mo104025g(1);
                } else if (ugVar.f238493e) {
                    ((C118827a) this.f323118m.mo27525b()).mo77944g(C118569b.SNA_BOOTSTRAPPED_FROM_SEARCH_SERVICE_AS_FALLBACK_COUNT, C118575h.SEARCH_NOW_ACTIVITY_BOOTSTRAP_STATUS).mo104025g(1);
                } else {
                    ((C118827a) this.f323118m.mo27525b()).mo77944g(C118569b.SNA_BOOTSTRAPPED_WITHOUT_USING_SEARCH_ACTIVITY_COUNT, C118575h.SEARCH_NOW_ACTIVITY_BOOTSTRAP_STATUS).mo104025g(1);
                }
            }
            ((C118827a) this.f323118m.mo27525b()).mo77944g(C118569b.SNA_BOOTSTRAP_TOTAL_COUNT, C118575h.SEARCH_NOW_ACTIVITY_BOOTSTRAP_STATUS).mo104025g(1);
        } else if (ordinal != 180) {
            aaj aaj = null;
            if (ordinal != 183) {
                EnumMap enumMap = this.f323123r;
                C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                if (a2 == null) {
                    a2 = C87739bu.UNKNOWN;
                }
                C116780ib ibVar = (C116780ib) enumMap.get(a2);
                if (ibVar != null) {
                    if (!this.f323110e.mo80763q()) {
                        ((C89911f) this.f323119n.mo27525b()).mo83755a((Throwable) null, 120906893, 29).mo83721a();
                    }
                    ibVar.mo80408hr(j, clientEventData);
                    return;
                }
                cVar.mo80279a(clientEventData);
                return;
            }
            C116537b bVar = (C116537b) this.f323117l.mo27525b();
            Query query = clientEventData.mo81913d(Query.class) ? (Query) clientEventData.mo81912b(Query.class) : null;
            C62940bt btVar2 = aah.f237074a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r8 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r8);
            if (bwVar2.f169962ag.mo58857o(r8.f169971d)) {
                C62940bt btVar3 = aah.f237074a;
                C87741bw bwVar3 = clientEventData.f236955a;
                C62940bt r82 = C62942bv.checkIsLite(btVar3);
                bwVar3.mo58887l(r82);
                Object l2 = bwVar3.f169962ag.mo58854l(r82.f169971d);
                if (l2 == null) {
                    obj3 = r82.f169969b;
                } else {
                    obj3 = r82.mo58889c(l2);
                }
                aaj = (aaj) obj3;
            }
            if (query == null || aaj == null) {
                C59104x d = C116537b.f323156a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "VoiceSearchHandsFreeHdl");
                ((C59052c) ((C59052c) d).mo56372aa(31879)).mo56386p("HANDS_FREE_QUERY event is missing data; dropping event");
                return;
            }
            bVar.mo102747a(query, aaj);
        } else {
            C62940bt btVar4 = C87873gt.f237726a;
            C87741bw bwVar4 = clientEventData.f236955a;
            C62940bt r52 = C62942bv.checkIsLite(btVar4);
            bwVar4.mo58887l(r52);
            if (bwVar4.f169962ag.mo58857o(r52.f169971d)) {
                C62940bt btVar5 = C87873gt.f237726a;
                C87741bw bwVar5 = clientEventData.f236955a;
                C62940bt r53 = C62942bv.checkIsLite(btVar5);
                bwVar5.mo58887l(r53);
                Object l3 = bwVar5.f169962ag.mo58854l(r53.f169971d);
                if (l3 == null) {
                    obj2 = r53.f169969b;
                } else {
                    obj2 = r53.mo58889c(l3);
                }
                m193263a((C88406ad) obj2);
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
        fVar.mo85279c("Session id").mo85276a(C90752i.m148230d(Long.valueOf(this.f323124s)));
        fVar.mo85287n(this.f323109d);
    }

    /* renamed from: h */
    public final void mo80295h() {
        C116766ho hoVar = this.f323110e;
        if (!hoVar.f323929m.remove(Long.valueOf(this.f323124s))) {
            ((C59052c) ((C59052c) C116766ho.f323924h.mo56226d()).mo56372aa(32237)).mo56386p("onDestroy called for a session that is not started.");
        }
        if (hoVar.f323929m.isEmpty()) {
            hoVar.f323925i.mo80761o(hoVar);
            hoVar.f323926j.f232790a.mo79725d(hoVar);
            C58485gu guVar = hoVar.f235433c;
            int i = ((C58724pq) guVar).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                C116780ib ibVar = (C116780ib) guVar.get(i2);
            }
        }
        this.f323109d.mo81041a();
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C88424av avVar = this.f323126u;
        if (avVar != null) {
            ((C86978dd) this.f323116k.mo27525b()).mo80618c(new C88394a(this.f323124s, "search"), aVar.mo80304b(), (Bundle) null);
            if (avVar.f239074b) {
                this.f323112g.mo102871L(Query.f252741b);
                C116802ix ixVar = this.f323113h;
                C58976aa aaVar = C58975e.f156826a;
                ixVar.mo102952e(C86724d.STARTUP_QSB_TEXT);
            }
            this.f323126u = null;
        }
        if (this.f323125t) {
            C116572aj ajVar = this.f323111f;
            C58976aa aaVar2 = C58975e.f156826a;
            ajVar.f323291b = false;
            ajVar.mo80591ar();
            this.f323125t = false;
        }
        this.f323109d.mo81042b(aVar);
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        this.f323124s = j;
        C116766ho hoVar = this.f323110e;
        if (!hoVar.f323930n) {
            hoVar.mo80555e();
            ((C86899cu) hoVar.f323928l.mo27525b()).f234667a = (C86795j) hoVar.f323927k.mo27525b();
            hoVar.f323930n = true;
        }
        if (hoVar.f323929m.isEmpty()) {
            hoVar.f323925i.mo80760l(hoVar);
            hoVar.f323926j.f232790a.mo79724c(hoVar);
        }
        hoVar.f323929m.add(Long.valueOf(j));
        ((C86978dd) this.f323116k.mo27525b()).mo80616a(this.f323110e);
        C62940bt r8 = C62942bv.checkIsLite(C38361l.f101569a);
        bbVar.mo58887l(r8);
        Uri uri = null;
        if (bbVar.f169962ag.mo58857o(r8.f169971d)) {
            C62940bt r82 = C62942bv.checkIsLite(C38361l.f101569a);
            bbVar.mo58887l(r82);
            Object l = bbVar.f169962ag.mo58854l(r82.f169971d);
            if (l == null) {
                obj5 = r82.f169969b;
            } else {
                obj5 = r82.mo58889c(l);
            }
            C38360k kVar = (C38360k) obj5;
            if ((kVar.f101567a & 1) != 0) {
                String str = kVar.f101568b;
                Query o = ((C85929cw) this.f323115j.mo27525b()).mo79574o(Query.f252741b.mo84259V().mo84493u(), str);
                if (o == null) {
                    ((C59052c) ((C59052c) f323107a.mo56226d()).mo56372aa(31835)).mo56389s("Unable to create Query from URL %s.", str);
                    int i = C90755l.f253831a;
                } else {
                    m193264c(this.f323124s, (Bundle) null);
                    this.f323112g.mo80462q(o);
                }
            } else {
                ((C59052c) ((C59052c) f323107a.mo56226d()).mo56372aa(31836)).mo56389s("Invalid search deeplink: %s.", kVar);
                int i2 = C90755l.f253831a;
            }
        } else {
            C62940bt r83 = C62942bv.checkIsLite(C88444bo.f239114a);
            bbVar.mo58887l(r83);
            if (bbVar.f169962ag.mo58857o(r83.f169971d)) {
                C59081b.m91349a(C58979ad.FULL, "stack size");
                C62940bt r84 = C62942bv.checkIsLite(C88444bo.f239114a);
                bbVar.mo58887l(r84);
                Object l2 = bbVar.f169962ag.mo58854l(r84.f169971d);
                if (l2 == null) {
                    obj4 = r84.f169969b;
                } else {
                    obj4 = r84.mo58889c(l2);
                }
                C88443bn bnVar = (C88443bn) obj4;
                m193264c(this.f323124s, (Bundle) null);
                C116811jf jfVar = this.f323114i;
                C58976aa aaVar = C58975e.f156826a;
                C116735gk gkVar = (C116735gk) jfVar.f324104c.mo27525b();
                Query aL = Query.f252741b.mo84294af().mo84342ba(bnVar.f239110c).mo84275aL(bnVar.f239109b);
                if ((bnVar.f239108a & 8) != 0) {
                    amo a = amo.m92435a(bnVar.f239112e);
                    if (a == null) {
                        a = amo.UNKNOWN;
                    }
                    aL = aL.mo84272aI(a);
                }
                if (bnVar.f239111d) {
                    aL = aL.mo84291ab();
                }
                if (bnVar.f239113f) {
                    C90498f i3 = aL.mo84480i();
                    i3.mo84572d(0, 35184372088832L);
                    Query aw = i3.mo84568a().mo84311aw("android.opa.extra.TRIGGERED_BY", 4);
                    C86124t tVar = jfVar.f324108g;
                    aL = aw.mo84311aw("android.opa.extra.LAUNCHED_ON", C83583an.m133152g((C86152a) jfVar.f324109h.mo27525b()));
                }
                gkVar.mo80462q(aL);
            } else {
                C62940bt r85 = C62942bv.checkIsLite(C88425aw.f239075a);
                bbVar.mo58887l(r85);
                if (bbVar.f169962ag.mo58857o(r85.f169971d)) {
                    C62940bt r86 = C62942bv.checkIsLite(C88425aw.f239075a);
                    bbVar.mo58887l(r86);
                    Object l3 = bbVar.f169962ag.mo58854l(r86.f169971d);
                    if (l3 == null) {
                        obj3 = r86.f169969b;
                    } else {
                        obj3 = r86.mo58889c(l3);
                    }
                    this.f323126u = (C88424av) obj3;
                } else {
                    C62940bt r87 = C62942bv.checkIsLite(C88447br.f239120a);
                    bbVar.mo58887l(r87);
                    if (bbVar.f169962ag.mo58857o(r87.f169971d)) {
                        C62940bt r88 = C62942bv.checkIsLite(C88447br.f239120a);
                        bbVar.mo58887l(r88);
                        Object l4 = bbVar.f169962ag.mo58854l(r88.f169971d);
                        if (l4 == null) {
                            obj2 = r88.f169969b;
                        } else {
                            obj2 = r88.mo58889c(l4);
                        }
                        C88446bq bqVar = (C88446bq) obj2;
                        C116537b bVar = (C116537b) this.f323117l.mo27525b();
                        long j2 = this.f323124s;
                        C58976aa aaVar2 = C58975e.f156826a;
                        if ((bqVar.f239117a & 2) != 0) {
                            aaj aaj = bqVar.f239119c;
                            if (aaj == null) {
                                aaj = aaj.f237075i;
                            }
                            bVar.f323164i = j2;
                            bVar.f323160e.mo80620e(new C88394a(j2, "search"), ((C86152a) bVar.f323157b.mo27525b()).mo79789a());
                            C116572aj ajVar = bVar.f323163h;
                            ajVar.f323291b = true;
                            ajVar.mo80591ar();
                            if (bqVar.f239118b) {
                                bVar.f323159d.mo80760l(new C116536a(bVar));
                            }
                            if ((aaj.f237077a & 16) != 0) {
                                uri = Uri.parse(aaj.f237082f);
                            }
                            boolean z = aaj.f237078b;
                            boolean z2 = aaj.f237080d;
                            boolean z3 = bqVar.f239118b;
                            bVar.mo102747a(((C84538aw) bVar.f323158c.mo27525b()).mo78247c(z, z2, !z3, z3, uri, aaj.f237083g), aaj);
                        } else {
                            C59104x d = C116537b.f323156a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "VoiceSearchHandsFreeHdl");
                            ((C59052c) ((C59052c) d).mo56372aa(31881)).mo56386p("Hands free session context missing event data; dropping event");
                            bVar.f323161f.mo80269c(j2);
                        }
                    } else {
                        C62940bt r89 = C62942bv.checkIsLite(C88407ae.f239046a);
                        bbVar.mo58887l(r89);
                        if (bbVar.f169962ag.mo58857o(r89.f169971d)) {
                            m193264c(this.f323124s, this.f323121p.mo79789a());
                            C116572aj ajVar2 = this.f323111f;
                            C58976aa aaVar3 = C58975e.f156826a;
                            ajVar2.f323291b = true;
                            ajVar2.mo80591ar();
                            this.f323125t = true;
                            C62940bt r810 = C62942bv.checkIsLite(C88407ae.f239046a);
                            bbVar.mo58887l(r810);
                            Object l5 = bbVar.f169962ag.mo58854l(r810.f169971d);
                            if (l5 == null) {
                                obj = r810.f169969b;
                            } else {
                                obj = r810.mo58889c(l5);
                            }
                            m193263a((C88406ad) obj);
                        }
                    }
                }
            }
        }
        if (this.f323108c.mo79746e(C90037cp.f248465at)) {
            this.f323122q.ifPresent(C116476a.f322946a);
        }
    }

    /* renamed from: k */
    public final boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        if (!clientConfig.f236951d.equals(amo.ASSIST_ENTRY) || !clientConfig2.f236951d.equals(amo.ACETONE_NOW)) {
            return C86685g.m139633b(clientConfig, clientConfig2);
        }
        return false;
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
