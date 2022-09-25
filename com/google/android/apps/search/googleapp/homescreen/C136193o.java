package com.google.android.apps.search.googleapp.homescreen;

import android.content.Context;
import androidx.navigation.C3896q;
import com.google.android.apps.gsa.h.p.a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.compliance.p10145b.C133612j;
import com.google.android.apps.search.googleapp.discover.p10181d.C134212aq;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136150a;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136151b;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136152c;
import com.google.android.apps.search.googleapp.homescreen.p10313c.C136153d;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135408y;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139768i;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137087ap;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139680b;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.apps.search.googleapp.startup.p10514a.C139676e;
import com.google.android.apps.search.lens.p10547a.C139916a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.o */
/* compiled from: PG */
public final class C136193o implements C139761b, C139768i {

    /* renamed from: a */
    public static final C59071e f370887a = C59071e.m91331h();

    /* renamed from: A */
    public final boolean f370888A;

    /* renamed from: B */
    public final C137087ap f370889B;

    /* renamed from: C */
    public final C136969bx f370890C;

    /* renamed from: D */
    public final boolean f370891D;

    /* renamed from: E */
    public final boolean f370892E;

    /* renamed from: F */
    public final Optional f370893F;

    /* renamed from: G */
    public final boolean f370894G;

    /* renamed from: H */
    public final C133612j f370895H;

    /* renamed from: I */
    public final C46855i f370896I;

    /* renamed from: J */
    public final boolean f370897J;

    /* renamed from: K */
    public final C46485f f370898K;

    /* renamed from: L */
    public final boolean f370899L;

    /* renamed from: M */
    public final C136188j f370900M;

    /* renamed from: N */
    public C136150a f370901N;

    /* renamed from: O */
    public C136152c f370902O;

    /* renamed from: P */
    public boolean f370903P;

    /* renamed from: Q */
    public boolean f370904Q;

    /* renamed from: R */
    public final C3896q f370905R;

    /* renamed from: S */
    public final C38553h f370906S;

    /* renamed from: b */
    public final HomeScreenFragment f370907b;

    /* renamed from: c */
    public final Context f370908c;

    /* renamed from: d */
    public final a f370909d;

    /* renamed from: e */
    public final C134714d f370910e;

    /* renamed from: f */
    public final C134724d f370911f;

    /* renamed from: g */
    public final AccountId f370912g;

    /* renamed from: h */
    public final C28306ab f370913h;

    /* renamed from: i */
    public final C68214a f370914i;

    /* renamed from: j */
    public final C134212aq f370915j;

    /* renamed from: k */
    public final C46439e f370916k;

    /* renamed from: l */
    public final C137419h f370917l;

    /* renamed from: m */
    public final C136151b f370918m;

    /* renamed from: n */
    public final C136153d f370919n;

    /* renamed from: o */
    public final C139676e f370920o;

    /* renamed from: p */
    public final C139701a f370921p;

    /* renamed from: q */
    public final C139680b f370922q;

    /* renamed from: r */
    public final C139684f f370923r;

    /* renamed from: s */
    public final C135408y f370924s;

    /* renamed from: t */
    public final C46801dp f370925t;

    /* renamed from: u */
    public final C136149c f370926u;

    /* renamed from: v */
    public final C89859i f370927v;

    /* renamed from: w */
    public final C38802e f370928w;

    /* renamed from: x */
    public final C139708c f370929x;

    /* renamed from: y */
    public final C139916a f370930y;

    /* renamed from: z */
    public final boolean f370931z;

