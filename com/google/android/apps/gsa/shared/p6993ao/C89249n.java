package com.google.android.apps.gsa.shared.p6993ao;

import com.google.android.apps.gsa.search.shared.overlay.C87661j;
import com.google.android.apps.gsa.searchnow.C88889z;
import com.google.android.apps.gsa.searchplate.C88906ah;
import com.google.android.apps.gsa.searchplate.C88951n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.shared.ao.n */
/* compiled from: PG */
public final class C89249n implements C89244i {

    /* renamed from: a */
    public static final C58485gu f241998a = C58485gu.m89849q(C90208n.INTERESTS_TAB, C90208n.SEARCH_TAB, C90208n.UNKNOWN_TAB, C90208n.NO_TAB);

    /* renamed from: e */
    private static final C58485gu f241999e = C58485gu.m89847o(C90208n.INTERESTS_TAB, C90208n.UNKNOWN_TAB);

    /* renamed from: b */
    public final C89251p f242000b;

    /* renamed from: c */
    public final C89240e f242001c;

    /* renamed from: d */
    public C90208n f242002d = C90208n.UNKNOWN_TAB;

    /* renamed from: f */
    private final C58881cr f242003f;

    /* renamed from: g */
    private final C87661j f242004g;

    /* renamed from: h */
    private final C89250o f242005h;

    public C89249n(C87661j jVar, C89254s sVar, C89251p pVar, C89241f fVar, C88906ah ahVar, C88951n nVar, C58881cr crVar) {
        C87661j jVar2 = (C87661j) fVar.f241983a.mo17428b();
        jVar2.getClass();
        C89236a aVar = (C89236a) fVar.f241984b.mo17428b();
        aVar.getClass();
        C89240e eVar = new C89240e(jVar2, aVar, ahVar, nVar);
        this.f242001c = eVar;
        this.f242000b = pVar;
        this.f242003f = crVar;
        this.f242004g = jVar;
        C89250o oVar = new C89250o(eVar);
        this.f242005h = oVar;
        sVar.f242015a = new C89248m(this);
        jVar.mo81814j().f240703a.mo83073a(new C89246k(this, pVar));
        pVar.mo83205a(this.f242002d).mo83208c(oVar);
    }

    /* renamed from: a */
    public final void mo83201a(C90208n nVar) {
        C90208n nVar2 = this.f242002d;
        if (nVar2 == nVar) {
            this.f242000b.mo83205a(nVar2).f242013f = this.f242005h;
            return;
        }
        this.f242000b.mo83205a(nVar2).f242013f = null;
        C89252q a = this.f242000b.mo83205a(nVar);
        a.f242008a.mo83075c(this.f242004g.mo81814j().f240703a.f241535a);
        this.f242000b.mo83205a(nVar).mo83206a(f241998a.contains(nVar));
        this.f242000b.mo83205a(nVar).mo83208c(this.f242005h);
        this.f242002d = nVar;
    }

    /* renamed from: b */
    public final boolean mo83202b(int i) {
        if (i == 1) {
            C89240e eVar = this.f242001c;
            if (eVar.f241978c.f241970a.isRunning()) {
                return false;
            }
            eVar.f241976a.mo81772E();
            return true;
        } else if (i != 2) {
            C89240e eVar2 = this.f242001c;
            if (eVar2.f241978c.f241970a.isRunning()) {
                return false;
            }
            eVar2.mo83192c();
            eVar2.f241976a.mo81770C(QueryTriggerType.AGA_SEARCHPLATE_MIC);
            return true;
        } else {
            C89240e eVar3 = this.f242001c;
            C89247l lVar = new C89247l(this);
            boolean contains = f241998a.contains(this.f242002d);
            if (eVar3.f241978c.f241970a.isRunning()) {
                return false;
            }
            if (contains) {
                eVar3.mo83191a(0.0f, true, true, new C89239d(eVar3, lVar));
            } else {
                eVar3.mo83192c();
                eVar3.f241976a.mo81827w(lVar.f241996a.mo83203c(), false);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Query mo83203c() {
        if (f241999e.contains(this.f242002d)) {
            C90498f i = ((C88889z) this.f242003f).f240666a.f236844au.mo84480i();
            i.mo84572d(0, 18014398509481984L);
            return i.mo84568a();
        }
        C90498f i2 = ((C88889z) this.f242003f).f240666a.f236844au.mo84480i();
        i2.mo84572d(18014398509481984L, 0);
        return i2.mo84568a();
    }
}
