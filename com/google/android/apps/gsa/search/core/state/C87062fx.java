package com.google.android.apps.gsa.search.core.state;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6674cu.C85211a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.searchplate.p6965c.C88927a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.fx */
/* compiled from: PG */
public final class C87062fx extends C86898ct {

    /* renamed from: a */
    public static final C59071e f235211a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.fx");

    /* renamed from: b */
    public final C68214a f235212b;

    /* renamed from: c */
    public final C68214a f235213c;

    /* renamed from: d */
    public final C68214a f235214d;

    /* renamed from: e */
    public final C68214a f235215e;

    /* renamed from: f */
    public final C86124t f235216f;

    /* renamed from: g */
    public final C85211a f235217g;

    /* renamed from: h */
    public int f235218h;

    /* renamed from: i */
    public int f235219i;

    /* renamed from: j */
    public int f235220j;

    /* renamed from: k */
    public ClientConfig f235221k;

    /* renamed from: l */
    public int f235222l = 0;

    /* renamed from: m */
    public Query f235223m;

    /* renamed from: n */
    public boolean f235224n;

    /* renamed from: o */
    public boolean f235225o;

    /* renamed from: p */
    public String f235226p;

    /* renamed from: q */
    public String f235227q;

    /* renamed from: r */
    public long f235228r = 0;

    /* renamed from: s */
    public boolean f235229s;

    /* renamed from: t */
    public String f235230t;

    /* renamed from: u */
    public String f235231u;

    /* renamed from: v */
    public SearchError f235232v;

    /* renamed from: w */
    private final C68214a f235233w;

    /* renamed from: x */
    private final C68214a f235234x;

    /* renamed from: y */
    private Query f235235y;

    /* renamed from: z */
    private final C87061fw f235236z;

    public C87062fx(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C86124t tVar, C85211a aVar8, C22871g gVar) {
        super(aVar, 54);
        this.f235233w = aVar2;
        this.f235212b = aVar3;
        this.f235213c = aVar4;
        this.f235234x = aVar6;
        this.f235214d = aVar5;
        this.f235215e = aVar7;
        this.f235216f = tVar;
        this.f235223m = Query.f252741b;
        this.f235217g = aVar8;
        this.f235226p = BuildConfig.FLAVOR;
        this.f235227q = BuildConfig.FLAVOR;
        this.f235230t = BuildConfig.FLAVOR;
        this.f235231u = BuildConfig.FLAVOR;
        C87061fw fwVar = new C87061fw(this, gVar);
        this.f235236z = fwVar;
        fwVar.mo81997g();
    }

    /* renamed from: k */
    public static boolean m140701k(C87052fn fnVar, TtsState ttsState, C87171z zVar, Query query) {
        if (!query.mo84391cX() || query.mo84397cd()) {
            return false;
        }
        C87051fm fmVar = fnVar.f235184t;
        if (((!fmVar.mo80680j(query) || fmVar.f235135a != 3) && (!fnVar.mo80687E() || !query.mo84332bQ() || !zVar.mo80781M(query))) || ttsState.mo80421v()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo80725a() {
        this.f235226p = BuildConfig.FLAVOR;
        this.f235227q = BuildConfig.FLAVOR;
        this.f235224n = false;
    }

    /* renamed from: e */
    public final void mo80726e(int i) {
        if (this.f235222l != i) {
            this.f235222l = i;
            this.f235217g.mo78796g(i);
        }
    }

    /* renamed from: g */
    public final void mo80727g(boolean z) {
        Query query;
        C87171z zVar = (C87171z) this.f235233w.mo27525b();
        C87052fn fnVar = (C87052fn) this.f235214d.mo27525b();
        if (zVar.mo80782N() && !fnVar.mo80690I()) {
            query = Query.f252741b;
        } else if (fnVar.mo80690I() || !fnVar.mo80693N()) {
            Query query2 = fnVar.f235176l;
            query = (!query2.mo84420dA() || !zVar.mo80791X() || zVar.mo80784Q()) ? query2 : query2.mo84283aT();
        } else {
            query = null;
        }
        if (query != null) {
            if (z || this.f235235y != query) {
                if (!((C86812ai) this.f235212b.mo27525b()).f234471a.f236953f.equals("search")) {
                    this.f235217g.mo78799j(query);
                }
                this.f235235y = query;
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchPlateState");
        C91005e c = fVar.mo85279c("mode");
        String a = C88927a.m144526a(this.f235219i);
        int i = this.f235220j;
        c.mo85276a(C90752i.m148229c(a + "/" + i));
        fVar.mo85279c("ext").mo85276a(C90752i.m148230d(Integer.valueOf(this.f235218h)));
        fVar.mo85279c("rec state").mo85276a(C90752i.m148230d(Integer.valueOf(this.f235222l)));
    }

    /* renamed from: i */
    public final boolean mo80728i(Query query) {
        return (((C87055fq) this.f235234x.mo27525b()).mo80721a() && ((C87171z) this.f235233w.mo27525b()).mo80784Q()) || ((C87052fn) this.f235214d.mo27525b()).f235176l.mo84383cP(query);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo80729j(Query query) {
        return (this.f235219i == 4 && query.mo84420dA()) || this.f235219i == 5;
    }

    public final String toString() {
        return "SearchPlateState[Mode:" + C88927a.m144526a(this.f235219i) + "/" + this.f235220j + " Ext:" + this.f235218h + " Rec state:" + this.f235222l + "%]";
    }
}