    public C136193o(HomeScreenFragment homeScreenFragment, Context context, a aVar, C134714d dVar, C134724d dVar2, AccountId accountId, C28306ab abVar, C68214a aVar2, C134212aq aqVar, C46439e eVar, C137419h hVar, C136151b bVar, C136153d dVar3, C139676e eVar2, C139701a aVar3, C139680b bVar2, C139684f fVar, C135408y yVar, C46801dp dpVar, C136149c cVar, C89859i iVar, C38802e eVar3, C139708c cVar2, C139916a aVar4, boolean z, boolean z2, C38553h hVar2, C137087ap apVar, C136969bx bxVar, boolean z3, boolean z4, Optional optional, boolean z5, C133612j jVar, C47429i iVar2, C46855i iVar3, boolean z6, C46485f fVar2, boolean z7) {
        Context context2 = context;
        C134724d dVar4 = dVar2;
        AccountId accountId2 = accountId;
        C28306ab abVar2 = abVar;
        C68214a aVar5 = aVar2;
        C134212aq aqVar2 = aqVar;
        C46439e eVar4 = eVar;
        C139676e eVar5 = eVar2;
        C139701a aVar6 = aVar3;
        C139680b bVar3 = bVar2;
        C135408y yVar2 = yVar;
        C46801dp dpVar2 = dpVar;
        C89859i iVar4 = iVar;
        C139708c cVar3 = cVar2;
        C136969bx bxVar2 = bxVar;
        C69664n.m101061g(context2, "context");
        C69664n.m101061g(dVar4, "discoverLaunchSignals");
        C69664n.m101061g(accountId2, "accountId");
        C69664n.m101061g(abVar2, "viewVisualElements");
        C69664n.m101061g(aVar5, "startupFlowLogger");
        C69664n.m101061g(aqVar2, "streamDisplayAppFlowLogger");
        C69664n.m101061g(eVar4, "futuresMixin");
        C69664n.m101061g(eVar5, "firstDrawRunner");
        C69664n.m101061g(aVar6, "discoverSearchBoxToSuggestAppFlowLogger");
        C69664n.m101061g(bVar3, "criticalStartupUiInteractivePublisher");
        C69664n.m101061g(yVar2, "doodleStatusDataService");
        C69664n.m101061g(dpVar2, "subscriptionMixin");
        C69664n.m101061g(iVar4, "appFlowLogger");
        C69664n.m101061g(cVar3, "voiceSearchLogger");
        C69664n.m101061g(hVar2, "fragmentIncognitoChecker");
        C69664n.m101061g(bxVar, "promoManagerDataService");
        C69664n.m101061g(optional, "optionalComposeWeatherWidgetFragmentProvider");
        C69664n.m101061g(iVar3, "localSubscriptionMixin");
        C69664n.m101061g(fVar2, "accountNavigation");
        this.f370907b = homeScreenFragment;
        this.f370908c = context2;
        this.f370909d = aVar;
        this.f370910e = dVar;
        this.f370911f = dVar4;
        this.f370912g = accountId2;
        this.f370913h = abVar2;
        this.f370914i = aVar5;
        this.f370915j = aqVar2;
        this.f370916k = eVar4;
        this.f370917l = hVar;
        this.f370918m = bVar;
        this.f370919n = dVar3;
        this.f370920o = eVar5;
        this.f370921p = aVar6;
        this.f370922q = bVar3;
        this.f370923r = fVar;
        this.f370924s = yVar2;
        this.f370925t = dpVar2;
        this.f370926u = cVar;
        this.f370927v = iVar4;
        this.f370928w = eVar3;
        this.f370929x = cVar3;
        this.f370930y = aVar4;
        this.f370931z = z;
        this.f370888A = z2;
        this.f370906S = hVar2;
        this.f370889B = apVar;
        this.f370890C = bxVar;
        this.f370891D = z3;
        this.f370892E = z4;
        this.f370893F = optional;
        boolean z8 = z5;
        this.f370894G = z8;
        this.f370895H = jVar;
        this.f370896I = iVar3;
        this.f370897J = z6;
        this.f370898K = fVar2;
        this.f370899L = z7;
        if (z8) {
            C47426f.m84293a(iVar2.mo51262a(yVar2.f368919c), new C136154d(this));
        }
        this.f370900M = new C136188j(this);
        this.f370905R = new C136156e(this);
    }

    /* renamed from: a */
    public final C134744f mo112824a() {
        C47231d dVar = (C47231d) this.f370907b.getChildFragmentManager().f634a.mo671c("discover");
        if (dVar != null) {
            return (C134744f) dVar.mo17754z();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo111219b(C139779t tVar) {
        C69664n.m101061g(tVar, "destinationTab");
        if (tVar == C139779t.HOME_SCREEN) {
            C134744f a = mo112824a();
            if (a != null) {
                a.mo111957k();
                return;
            }
            return;
        }
        mo112826l(tVar.name());
    }

    /* renamed from: c */
    public final void mo111220c(C139775p pVar) {
        C69664n.m101061g(pVar, "tabParams");
        this.f370904Q = true;
        mo112828n();
    }

    /* renamed from: d */
    public final void mo111221d() {
        this.f370904Q = true;
        mo112828n();
        if (!this.f370906S.f101930a) {
            C136150a aVar = this.f370901N;
            if (aVar == null) {
                C69664n.m101065k("headerScrollBehavior");
                aVar = null;
            }
            aVar.mo112803b();
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo111222e() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo111223f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo111224g() {
        C134744f a = mo112824a();
        if (a == null) {
            return false;
        }
        a.mo111956j(C134720e.NAVIGATED_BACK);
        return false;
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo111225h() {
        return false;
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo111226i() {
        return true;
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo111227j() {
        return true;
    }

    /* renamed from: k */
    public final void mo112825k(C134744f fVar) {
        C136150a aVar = this.f370901N;
        C136152c cVar = null;
        if (aVar == null) {
            C69664n.m101065k("headerScrollBehavior");
            aVar = null;
        }
        fVar.mo111949c(aVar);
        C136152c cVar2 = this.f370902O;
        if (cVar2 == null) {
            C69664n.m101065k("searchBoxScrollAndQuickReturnBehavior");
        } else {
            cVar = cVar2;
        }
        fVar.mo111949c(cVar);
    }

    /* renamed from: l */
    public final void mo112826l(String str) {
        C134744f a = mo112824a();
        if (a != null) {
            a.mo111956j(C134720e.NAVIGATED_TO_ANOTHER_TAB);
        }
        this.f370915j.mo111645f(true != C69664n.m101066l(str, C139779t.SEARCH.name()) ? 101 : 106);
        this.f370904Q = false;
        mo112828n();
        if (!this.f370906S.f101930a) {
            C136150a aVar = this.f370901N;
            if (aVar == null) {
                C69664n.m101065k("headerScrollBehavior");
                aVar = null;
            }
            aVar.mo112804c(!aVar.f370798a);
        }
    }

    /* renamed from: m */
    public final void mo112827m(C134744f fVar, int i) {
        fVar.mo111958l(new C136191m(i, this));
    }

    /* renamed from: n */
    public final void mo112828n() {
        if (this.f370904Q) {
            C134744f a = mo112824a();
            if (a != null) {
                a.mo111955i();
                return;
            }
            return;
        }
        C134744f a2 = mo112824a();
        if (a2 != null) {
            a2.mo111954h();
        }
    }
}
